package com.Probability;

import junit.framework.Assert;
import junit.framework.TestCase;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static junit.framework.TestCase.assertTrue;

public class ProbabilityTest {
    @Test
    public void test_giveProbabilityWithTwoCoin(){
        Probability p1 = Probability.getProbability(2,1);
        TestCase.assertEquals(0.5,p1.getValue(),0.0);
    }

    @Test
    public void test_of_and_getting_two_tail(){
        Probability p1 = Probability.getProbability(2,1);
        Probability p2 = Probability.getProbability(2, 1);
        Probability expected = Probability.getProbability(4,1);
        assertTrue(p1.and(p2).equals(expected));
    }
    @Test
    public void test_of_at_least_one_getting_one_tail(){
        Probability p1 = Probability.getProbability(2,1);
        Probability p2 = Probability.getProbability(2,1);
        Probability result = p1.or(p2);
        Probability expected = Probability.getProbability(4,3);
        assertTrue(result.equals(expected));
    }

    @Test
    public void test_of_negate_not_getting_tail_in_one_coin(){
        Probability p1 = Probability.getProbability(2,1);
        Probability result = p1.negate();
        Probability expected =Probability.getProbability(2,1);
        assertTrue(result.equals(expected));
    }

    @Test
    public void test_of_negate_not_getting_two_tail(){
        Probability p1 = Probability.getProbability(2,1);
        Probability p2 = Probability.getProbability(2,1);
        Probability p3 = p1.and(p2);
        Probability result = p3.negate();
        Probability expected =Probability.getProbability(4,3);
        assertTrue(result.equals(expected));
    }
}