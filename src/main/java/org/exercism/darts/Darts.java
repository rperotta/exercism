package org.exercism.darts;

import java.util.HashMap;
import java.util.Map;

public class Darts {
    private static final int CENTER_X = 0;
    private static final int CENTER_Y = 0;

    public static void main(String[] args) {
        System.out.println(score(-5, 0));
    }

    static int score(double xOfDart, double yOfDart) {
        int score = 0;
        Map<Integer, Integer> radiusMap = new HashMap<>();
        radiusMap.put(1, 10);
        radiusMap.put(5, 5);
        radiusMap.put(10, 1);

        for (Integer key : radiusMap.keySet()) {
            if (Math.pow(xOfDart - CENTER_X, 2) + Math.pow(yOfDart - CENTER_Y, 2) <= Math.pow(key, 2)) {
                score = radiusMap.getOrDefault(key, 0);
                break;
            }
        }
        return score;
    }
}
