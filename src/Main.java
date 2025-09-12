import entities.Dipartimento;
import entities.Dipendente;
import entities.DipendenteFullTime;
import entities.DipendetePartTime;

public class Main {
    public static void main(String[] args) {
        //Istanze

//        Dipendente Davide = new Dipendente(3, 1200, Dipartimento.AMMINISTRAZIONE);
//        Dipendente Alessandra = new Dipendente(5, 1800, Dipartimento.VENDITE);
//
//        Dipendente[] dipendenti = {
//                Davide, Alessandra
//        };
//
//        for (Dipendente dipendente : dipendenti) {
//            dipendente.getMatricola();
//        }

        DipendenteFullTime Gian = new DipendenteFullTime(3, 1200, Dipartimento.AMMINISTRAZIONE);
        DipendetePartTime Giorgio = new DipendetePartTime(5, 700, Dipartimento.VENDITE, 10);

        Dipendente[] dipendenti = {
                Gian, Giorgio
        };

        for (Dipendente singleDipendente : dipendenti) {
            System.out.println(singleDipendente.calculateSalary());
        }
    }
}
