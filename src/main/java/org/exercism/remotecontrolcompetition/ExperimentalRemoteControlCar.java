package org.exercism.remotecontrolcompetition;

import java.util.ArrayList;
import java.util.List;

public class ExperimentalRemoteControlCar implements RemoteControlCar {
    int distanceDriven = 0;

    public static void main(String[] args) {
        ProductionRemoteControlCar prc1 = new ProductionRemoteControlCar();
        ProductionRemoteControlCar prc2 = new ProductionRemoteControlCar();
        prc1.setNumberOfVictories(2);
        prc2.setNumberOfVictories(3);
        List<ProductionRemoteControlCar> unsortedCars = new ArrayList<>();
        unsortedCars.add(prc1);
        unsortedCars.add(prc2);
        unsortedCars.forEach(prc -> System.out.println(prc.toString()));
        List<ProductionRemoteControlCar> rankings = TestTrack.getRankedCars(unsortedCars);
        rankings.forEach(prc -> System.out.println(prc.toString()));
    }

    @Override
    public void drive() {
        distanceDriven += 20;
    }

    @Override
    public int getDistanceTravelled() {
        return distanceDriven;
    }
}
