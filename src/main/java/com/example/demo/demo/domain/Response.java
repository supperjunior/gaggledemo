package com.example.demo.demo.domain;

import java.time.LocalDateTime;

public class Response {
	private final String msg;
	private final LocalDateTime localDateTime;

	public Response() {
		this.msg = "Welcome to the machine";
		this.localDateTime = LocalDateTime.now();
	}

	public String getMsg() {
		return msg;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}
}
