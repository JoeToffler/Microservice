package com.joe.querydsl.repository;

import com.joe.querydsl.model.QTeacher;
import com.joe.querydsl.model.Teacher;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.repository.Repository;

/**
 * @author JoeToffler
 * @describe
 * @date 2019-10-10 18:20
 */
public interface TeacherRepository extends Repository<Teacher, Long>
        , JpaSpecificationExecutor<Teacher>
        , QuerydslPredicateExecutor<Teacher>
        , QuerydslBinderCustomizer<QTeacher> {

    @Override
    default void customize(QuerydslBindings bindings, QTeacher teacher) {

    }
}
