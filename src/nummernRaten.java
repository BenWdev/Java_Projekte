public class nummernRaten {
    public static void main(String[] args) {

        System.out.println("Rate eine Zahl zwischen 1 und 25");

        int zufallsZahl = (int) (Math.random() * 25) + 1;
        System.out.println(zufallsZahl);
        int raten = 0;
        int versuche = 0;

        while (raten != zufallsZahl) {
            System.out.print("Gib deine geschätzte Nummer ein: ");
            raten = Integer.parseInt(System.console().readLine());
            versuche++;

            if (raten < zufallsZahl) {
                System.out.println("Zahl ist zu niedrig");
            } else if (raten > zufallsZahl) {
                System.out.println("Zahl ist zu groß");
            } else {
                System.out.println("Richtig");
                System.out.println("Du hast " + versuche + " Versuche benötigt");
            }
        }
    }
}
