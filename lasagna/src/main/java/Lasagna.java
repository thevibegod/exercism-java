public class Lasagna {

    static private final int REQUIRED_MINUTES_IN_OVEN = 40;

    public int expectedMinutesInOven() {
        return REQUIRED_MINUTES_IN_OVEN;
    }

    public int remainingMinutesInOven(int min) {
        return REQUIRED_MINUTES_IN_OVEN - min;
    }

    public int preparationTimeInMinutes(int layers) {
        return layers * 2;
    }

    public int totalTimeInMinutes(int layers, int min) {
        return (layers * 2) + min;
    }
}
