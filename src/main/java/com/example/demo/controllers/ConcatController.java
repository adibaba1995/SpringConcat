package com.example.demo.controllers;

import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.Person;

@RestController
public class ConcatController {

	/*
	 * This API endpoint accepts XML input. We pass firstname and lastname of person in xml format.
	 * It looks that it returns the same object. But behind the scenes, it concatenates firstName & lastName and then returns the object.
	 * For more details look in Person class.
	 */
	@RequestMapping(value="/concat",consumes = MediaType.APPLICATION_XML_VALUE, produces = MediaType.APPLICATION_XML_VALUE)
	public Person concat(@RequestBody Person person) {
		return person;
	}

}