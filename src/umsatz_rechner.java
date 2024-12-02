public class umsatz_rechner {
    public static void main(String[] args) {

        System.out.println("eingabe des Umsatzes: ");
        double umsatz = Double.parseDouble(System.console().readLine());
        int rabatt = 0;

        if(umsatz > 100) {
            if (umsatz > 500) {
                rabatt = 10;
        }else {
            rabatt = 5;
            }
        }else {
            rabatt = 0;
            System.out.println("der Umsatz ist nicht groß genung um Rabat zu erhalten");
        }


        double rechnungsbetrag = umsatz - rabatt;
        
        System.out.println("betrag der Rechnung " + rechnungsbetrag);


    }
}
