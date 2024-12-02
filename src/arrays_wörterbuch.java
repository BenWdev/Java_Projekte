import java.util.Random;

public class arrays_wörterbuch {
    public static void main(String[] args) {

        String[] wörterbuch = {"Mein", "Name", "ist", "Ben", "Woike"};
        Random random = new Random();

        StringBuilder zufaelligerSatz = new StringBuilder();
        for (int i = 0; i < 5; i++) {
            zufaelligerSatz.append(wörterbuch[random.nextInt(wörterbuch.length)]).append(" ");
        }

        System.out.println("Zufälliger Satz: " + zufaelligerSatz.toString().trim() + ".");
    }
}

