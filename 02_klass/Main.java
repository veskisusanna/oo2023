public class Main {
    public static void main(String[] args) {
       Pank susanna = new Pank("Susanna","Veski","eur",
               "LHV","kogumiskonto",10000);

       Pank karl = new Pank("Karl","Tamm","eur",
               "SEB","arvelduskonto",3847);

       susanna.rahaSumma();
       susanna.rahaLisamine(500);
       susanna.konto();

       karl.rahaSumma();
       karl.rahaLisamine(340);
       karl.konto();
    }
}