package com.kodilla.startCoding.operations;

public class Operations {

    public static void main(String[] args) {
        int numberOne = 15;
        int numberTwo = 6;
        double numberOneFloating = 15.90;
        double numberTwoFloating = 5.30;


        int resultSum = numberOne + numberTwo;
        int resultDetection = numberOne - numberTwo;
        double resultDetectionFloating = numberOne - numberOneFloating;
        int multiplication = numberOne * numberTwo;
        double resultMultiplicationFloating = numberOneFloating * numberTwoFloating;
        int resultDivision = numberOne / numberTwo;
        double resultDivisionFloating = numberOneFloating / numberTwoFloating;
        int modulo = numberOne % numberTwo;

        System.out.println(resultSum);
        System.out.println(resultDetection);
        System.out.println(resultDetectionFloating);
        System.out.println(multiplication);
        System.out.println(resultMultiplicationFloating);
        System.out.println(resultDivision);
        System.out.println(resultDivisionFloating);
        System.out.println(modulo);
    }
}
