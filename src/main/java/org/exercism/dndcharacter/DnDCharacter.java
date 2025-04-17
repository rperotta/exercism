package org.exercism.dndcharacter;

import java.util.*;

public class DnDCharacter {
    private int strength = ability(rollDice());
    private int dexterity = ability(rollDice());
    private int constitution = ability(rollDice());
    private int intelligence = ability(rollDice());
    private int wisdom = ability(rollDice());
    private int charisma = ability(rollDice());
    private int hitpoints = 10 + modifier(constitution);

    public static void main(String[] args) {
        DnDCharacter c = new DnDCharacter();
        c.ability(List.of(4, 3, 2, 1));
    }

    int ability(List<Integer> scores) {
        List<Integer> newScores = new ArrayList<>(scores);
        Collections.sort(newScores);
        newScores.remove(0);
        int ability = 0;
        for (int score : newScores) {
            ability += score;
        }
        return ability;
    }

    List<Integer> rollDice() {
        List<Integer> diceRolls = new ArrayList<>();
        for (int j = 0; j < 4; j++) {
            diceRolls.add(new Random().nextInt(1, 6));
        }
        return diceRolls;
    }

    int modifier(int value) {
        return (int) Math.floor(((double) value - 10) / 2);
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getCharisma() {
        return charisma;
    }

    public int getHitpoints() {
        return hitpoints;
    }
}
