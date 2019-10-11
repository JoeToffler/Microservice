package com.joe.querydsl.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author JoeToffler
 * @describe
 * @date 2019-10-10 14:48
 */
@Getter
@Setter
@Entity
@Table(name = "course")
public class Course extends AbstractModel {

}
