package com.example.mattpo.touchtime_3xa3;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by MattPo on 2017-11-16.
 * This class contains the vibration patterns observed in
 * TouchTime in their base state
 */

public class VibrationPattern {
    public ArrayList<Long> signalVib = new ArrayList<Long>(Arrays.asList(50L, 1000L));
    public ArrayList<Long> longVib = new ArrayList<Long>(Arrays.asList(50L, 500L));
    public ArrayList<Long> medVib = new ArrayList<Long>(Arrays.asList(50L, 300L));
    public ArrayList<Long> shortVib = new ArrayList<Long>(Arrays.asList(50L, 100L));

}
