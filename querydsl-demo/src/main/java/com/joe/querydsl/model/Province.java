package com.joe.querydsl.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author JoeToffler
 * @describe 省
 * @date 2019-10-10 11:54
 */
@Getter
@Setter
@Entity
@Table(name = "province")
public class Province extends AbstractModel {

}
