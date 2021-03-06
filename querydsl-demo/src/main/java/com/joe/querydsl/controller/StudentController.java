package com.joe.querydsl.controller;

import com.joe.querydsl.model.Student;
import com.joe.querydsl.repository.StudentRepository;
import com.querydsl.core.BooleanBuilder;
import com.querydsl.core.types.Predicate;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.querydsl.binding.QuerydslPredicate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author JoeToffler
 * @describe
 * @date 2019-10-10 14:56
 */
@RestController
@RequestMapping("/w/students")
@Api(tags = {"学生API"})
public class StudentController {

    @Autowired
    StudentRepository studentRepository;

    @ApiOperation(value = "复合条件查询并分页")
    @GetMapping("/search")
    public ResultModel search(@QuerydslPredicate(root = Student.class) Predicate predicate, final Pageable pageable) {
        if (predicate == null) predicate = new BooleanBuilder();
        Page<Student> all = studentRepository.findAll(predicate, pageable);
        Pageable page = all.getPageable();
        List<Student> content = all.getContent();
        ResultModel resultModel = new ResultModel(content, page);
        return resultModel;
    }
}
