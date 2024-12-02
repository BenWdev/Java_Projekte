public class test {
    public static void main(String[] args) {

        class Spiel
        {
            Spiel()
            {

            }

            void rateEinmal()
            {
                boolean gewonnen;
                gewonnen = true;
                int spieler = 1;
                int punkte1 = 0;
                int punkte2 = 0;
                while (gewonnen = true) {
                    int zahlEins = zufallszahl(10);
                    int zahlZwei = zufallszahl(10);
                    boolean richtig;
                    richtig = false;
                    int loesung = zahlEins + zahlZwei;
                    System.out.println("Wie viel ist " + zahlEins + " + " + zahlZwei + "?");
                    int antwort = leseZahl();
                    System.out.println("Das Ergebnis war " + loesung);
                    if (antwort == loesung) {
                        System.out.println("Super! Richtig gerechnet.");
                        richtig = true;
                    } else {
                        System.out.println("Leider falsch. Richtig war:" + " " + loesung);
                        richtig = false;
                    }
                    if (richtig == true && spieler == 1) {
                        punkte1 = punkte1 + 1;
                    }
                    if (richtig == true && spieler == 2) {
                        punkte2 = punkte2 + 1;
                    }
                    if (spieler == 1) {
                        spieler = 2;
                    } else {
                        spieler = 1;
                    }
                    if (punkte1 == 10) {
                        gewonnen = false;
                    }
                    if (punkte2 == 10) {
                        gewonnen = false;
                    }
                    if (punkte1 == 10) {
                        System.out.println("Spieler 1 hat gewonnen!");
                    }
                    if (punkte2 == 10) {
                        System.out.println("Spieler 2 hat gewonnen!");
                    }
                }
            }

            int zufallszahl(int n)
            {
                return new java.util.Random().nextInt(n);
            }

            int leseZahl()
            {
                return new java.util.Scanner(System.in).nextInt();
            }

        }
    }
}
