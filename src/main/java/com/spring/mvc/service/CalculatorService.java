package com.spring.mvc.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
	//creating methods 
	  public int add(int num1, int num2) {
	        return num1 + num2;
	    }

	    public int subtract(int num1, int num2) {
	        return num1 - num2;
	    }

	    public int multiply(int num1, int num2) {
	        return num1 * num2;
	    }

	    public int divide(int num1, int num2) {
	        if (num2 == 0) {
	            throw new ArithmeticException("Cannot divide by zero.");
	        }
	        return num1 / num2;
	    }

	    public int performOperation(int num1, int num2, String operation) {
	        switch (operation) {
	            case "add": return add(num1, num2);
	            case "subtract": return subtract(num1, num2);
	            case "multiply": return multiply(num1, num2);
	            case "divide": return divide(num1, num2);
	            default: throw new IllegalArgumentException("Invalid operation: " + operation);
	        }
	    }
}
