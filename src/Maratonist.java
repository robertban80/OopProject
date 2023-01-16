public class Maratonist extends Sportiv{
    public Maratonist(String proba, String tara) {
        super(proba, tara);
    }   // Maratonist mosteneste pe Sportiv
    @Override
    void seAntreneaza() {
        System.out.println("Maratonistul se antreneaza");
    }

}
