package com.Probability;


import java.util.Map;

public class CompareUnits {
    private static final double PRECISION = 0.01;
    private Double unitValue;
    private Units unit;
    private Map<Units, Double> converter;

    public CompareUnits(Double unitValue, Units unit){
        this.unitValue = unitValue;
        this.unit = unit;
        this.giveMap();
    }

    public void giveMap(){
        try{
            converter = UnitSearch.containsLength(unit);
        }
        catch (Exception e){
            System.out.printf("Error");
        }
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CompareUnits)) return false;
        CompareUnits that = (CompareUnits) o;
        return (Math.abs(normalize() - that.normalize()) < PRECISION);
    }

    public double normalize(){
        return unitValue * converter.get(unit);
    }

    public CompareUnits convertTo(Units unit) {
        return new CompareUnits(unitValue/converter.get(unit),unit);
    }
}
