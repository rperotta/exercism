package org.customex.arrowword;

public class ArrowWord {
    public static void main(String[] args) {
        new ArrowWord().printPyramid("i topi non avevano nipoti");
    }

    public String formatString(String input) {
        int c = input.length();
        for (int i = 1; i < input.length() * 2; i++) {
            if (i <= input.length()) {
                System.out.println(input.substring(0, i));
            } else {
                c--;
                System.out.println(input.substring(0, c));
            }
        }
        return "";
    }

    //fatto da AIutante
    public void printPyramid(String input) {
        int length = input.length();

        // Parte crescente
        for (int i = 1; i <= length; i++) {
            System.out.println(input.substring(0, i));
        }

        // Parte decrescente
        for (int i = length - 1; i > 0; i--) {
            System.out.println(input.substring(0, i));
        }
    }

}
