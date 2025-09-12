package entities;

public class DipendenteFullTime extends Dipendente {
    //Costruttori

    public DipendenteFullTime(int m, double s, Dipartimento d) {
        super(m, s, d);
    }

    //Metodi

    @Override
    public double calculateSalary() {
        return this.getStipendio();
    }

}
