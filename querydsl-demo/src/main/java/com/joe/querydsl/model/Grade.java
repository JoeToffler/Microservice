package com.joe.querydsl.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author JoeToffler
 * @describe 班级
 * @date 2019-10-10 11:36
 */
@Getter
@Setter
@Entity
@Table(name = "grade")
public class Grade extends AbstractModel {
    @ManyToMany(mappedBy = "grades")
    private Set<Teacher> teacher = new HashSet<>();
}
