package com.joe.querydsl.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.domain.Pageable;

import java.util.List;


/**
 * @author JoeToffler
 * @describe
 * @date 2019-10-10 18:10
 */
@Data
@AllArgsConstructor
public class ResultModel {
    private List content;
    private Pageable page;
}
