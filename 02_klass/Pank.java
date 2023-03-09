public class Pank {

    String eesnimi;
    String perenimi;
    String valuuta;
    String pangaNimi;
    String kontoTyyp;
    double rahaSumma;

    public Pank(String eesnimi, String perenimi, String valuuta,
                String pangaNimi, String kontoTyyp, double algneSumma) {
        this.eesnimi = eesnimi;
        this.perenimi = perenimi;
        this.valuuta = valuuta;
        this.pangaNimi = pangaNimi;
        this.kontoTyyp = kontoTyyp;
        this.rahaSumma = algneSumma;
    }

    public void rahaLisamine(double summa) {
        rahaSumma += summa;
        System.out.println("Panite " + summa + valuuta + " enda " + kontoTyyp + "le.");
    }

    public void konto() {
        System.out.println(eesnimi +" "+ perenimi + ",teie " + kontoTyyp + "l " + pangaNimi + "-s on nüüd " + rahaSumma + valuuta + ".");
    }

    public void rahaSumma() {
        System.out.println("Algne rahasumma teie kontol on " + rahaSumma + ".");
    }
}
