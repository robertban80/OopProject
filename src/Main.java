import javax.sound.midi.Soundbank;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
/*
        Book book1 = new Book(); // am creat un obiect de tip Book sau am instantiat clasa Book

        System.out.println(book1.showAuthorAndTitle());

        //showILoveBooks();

        //creaza un obiect nou in clasa Oop
        Oop object1 = new Oop(); // nume clasa nume obiect = new
        Oop object2 = new Oop(); //new Oop() e constructorul

        System.out.println(object1.x);
        object2.x = 10;
        System.out.println(object2.x);
        System.out.println(object1.x);

        Car bmw = new Car();
        Car volvo = new Car();
        System.out.println(bmw.culuare + " " + bmw.anFabricatie);
        //System.out.println(bmw);

        volvo.culuare = "albastru";
        volvo.anFabricatie = 2020;
        System.out.println(volvo.culuare + " " + volvo.anFabricatie);


        Persoana person1 = new Persoana();
        System.out.println("Nume: " + person1.nume + " " + person1.prenume);
        System.out.println("Varsta: " + person1.varsta);

        Persoana person2 = new Persoana("Maria", "Ionescu");
        System.out.println(person2);
        System.out.println("Nume: " + person2.nume + " " + person2.prenume);
        System.out.println("Varsta: " + person2.varsta);
        System.out.println("Genul: " + person2.gen);

        Persoana person3 = new Persoana("Ana", "Maria", 22, "F");
        System.out.println(person3);
        System.out.println("Nume: " + person3.nume + " " + person3.prenume);
        System.out.println("Varsta: " + person3.varsta);
        System.out.println("Genul: " + person3.gen);

         // Homework: 6.	In Clasa Main, creati doua obiecte de tip Animal folosind constructori si valori la alegere


        Animal animal1 = new Animal("Caine", "Galben", false);
        Animal animal2 = new Animal("Pisica");

         // 7.	Tot in Main, apelati cele 3 metode (mananca, doarme, afiseaza) cu fiecare din cele doua obiecte

        animal1.doarme();
        animal2.doarme();
        animal2.mananca();
        animal1.mananca();
        System.out.println(animal1.afiseaza());
        System.out.println(animal2.afiseaza());
*/


        Film film1 = new Film();
        film1.setTitlu("Avatar 2");
        film1.getTitlu();
        film1.rating =7.9;
        film1.potrivitPtCopii =false;

        film1.afiseazaDacaEPotrivitPtCopii();
        System.out.println(film1.anProductie);

        Film film2 = new Film("Motanul incaltat 2", 2022, true);
        film2.afiseazaDacaEPotrivitPtCopii();
        film2.rating = 8.0;
        System.out.println(film2.rating);

        System.out.println(film1.afiseazaRating());
        System.out.println(film2.afiseazaRating());

    }

}