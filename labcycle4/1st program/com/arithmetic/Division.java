package com.arithmetic;

public class Division implements ArithmeticOperation {
    @Override
    public double calculate(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
    }
}

