package com.microsoft.identity.client.stresstests;

public class Util {

    public static String timeString(int seconds) {
        int hours = seconds / (3600);
        int min = (seconds / 60) % 60;
        int sec = seconds % 60;

        StringBuilder stringBuilder = new StringBuilder();
        if (hours > 0) {
            stringBuilder.append(hours == 1 ? "1 hour " : hours + " hours ");
        }
        if (min > 0) {
            stringBuilder.append(min == 1 ? "1 minute " : min + " minutes ");
        }

        if (sec != 0 || !(min > 0 || hours > 0)) {
            stringBuilder.append(sec == 1 ? "1 second " : sec + " seconds. ");
        }

        return stringBuilder.toString();
    }
}
