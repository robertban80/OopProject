public class Elev {
    public String nume; // individual pt fiecare obiect
    public static String diriginte; // comun tuturor obiectelor de tip Elev!!! pt ca e static

    public Elev(String nume) {
        this.nume = nume;
    }

    public void afiseazaElevDiriginte(){
        System.out.println(this.nume + " are ca diriginte pe " + diriginte);
    }
}

