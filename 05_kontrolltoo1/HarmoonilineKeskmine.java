
public class HarmoonilineKeskmine {

        double kiirus1;
        double kiirus2;
        double keskmineKiirus;

    public HarmoonilineKeskmine(double kiirus1, double kiirus2) {
        this.kiirus1 = kiirus1;
        this.kiirus2 = kiirus2;

    }

    public void Keskmine() {
        keskmineKiirus= (kiirus1 + kiirus2) / 2.0;
        System.out.println("Kahe kiiruse keskmine kiirus on " + keskmineKiirus + " km/h.");
    }
}
