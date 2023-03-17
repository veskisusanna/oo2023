public class Main {
    public static void main(String[] args) {
        System.out.println("Harmooniline keskmine,  " +
                "Koosta funktsioon, mille sisendiks on kahe kilomeetripikkuse lõigu läbimise kiirused (km/h)," +
                " väljundiks nende kahe kilomeetri läbimise keskmine kiirus.\n" +
                "* Funktsioonile antakse ette kilomeetripikkuste lõikude läbimiste keskmised kiirused kogumina (km/h)." +
                " Väljasta kogu selle tee läbimise keskmine kiirus.\n" +
                "* Kilomeetriste lõikude läbimiste keskmised kiirused loetakse sisse failist, kogu teekonna läbimise keskmine kiirus " +
                "salvestatakse faili.");

        HarmoonilineKeskmine keskmineKiirus = new HarmoonilineKeskmine(20,30);

    }
}