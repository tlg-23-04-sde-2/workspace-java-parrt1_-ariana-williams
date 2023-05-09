package com.mathhelp;

/*
 * This is "all - static" class, i.e., one that contains only static methods.
 */
class Calculator {

    // add, subtract, isEven
   public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static boolean isEven(int value) {
        return value % 2 == 0;
    }

    /*
     * Returns a random integer between 1 and 14.
     *
     * HINT: see class called Math (in package java.lang), look for a helpful method here.
     * NOTE: these methods in the Math class are all "static," which means you call them as
     * Math.methodName()
     */

    public static int getRandomInt() {
      // delegate to the min-max version, passing 1 for the min, and 14 for the max
        return getRandomInt(1, 14);
    }

    /*
     * Returns a random integer between 'min' and 'max' (inclusive)
     */

    public static int getRandomInt(int min, int max) {
        int result = 0;
        double rand = Math.random(); // 0.0000 to 0.999999
        double inRange = (rand * (max - min) + min); // 5.000 - 19.999
        double rounded = Math.ceil(inRange); //5.000 - 20.000
        result = (int) rounded; // min to max
        return result;
    }

    /*
     * Returns the average (arithmetic mean) of the supplied integers
     * getAverage()
     * aveInt()
     * averageator()
     * xbar()
     * getMean()
     */

    public static double getAverage(int first, int... rest) { // client can pass any number of ints EX. first:3 rest:4, 9, 9

        double sum = first;
        for (int number : rest) {
            sum += number;
        }

        return sum / (1 + rest.length);
    }
}