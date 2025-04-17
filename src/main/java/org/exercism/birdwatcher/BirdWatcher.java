package org.exercism.birdwatcher;

public class BirdWatcher {
    public static void main(String[] args) {
        int[] birdsPerDay = {2, 5, 0, 7, 4, 1};
        BirdWatcher birdCount = new BirdWatcher(birdsPerDay);
        System.out.println(birdCount.getBusyDays());
    }

    private final int[] birdsPerDay;

    public BirdWatcher(int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {
        return new int[]{0, 2, 5, 3, 7, 8, 4};
    }

    public int getToday() {
        return birdsPerDay[birdsPerDay.length - 1];
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1] = getToday() + 1;
    }

    public boolean hasDayWithoutBirds() {
        for (int i : birdsPerDay) {
            if (i == 0) {
                return true;
            }
        }
        return false;
    }

    public int getCountForFirstDays(int numberOfDays) {
        int count = 0;
        for (int i = 0;i < birdsPerDay.length && i < numberOfDays; i++) {
            count += birdsPerDay[i];
        }
        return count;
    }

    public int getBusyDays() {
        int count = 0;
        for (int i : birdsPerDay) {
            if (i >= 5) {
                count++;
            }
        }
        return count;
    }
}
