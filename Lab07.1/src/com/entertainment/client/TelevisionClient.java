package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

/*
 * Client-side main-class to create a few instances of Television
 * and give them a basic test-drive.
 */
class TelevisionClient {

    public static void main(String[] args) {
        System.out.println(Television.getInstanceCount() + " instances");
        // instance one of Television object
        Television tv1 = new Television();
        tv1.setDisplay(DisplayType.CRT);
        tv1.setBrand("Samsung");
        tv1.setVolume(Television.MAX_VOLUME);
        System.out.println(tv1);

        // instance 2 of Television object
        Television tv2 = new Television("Sony", Television.MIN_VOLUME);

        // instance 3 of Television object
        Television tv3 = new Television("LG");

        Television tv4 = new Television("Sony", 40);
        System.out.println(tv4);

        //make tvs turn on then a blank line
        tv1.turnOn();
        System.out.println();
        tv2.turnOn();
        System.out.println();
        tv3.turnOn();
        System.out.println();

        //gets information about the tvs
        System.out.println(tv1);
        System.out.println(tv2);
        System.out.println(tv3);

        System.out.println();


        //turns the tvs off
        tv1.turnOff();
        tv2.turnOff();
        tv3.turnOff();

        System.out.println(Television.getInstanceCount() + " instances");
    }
}