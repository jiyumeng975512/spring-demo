package com.jiyumeng.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jiyumeng.spring.service.CallControllerService;

@Controller
public class CallControllerController {
	
	@Autowired
	private CallControllerService callControllerService;
	
	@RequestMapping("/callController")
	public String callController() {
		return callControllerService.callController();
	}
}
