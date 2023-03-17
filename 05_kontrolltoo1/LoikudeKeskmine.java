import java.util.ArrayList;
import java.util.List;

public class LoikudeKeskmine {
    List<Double> kiirused = new ArrayList<>();


    public LoikudeKeskmine(List<Double> kiirused) {
        this.kiirused = kiirused;
        kiirused.add(15.0);
        kiirused.add(20.0);
        kiirused.add(40.0);

    }
    public void KiirusteKeskmine()   {
        double loigud = kiirused.size();
        for (int i = 0; i < kiirused.size(); i++) {
            loigud += kiirused.get(i);
        }
        double loikudeKiirused = loigud / kiirused.size();
        System.out.println("Lõikude kiiruste keskmine on " + loikudeKiirused + " km/h.");
    }
}

