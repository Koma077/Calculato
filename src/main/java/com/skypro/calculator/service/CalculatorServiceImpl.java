package com.skypro.calculator.service;

import com.skypro.calculator.exception.CalculatorException;

public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public int add(int a, int b){
        return a + b;
    }
    @Override
    public int subtrack(int a, int b){
        return a - b;
    }
    @Override
    public int multiply(int a, int b){
        return a * b;
    }
    @Override
    public int divide(int a, int b){
        if(b == 0){
            throw new CalculatorException();
        }
        return a / b;
    }

}
