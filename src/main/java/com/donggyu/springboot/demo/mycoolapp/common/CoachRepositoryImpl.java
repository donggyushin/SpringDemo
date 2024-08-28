package com.donggyu.springboot.demo.mycoolapp.common;

import org.springframework.stereotype.Component;

@Component
public class CoachRepositoryImpl implements CoachRepository {

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }
}
