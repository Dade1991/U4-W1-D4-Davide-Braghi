import entities.Dipartimento;
import entities.Dipendente;

public class Main {
    public static void main(String[] args) {
        Dipendente dipendenteDirigente = new Dipendente(99, 2500, Dipartimento.VENDITE);
        Dipendente dipendenteTempoPieno = new Dipendente(67, 1800, Dipartimento.PRODUZIONE);
        Dipendente dipendentePartTime = new Dipendente(108, 1650, Dipartimento.AMMINISTRAZIONE);

        Dipendente[] dipendenti = {
                dipendenteDirigente,
                dipendenteTempoPieno,
                dipendentePartTime,
        };

        for (Dipendente arrayOfDipendenti : dipendenti) {
            System.out.println("Matricola: " + arrayOfDipendenti.getMatricola());
        }
    }
}
