/*
1.	Creati o clasa noua cu numele Animal cu atributele: nume (String), culoare (String), vegetarian (boolean);
*/
public class Animal {
    String nume;
    String culoare;
    boolean vegetarian;

    /*
    2.	Adaugati un constructor cu 0 parametri cu valori default (nume “unknwon”, culoare “unknown”, vegetarian “false”);
     */
    Animal() {
        nume = "unknown";
        culoare = "unknown";
        vegetarian = false;
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
    /*
    * 4.	Adaugati doua metode (non-statice) void pentru clasa Animal: mananca() si doarme()
    * care sa afiseze “numeAnimal mananca”, respectiv “numeAnimal doarme”
    * */
    public void mananca(){
        System.out.println(nume + " mananca");
    }

    public void doarme(){
        System.out.println(nume + " doarme");
    }
    /*
    5.	Adaugati o metoda (non-statica) afiseaza() care sa returneze (cu return de tip String)
    “numeAnimal are culoarea culoare”.
    * */

    public String afiseaza(){
        String rezultat = nume + " are culoarea " + culoare;
        return rezultat;
    }

    /*
    * 6.	In Clasa Main, creati doua obiecte de tip Animal folosind constructori si valori la alegere
    * */
}

