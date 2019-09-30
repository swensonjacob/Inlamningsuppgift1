package se.jacobswenson;

public class Main {

    public static void main(String[] args) {
        Hotel hotel = new Hotel();

        while (true) {
            try {
                hotel.getFoodInformation();
                break;

            } catch (NullPointerException e) {
                Output.errorMessage();
            }
        }

    }

}

