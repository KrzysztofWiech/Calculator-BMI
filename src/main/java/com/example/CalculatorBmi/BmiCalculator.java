package com.example.CalculatorBmi;

public class BmiCalculator {


    public static double getBmiIndex(double height, double weight) {
        height /= 100;
        double bmiIndex = weight / (height * height);
        return bmiIndex;
    }

    public static String getMessage(double height, double weight) {
        height /= 100;
        double bmiIndex = weight / (height * height);

        if (bmiIndex < 16) {
            return "Wygłodzenie";
        } else if (bmiIndex >= 16 && bmiIndex < 17) {
            return "Wychudzenie";
        } else if (bmiIndex >= 17 && bmiIndex < 18.5) {
            return "Niedowaga";
        } else if (bmiIndex >= 18.5 && bmiIndex < 25) {
            return "Waga prawidłowa";
        } else if (bmiIndex >= 25 && bmiIndex < 30) {
            return "Nadwaga";
        } else if (bmiIndex >= 30 && bmiIndex < 35) {
            return "I Stopień otyłości";
        } else if (bmiIndex >= 35 && bmiIndex < 40) {
            return "II Stopień otyłości";
        } else if (bmiIndex >= 40) {
            return "Otyłość skrajna";
        }
        return null;
    }
}

//    DecimalFormat dec2 = new DecimalFormat(".##");
//
//
////    @GetMapping("/bmi")
////    public String getResult(@RequestParam double height,
////                            @RequestParam double weight,
////                            ModelMap modelMap) {
////        modelMap.put("wzrost", dec2.format(height));
////        modelMap.put("waga", dec2.format(weight));
////        double bmiIndex = BmiCalculator.getBmiIndex(height, weight);
////        modelMap.put("bmi", dec2.format(bmiIndex));
////        modelMap.put("bmimessage", (getMessage(height, weight)));
////        return "bmi";
////    }
////}
//        if (bmiIndex < 16) {
//            modelMap.put("info", "Wygłodzenie");
//        } else if (bmiIndex >= 16 && bmiIndex < 17) {
//            modelMap.put("info", "Wychudzenie");
//        } else if (bmiIndex >= 17 && bmiIndex < 18.5) {
//            modelMap.put("info", "Niedowaga");
//        } else if (bmiIndex >= 18.5 && bmiIndex < 25) {
//            modelMap.put("info", "Waga prawidłowa");
//        } else if (bmiIndex >= 25 && bmiIndex < 30) {
//            modelMap.put("info", "Nadwaga");
//        } else if (bmiIndex >= 30 && bmiIndex < 35) {
//            modelMap.put("info", "I Stopień otyłości");
//        } else if (bmiIndex >= 35 && bmiIndex < 40) {
//            modelMap.put("info", "II Stopień otyłości");
//        } else if (bmiIndex >= 40) {
//            modelMap.put("info", "Otyłość skrajna");
//        }




