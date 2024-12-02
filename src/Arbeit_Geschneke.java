public class Arbeit_Geschneke {
    public static void main(String[] args) {

        int g, s, w = 0;
        double l = 0;

        g = Integer.parseInt(System.console().readLine());

        if (g <= 5) {
            w = w + 1;
        } else if (g <= 20) {
            w = w + 2;
        } else if (g > 20) {
            w = w + 3;
        }

        System.out.println("geben sie nun deie von ihnen gemessene länge des pakets an: ");

        l = Double.parseDouble(System.console().readLine());

        System.out.println("geben sie das aktuelle Gewicht: ");

        s = Integer.parseInt(System.console().readLine());

        if (l != 1 && s >= 200) {
            System.out.println("Neuer Geschenkesack wird benötigt");
            w += 1;
        } else {
            System.out.println("Wichtel die du benötigst: " + w);
        }

    }
}
