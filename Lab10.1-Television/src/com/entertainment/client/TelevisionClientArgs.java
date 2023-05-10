package com.entertainment.client;

import com.entertainment.DisplayType;
import com.entertainment.Television;

import java.util.Arrays;

/**
 *
 *
 *
 *
 *  GOAL:
 * Create an instance of Television with the specification (values) provided by the user.
 */


class TelevisionClientArgs {

    public static void main(String[] args) {
        // must first check for the presence of you (required) 3 arguments
        if (args.length < 3) {
            String usage = "Usage: java TelevisionClientArgs <brand> <volume> <display>";
            String example = "Example: java TelevisionClientArgs Samsung 32 PLASMA";
            String note1 = "Note: supported displays are " + Arrays.toString(DisplayType.values());
            String note2 = "Note: supported brands are " + Arrays.toString(Television.VALID_BRANDS);
            System.out.println(usage);
            System.out.println(example);
            System.out.println(note1);
            System.out.println(note2);
            return;
        }
        //at this point, you can safely proceed, because you got your arguments
        //first, let's  just show that we got them
//        System.out.println("You provided " + args.length + " arguments");

        //step 1: covert the arguments into proper types
        String brand = args[0]; // is a string
        int volume = Integer.parseInt(args[1]); // takes a string of an int converts to integer
        DisplayType display = DisplayType.valueOf(args[2].toUpperCase()); // returns the enum value in a string that is uppercase

        //step2: create a Television object from these ingredients
        Television tv = new Television(brand, volume, display);

        //step3: print it and congratulate them on their order
        System.out.println("Congratulations on your order, it will arrive soon.");
        System.out.println(tv);
    }

}
