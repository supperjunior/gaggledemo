package com.example.demo.demo.controller;

import com.example.demo.demo.domain.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public ResponseEntity<Response> getHome() {
		Response response = new Response();
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
}
