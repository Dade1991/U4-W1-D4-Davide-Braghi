package entities;

public abstract class Dipendente {
    //Attributi

    private int matricola;
    private double stipendio;
    private Dipartimento dipartimento;

    //Costruttori

    public Dipendente(int m, double s, Dipartimento d) {
        this.matricola = m;
        this.stipendio = s;
        this.dipartimento = d;
    }

    //Getter

    public int getMatricola() {
        return this.matricola;
    }

    public double getStipendio() {
        return this.stipendio;
    }

    //Setter

    public void setDipartimento(Dipartimento d) {
        this.dipartimento = d;
    }

    //Metodi astratti

    public abstract double calculateSalary();
}
