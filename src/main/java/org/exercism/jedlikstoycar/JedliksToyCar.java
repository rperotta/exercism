package org.exercism.jedlikstoycar;

public class JedliksToyCar {

    private int batteryPercentage = 100;
    private int distanceDriven = 0;

    public static void main(String[] args) {
        JedliksToyCar car = buy();
        System.out.println(car.distanceDisplay() + " " + car.batteryDisplay());
        car.drive();
        System.out.println(car.distanceDisplay() + " " + car.batteryDisplay());
    }

    public static JedliksToyCar buy() {
        return new JedliksToyCar();
    }

    public String distanceDisplay() {
        return String.format("Driven %d meters", distanceDriven);
    }

    public String batteryDisplay() {
        return batteryPercentage > 0 ? String.format("Battery at %d%%", batteryPercentage) : "Battery empty";
    }

    public void drive() {
        if(batteryPercentage > 0){
            distanceDriven += 20;
            batteryPercentage--;
        }
    }
}
