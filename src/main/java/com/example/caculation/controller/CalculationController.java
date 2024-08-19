package com.example.caculation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.ui.Model;

@Controller
@RequestMapping("/maths")
public class CalculationController {
    @GetMapping("")
    public String calculation() {
        return "view";
    }

    @PostMapping("/caculator")
    public String caculator(@RequestParam double s1, @RequestParam double s2,
                            @RequestParam String operation, Model model) {
        double result = 0;

        switch (operation) {
            case "Addition(+)":
                result = s1 + s2;
                break;
            case "Subtraction(-)":
                result = s1 - s2;
                break;
            case "Multiplication(X)":
                result = s1 * s2;
                break;
            case "Division(/)":
                if (s2 != 0) {
                    result = s1 / s2;
                } else {
                    model.addAttribute("error", "Không thể chia cho 0.");
                    return "view";
                }
                break;
        }

        model.addAttribute("result", result);
        return "view";
    }
}
