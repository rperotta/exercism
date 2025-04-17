package org.exercism.carsassemble;

public class CarsAssemble {
    private static final int PRODUCTION_RATE = 221;

    public static void main(String[] args) {
        CarsAssemble c = new CarsAssemble();
        System.out.println(c.workingItemsPerMinute(7));
    }

    public double productionRatePerHour(int speed) {
        int products = PRODUCTION_RATE * speed;
        return speed >= 1 && speed <= 4 ?
                products :
                speed >= 5 && speed <= 8 ?
                        products * 0.9 :
                        speed == 9 ?
                                products * 0.8 :
                                products * 0.77;
    }

    public int workingItemsPerMinute(int speed) {
        return (int) productionRatePerHour(speed) / 60;
    }
}
