package com.joe.querydsl.repository;

import com.joe.querydsl.model.QStudent;
import com.joe.querydsl.model.Student;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;
import org.springframework.data.querydsl.binding.QuerydslBinderCustomizer;
import org.springframework.data.querydsl.binding.QuerydslBindings;
import org.springframework.data.repository.Repository;

/**
 * @author JoeToffler
 * @describe
 * @date 2019-10-10 11:24
 */
@org.springframework.stereotype.Repository
public interface StudentRepository extends Repository<Student, Long>
        , JpaSpecificationExecutor<Student>
        , QuerydslPredicateExecutor<Student>
        , QuerydslBinderCustomizer<QStudent> {

    @Override
    default void customize(QuerydslBindings bindings, QStudent student) {

    }
}
