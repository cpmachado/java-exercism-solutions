public class CarsAssemble {
    static double PRODUCTION_PER_HOUR = 221.0;

    public double productionRatePerHour(int speed) {
        double factor = 0.77;
        if (speed < 1 || speed > 10) {
            return 0.0;
        }
        if (speed < 5) {
            factor = 1.0;
        } else if (speed < 9) {
            factor = 0.9;
        } else if (speed == 9) {
            factor = 0.8;
        }
        return factor * PRODUCTION_PER_HOUR * speed;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) (productionRatePerHour(speed) / 60.0);
    }
}
