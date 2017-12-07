package com.example.mattpo.touchtime_3xa3;

import android.util.Log;

import java.util.ArrayList;

/**
 * Created by Evan Ansell on 2017-11-26.
 */

public class VibrationMethods {
    public static int [] vibCalc(int hour, int minute){
//            Log.i("HOUR",String.valueOf(hour));
//            Log.i("MINUTE",String.valueOf(minute));

        int [] vibCount = new int [3];
        vibCount[0] = hour;

        //int hourNum = hour;
        int minuteLong = minute / 10;
        vibCount[1] = minuteLong;
        int minuteShort = minute % 10;
        vibCount[2] = minuteShort;

        return vibCount;
    }

    public static long[] vibPatternMaker(int[] vibs) {
        VibrationPattern vibPat = new VibrationPattern();
        long[] vibPattern;

        ArrayList<Long> minuteTensVib = vibPat.minuteTensVib;
        ArrayList<Long> longVib = vibPat.longVib;
        ArrayList<Long> minuteOnesVib = vibPat.minuteOnesVib;
        ArrayList<Long> signalVib = vibPat.signalVib;
        ArrayList<Long> hourVib = vibPat.hourVib;

        ArrayList<Long> vibPatList = new ArrayList<Long>();

        if (vibs[0] != 0) {
            // Hours
            for (int i = 0; i < vibs[0]; i++) {
                vibPatList.addAll(hourVib);
            }
            // Delay in between hours and minutes
            vibPatList.addAll(signalVib);
            Log.i("VIB", vibs[0] + " long vibration(s (hours)");
        } else {
            vibPatList.addAll(longVib);
            vibPatList.addAll(signalVib);
            Log.i("VIB", "1 extra-long vibration (hour = 12)");
        }

        if (vibs[1] != 0) {
            // Minutes (Tens)
            for (int i = 0; i < vibs[1]; i++) {
                vibPatList.addAll(minuteTensVib);
            }
            vibPatList.addAll(signalVib);
            Log.i("VIB", vibs[0] + " long vibration(s) (hours)");
        }

        if (vibs[2] != 0) {
            // Minutes (Ones)
            for (int i = 0; i < vibs[2]; i++) {
                vibPatList.addAll(minuteOnesVib);
            }
        }

//            Log.i(ON_TAP, vibPatList.toString());

        vibPattern = new long[vibPatList.size()];
        Long[] tempHold = vibPatList.toArray(new Long[vibPatList.size()]);
        for (int i = 0; i < tempHold.length; i++) {
            vibPattern[i] = tempHold[i].longValue();
        }

        return vibPattern;
    }
}