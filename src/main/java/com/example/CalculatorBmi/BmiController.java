package com.example.CalculatorBmi;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class BmiController {

    @GetMapping("/home")
    public String getName() {
        return "home";
    }




}
