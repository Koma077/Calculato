package com.skypro.calculator.controller;

import com.skypro.calculator.exception.CalculatorException;
import com.skypro.calculator.service.CalculatorService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

public class CalculatorController {
    private final CalculatorService calculatorService;


    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    @GetMapping("/plus")
    public String addNumbers(@RequestParam int a, @RequestParam int b){
        return generateMassege(a, b, "-", calculatorService.add(a,b));
    }
    @GetMapping("/minus")
    public String subtractNumbers(@RequestParam int a, @RequestParam int b){
        return generateMassege(a, b, "-", calculatorService.subtrack(a,b));
    }
    @GetMapping("/multiply")
    public String multiplyNumbers(@RequestParam int a, @RequestParam int b){
        return generateMassege(a, b, "-", calculatorService.multiply(a,b));
    }
    @GetMapping("/divide")
    public String divideNumbers(@RequestParam int a, @RequestParam int b){
        if(b == 0){
            throw new CalculatorException();
        }
        return generateMassege(a, b, "-", calculatorService.divide(a,b));
    }
    private String generateMassege(int a, int b, String operation,int result){
        return String.format("%d %s %d = %d", a ,operation, b, result);
    }
}
