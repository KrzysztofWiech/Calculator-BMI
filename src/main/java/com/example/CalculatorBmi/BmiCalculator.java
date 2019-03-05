package com.example.CalculatorBmi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


public class BmiCalculator {


    private double weight;

    private double height;



    public double getBmiIndex(double height, double weight) {
        height /= 100;

        double bmiIndex = weight / (height * height);
        return bmiIndex;
    }


}
