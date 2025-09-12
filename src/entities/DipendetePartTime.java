package entities;

public class DipendetePartTime extends Dipendente {
    //Attributo

    public int workedHours;

    //Costruttori

    public DipendetePartTime(int m, double s, Dipartimento d, int w) {
        super(m, s, d);
        this.workedHours = w;
    }

    //Metodi

    @Override
    public double calculateSalary() {
        return this.getStipendio() * this.workedHours;
    }

}
