package org.exercism.highscores;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class HighScores {
    private List<Integer> highScores;

    public static void main(String[] args) {
        HighScores highScores = new HighScores(Arrays.asList(10, 30, 90, 20));
        System.out.println(highScores.personalTopThree().toString());
    }

    public HighScores(List<Integer> highScores) {
        this.highScores = highScores;
    }

    List<Integer> scores() {
        return highScores;
    }

    Integer latest() {
        return highScores.getLast();
    }

    Integer personalBest() {
        return Collections.max(highScores);
    }

    List<Integer> personalTopThree() {
        List<Integer> list = new ArrayList<>(highScores);
        list.sort(Collections.reverseOrder());
        if(list.size() > 3) {
            return list.subList(0, 3);
        }
        return list;
    }
}
