package com.bgeles.webscraping.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/api/v1/scrapping")
@RestController
public class ScrapingController {

	@GetMapping("/page")
	public void generateCars() {

	}

}
