package com.Probability;

import java.util.Map;

/**
 * Created by tprashan on 3/16/2015.
 */
public class VolumeCompare {
    private static final double PRECISION = 0.01;
    public static Map<Volume, Double> lengthConverterInVolume = VolumeConverter.getLengthInVolume();
    private double value;
    private Volume unit;
    public VolumeCompare(double value, Volume unit) {
        this.value = value;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof VolumeCompare)) return false;

        VolumeCompare that = (VolumeCompare) o;

        System.out.println(Math.abs(normalize() - that.normalize()));
        return (Math.abs(normalize() - that.normalize()) <= PRECISION);


    }
    public double normalize(){
        return value*lengthConverterInVolume.get(unit);
    }
}
