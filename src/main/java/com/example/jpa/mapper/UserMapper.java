package com.example.jpa.mapper;


import com.example.jpa.entity.Person;

/**
 *
 * @author Eva
 * @date 2018年5月14日
 *
 */
public interface UserMapper {

    int add(Person user);
    Person findOne(Person user);
}

		