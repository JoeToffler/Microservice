package com.joe.querydsl.model;

import com.joe.querydsl.constant.Sex;
import com.querydsl.core.annotations.QueryInit;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author JoeToffler
 * @describe 学生
 * @date 2019-10-10 11:05
 */
@Setter
@Getter
@Entity
@Table(name = "student")
public class Student extends AbstractModel{

    @QueryInit("*.*.*.*.*.*.*")
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "grade_id")
    private Grade grade;

    @Column(name = "age",length = 2)
    private Integer age;

    @Column(name = "sex",length = 1)
    private Sex sex;
}
