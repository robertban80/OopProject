import java.util.ArrayList;
import java.util.HashMap;

public class StructuriDeDate {
    public static void main(String[] args){
        ArrayList<String> listaNoastra = new ArrayList<>();
        listaNoastra.add("First");
        listaNoastra.add("Second");
        listaNoastra.set(0,"First-updated");
        //listaNoastra.remove(0);
        System.out.println(listaNoastra.get(0));
        System.out.println(listaNoastra.indexOf("Second"));

        for (String value: listaNoastra){
            System.out.println(value);

        }

        HashMap <Integer, String> dictionarulNostru = new HashMap<>();
        dictionarulNostru.put(1,"Primul");
        dictionarulNostru.put(2,"Secund");
        dictionarulNostru.put(3,"Third");

        System.out.println(dictionarulNostru.get(0));
        System.out.println(dictionarulNostru.keySet());
        System.out.println(dictionarulNostru.values());
        System.out.println(dictionarulNostru.entrySet());
        dictionarulNostru.replace(1,"Noua valoare");
        System.out.println(dictionarulNostru.entrySet());

// tema lab 28 - 16.01.2023
        HashMap <String, Boolean> cineTreceExamenul = new HashMap<>();
        cineTreceExamenul.put("Gigel",false);
        cineTreceExamenul.put("Georgel",true);
        cineTreceExamenul.put("Maricica",true);
        cineTreceExamenul.put("Ana",true);
        cineTreceExamenul.put("Costel",false);
        //afisez tot setul
        System.out.println("\nAfisare sub forma de set/dictionar");
        System.out.println(cineTreceExamenul);
        //afisez sub forma de lista
        System.out.println("\nAfisare sub forma de lista");
        System.out.println(cineTreceExamenul.entrySet());
        //accesez o inregistrare
        System.out.println(cineTreceExamenul.get("Ana"));

// rezolvare ex. 13 din tema lab 28 - 16.02.2023
        for (String value: cineTreceExamenul.keySet()){
            if (cineTreceExamenul.get(value) == true) {System.out.println(value);}

        }
    }
}
