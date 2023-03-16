public class Hoiukonto {
    String nimi;
    double saldo;
    double intressimaar;
    double rahaSumma;

    public Hoiukonto(String nimi, double saldo, double intressimaar) {
        this.nimi = nimi;
        this.saldo = saldo;
        this.intressimaar = intressimaar;
    }
    public void lisaIntress(){

        rahaSumma = saldo * intressimaar;
        System.out.println(nimi + ",intressiga oleks summa teie hoiukontol " + rahaSumma + " eurot.");

    }
}
