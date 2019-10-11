package com.joe.querydsl.model;

import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;
import com.joe.querydsl.constant.Sex;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author JoeToffler
 * @describe 教师
 * @date 2019-10-10 11:15
 */
@Getter
@Setter
@Entity
@Table(name = "teacher")
@JsonIdentityInfo(generator = ObjectIdGenerators.PropertyGenerator.class, property = "id")
public class Teacher extends AbstractModel {

    @OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.ALL, optional = false)
    @JoinColumn(name = "course_id")
    private Course course;

    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "teaching_group_id")
    private TeachingGroup teachingGroup;


    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
    @JoinTable(name = "teacher_grade", joinColumns = @JoinColumn(name = "teacher_id", referencedColumnName = "id")
            , inverseJoinColumns = @JoinColumn(name = "grade_id", referencedColumnName = "id"))
    private Set<Grade> grades = new HashSet<>();

    @Column(name = "age", length = 2)
    private Integer age;

    @Column(name = "sex", length = 1)
    private Sex sex;

}
