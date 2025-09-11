package entities;

public class Dipendente {
    //Attributi

    private int matricola;
    private int stipendio;
    private Dipartimento dipartimento;

    //Costruttori

    public Dipendente(int matricola, int stipendio, Dipartimento dipartimento) {
        this.matricola = matricola;
        this.stipendio = stipendio;
        this.dipartimento = dipartimento;
    }

    //Getter

    public int getMatricola() {
        return matricola;
    }

    public int getStipendio() {
        return stipendio;
    }

    public Dipartimento getDipartimento() {
        return dipartimento;
    }

    //Setter

    public void setDipartimento(Dipartimento dipartimento) {
        this.dipartimento = dipartimento;
    }

    //Metodi

}
