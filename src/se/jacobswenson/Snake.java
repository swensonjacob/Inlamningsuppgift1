package se.jacobswenson;

public class Snake extends Animal {

    private double foodPortion;

    /**
     * Konstruktor.
     */
    public Snake(Name names, double weightInGram) {
        super(names, weightInGram);
        this.foodPortion = 20;
    }

    /**
     * Hämtar djurets namn från superklassen
     */
    @Override
    public String getName() {
        return super.getName();
    }

    /**
     * Returnerar formaterad portionsstorlek.
     */
    @Override
    public String portionToString(double portion) {
        return super.portionToString(portion);
    }

    /**
     * Skapar String med information om djurets portionsstorlek
     */
    @Override
    public String getFoodPortionMessage() {
        return getName() + " äter " + portionToString(this.foodPortion) + " gram ormpellets";
    }
}
