package com.example.mattpo.touchtime_3xa3;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by MattPo on 2017-11-16.
 * This class contains the vibration patterns observed in
 * TouchTime in their base state
 */

public class VibrationPattern {
    public ArrayList<Long> signalVib = new ArrayList<Long>(Arrays.asList(1000L, 0L));
    public ArrayList<Long> minuteTensVib = new ArrayList<Long>(Arrays.asList(80L, 400L));
    public ArrayList<Long> longVib = new ArrayList<Long>(Arrays.asList(50L, 1000L));
    public ArrayList<Long> minuteOnesVib = new ArrayList<Long>(Arrays.asList(85L, 250L));
    public ArrayList<Long> hourVib = new ArrayList<Long>(Arrays.asList(80L, 400L));

}
