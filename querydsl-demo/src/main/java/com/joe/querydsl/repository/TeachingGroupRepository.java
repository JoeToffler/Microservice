package com.joe.querydsl.repository;

import com.joe.querydsl.model.QTeachingGroup;
import com.joe.querydsl.model.TeachingGroup;
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
public interface TeachingGroupRepository extends Repository<TeachingGroup, Long>
        , JpaSpecificationExecutor<TeachingGroup>
        , QuerydslPredicateExecutor<TeachingGroup>
        , QuerydslBinderCustomizer<QTeachingGroup> {

    @Override
    default void customize(QuerydslBindings bindings, QTeachingGroup teachingGroup) {

    }
}
