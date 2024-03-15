package com.Task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
	@GetMapping(value="/get")
	public String get() {
		return "Hello world";
	}
}
