package com.miraclesoft.io;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public class PutTestCase extends WorkshopApplicationTests {

	@Test
	public void putTest() throws Exception {
		MvcResult mvcResult = mockMvc.perform( // using mock mvc builder we can handle the mockMvc
				MockMvcRequestBuilders.put("/api/medications/0").accept(MediaType.APPLICATION_JSON)
				.content("{\n" + "	\"medid\":\"Hello\",\n" + "	\"description\":\"JUnit\"\n" + "}")
						.contentType(MediaType.APPLICATION_JSON))
				.andReturn();
		MockHttpServletResponse response = mvcResult.getResponse();
		assertEquals(200, response.getStatus()); // HttpStatus.OK.value()=200, HttpStatus.CREATED.value()=201
		System.out.println("Response:" + response.getContentAsString());
	}
}
