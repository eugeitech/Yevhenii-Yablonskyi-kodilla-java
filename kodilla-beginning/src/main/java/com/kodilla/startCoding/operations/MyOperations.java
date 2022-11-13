package com.kodilla.startCoding.operations;

public class MyOperations {

    public static void main(String[] args) {

        int x = 7;
        int seven = 7;
        int result = x % seven;

        if (result == 0) {
            System.out.println("Liczba 7 jest dzielnikiem liczby " + x);
        } else {
            System.out.println("Liczba 7 NIE jest dzielnikiem liczby " + x + " :(");
        }

    }
}
