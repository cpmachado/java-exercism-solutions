public class Lasagna {
    static int TIME_IN_OVEN = 40;
    static int TIME_PER_LAYER = 2;

    public int expectedMinutesInOven() {
        return TIME_IN_OVEN;
    }

    public int remainingMinutesInOven(int actualMinutes) {
        return this.expectedMinutesInOven() - actualMinutes;
    }

    public int preparationTimeInMinutes(int amountLayers) {
        return amountLayers * TIME_PER_LAYER;
    }

    public int totalTimeInMinutes(int amountLayers, int actualMinutes) {
        return this.preparationTimeInMinutes(amountLayers) + actualMinutes;
    }
}
