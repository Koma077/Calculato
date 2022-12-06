package com.skypro.calculator.exception;

public class CalculatorException extends IllegalArgumentException {
    public CalculatorException() {
    }

    public CalculatorException(String s) {
        super(s);
    }

    public CalculatorException(String message, Throwable cause) {
        super(message, cause);
    }

    public CalculatorException(Throwable cause) {
        super(cause);
    }

}
