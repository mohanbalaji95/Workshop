package com.miraclesoft.io.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.miraclesoft.io.services.PatientClaimDetailsService;

@RestController
public class InsuranceController {

	@Autowired
	private PatientClaimDetailsService Service;
}
