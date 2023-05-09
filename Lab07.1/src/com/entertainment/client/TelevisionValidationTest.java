package com.entertainment.client;

import com.entertainment.Television;

class TelevisionValidationTest {
    public static void main(String[] args) {
        //check 4 values to do boundary testing for tv volume
        //check -1,(0) and (100), 101
        Television tv = new Television();
        tv.setVolume(0);
        System.out.println(tv);

        tv.setVolume(100);
        System.out.println(tv);

        tv.setVolume(-1);
        System.out.println(tv);

        tv.setVolume(101);
        System.out.println(tv);

        tv.setBrand("samsung");
        System.out.println(tv);

        tv.setBrand("LG");
        System.out.println(tv);

        tv.setBrand("Sony");
        System.out.println(tv);

        tv.setBrand("Toshiba");
        System.out.println(tv);

        tv.setBrand("Vizio");
        System.out.println(tv);

    }
}
