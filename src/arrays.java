public class arrays {
    public static void main(String[] args) {

        int n = Integer.parseInt(System.console().readLine());


        int[]zahlen = new int[n];
        for (int i = 0; i < n; i++) {
            zahlen[i] = Integer.parseInt(System.console().readLine());
        }


        int minimum = zahlen[0];
        int maximum = zahlen[0];

        for (int zahl : zahlen) {
            if(zahl > maximum)
                maximum = zahl;

            if(zahl < minimum)
                minimum = zahl;
        }

        System.out.println("Das minimum ist: " + minimum);
        System.out.println("Das maximum ist :" + maximum);

    }
}