package dont.wakeme;

/*
 * Application test-class to verify correct behavior of our setter validation.
 * BVT = boundary Value Testing
 * for a [1,0] range, you need to check:
 * 0,1 and 20,21
 */
class AlarmClockValidationTest {
    public static void main(String[] args) {
        AlarmClock clock = new AlarmClock();
        clock.setSnoozeInterval(1); //should "stick" -> 'clock' indeed has this value
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(20); //should 'stick'
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(0); //should not stick
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

        clock.setSnoozeInterval(21); //should give error value not set still be 20
        System.out.println("snoozeInterval: " + clock.getSnoozeInterval());

    }

}
