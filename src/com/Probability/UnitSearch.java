package com.Probability;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class UnitSearch {
    //...
    public static Map<Units,Double> containsLength(Units unit){
        List<Map<Units,Double>> mapList = new ArrayList<Map<Units,Double>>();
        mapList.add(UnitConverter.getLengthConverter());
        mapList.add(UnitConverter.getLengthInVolume());
        for(Map<Units,Double> map : mapList){
            if(map.containsKey(unit))
                return map;
        }
        return null;
    }
}

