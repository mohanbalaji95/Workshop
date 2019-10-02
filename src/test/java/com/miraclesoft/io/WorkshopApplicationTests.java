package com.miraclesoft.io;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.miraclesoft.io.controller.InsuranceController;
import com.miraclesoft.io.model.PatientClaimDetails;
import com.miraclesoft.io.repository.PatientClaimDetailsRepo;
import com.miraclesoft.io.repository.PatientInsurancePlanRepo;
import com.miraclesoft.io.services.PatientClaimDetailsService;
import com.miraclesoft.io.services.PatientInsurancePlanService;

@RunWith(SpringRunner.class)
@WebMvcTest(InsuranceController.class)
public class WorkshopApplicationTests {

	@Autowired
	MockMvc mockMvc; // to use direct rest calls

	@MockBean
	PatientClaimDetailsService patientClaimDetailsService;
	
//	@MockBean
//	PatientClaimDetailsRepo patientClaimDetailsRepo;

	@MockBean
	PatientInsurancePlanService patientInsurancePlanService;
	
	@Test
	public void contextLoads() throws Exception {
		
//		PatientClaimDetails patientClaimDetails = new PatientClaimDetails(1, 123, 10, 2000, 1000, "2019-01-01", "apollo");
//		
//		List<PatientClaimDetails> allClaims = Arrays.asList(patientClaimDetails);
//		
//		given(patientClaimDetailsService.findAll()).willReturn(allClaims);

		
		
		
		
		
//		 when(patientClaimDetailsRepo.findAll()).thenReturn(Collections.emptyList());
//
//		MvcResult mvcResult1= mockMvc.perform(                        //using mock mvc builder we can handle the mockMvc
//				MockMvcRequestBuilders.get("/claims")
//				.accept(MediaType.APPLICATION_JSON)
//				).andReturn();
//		
//		System.out.println("Response:"+mvcResult1.getResponse());
//
//		 verify(patientClaimDetailsRepo).findAll();
		/*---------------------------------*/
//		
//		 when(patientInsurancePlanRepo.findAll()).thenReturn(Collections.emptyList());
//
//			MvcResult mvcResult2= mockMvc.perform(                        //using mock mvc builder we can handle the mockMvc
//					MockMvcRequestBuilders.get("/plans")
//					.accept(MediaType.APPLICATION_JSON)
//					).andReturn();
//			
//			System.out.println("Response:"+mvcResult2.getResponse());
//
//			 verify(patientInsurancePlanRepo).findAll();
//	
	}
}
