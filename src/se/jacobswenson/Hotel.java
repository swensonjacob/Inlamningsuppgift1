package se.jacobswenson;

import java.util.ArrayList;

public class Hotel {

    /**
     * Arraylist med djuren på hotellet.
     */
    private ArrayList<Animal> animals;

    /**
     * Konstruktor.
     */
    public Hotel() {
        this.animals = new ArrayList<>();

        animals.add(new Dog(Name.SIXTEN));
        animals.add(new Dog(Name.DOGGE));
        animals.add(new Cat(Name.VENUS));
        animals.add(new Cat(Name.OVE));
        animals.add(new Snake(Name.HYPNO));
    }

    /**
     * Kontrollerar om ingående namn återfinns i listan med hotellets djur.
     * private då den endast används inom klassen.
     */
    private Animal getAnimal(String name) {
        for (Animal animal : this.animals) {
            if (name.equalsIgnoreCase(animal.getName())) {
                return animal;
            }
        }
        return null;
    }

    /**
     * Skapar dialogruta för input, återfinns inmatat namn i listan över hotellets djur skapas infomeddelande,
     * annars felsignal.
     */
    public void getFoodInformation() {
        Animal animal = getAnimal(Output.nameQuestion());
        if (animal != null) {
            Output.foodInformation(animal);
        } else {
            throw new NullPointerException("Felaktigt angivet namn");
        }
    }

}
