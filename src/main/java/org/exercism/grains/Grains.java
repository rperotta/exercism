package org.exercism.grains;

import java.math.BigInteger;

class Grains {
    public static void main(String[] args) {
        System.out.println(new Grains().grainsOnSquare(63));
        System.out.println("grains on board: " + new Grains().grainsOnBoard());
    }

    BigInteger grainsOnSquare(final int square) {
        if(square <= 0 || square > 64){
            throw new IllegalArgumentException("square must be between 1 and 64");
        }
        BigInteger count = BigInteger.valueOf(1);
        int numOfSquare = square;
        while (numOfSquare > 1) {
            count = count.multiply(BigInteger.valueOf(2));
            numOfSquare--;
        }
        return count;
    }

    BigInteger grainsOnBoard() {
        BigInteger count = BigInteger.valueOf(0);
        for(int square = 1; square <= 64; square++){
            count = count.add(grainsOnSquare(square));
        }
        return count;
    }

}
