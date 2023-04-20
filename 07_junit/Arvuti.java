public class Arvuti extends ElektroonikaPood implements Andmed {

    public Arvuti(String brand, int hind, int aastaKaik) {
        super(brand, hind, aastaKaik);
    }

    @Override
        public String getVanus() {
            float suhe = 2023 - this.aastaKaik;
            if (suhe > 5){
                return "Tegemist on vanema arvuti mudeliga!";
            }   else{
                return "Tegemist on pigem uue arvuti!";
            }
        }

        @Override
        public String getHind() {
            if (this.hind > 1000){
                return "Arvuti on kallis!";
            }   else{
                return "Arvuti ei ole nii kallis!";
            }
        }


    }
