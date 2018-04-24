package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.config.Configuration;
import com.example.demo.model.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration config;
	

	@GetMapping("/getLimits")
	public LimitConfiguration retriveLimitConfiguration() {
		return new LimitConfiguration(config.getMinimum(),config.getMaximum());	
	}
}
