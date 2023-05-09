package com.mathhelp;

class CalculatorClient {

    public static void main(String[] args) {
        double sum = Calculator.add(3,5);
        System.out.println("The sum is: " + sum);

        // System.out.println("The difference is: " + calc1.subtract(3.1,5.1));

        int input = 10;
        System.out.println(input + " is even: " + Calculator.isEven(input));

        System.out.println("random number from 1 and 14: " + Calculator.getRandomInt());
        System.out.println();
        System.out.println("random number from max and min: " + Calculator.getRandomInt(5, 20));

        System.out.println(Calculator.getAverage(3,4,9,9));
        System.out.println(Calculator.getAverage(8));
    }

}