/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 50721
Source Host           : localhost:3306
Source Database       : querytest

Target Server Type    : MYSQL
Target Server Version : 50721
File Encoding         : 65001

Date: 2019-10-17 10:35:41
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for city
-- ----------------------------
DROP TABLE IF EXISTS `city`;
CREATE TABLE `city` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `province_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKll21eddgtrjc9f40ueeouyr8f` (`province_id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of city
-- ----------------------------
INSERT INTO `city` VALUES ('1', '西安', '1');
INSERT INTO `city` VALUES ('2', '北京', '2');
INSERT INTO `city` VALUES ('3', '咸阳', '1');

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1', '数学');
INSERT INTO `course` VALUES ('2', '英语');
INSERT INTO `course` VALUES ('3', '体育');

-- ----------------------------
-- Table structure for grade
-- ----------------------------
DROP TABLE IF EXISTS `grade`;
CREATE TABLE `grade` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of grade
-- ----------------------------
INSERT INTO `grade` VALUES ('1', '一年一班');
INSERT INTO `grade` VALUES ('2', '初一一班');
INSERT INTO `grade` VALUES ('3', '初二一班');

-- ----------------------------
-- Table structure for province
-- ----------------------------
DROP TABLE IF EXISTS `province`;
CREATE TABLE `province` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=MyISAM AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of province
-- ----------------------------
INSERT INTO `province` VALUES ('1', '陕西');
INSERT INTO `province` VALUES ('2', '北京');

-- ----------------------------
-- Table structure for region
-- ----------------------------
DROP TABLE IF EXISTS `region`;
CREATE TABLE `region` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `city_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKedafr6k537xtdes7gc7nq778a` (`city_id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of region
-- ----------------------------
INSERT INTO `region` VALUES ('1', '雁塔', '1');
INSERT INTO `region` VALUES ('2', '西城', '2');
INSERT INTO `region` VALUES ('3', '渭滨', '3');

-- ----------------------------
-- Table structure for school
-- ----------------------------
DROP TABLE IF EXISTS `school`;
CREATE TABLE `school` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `region_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FKnhtgat3oodd4glhl227duqarj` (`region_id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of school
-- ----------------------------
INSERT INTO `school` VALUES ('1', '高新一小', '1');
INSERT INTO `school` VALUES ('2', '北京四中', '2');
INSERT INTO `school` VALUES ('3', '实验中学', '3');

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` varchar(1) DEFAULT NULL,
  `grade_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK4xvaqcll34afqdd9vkydid5qo` (`grade_id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------
INSERT INTO `student` VALUES ('1', '李洛克', '6', '0', '1');
INSERT INTO `student` VALUES ('2', '鸣人', '13', '0', '2');
INSERT INTO `student` VALUES ('3', '天天', '13', '1', '3');

-- ----------------------------
-- Table structure for teacher
-- ----------------------------
DROP TABLE IF EXISTS `teacher`;
CREATE TABLE `teacher` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `age` int(11) DEFAULT NULL,
  `sex` varchar(1) DEFAULT NULL,
  `course_id` bigint(20) DEFAULT NULL,
  `teaching_group_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `UK_29ma965j5bwbs3lvny1y3dps4` (`course_id`),
  KEY `FKkyaqr64e6yemiqafcdpdl4nsq` (`teaching_group_id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher
-- ----------------------------
INSERT INTO `teacher` VALUES ('1', '李克强', '50', '0', '1', '1');
INSERT INTO `teacher` VALUES ('2', '凯', '45', '0', '2', '2');
INSERT INTO `teacher` VALUES ('3', '红', '44', '1', '3', '3');

-- ----------------------------
-- Table structure for teacher_grade
-- ----------------------------
DROP TABLE IF EXISTS `teacher_grade`;
CREATE TABLE `teacher_grade` (
  `teacher_id` bigint(20) NOT NULL,
  `grade_id` bigint(20) NOT NULL,
  PRIMARY KEY (`teacher_id`,`grade_id`),
  KEY `FK80vsqge1wlie1hm420gki9yo8` (`grade_id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teacher_grade
-- ----------------------------
INSERT INTO `teacher_grade` VALUES ('1', '1');
INSERT INTO `teacher_grade` VALUES ('2', '2');
INSERT INTO `teacher_grade` VALUES ('3', '3');

-- ----------------------------
-- Table structure for teaching_group
-- ----------------------------
DROP TABLE IF EXISTS `teaching_group`;
CREATE TABLE `teaching_group` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL,
  `school_id` bigint(20) NOT NULL,
  PRIMARY KEY (`id`),
  KEY `FK2cvyl601x0ioov7fdvn1sxh9y` (`school_id`)
) ENGINE=MyISAM AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of teaching_group
-- ----------------------------
INSERT INTO `teaching_group` VALUES ('1', '数学', '1');
INSERT INTO `teaching_group` VALUES ('2', '英语', '2');
INSERT INTO `teaching_group` VALUES ('3', '体育', '3');
