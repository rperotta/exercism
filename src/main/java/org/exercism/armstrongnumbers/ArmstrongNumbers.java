package org.exercism.armstrongnumbers;

public class ArmstrongNumbers {

    public static void main(String[] args) {
        System.out.println(isArmstrongNumber(20));
    }

    public static boolean isArmstrongNumber(int numberToCheck) {
        int sum = 0;
        int power = String.valueOf(numberToCheck).length();
        int[] digits = Integer.toString(numberToCheck).chars().map(c -> c - '0').toArray();
        for (int d : digits)
            sum += (int) Math.pow(d, power);
        System.out.println(numberToCheck);
        System.out.println(sum);
        return sum == numberToCheck;
    }
}
