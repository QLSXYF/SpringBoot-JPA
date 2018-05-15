package com.example.jpa.controller;

import com.example.jpa.entity.Person;
import com.example.jpa.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 *
 * @author Eva
 * @date 2018年5月14日
 *
 */
@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	private PersonRepository personRepository;

	@PostMapping("add")
	@ResponseBody
	public void add(Person person) {
		personRepository.save(person);
	}

    @DeleteMapping(path = "deletePerson")
    public void deletePerson(Long id) {
        personRepository.deleteById(id);
    }

}

		