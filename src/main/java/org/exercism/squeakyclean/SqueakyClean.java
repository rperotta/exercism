package org.exercism.squeakyclean;

public class SqueakyClean {
    public static void main(String[] args) {
        System.out.println(clean("my    id"));
    }

    static String clean(String identifier) {
        StringBuilder sb = new StringBuilder(identifier.replace(" ", "_"));
        int indexOfKC = 0;
        while (sb.indexOf("-") != -1) {
            indexOfKC = sb.indexOf("-");
            sb.deleteCharAt(indexOfKC);
            sb.setCharAt(indexOfKC, Character.toUpperCase(sb.charAt(indexOfKC)));
        }
        sb = new StringBuilder(
                sb.toString()
                        .replace("4", "a")
                        .replace("3", "e")
                        .replace("0", "o")
                        .replace("1", "l")
                        .replace("7", "t")
                        .replaceAll("[^a-zA-Z_]", "")
        );
        return sb.toString();
    }
}
