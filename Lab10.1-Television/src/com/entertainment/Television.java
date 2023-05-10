package com.entertainment;

import java.util.Arrays;

/*
 * Business class (system class) to model the workings of a television.
 */
public class Television {
    //static final variables live outside of each instance of tv. They are shared with every tv created.
    public static int instanceCount = 0;
    // These are final meaning they can not be changed
    public static final int MIN_VOLUME = 0;
    public static final int MAX_VOLUME = 100;
    public static final String[] VALID_BRANDS = {"Samsung", "LG", "Sony", "Toshiba"};

    //instance variables or fields (properties or attributes)
    private String brand = "Toshiba";
    private int volume = 1;
    private DisplayType display = DisplayType.LED;
    //internal variables
    private boolean isMuted;
    private int oldVolume;


    // constructor
    public Television() {
        instanceCount++;
    }

    public Television(String brand) {
        this();
        setBrand(brand);
    }

    public Television(String brand, int volume) throws IllegalArgumentException {
        this(brand);
        setVolume(volume);
    }

    public Television(String brand, int volume, DisplayType display) throws IllegalArgumentException {
        this(brand, volume);
        setDisplay(display);
    }

    // business methods or operations
    // method when turning on Television
    public void turnOn() {
        boolean isConnected = verifyInternetConnection();
        System.out.println("Turning on your " + getBrand() + " TV to volume " + getVolume());
    }

    // method when turning off Television
    public void turnOff() {
        System.out.println("Shutting down...goodbye");
    }

    // method to mute
    public void mute() {
        if (!isMuted()) {
            oldVolume = getVolume();
            volume = 0;
            isMuted = true;
        }
        else {
            setVolume(oldVolume);
            isMuted = false;
        }
    }


    // accessor methods (get/set)
    public String getBrand() {
        return brand;
    }

    // Valid brands page 81
    // for (String validBrand : VALID_BRANDS) { }
    //CHECK THE INCOMING 'BRAND' AGAINST 'VAILDbRAND' USING THE EQUALS() METHOD
    // currently printing the else statement which I dont want unless its not in the array
    public void setBrand(String brand) {
        boolean matchFound = false;
        for (String validBrand : VALID_BRANDS) {
            if (brand.equals(validBrand)) {
                this.brand = brand;
                matchFound = true;
                break;
            }
        }
        if (!matchFound) {
            System.out.println("The brand " + brand + " is not valid please choose "
                    + Arrays.toString(Television.VALID_BRANDS));
        }


//        if (brand.equals("Samsung") || brand.equals("LG") || brand.equals("Sony") || brand.equals("Toshiba")) {
//            this.brand = brand;
//        }
//        else {
//            System.out.println("The brand " + brand + " is not valid please choose Samsung, LG, Sony, or Toshiba");
//        }
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) throws IllegalArgumentException {
        if (volume >= MIN_VOLUME && volume <= MAX_VOLUME ) {
            this.volume = volume;

            isMuted = false;
        }
        else {
            throw new IllegalArgumentException("Volume " + volume + " is an invalid volume " +
                    "select a number from " +
                    MIN_VOLUME + " and " + MAX_VOLUME);
        }
    }

    public DisplayType getDisplay() {
        return display;
    }

    public void setDisplay(DisplayType display) {
        this.display = display;
    }

    public boolean isMuted() {
        return isMuted;
    }

    private boolean verifyInternetConnection() {
        return true;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    // toString method
    public String toString() {
        String volumeString = isMuted() ? "<muted>" : String.valueOf(getVolume());
        return "Television: " + getBrand() + " Volume set to: " + volumeString + " Tv display: " + display;

    }
}