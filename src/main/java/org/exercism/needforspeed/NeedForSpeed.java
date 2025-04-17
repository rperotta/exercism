package org.exercism.needforspeed;

public class NeedForSpeed {
    private int speed;
    private int batteryDrain;
    private int batteryPercentage = 100;
    private int distanceDriven = 0;

    public static void main(String[] args) {
        int speed = 5;
        int batteryDrain = 2;
        var car = new NeedForSpeed(speed, batteryDrain);

        int distance = 250;
        var raceTrack = new RaceTrack(distance);

        System.out.println(raceTrack.canFinishRace(car));
    }

    NeedForSpeed(int speed, int batteryDrain) {
        this.speed = speed;
        this.batteryDrain = batteryDrain;
    }

    public boolean batteryDrained() {
        return batteryPercentage < batteryDrain;
    }

    public int distanceDriven() {
        return distanceDriven;
    }

    public void drive() {
        if (!batteryDrained()) {
            distanceDriven += speed;
            batteryPercentage -= batteryDrain;
        }
    }

    public static NeedForSpeed nitro() {
        return new NeedForSpeed(50, 4);
    }
}

class RaceTrack {
    private int distance;

    RaceTrack(int distance) {
        this.distance = distance;
    }

    public boolean canFinishRace(NeedForSpeed car) {
        while(!car.batteryDrained()){
            car.drive();
        }
        return car.distanceDriven() >= distance;
    }
}
