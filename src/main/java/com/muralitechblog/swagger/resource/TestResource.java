package com.muralitechblog.swagger.resource;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test")
public class TestResource {

	@GetMapping(path = "/echo")
	public String getEcho() {
		return "Echo 1.. 2.. 3..";
	}

	@GetMapping(path = "/hello/{name}")
	public String helloApp(@PathVariable String name) {
		return "Hello " + name;
	}

}
