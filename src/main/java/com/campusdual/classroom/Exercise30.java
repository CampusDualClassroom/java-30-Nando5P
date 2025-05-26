package com.campusdual.classroom;

public class Exercise30 {

    public static int divisionWithCustomException (int dividend, int divisor){
        if (divisor == 0) {
            throw new DivisionByZeroException("Division by zero is not allowed.");
        }
        return dividend / divisor;
    }

    public static void main(String[] args) {
        System.out.println(divisionWithCustomException(10, 2));
    }
}
