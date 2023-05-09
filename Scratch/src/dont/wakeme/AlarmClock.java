package dont.wakeme;

/*
 * Class definition to model the workings of an alarm clock.
 * This is called a "business class" or "system class."
 *  This class definition does Not have a main() method - most classes don't.
 */
class AlarmClock {
    // Static variables
    // They are final they can not be changed
    public static final int MIN_Interval = 1;
    public static final int MAX_Interval = 20;

    // properties or attributes - called "instance variables" or "fields" in java
    private int snoozeInterval = 5; //default if no time is added in the client side
    private int repeat = 1; //default value when client doesn't specify

    //constructor
    public AlarmClock() {
        //no-op
    }

    public AlarmClock(int snoozeInterval) {

        setSnoozeInterval(snoozeInterval);
    }

    public AlarmClock(int snoozeInterval, int repeat) {

        this(snoozeInterval); //delegate to ctor above me for snoozeInterval
        setRepeat(repeat);
    }

    // functions or "methods" - what do AlarmClocks do?
    public void snooze() {

        System.out.println("Snoozing " + getSnoozeInterval() + " minutes");
    }

    //accessor methods (get/set methods) - provide "controlled access" to the object's fields
    public int getSnoozeInterval() {

        return snoozeInterval;
    }

    public void setSnoozeInterval(int snoozeInterval) {
        //no 'magic numbers'

        if (snoozeInterval >= MIN_Interval && snoozeInterval <= MAX_Interval) {
            this.snoozeInterval = snoozeInterval;
        }
        else {
            System.out.println("Invalid snoozeInterval: " + snoozeInterval + ". Must be between "
                    + MIN_Interval + " and " + MAX_Interval);
        }
    }

    public int getRepeat() {
        return repeat;
    }

    public void setRepeat(int repeat) {
        this.repeat = repeat;
    }

    public String toString() {

        return "AlarmClock: snoozeInterval=" + getSnoozeInterval() + ", repeat= " + getRepeat();
    }
}