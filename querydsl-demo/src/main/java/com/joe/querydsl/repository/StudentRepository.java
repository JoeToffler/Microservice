package com.joe.querydsl.repository;

import com.joe.querydsl.model.QStudent;
import com.joe.querydsl.model.Student;
import com.querydsl.core.types.dsl.StringPath;
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
    /**
     * Student查询入口统一自定义过滤
     */
    @Override
    default void customize(QuerydslBindings bindings, QStudent student) {
        /**
         * 通过name匹配name或nickname
         */
        bindings.bind(student.name).first((path, value) ->
                student.name.contains(value).or(student.nickname.contains(value))
        );

        /**
         * 查询字段黑名单
         * 如：禁止通过性别查询
         */
        bindings.excluding(student.sex);

        /**
         * 忽略大小写
         */
        bindings.bind(String.class).first((StringPath path, String value) -> path.containsIgnoreCase(value));
    }
}
