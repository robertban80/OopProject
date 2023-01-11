/*
1.	Creati o clasa noua cu numele Animal cu atributele: nume (String), culoare (String), vegetarian (boolean);
*/
public class Animal {
    String nume;
    String culoare;
    boolean vegetarian;

    //8.	Adaugati un atribut/camp nou in clasa Animal cu numele nrPicioare;

    int nrPicioare;

    private String undeTraieste; // adica, unde traieste animalul

    // getter-setter pentru undeTraieste

    public String getUndeTraieste() {
        return undeTraieste;
    }

    public void setUndeTraieste(String undeTraieste) {
        this.undeTraieste = undeTraieste;
    }

    //2.	Adaugati un constructor cu 0 parametri cu valori default (nume “unknwon”, culoare “unknown”, vegetarian “false”);
    //9.	Creati/updatati constructorul a.i. sa contina noul camp
    public Animal() {
        nume = "unknown";
        culoare = "unknown";
        vegetarian = false;
        nrPicioare = 0;
    }
/*
* 3.	Adaugati 3 constructori cu 1, 2, 3 parametri (folosind this); Hint: Code > Generate > Constructor
* */

    public Animal(String nume) {
        this.nume = nume;
    }

    public Animal(String nume, String culoare) {
        this.nume = nume;
        this.culoare = culoare;
    }

    public Animal(String nume, String culoare, boolean vegetarian) {
        this.nume = nume;
        this.culoare = culoare;
        this.vegetarian = vegetarian;
    }

    //9.	Creati/updatati constructorul a.i. sa contina noul camp
    public Animal(String nume, String culoare, boolean vegetarian, int nrPicioare) {
        this.nume = nume;
        this.culoare = culoare;
        this.vegetarian = vegetarian;
        this.nrPicioare = nrPicioare;
    }
    // 4.	Adaugati doua metode (non-statice) void pentru clasa Animal: mananca() si doarme()
    // care sa afiseze “numeAnimal mananca”, respectiv “numeAnimal doarme”

    public void mananca(){
        System.out.println(nume + " mananca");
    }

    public void doarme(){
        System.out.println(nume + " doarme");
    }

    // 5.	Adaugati o metoda (non-statica) afiseaza() care sa returneze (cu return de tip String)
    // “numeAnimal are culoarea culoare”.


    public String afiseaza(){
        String rezultat = nume + " are culoarea " + culoare;
        return rezultat;
    }


    // 6.	In Clasa Main, creati doua obiecte de tip Animal folosind constructori si valori la alegere

    //10.	Creati o metoda care afiseaza: “nu are picioare” (daca nu are picioare),
    // “are 2 picioare” (daca are doua picioare), “are 4 picioare” (daca nrPicioare==4)
    // sau “are alt numar de picioare”.

    public void numarPicioare(){
        if (this.nrPicioare==0){
            System.out.println("Nu are picioare!");
        } else if (this.nrPicioare==2) {
            System.out.println("Are 2 picioare!");
        } else if (this.nrPicioare==4) {
            System.out.println("Are 4 picioare!");
        } else {
            System.out.println("Are alt numar de picioare!");
        }


    }
}

