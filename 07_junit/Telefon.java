public class Telefon extends ElektroonikaPood implements Andmed {

    public Telefon(String brand, int hind, int aastaKaik) {
        super(brand, hind, aastaKaik);
    }

    @Override
    public String getVanus() {
        float suhe = 2023 - this.aastaKaik;
        if (suhe > 3){
            return "Tegemist on vanema telefoni mudeliga!";
        }   else{
            return "Tegemist on pigem uue telefoniga!";
        }
    }

    @Override
    public String getHind() {
        if (this.hind > 1000){
            return "Telefon on kallis!";
        }   else{
            return "Telefon ei ole nii kallis!";
        }
    }


}