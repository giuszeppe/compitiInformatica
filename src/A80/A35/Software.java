package A80.A35;

public class Software {
    private String denominazione;
    private String produttore;
    private String versione;
    private String sistemaOperativo;
    private int anno;

    public String getDenominazione() {
        return denominazione;
    }

    public void setDenominazione(String denominazione) {
        this.denominazione = denominazione;
    }

    public String getProduttore() {
        return produttore;
    }

    public void setProduttore(String produttore) {
        this.produttore = produttore;
    }

    public String getVersione() {
        return versione;
    }

    public void setVersione(String versione) {
        this.versione = versione;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        this.sistemaOperativo = sistemaOperativo;
    }

    public int getAnno() {
        return anno;
    }

    public void setAnno(int anno) {
        this.anno = anno;
    }

    public Software(String denominazione, String produttore, String versione, String sistemaOperativo, int anno) {
        this.denominazione = denominazione;
        this.produttore = produttore;
        this.versione = versione;
        this.sistemaOperativo = sistemaOperativo;
        this.anno = anno;
    }
    public Software(Software s2){
       this.denominazione = s2.denominazione;
       this.produttore = s2.produttore;
       this.versione = s2.versione;
       this.sistemaOperativo = s2.sistemaOperativo;
       this.anno = s2.anno;
    }
    public String toString() {
        return "Software: " +
                "denominazione='" + denominazione + '\'' +
                ", produttore='" + produttore + '\'' +
                ", versione='" + versione + '\'' +
                ", sistemaOperativo='" + sistemaOperativo + '\'' +
                ", anno=" + anno
                ;
    }
    public void compareAnno(Software s2){
        if(this.anno > s2.anno){
            System.out.println(this.denominazione + "è più recente");
        } else if (this.anno == s2.anno){
            System.out.println("I software sono usciti nello stesso anno");
        } else {
            System.out.println(s2.denominazione + " è più recente");
        }
    }

    public static void main(String[] args) {
        Software s1,s2;
        s1 = new Software("Word", "Microsoft", "365", "All", 2021);
        s2 = new Software("Excel", "Microsoft", "365", "All", 2021);
        System.out.println(s1.toString());
        s1.compareAnno(s2);
    }

}
