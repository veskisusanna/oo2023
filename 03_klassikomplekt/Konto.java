public class Konto {
    String nimi;
    double saldo;

    public Konto(String nimi, double saldo) {
        this.nimi = nimi;
        this.saldo = saldo;

    }

    public void sisseMakse(double summa) {
        saldo += summa;
        System.out.println(nimi + " tegi sissemakse summas: " + summa + " eurot. Uus saldo on " + saldo);
    }

    public void valjaMakse(double summa) {
        if (summa > saldo){
        System.out.println(nimi + " kontol ei ole piisavalt raha.");
    } else {
        saldo -= summa;
        System.out.println(nimi + " tegi väljamakse summas: " + summa + " eurot. Uus saldo on " + saldo);
    }

    }
    public void vaataSaldo(){
        System.out.println(nimi + " kontol on " + saldo + " eurot.");
    }
}
