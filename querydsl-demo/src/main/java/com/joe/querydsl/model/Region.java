package com.joe.querydsl.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author JoeToffler
 * @describe 区/县
 * @date 2019-10-10 11:48
 */
@Getter
@Setter
@Entity
@Table(name = "region")
public class Region extends AbstractModel{
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "city_id")
    private City city;
}
