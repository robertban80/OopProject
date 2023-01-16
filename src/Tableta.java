public abstract class Tableta extends Device implements ObiectElectronic{
    @Override
    void porneste() {
        System.out.println("Tableta porneste");
    }

    @Override
    void seOpreste() {
        System.out.println("Tableta se opreste");
    }

    @Override
    public boolean eConectat() {
        return false;
    }
}
