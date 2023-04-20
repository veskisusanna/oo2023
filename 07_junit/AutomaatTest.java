import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class AutomaatTest {
    @Test
    public void kontrolli_kas_telefo_on_kallis_kui_hind_on_1200() {
        Telefon telefon = new Telefon("iPhone",1200,2021);
        assertEquals("Telefon on kallis!", telefon.getHind());
    }
    @Test
    public void kontrolli_kas_arvuti_on_vana(){
        Arvuti arvuti = new Arvuti("Samsung",800,2022);
        assertEquals("Tegemist on pigem uue arvuti!", arvuti.getVanus());
    }

    @Test
    public void kontrolli_kas_televiisor_on_uuem(){
        Televiisor televiisor = new Televiisor("LG", 2000, 2019);
        assertEquals("Tegemist on pigem uue telekaga!", televiisor.getVanus());
    }
    @Test
    public void kontrolli_kas_televiisor_on_kallim(){
        Televiisor televiisor = new Televiisor("LG", 2000, 2019);
        assertEquals("Telekas on pigem kallis!", televiisor.getHind());
    }
}
