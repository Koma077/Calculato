package com.skypro.calculator.service;

import org.junit.jupiter.api.Test;

import static com.skypro.calculator.service.Constans.ONE;
import static com.skypro.calculator.service.Constans.TWO;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    private final CalculatorService calculatorService = new CalculatorServiceImpl();

    @Test
    public void shouldReturnTwoWhenSumOneAndOne(){
        int result = calculatorService.add(ONE, ONE);
        assertEquals(ONE + ONE, result);
    }
    public void shouldReturnTwoWhenSumTwoAndOne() {
        int result = calculatorService.add(ONE, ONE);
        assertEquals(TWO + TWO, result);
    }

}