package se.jacobswenson;

public class Dog extends Animal implements IFoodCalc {

    private static double weightDivider = 100;
    private double foodPortion;

    /**
     * Konstruktor.
     */
    public Dog(Name name) {
        super(name);
        this.foodPortion = setFoodPortion();
    }

    /**
     * Beräkning av portionsstorlek från interface IFoodCalc
     */
    @Override
    public double setFoodPortion() {
        return super.getWeight() / weightDivider;
    }

    /**
     * Skapar String med information om djurets portionsstorlek
     */
    @Override
    public String getFoodPortionMessage() {
        return super.getName() + " äter " + super.portionToString(this.foodPortion) + " gram hundfoder";
    }

}
