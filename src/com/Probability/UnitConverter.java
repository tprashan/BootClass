package com.Probability;

import java.util.HashMap;
import java.util.Map;

public class UnitConverter {

    public static Map<Units, Double> getLengthConverter(){
        Map<Units, Double> lengthConverter = new HashMap<Units, Double>();
        lengthConverter.put(Units.INCHES, 1.0);
        lengthConverter.put(Units.FEET, 12.0);
        lengthConverter.put(Units.CENTIMETER,0.4);
        return lengthConverter;
    }

    public static Map<Units , Double> getLengthInVolume(){
        Map<Units, Double> volumeConverter = new HashMap<Units, Double>();
        volumeConverter.put(Units.GALLON,3780.0);
        volumeConverter.put(Units.LITERS,1000.0);
        return volumeConverter;
    }
}


