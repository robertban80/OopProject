public class Smartphone extends Device{
    protected String marca;
    protected double pret;

    public Smartphone(String marca, double pret) {
        this.marca = marca;
        this.pret = pret;
    }

       @Override
    void porneste() {
        System.out.println("Telefonul porneste");
    }

    @Override
    void seOpreste() {
        System.out.println("Telefonul se opreste");
    }

    protected void afiseazaPret() {
        System.out.println("Pretul e: " + pret);
    }
}
