package dont.wakeme;

/*
 * This is a client "main-class," i.e., a class definition with the main() method.
 * It will create a few instances of AlarmClock and give them a basic test-drive.
 */
class AlarmClockClient {

    // starting point or "entry point" for every standalone Java application
    public static void main(String[] args) {
        // create an instance of AlarmClock (an AlarmClock object)
        AlarmClock clock1 = new AlarmClock(7, 5);

        //create a second instance of AlarmClock
        AlarmClock clock2 = new AlarmClock();
        clock2.setSnoozeInterval(10);

        // create a 3rd AlarmClock object, But don't set its properties
        AlarmClock clock3 = new AlarmClock();
        clock3.setSnoozeInterval(AlarmClock.MAX_Interval);

        //make them snooze
        clock1.snooze();
        clock2.snooze();
        clock3.snooze();
        System.out.println();

        // show their toString() methods in action
        System.out.println(clock1.toString());
        System.out.println(clock2.toString());
        System.out.println(clock3); // toString() automatically called
    }
}