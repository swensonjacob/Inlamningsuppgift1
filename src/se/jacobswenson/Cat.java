package se.jacobswenson;

public class Cat extends Animal implements IFoodCalc {

    private double foodPortion;

    /**
     * Konstruktor.
     */
    public Cat(Name name, double weightInGram) {
        super(name, weightInGram);
        this.foodPortion = setFoodPortion(weightInGram);
    }

    /**
     * Beräkning av portionsstorlek från interface IFoodCalc
     */
    @Override
    public double setFoodPortion(double weight) {
        return weight / 150;
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
        return getName() + " äter " + portionToString(this.foodPortion) + " gram kattfoder";
    }
}
