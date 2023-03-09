import java.util.Calendar;

public class Main {
    public static void main(String[] args) {
        int arv = 10;
        NumberType(arv);
        int EAP = 61;
        Ainepunktid(EAP);
        Calendar cal = Calendar.getInstance();
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        int minute = cal.get(Calendar.MINUTE);
        Lounaaeg(hour, minute);
    }

    private static void Lounaaeg(int hour, int minute) {
        if ((hour >= 12) && (13 >= hour) && (minute <= 0)) {
            System.out.println("On aeg lõunat süüa!");
        } else {
            System.out.println("Lõunaaeg on kas läbi või pole alanud.");
        }
    }

    private static void Ainepunktid(int EAP) {
        int tooTunnid = EAP * 26;
        System.out.println("Õpilane on õppinud " + tooTunnid + " tundi");
    }

    private static void NumberType(int arv) {
        if (arv % 2 == 0) {
            System.out.println(arv + " on paarisarv");
        } else {
            System.out.println(arv + " ei ole paarisarv");
        }
    }
}

