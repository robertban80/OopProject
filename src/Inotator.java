public class Inotator extends Sportiv implements A, B{      // Inotator mosteneste pe Sportiv

    public Abilitate abilitateaInotatorului;

    public Inotator(String proba, String tara) {
        super(proba, tara);
    }

    public void seOdihneste(){
        super.seOdihneste();
        System.out.println("Inotatorul se odihneste");
    };

    @Override
    void seAntreneaza() {
        System.out.println("Inotatorul se antreneaza");
    }


    public void ceTaraReprezinta(){
        System.out.println("Inaotatorul reprezinta " + super.tara);

    }

    @Override
    public void metodaA() {

    }

    @Override
    public void metodaB() {

    }
}
