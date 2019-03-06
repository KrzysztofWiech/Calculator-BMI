package com.example.CalculatorBmi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DecimalFormat;
@Controller
public class BmiControllerMethod {

    DecimalFormat dec2 = new DecimalFormat(".##");

    @GetMapping("/bmi")
    public String getResult(@RequestParam double height,
                            @RequestParam double weight,
                            ModelMap modelMap) {
        modelMap.put("wzrost", dec2.format(height));
        modelMap.put("waga", dec2.format(weight));
        double bmiIndex = BmiCalculator.getBmiIndex(height, weight);
        modelMap.put("bmi", dec2.format(bmiIndex));
        modelMap.put("bmimessage", (BmiCalculator.getMessage(height, weight)));
        return "bmi";
    }
}

