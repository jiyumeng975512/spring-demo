package com.jiyumeng.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jiyumeng.spring.service.SpringService;

@Controller
public class SpringController {
	@Autowired
	private SpringService springService;
	
	@RequestMapping("/spring")
	public String spring() {
		
		return springService.spring();
	}
	

}
