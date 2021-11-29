package A80.A36;

import A80.A35.Software;

public class CD {
    private String titolo;
    private String autore;
    private int durata;
    private int numeroBrani;

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    public String getAutore() {
        return autore;
    }

    public void setAutore(String autore) {
        this.autore = autore;
    }

    public int getDurata() {
        return durata;
    }

    public void setDurata(int durata) {
        this.durata = durata;
    }

    public int getNumeroBrani() {
        return numeroBrani;
    }

    public void setNumeroBrani(int numeroBrani) {
        this.numeroBrani = numeroBrani;
    }

    public CD(String titolo, String autore, int durata, int numeroBrani) {
        this.titolo = titolo;
        this.autore = autore;
        this.durata = durata;
        this.numeroBrani = numeroBrani;
    }

    public String toString() {
        return "CD" +
                "titolo='" + titolo + '\'' +
                ", autore='" + autore + '\'' +
                ", durata=" + durata +
                ", numeroBrani=" + numeroBrani
                ;
    }

    public void compareDurata(CD cd2){
        if(this.durata > cd2.durata){
            System.out.println(this.titolo + "Dura di più");
        } else if (this.durata == cd2.durata){
            System.out.println("hanno la stessa durata");
        } else {
            System.out.println(cd2.titolo + " Dura di più");
        }
    }
    public static void main(String[] args) {
        CD cd1,cd2;
        cd1 = new CD("Word", "Microsoft", 300, 2);
        cd2 = new CD("Excel", "Microsoft", 500, 4);
        System.out.println(cd1.toString());
        cd1.compareDurata(cd2);
    }
}
