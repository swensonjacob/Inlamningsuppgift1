package se.jacobswenson;

/**
 * Enum med namnen på djuren som finns på hotellet samt deras vikt.
 */
public enum Name {
    SIXTEN(5000), DOGGE(10000), VENUS(5000), OVE(3000), HYPNO(1000);
    private final int weightInGram;

    Name(int weight) {
        this.weightInGram = weight;
    }

    public int getWeightInGram() {
        return this.weightInGram;
    }
}
