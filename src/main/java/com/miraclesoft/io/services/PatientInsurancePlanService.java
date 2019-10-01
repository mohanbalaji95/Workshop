package com.miraclesoft.io.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miraclesoft.io.ExceptionHandler.PatientNotFoundException;
import com.miraclesoft.io.model.PatientClaimDetails;
import com.miraclesoft.io.model.PatientInsurancePlan;
import com.miraclesoft.io.repository.PatientInsurancePlanRepo;

@Service
public class PatientInsurancePlanService {
	@Autowired
	private PatientInsurancePlanRepo patientInsurancePlanRepo;
	
	public List<PatientInsurancePlan> findAll(){
		return patientInsurancePlanRepo.findAll();
	}
	
	public PatientInsurancePlan findByPid(int pId){
		return patientInsurancePlanRepo.findById(pId).orElseThrow(PatientNotFoundException::new);
	}
}
