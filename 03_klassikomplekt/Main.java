public class Main {
    public static void main(String[] args) {
        Konto konto1 = new Konto("Susanna Veski", 100);
        Hoiukonto konto2 = new Hoiukonto("Karl Tamm", 200, 1.1);
        Hoiukonto konto3 = new Hoiukonto("Peeter Kask", 458, 2.6);
        
        konto1.sisseMakse(100);
        konto1.valjaMakse(30);
        konto1.vaataSaldo();
        konto2.lisaIntress();
        konto3.lisaIntress();
        

    }
}