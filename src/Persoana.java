public class Persoana {
    String nume;
    String prenume;
    int varsta;
    String gen;

    Persoana(){ //asta e un constructor ! Are numele clasei! Valori default pentru clasa
        gen = "m";
        nume = "unknown";
        prenume = "unknown";
        varsta = 100;

    }

    Persoana(String nume, String prenume){
        this.nume = nume;
        this.prenume = prenume;
    }

    public Persoana(String nume, String prenume, int varsta, String gen) {
        this.nume = nume;
        this.prenume = prenume;
        this.varsta = varsta;
        this.gen = gen;
    }
}
