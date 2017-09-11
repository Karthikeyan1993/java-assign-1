package com.kgfsl.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("api/v1")
public class EmployeeController {

	@RequestMapping(value = "/welcome", method = RequestMethod.GET)
	public @ResponseBody String greet() {
		return "Welcome";
	}
}
