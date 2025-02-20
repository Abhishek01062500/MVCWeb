package com.spring.mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.mvc.service.CalculatorService;

@Controller
public class HomeController {
	
	@Autowired
	private CalculatorService calculatorService;
	  
	  
    @RequestMapping("/calculate")
    public String calculate(@RequestParam("num1") int num1,
                            @RequestParam("num2") int num2,
                            @RequestParam("operation") String operation,
                            Model model) {

        int result = 0;
        try {
            result = calculatorService.performOperation(num1, num2, operation);
        } catch (ArithmeticException e) {
            model.addAttribute("error", "Error: " + e.getMessage());
            return "result";
        }

        model.addAttribute("result", result);
        return "result";
    }
}
