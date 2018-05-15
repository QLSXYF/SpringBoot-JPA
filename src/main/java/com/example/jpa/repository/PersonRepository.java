package com.example.jpa.repository;


import com.example.jpa.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author Eva
 * @date 2018年5月14日
 *
 */
public interface PersonRepository extends JpaRepository<Person, Long> {

}

		