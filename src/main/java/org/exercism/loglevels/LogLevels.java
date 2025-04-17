package org.exercism.loglevels;

public class LogLevels {

    public static void main(String[] args) {
        System.out.println(message("[WARNING]:  Disk almost full\r\n"));
        // => "Disk almost full"

        System.out.println(logLevel("[WARNING]:  Disk almost full\r\n"));
        // => "Disk almost full"

        System.out.println(reformat("[WARNING]:  Disk almost full\r\n"));
        // => "Disk almost full"
    }

    public static String message(String logLine) {
        String message =  logLine.split(":")[1].replaceAll("^\\s+|\\s+$", "");
        return message;
    }

    public static String logLevel(String logLine) {
        String message =  logLine.split(":")[0].replaceAll("^[\\s\\[\\]]+|[\\s\\[\\]]+$", "").toLowerCase();
        return message;
    }

    public static String reformat(String logLine) {
        //return String.format("%s (%s)", message(logLine), logLevel(logLine)); not efficient
        return message(logLine) + " (" + logLevel(logLine) + ")";
    }
}

