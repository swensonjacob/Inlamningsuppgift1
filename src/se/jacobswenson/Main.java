package se.jacobswenson;

public class Main {

    public static void main(String[] args) {
        Hotel hotel = new Hotel();
        Message message = new Message();

        while (true) {
            try {
                hotel.inputPrintAnimal();
                break;

            } catch (NullPointerException e) {
                message.errorMessage();
            }
        }

    }

}

