package com.Probability;

import org.testng.annotations.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;


public class UnitTest {
    @Test
    public void test_that_12_inches_should_be_equal_to_1_feet(){
        CompareUnits u1 = new CompareUnits(12.0, Units.INCHES);
        CompareUnits u2 = new CompareUnits(1.0,Units.FEET);
        assertTrue(u1.equals(u2));
    }
    @Test
    public void test_that_13_inches_should_not_be_equal_to_1_feet(){
        CompareUnits u1 = new CompareUnits(13.0, Units.INCHES);
        CompareUnits u2 = new CompareUnits(1.0,Units.FEET);
        assertFalse(u1.equals(u2));
    }
    @Test
    public void test_that_14_4_should_be_equal_to_1_2_feet (){
        CompareUnits u1 = new CompareUnits(14.4, Units.INCHES);
        CompareUnits u2 = new CompareUnits(1.2,Units.FEET);
        assertTrue(u1.equals(u2));
    }
    @Test
    public void test_to_1_feet_equals_to_30_cm(){
        CompareUnits u1 = new CompareUnits(30.0, Units.CENTIMETER);
        CompareUnits u2 = new CompareUnits(1.0,Units.FEET);
        assertTrue(u1.equals(u2));
    }
    @Test
    public void test_to_5_feet_equals_to_150_cm(){
        CompareUnits u1 = new CompareUnits(150.0, Units.CENTIMETER);
        CompareUnits u2 = new CompareUnits(5.0,Units.FEET);
        assertTrue(u1.equals(u2));
    }
    @Test
    public void test_to_2_INCHES_equals_to_5_cm(){
        CompareUnits u1 = new CompareUnits(5.0, Units.CENTIMETER);
        CompareUnits u2 = new CompareUnits(2.0,Units.INCHES);
        assertTrue(u1.equals(u2));
    }
    @Test
    public void test_CONVERT_2_INCHES_into_5_cm(){
        CompareUnits u1 = new CompareUnits(5.0, Units.CENTIMETER);
        CompareUnits u2 = new CompareUnits(2.0,Units.INCHES);
        assertEquals(u1,u2.convertTo(Units.CENTIMETER));
    }
    @Test
    public void test_1_GALLON_should_be_equal_to_3p78_liters(){
        CompareUnits v1 = new CompareUnits(1.0,Units.GALLON);
        CompareUnits v2 = new CompareUnits(3.78,Units.LITERS);
        assertTrue(v1.equals(v2));
    }
    @Test
    public void test_1_GALLON_should_not_be_equal_to_40_Inches(){
        CompareUnits v1 = new CompareUnits(1.0,Units.GALLON);
        CompareUnits u1 = new CompareUnits(40.0,Units.INCHES);
        assertFalse(v1.equals(u1));
    }
    @Test
        public void test_should_give_false_when_we_compare_length_to_volume(){
        CompareUnits v1 = new CompareUnits(1.0,Units.FEET);
        CompareUnits u1 = new CompareUnits(1.0,Units.LITERS);
        assertFalse(v1.equals(u1));
    }
    @Test
        public void test_should_give_true_when_we_compare_liter7p56_and_2_gallon(){
        CompareUnits v1 = new CompareUnits(7.56,Units.LITERS);
        CompareUnits v2 = new CompareUnits(2.0,Units.GALLON);
        assertTrue(v1.equals(v2));
    }
    @Test
        public void test_should_give_false_when_we_compare_liter7p56_and_3_gallon(){
        CompareUnits v1 = new CompareUnits(7.56,Units.LITERS);
        CompareUnits v2 = new CompareUnits(3.0,Units.GALLON);
        assertFalse(v1.equals(v2));
    }
}
