package com.Probability;

import netscape.security.Privilege;


public class Probability {
    private double probability;
    private static final int CERTAINTY = 1;

    private Probability(double value) {
        probability = value;
    }

    public static Probability getProbability(int totalChance, int chanceOf) {
        if(chanceOf<=totalChance && totalChance>0 && chanceOf>0)
            return new Probability((double)chanceOf/totalChance);
        return null;
    }

    public double getValue(){
        return this.probability;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Probability)) return false;

        Probability that = (Probability) o;

        if (Double.compare(that.probability, probability) != 0) return false;

        return true;
    }

    //        De Morgan's Law !(!P(A) && !P(B))
    public Probability or(Probability o) {
        return new Probability(this.negate().and(o.negate()).negate().getValue());
    }

    public Probability and(Probability probability) {
        return new Probability(this.probability * probability.probability);
    }

    public Probability negate() {
        return new Probability(CERTAINTY-(this.probability));
    }
}