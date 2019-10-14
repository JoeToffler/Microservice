package com.joe.querydsl.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author JoeToffler
 * @describe 学校
 * @date 2019-10-10 11:47
 */
@Getter
@Setter
@Entity
@Table(name = "school")
public class School extends AbstractModel{
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "region_id")
    private Region region;
}
