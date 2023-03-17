import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        HarmoonilineKeskmine keskmine1 = new HarmoonilineKeskmine(20,30);
        keskmine1.Keskmine();
        List<Double> kiirused = new ArrayList<>();
        LoikudeKeskmine keskmine2 = new LoikudeKeskmine(kiirused);
        keskmine2.KiirusteKeskmine();




    }
}