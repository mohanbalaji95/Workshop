package com.miraclesoft.io.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.miraclesoft.io.ExceptionHandler.PatientIdMismatchException;
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
	
	public PatientClaimDetails addClaims(PatientClaimDetails patientClaimDetails) {
		return patientClaimDetailsRepo.save(patientClaimDetails);
	}
	
	public PatientClaimDetails updateClaim(PatientClaimDetails patientClaimDetails, int claimId) {
		if(patientClaimDetails.getClaimId() != claimId) {
			throw new PatientIdMismatchException();
		}
		patientClaimDetailsRepo.findById(claimId).orElseThrow(PatientNotFoundException::new);
		return patientClaimDetailsRepo.save(patientClaimDetails);
	}
	
	public String deleteClaim(int claimId) {
		patientClaimDetailsRepo.findById(claimId).orElseThrow(PatientNotFoundException::new);
		patientClaimDetailsRepo.deleteById(claimId);
		return "Deleted";
	}

}
