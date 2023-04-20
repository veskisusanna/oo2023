public class Televiisor extends ElektroonikaPood implements Andmed{
    public Televiisor(String brand, int hind, int aastaKaik) {
        super(brand, hind, aastaKaik);
    }

    @Override
    public String getVanus() {
        float suhe = 2023 - this.aastaKaik;
        if (suhe > 7){
            return "Tegemist on vanema teleka mudeliga!";
        }   else{
            return "Tegemist on pigem uue telekaga!";
        }
    }

    @Override
    public String getHind() {
        if (this.hind > 1000){
            return "Telekas on pigem kallis!";
        }   else{
            return "Telekas ei ole nii kallis!";
        }
    }
}
