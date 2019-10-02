package com.miraclesoft.io;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.miraclesoft.io.repository.MedicationRepository;

@RunWith(SpringRunner.class)
@WebMvcTest
public class WorkshopApplicationTests {
	@Autowired
	MockMvc mockMvc; // to use direct rest calls

	@MockBean
	MedicationRepository medrepo;
	
	@Test
	public void contextLoads() {
	}

}
