package com.gudwish.RestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NameOneRestController {

	@GetMapping(value = "/")
	public String getOneRestController() {
		return "HEllo welcome HOme;";
	}
	
	@GetMapping(value = "/elasticBeanStock")
	public String elasticBeanStock() {
		return "Hello elasticBeanStock;";
	}

}
