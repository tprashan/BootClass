package com.Probability;


import sun.font.GlyphLayout;

import java.util.Map;

public class LengthCompare {
    private static final double PRECISION = 0.01;
    public static Map<Lengths, Double> lengthConverterInInches = LengthConverter.getLengthConverter();
    private Double unitValue;
    private Lengths unit;
    public LengthCompare(Double unitValue, Lengths unit){
        this.unitValue = unitValue;
        this.unit = unit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LengthCompare)) return false;

        LengthCompare that = (LengthCompare) o;
        return (Math.abs(normalize() - that.normalize()) < PRECISION);
    }

    public double normalize(){
        return unitValue * lengthConverterInInches.get(unit);
    }

    public LengthCompare convertTo(Lengths unit) {
        return new LengthCompare(unitValue/lengthConverterInInches.get(unit),unit);
    }
}
