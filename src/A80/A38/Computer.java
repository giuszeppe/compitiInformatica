package A80.A38;

public class Computer {
    private static int codiceAttuale = 0;
    private int codice;
    private String marca;
    private String modello;
    private int velocitàProcessore;
    private int dimRam;
    private int dimDisco;
    private int dimMonitor;
    private int annoAcquisto;

    public int getCodice() {
        return codice;
    }

    public void setCodice(int codice) {
        this.codice = codice;
    }

    public Computer() {
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModello() {
        return modello;
    }

    public void setModello(String modello) {
        this.modello = modello;
    }

    public int getVelocitàProcessore() {
        return velocitàProcessore;
    }

    public void setVelocitàProcessore(int velocitàProcessore) {
        this.velocitàProcessore = velocitàProcessore;
    }

    public int getDimRam() {
        return dimRam;
    }

    public void setDimRam(int dimRam) {
        this.dimRam = dimRam;
    }

    public int getDimDisco() {
        return dimDisco;
    }

    public void setDimDisco(int dimDisco) {
        this.dimDisco = dimDisco;
    }

    public int getDimMonitor() {
        return dimMonitor;
    }

    public void setDimMonitor(int dimMonitor) {
        this.dimMonitor = dimMonitor;
    }

    public int getAnnoAcquisto() {
        return annoAcquisto;
    }

    public void setAnnoAcquisto(int annoAcquisto) {
        this.annoAcquisto = annoAcquisto;
    }

    public Computer(String marca, String modello, int velocitàProcessore, int dimRam, int dimDisco, int dimMonitor, int annoAcquisto) {
        this.codice = codiceAttuale;
        codiceAttuale += 1;
        this.marca = marca;
        this.modello = modello;
        this.velocitàProcessore = velocitàProcessore;
        this.dimRam = dimRam;
        this.dimDisco = dimDisco;
        this.dimMonitor = dimMonitor;
        this.annoAcquisto = annoAcquisto;
    }


}
