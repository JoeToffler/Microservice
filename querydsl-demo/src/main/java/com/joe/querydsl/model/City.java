package com.joe.querydsl.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author JoeToffler
 * @describe 市
 * @date 2019-10-10 11:53
 */
@Getter
@Setter
@Entity
@Table(name = "city")
public class City extends AbstractModel{
    @ManyToOne(fetch = FetchType.EAGER, optional = false)
    @JoinColumn(name = "province_id")
    private Province province;
}
