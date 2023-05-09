package net.flix;

enum Genre {
    ROMANCE("Romance"),
    SCI_FI("Sci-Fi"),
    COMEDY("Comedy"),
    HORROR("HORROR"),
    DOCUMENTARY("Documentary"),
    ACTION("Action"),
    THRILLER("Thriller"),
    DRAMA("Drama 5");

    //everything below here is regular class definition stuff, i.e., fields, ctors, methods
    private final String display;

    //constructor - implicitly private, only called from inside(8 times above)
    Genre(String display) {
        System.out.println("Genre ctor called");
        this.display = display;
    }

    // accessor methods - here, we provide "read-only" access to the display property

    public String getDisplay() {
        return display;
    }

    public String toString() {
        return display;
    }
}