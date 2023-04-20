public class Main {
    public static void main(String[] args) {
        Telefon telefon = new Telefon("iPhone",1200,2021);
        System.out.println(telefon.getVanus());
        System.out.println(telefon.getHind());

        Arvuti arvuti = new Arvuti("Samsung",800,2022);
        System.out.println(arvuti.getVanus());
        System.out.println(arvuti.getHind());

        Televiisor televiisor = new Televiisor("LG", 2000, 2019);
        System.out.println(televiisor.getVanus());
        System.out.println(televiisor.getHind());
    }
}