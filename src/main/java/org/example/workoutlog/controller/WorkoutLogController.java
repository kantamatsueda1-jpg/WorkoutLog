package org.example.workoutlog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WorkoutLogController {

@GetMapping("/dashboard")
    private String dashboard(){

    return "dashboard";
}
}
