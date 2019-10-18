package com.joe.querydsl.model;

import com.querydsl.core.annotations.QueryInit;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author JoeToffler
 * @describe 教研组
 * @date 2019-10-10 11:45
 */
@Getter
@Setter
@Entity
@Table(name = "teaching_group")
public class TeachingGroup extends AbstractModel {
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "school_id")
    @QueryInit("*.*.*.*")
    private School school;
}
