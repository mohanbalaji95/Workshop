package com.miraclesoft.io;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;


public class GetTestCase extends WorkshopApplicationTests {
	@Test
	public void getTest() throws Exception {
		// when(employeeRepo.findAll()).thenReturn(Collections.emptyList());

		MvcResult mvcResult = mockMvc.perform( // using mock mvc builder we can handle the mockMvc
				MockMvcRequestBuilders.get("/api/medications").accept(MediaType.APPLICATION_JSON)).andReturn();

		MockHttpServletResponse response = mvcResult.getResponse();
		assertEquals(200, response.getStatus());  // HttpStatus.OK.value()=200, HttpStatus.CREATED.value()=201
		System.out.println("Response:" + response.getContentAsString());

		// verify(employeeRepo).findAll();
	}

}
