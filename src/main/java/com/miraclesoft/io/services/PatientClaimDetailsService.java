package com.miraclesoft.io.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miraclesoft.io.ExceptionHandler.PatientNotFoundException;
import com.miraclesoft.io.model.PatientClaimDetails;
import com.miraclesoft.io.repository.PatientClaimDetailsRepo;

@Service
public class PatientClaimDetailsService {
	
	@Autowired
	private PatientClaimDetailsRepo patientClaimDetailsRepo;
	
	public List<PatientClaimDetails> findAll()
	{
		return patientClaimDetailsRepo.findAll();
	}
	
	public PatientClaimDetails findByPid(int pId){
		return patientClaimDetailsRepo.findById(pId).orElseThrow(PatientNotFoundException::new);
	}

}
