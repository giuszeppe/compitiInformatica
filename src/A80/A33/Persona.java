package A80.A33;

public class Persona {
    private int eta;
    private String name;
    private String sesso;
    private String professione;
    public String getSesso() {
        return sesso;
    }
    public String getName(){
        return name;
    }
    public int getEta() {
        return eta;
    }
    private void setEta(int eta){
        this.eta = eta;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSesso(String sesso) {
        this.sesso = sesso;
    }
    public void setProfessione(String professione) {
        this.professione = professione;
    }
    public String getProfessione() {
        return professione;
    }
    public void chiSei(){
        System.out.printf("Sono una persona di nome: %s, età: %d, sesso: %s e professione: %s",this.name,this.eta,this.sesso, this.professione);
    }
    public Persona(String name, int eta, String sesso, String professione){
        this.name = name;
        this.eta = eta;
        this.sesso = sesso;
        this.professione = professione;
    }
    public static void main(String[] args) {
        Persona luca;
        luca = new Persona("Luca", 18, "maschio", "Insegnante");
        luca.chiSei();
    }
}
