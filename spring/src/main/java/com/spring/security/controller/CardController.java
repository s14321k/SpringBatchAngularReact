package com.spring.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardController {

	@GetMapping("/myCards")
	public String getCardDetails() {
		return "getCardDetails";
	}
}
