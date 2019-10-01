package se.jacobswenson;

public class Dog extends Animal implements IFoodCalc {

    private double foodPortion;

    /**
     * Konstruktor.
     */
    public Dog(Name name) {
        super(name);
        this.foodPortion = setFoodPortion(super.getWeight());
    }

    /**
     * Beräkning av portionsstorlek från interface IFoodCalc
     */
    @Override
    public double setFoodPortion(double weight) {
        return weight / 100;
    }

    /**
     * Skapar String med information om djurets portionsstorlek
     */
    @Override
    public String getFoodPortionMessage() {
        return super.getName() + " äter " + super.portionToString(this.foodPortion) + " gram hundfoder";
    }

}
