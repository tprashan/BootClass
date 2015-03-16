package com.Probability;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by tprashan on 3/14/2015.
 */
public class LengthConverter {
    public static Map<Lengths, Double> getLengthConverter(){
        Map<Lengths, Double> lengthConverter = new HashMap<Lengths, Double>();
        lengthConverter.put(Lengths.INCHES, 1.0);
        lengthConverter.put(Lengths.FEET, 12.0);
        lengthConverter.put(Lengths.CENTIMETER,0.4);
        return lengthConverter;
    }
}

class VolumeConverter{
    public static Map<Volume , Double> getLengthInVolume(){
        Map<Volume, Double> volumeConverter = new HashMap<Volume, Double>();
        volumeConverter.put(Volume.GALLON,3780.0);
        volumeConverter.put(Volume.LITERS,1000.0);
        return volumeConverter;
    }
}
