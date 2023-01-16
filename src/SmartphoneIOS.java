public class SmartphoneIOS extends Smartphone{
    public SmartphoneIOS(String marca, double pret) {
        super(marca, pret);
    }
    public void afiseazaPret(){
        super.afiseazaPret();
        System.out.println("Super pret e: " + 333.11);
    }
    @Override
    void porneste() {
        System.out.println("Telefonul iOS porneste");
    }
}
