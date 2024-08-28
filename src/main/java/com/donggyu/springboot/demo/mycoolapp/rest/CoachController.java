package com.donggyu.springboot.demo.mycoolapp.rest;

import com.donggyu.springboot.demo.mycoolapp.common.CoachRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CoachController {
    private final CoachRepository coachRepository;

    @Autowired
    public  CoachController(CoachRepository theCoachRepository) {
        coachRepository = theCoachRepository;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return coachRepository.getDailyWorkout();
    }
}
