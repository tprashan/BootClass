package com.Probability;

//import junit.framework.Assert;
import junit.framework.Assert;
import junit.framework.TestCase;
import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;


public class UnitTest {
    @Test
    public void test_that_12_inches_should_be_equal_to_1_feet(){
        LengthCompare u1 = new LengthCompare(12.0, Lengths.INCHES);
        LengthCompare u2 = new LengthCompare(1.0,Lengths.FEET);
        assertTrue(u1.equals(u2));
    }
    @Test
    public void test_that_13_inches_should_not_be_equal_to_1_feet(){
        LengthCompare u1 = new LengthCompare(13.0, Lengths.INCHES);
        LengthCompare u2 = new LengthCompare(1.0,Lengths.FEET);
        assertFalse(u1.equals(u2));
    }
    @Test
    public void test_that_14_4_should_be_equal_to_1_2_feet (){
        LengthCompare u1 = new LengthCompare(14.4, Lengths.INCHES);
        LengthCompare u2 = new LengthCompare(1.2,Lengths.FEET);
        assertTrue(u1.equals(u2));
    }
    @Test
    public void test_to_1_feet_equals_to_30_cm(){
        LengthCompare u1 = new LengthCompare(30.0, Lengths.CENTIMETER);
        LengthCompare u2 = new LengthCompare(1.0,Lengths.FEET);
        assertTrue(u1.equals(u2));
    }
    @Test
    public void test_to_5_feet_equals_to_150_cm(){
        LengthCompare u1 = new LengthCompare(150.0, Lengths.CENTIMETER);
        LengthCompare u2 = new LengthCompare(5.0,Lengths.FEET);
        assertTrue(u1.equals(u2));
    }
    @Test
    public void test_to_2_INCHES_equals_to_5_cm(){
        LengthCompare u1 = new LengthCompare(5.0, Lengths.CENTIMETER);
        LengthCompare u2 = new LengthCompare(2.0,Lengths.INCHES);
        assertTrue(u1.equals(u2));
    }
    @Test
    public void test_CONVERT_2_INCHES_into_5_cm(){
        LengthCompare u1 = new LengthCompare(5.0, Lengths.CENTIMETER);
        LengthCompare u2 = new LengthCompare(2.0,Lengths.INCHES);
        assertEquals(u2,u2.convertTo(Lengths.CENTIMETER));
    }
    @Test
    public void test_1_GALLON_should_bed_equal_to_3_78_liters(){
        VolumeCompare v1 = new VolumeCompare(1.0,Volume.GALLON);
        VolumeCompare v2 = new VolumeCompare(3.78,Volume.LITERS);
        assertTrue(v1.equals(v2));
    }
}
