package se.jacobswenson;

public abstract class Animal {

    private Name name;
    private double weight;

    /**
     Konstruktor.
     */
    public Animal(Name name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    /**
     Hämtar djurets namn där namnet börjar med stor bokstav.
     */
    public String getName() {
        return capitalize(name.toString().toLowerCase());
    }

    /**
     Returnerar string med antingen en decimal eller utan decimal.
     */
    public String portionToString(double portion) {
        if (portion % 1 == 0) {
            return String.format("%.0f", portion);
        } else {
            return String.format("%,.1f", portion);
        }
    }

    /**
     Returnerar ingående String formaterad så den börjar med stor bokstav.
     */
    private String capitalize(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

    /**
     Abstrakt metod för implementering i subklasserna.
     */
    public abstract String getFoodPortionMessage();

}
