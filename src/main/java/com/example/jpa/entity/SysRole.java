package com.example.jpa.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * @author A-team Eva
 * @date 2018-05-16
 */
@Getter
@Setter
@Entity
public class SysRole {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
}
