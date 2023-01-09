public class Film {
    private String titlu;
    int anProductie;
    double rating;
    boolean potrivitPtCopii;

    public String getTitlu() {
        return titlu;
    }

    public void setTitlu(String titlu) {
        this.titlu = titlu;
    }

    public Film(String titlu, int anProductie, boolean potrivitPtCopii) {
        this.titlu = titlu;
        this.anProductie = anProductie;
        this.rating = rating;
        this.potrivitPtCopii = potrivitPtCopii;
    }

    public Film(){
        this.titlu = "unknown";
        this.anProductie = 2000;
        this.rating = 10.00;
        this.potrivitPtCopii = false;
    }

    public void afiseazaDacaEPotrivitPtCopii(){

        if (this.potrivitPtCopii == true) // identic cu if (this.potrivitPtCopii)
        {
            System.out.println(this.titlu + " e potrivit pentru copii!");
        }
        else
        {
            System.out.println(this.titlu + " nu e potrivit pentru copii!");
        }
    }

    public String afiseazaRating(){
        return (this.titlu + " are rating " + this.rating);
    }

}
