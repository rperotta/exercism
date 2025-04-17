package org.exercism.remotecontrolcompetition;

public class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar>{
    private int numberOfVictories;
    private int distanceDriven;

    @Override
    public void drive() {
        distanceDriven += 10;
    }

    @Override
    public int getDistanceTravelled() {
        return distanceDriven;
    }

    public int getNumberOfVictories() {
        return this.numberOfVictories;
    }

    public void setNumberOfVictories(int numberOfVictories) {
        this.numberOfVictories = numberOfVictories;
    }

    @Override
    public int compareTo(ProductionRemoteControlCar o) {
        return o.numberOfVictories - this.numberOfVictories;
    }
}
