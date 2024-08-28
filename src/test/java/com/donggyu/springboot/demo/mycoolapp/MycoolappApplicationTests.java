package com.donggyu.springboot.demo.mycoolapp;

import com.donggyu.springboot.demo.mycoolapp.common.CoachRepositoryImpl;
import com.donggyu.springboot.demo.mycoolapp.common.CoachRepository;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MycoolappApplicationTests {

	private static final Logger log = LoggerFactory.getLogger(MycoolappApplicationTests.class);

	@Test
	void contextLoads() {
		CoachRepository coachRepository = new CoachRepositoryImpl();
		String result = coachRepository.getDailyWorkout();
	}

}
