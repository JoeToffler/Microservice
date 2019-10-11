package com.joe.querydsl.constant;

/**
 * @author JoeToffler
 * @describe
 * @date 2019-10-10 13:55
 */
public enum Sex {
    /**
     *
     */
    MAN("男"), WOMAN("女");

    public String desc;

    Sex(String desc) {
        this.desc = desc;
    }
}
