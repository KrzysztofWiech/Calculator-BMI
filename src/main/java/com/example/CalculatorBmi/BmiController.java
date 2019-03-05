package com.example.CalculatorBmi;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.text.DecimalFormat;


@Controller
public class BmiController {

    DecimalFormat dec2 = new DecimalFormat(".##");

    BmiCalculator bmiCalculator = new BmiCalculator();


    @GetMapping("/home")
    public String getName() {
        return "home";
    }

    @GetMapping("/bmi")
    public String getResult(@RequestParam double height,
                            @RequestParam double weight,
                            ModelMap modelMap) {
        modelMap.put("wzrost", dec2.format(height));
        modelMap.put("waga", dec2.format(weight));
        double bmiIndex = bmiCalculator.getBmiIndex(height, weight);
        modelMap.put("bmi", dec2.format(bmiIndex));

        if (bmiIndex < 16) {
            modelMap.put("info", "Wygłodzenie");
        } else if (bmiIndex >= 16 && bmiIndex < 17) {
            modelMap.put("info", "Wychudzenie");
        } else if (bmiIndex >= 17 && bmiIndex < 18.5) {
            modelMap.put("info", "Niedowaga");
        } else if (bmiIndex >= 18.5 && bmiIndex < 25) {
            modelMap.put("info", "Waga prawidłowa");
        } else if (bmiIndex >= 25 && bmiIndex < 30) {
            modelMap.put("info", "Nadwaga");
        } else if (bmiIndex >= 30 && bmiIndex < 35) {
            modelMap.put("info", "I Stopień otyłości");
        } else if (bmiIndex >= 35 && bmiIndex < 40) {
            modelMap.put("info", "II Stopień otyłości");
        } else if (bmiIndex >= 40) {
            modelMap.put("info", "Otyłość skrajna");
        }
        return "bmi";
    }


}
