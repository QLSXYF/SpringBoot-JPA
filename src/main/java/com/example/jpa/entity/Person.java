package com.example.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 *
 * @author Eva
 * @date 2018年5月14日
 *
 */
@Entity
@Getter
@Setter
public class Person {

    @Id
    @GeneratedValue
	private Integer id;

    @Column(name = "name", nullable = true, length = 20)
    private String name;

    @Column(name = "age", nullable = true, length = 3)
    private Integer age;




}

		