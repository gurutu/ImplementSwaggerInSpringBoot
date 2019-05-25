package com.swagger.controller;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import org.springframework.core.io.Resource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
public class StudentController {

	@GetMapping("/students/{id}")
	@ApiOperation(value = "Find student by id",
    notes = "Also returns a link to retrieve all students with rel - all-students")
	public Map<String,String> retrieveStudent(@PathVariable long id) {
		Map<String,String> m=new HashMap<String,String>();
		m.put("Hello","Pranav");
		m.put("Hello","Pranav");
		return m;
	}
	
}
