package se.jacobswenson;

import java.util.ArrayList;

public class Hotel {

    /**
     Arraylist med djuren på hotellet.
     */
    private ArrayList<Animal> animals;

    /**
     Konstruktor.
     */
    public Hotel() {
        this.animals = new ArrayList<>();

        animals.add(new Dog(Animal.Name.SIXTEN, 5000));
        animals.add(new Dog(Animal.Name.DOGGE, 10000));
        animals.add(new Cat(Animal.Name.VENUS, 5000));
        animals.add(new Cat(Animal.Name.OVE, 3000));
        animals.add(new Snake(Animal.Name.HYPNO, 1000));
    }

    /**
     Kontrollerar om ingående namn återfinns i listan med hotellets djur.
     private då den endast används inom klassen.
     */
    private Animal getAnimal(String name) {
        for (Animal animal : this.animals) {
            if (name.toLowerCase().equals(animal.getName().toLowerCase())) {
                return animal;
            }
        }
        return null;
    }

    /**
     Skapar dialogruta för input, återfinns inmatat namn i listan över hotellets djur skapas infomeddelande,
     annars felsignal.
     */
    public void inputPrintAnimal() {
        Message message = new Message();
        Animal animal = getAnimal(message.inputMessage());
        if (animal != null) {
            message.informationMessage(animal);
        } else {
            throw new NullPointerException("Felaktigt angivet namn");
        }
    }

}