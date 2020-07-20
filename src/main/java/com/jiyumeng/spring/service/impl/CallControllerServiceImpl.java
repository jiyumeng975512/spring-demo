package com.jiyumeng.spring.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jiyumeng.spring.controller.SpringController;
import com.jiyumeng.spring.service.CallControllerService;

@Service
public class CallControllerServiceImpl implements CallControllerService{
	@Autowired(required = false)
	private SpringController springController;
	@Override
	public String callController() {
		// TODO Auto-generated method stub
		return springController.spring();
	}

}
