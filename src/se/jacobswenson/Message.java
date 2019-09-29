package se.jacobswenson;

import javax.swing.*;

public class Message {

    /**
     Dialogruta för inmatande av djurnamn.
     */
    public String inputMessage() {
        String input = JOptionPane.showInputDialog(null, "Ange namn på djuret som skall få mat: ",
                "HealthyPets", JOptionPane.PLAIN_MESSAGE);
        if (input == null) {
            System.exit(0);
        }
        return input;
    }

    /**
     Felmeddelande för felaktigt inmatande av djurnamn.
     */
    public void errorMessage() {
        int input = JOptionPane.showConfirmDialog(null, "Felaktigt angivet namn" +
                "\nFörsök igen", "Felmeddelande", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        if (input != JOptionPane.OK_OPTION) {
            System.exit(0);
        }
    }
    /**
     informationsmeddelande gällande portionsstorlek för djuret.
     Polymorfism när getFoodPortionMessage() anropas då olika meddelanden
     returneras beroende på vilket djur det gäller.
     */
    public void informationMessage(Animal animal) {
        JOptionPane.showMessageDialog(null, animal.getFoodPortionMessage(),
                "Information", JOptionPane.INFORMATION_MESSAGE);
    }
}