package com.spring.mvc.test;

import static org.junit.Assert.*;

import  org.junit.Before;
import  org.junit.Test;

import com.spring.mvc.service.CalculatorService;
public class CalculatorServiceTest {
	
    private CalculatorService calculatorService;

    @Before
    public void setUp() {
        calculatorService = new CalculatorService();
    }

    @Test
    public void testAddition() {
        assertEquals(8,calculatorService.add(5, 3) );
    }

    @Test
    public void testSubtraction() {
        assertEquals(6, calculatorService.subtract(10, 4));
    }
    
    @Test
    public void testmultiply() {
        assertEquals(40,calculatorService.multiply(10, 4));
    }
    @Test
    public void testdivide() {
        assertEquals(5,calculatorService.divide(10, 2));
    } 
    @Test
    public void testdivide1() {
        assertEquals(50,calculatorService.divide(100, 2));
    }
    @Test
    public void testAddition1() {
        assertEquals(102,calculatorService.add(100, 2));
    }
}

