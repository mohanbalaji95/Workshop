package com.miraclesoft.io.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.miraclesoft.io.model.PatientClaimDetails;
import com.miraclesoft.io.model.PatientInsurancePlan;
import com.miraclesoft.io.services.PatientClaimDetailsService;
import com.miraclesoft.io.services.PatientInsurancePlanService;

@RestController
public class InsuranceController {

	@Autowired
	private PatientClaimDetailsService patientClaimDetailsService;
	
	@Autowired
	private PatientInsurancePlanService patientInsurancePlanService;
	
	@GetMapping("/claims")
	public List<PatientClaimDetails> getClaims(){
		return patientClaimDetailsService.findAll();
	}
	
	@GetMapping("/plans")
	public List<PatientInsurancePlan> getPlans(){
		return patientInsurancePlanService.findAll();
	}
	
	@GetMapping("/claims/{pid}")
		public PatientClaimDetails getClaimByPid(@PathVariable("pid") int pid){
		return patientClaimDetailsService.findByPid(pid);
	}
	
	@GetMapping("/plans/{pid}")
	public PatientInsurancePlan getInsuranceByPid(@PathVariable("pid") int pid){
	return patientInsurancePlanService.findByPid(pid);
}
	
}
