package ee.susanna.kontrolltoo2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class MatkajaController {

    @Autowired
    private MatkajaRepository matkajaRepository;

    @GetMapping
    public List<Matkaja> koikMatkajad() {
        return matkajaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Matkaja saaMatkaja(@PathVariable Long id) {
        // See RuntimeException on selle jaoks kui matkajat ei leitud selle kindla id kaudu.
        Matkaja matkaja = matkajaRepository.findById(id).orElseThrow(() -> new RuntimeException("Matkajat ei leitud"));
        return matkaja;
    }

    @PostMapping("/lisa-matkaja") //Selle jaoks on Postmani vaja
    public Matkaja lisaMatkaja(@RequestBody Matkaja matkaja) {
        Matkaja uusMatkaja = matkajaRepository.save(matkaja);
        return uusMatkaja;
    }

    @PostMapping("/{matkajaId}/lisakm")
    public Matkaja lisaKm(@PathVariable Long matkajaId, @RequestParam double km) {
        Matkaja matkaja = matkajaRepository.findById(matkajaId).orElseThrow(() -> new RuntimeException("Matkajat ei leitud"));
        matkaja.lisaKm(km);
        matkajaRepository.save(matkaja);
        return matkaja;
    }
}
