package se.jacobswenson;

public class Snake extends Animal {

    private double foodPortion;

    /**
     * Konstruktor.
     */
    public Snake(Name name) {
        super(name);
        this.foodPortion = 20;
    }

    /**
     * Skapar String med information om djurets portionsstorlek
     */
    @Override
    public String getFoodPortionMessage() {
        return super.getName() + " äter " + super.portionToString(this.foodPortion) + " gram ormpellets";
    }
}
