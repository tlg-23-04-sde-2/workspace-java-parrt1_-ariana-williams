package ex.periment;

import java.sql.SQLOutput;

//Write a function that accepts an array of 10 integers (between 0 and 9),
//        that returns a string of those numbers in the form of a phone number. (123) 456-7890
class Practice {

    public String Practice(String s) {
        // ex of s the-stealth-warrior
        // I want theStealthWarrior
        StringBuilder mutableString = new StringBuilder();
        mutableString.append(s);

        for (int i = 0; i < mutableString.length(); i++) {
            if (!Character.isLetter(mutableString.charAt(i))) {
                mutableString.deleteCharAt(i);
                mutableString.setCharAt(i,Character.toUpperCase(mutableString.charAt(i)));
            }

        }
        return mutableString.toString();

    }
}
