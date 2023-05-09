class Waterfall {
    public static final Double MIN_HEIGHT = 1.0;
    //five attributes
    private String name;
    private Double height = MIN_HEIGHT;
    private String location = "unknown";
    private boolean isFreshWater;
    private WaterfallType type = WaterfallType.CASCADE;
    private boolean hasAccess;

    // Constructors
    public Waterfall(String name) {
        setName(name);
    }

    public Waterfall(String name, String location) {
        this(name);
        setLocation(location);
    }

    public Waterfall(String name, String location, Double height, WaterfallType type) {
        this(name, location);
        setHeight(height);
        setType(type);
    }

    // Business methods
    public void increaseOxygen() {
        System.out.println(getName() + ": has a height of " + getHeight() +
                ". Based on this it increases oxygen in the water");
    }

    public void erode() {
        System.out.println(getName() + ": has erosion because it is a waterfall.");
    }

    public void accessed() {
        System.out.println("Have you accessed this waterfall?");
    }

    // accessor methods (getters/setters)

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        if (isValid(height)) {
            this.height = height;
        }
        else {
            System.out.printf("%s is not a valid height, the waterfall must " +
                            "have a height equal to or greater than %s \n",
                   height, MIN_HEIGHT);
        }
    }

    private static boolean isValid (Double height) {
        boolean isValid = false;
        if (height >= MIN_HEIGHT) {
            isValid = true;
        }
        return isValid;

    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public boolean isFreshWater() {
        return isFreshWater;
    }

    public void setFreshWater(boolean freshWater) {
        isFreshWater = freshWater;
    }

    public WaterfallType getType() {
        return type;
    }

    public void setType(WaterfallType type) {
        this.type = type;
    }

    // To string method
    public String toString() {
        return String.format("Waterfall name=%s, location=%s, height=%s, type=%s",
                getName(), getLocation(), getHeight(), getType());
    }
}
