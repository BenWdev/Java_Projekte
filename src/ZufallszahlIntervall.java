public class ZufallszahlIntervall {
    public static void main(String[] args) {

        double gleit = Math.random();
        int ganz;

        //Intervall

        int untere = 10;
        int obere = 20;

        System.out.println(gleit);

        gleit = gleit * (obere-untere+1);
        System.out.println(gleit);

        gleit = gleit + untere;
        System.out.println(gleit);

        ganz = (int) gleit;
        System.out.println(ganz);

    }
}