package A80.A34;


public class Angolo {
    private int gradi;
    private int secondi;
    private int primi;
    
    public void setGradi(int gradi){
        this.gradi = gradi % 360;
    }
    public void setPrimi(int primi){
        this.primi = primi % 60;
    }
    public void setSecondi(int secondi){
        this.secondi = secondi % 60;
    }
    public int getGradi(){
        return this.gradi;
    }
    public int getPrimi(){
        return this.primi;
    }
    public int getSecondi(){
        return this.secondi;
    }
    
    public void visualizzaAngolo(){
        System.out.println(this.gradi + "gradi" + this.primi + "' " + this.secondi +'"');
    }
    public void aggiungiGradi(int n){
        this.setGradi(this.gradi+n);
    }
    public void aggiungiSecondi(int n){
        this.setSecondi(this.secondi+n);
    }
    public void aggiungiPrimi(int n){
        this.setPrimi(this.primi+n);
    }
    public int angoloSecondi(){
        return this.gradi*3600 + this.primi * 60 + this.secondi;
    }
    public void secondiAngolo(int n){
        this.setGradi(n/3600);
        n -= n/3600 * 3600;
        this.setPrimi(n/60);
        n -= n/60 * 60;
        this.setSecondi(n);
    }
    public int differenzaSecondi(Angolo a){
        return this.angoloSecondi() - a.angoloSecondi();
    }
    public void sommaAngolo(Angolo a){
        int tot = this.angoloSecondi() + a.angoloSecondi();
        this.secondiAngolo(tot);
    }
    public Angolo(int gradi, int secondi, int primi){
        this.gradi = gradi;
        this.secondi = secondi;
        this.primi = primi;
    }
    public Angolo(Angolo a){
        this.gradi = a.gradi;
        this.secondi = a.secondi;
        this.primi = a.primi;
    }
    public static void main(String[] args) {
        Angolo a1 = new Angolo(10,0,0);
        Angolo a2 = new Angolo(5,0,0);
        System.out.println(a1.angoloSecondi());
        System.out.println(a2.angoloSecondi());
        System.out.println(a1.differenzaSecondi(a2));
    }
}
