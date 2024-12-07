package Prob1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
@RequestMapping("/masini")
public class MasinaController
{


    private static final Logger logger = LoggerFactory.getLogger(MasinaController.class);

    @Autowired
    private MasinaService masinaService;

    @PostMapping("/adauga")
    public Masina adaugaMasina(@RequestBody Masina masina)
    {
        logger.info("Adăugăm mașina: {}", masina);
        System.out.println("Adăugată mașină: " + masina);
        return masinaService.adaugaMasina(masina);
    }

    @DeleteMapping("/sterge/{numarInmatriculare}")
    public void stergeMasina(@PathVariable String numarInmatriculare)
    {
        logger.info("Ștearsă mașină cu numărul de înmatriculare: {}", numarInmatriculare);
        System.out.println("Ștearsă mașină cu numărul de înmatriculare: " + numarInmatriculare);
        masinaService.stergeMasina(numarInmatriculare);
    }

    @GetMapping("/{numarInmatriculare}")
    public Masina cautaMasina(@PathVariable String numarInmatriculare)
    {
        Masina masina = masinaService.cautaMasina(numarInmatriculare);
        logger.info("Găsită mașină: {}", masina);
        System.out.println("Găsită mașină: " + masina);
        return masina;
    }

    @GetMapping("/toate")
    public List<Masina> getAllMasini()
    {
        List<Masina> masini = masinaService.getAllMasini();
        logger.info("Toate mașinile: {}", masini);
        System.out.println("Toate mașinile: " + masini);
        return masini;
    }

    @GetMapping("/marca/{marca}")
    public long getNumarMasiniMarca(@PathVariable String marca)
    {
        long numar = masinaService.getNumarMasiniMarca(marca);
        logger.info("Număr mașini marca {}: {}", marca, numar);
        System.out.println("Număr mașini marca " + marca + ": " + numar);
        return numar;
    }

    @GetMapping("/sub100k")
    public long getMasiniSub100k()
    {
        long numar = masinaService.getMasiniSub100k();
        logger.info("Număr mașini sub 100k km: {}", numar);
        System.out.println("Număr mașini sub 100k km: " + numar);
        return numar;
    }

    @GetMapping("/maiNoiDe5Ani")
    public List<Masina> getMasiniMaiNoiDe5Ani()
    {
        List<Masina> masini = masinaService.getMasiniMaiNoiDe5Ani();
        logger.info("Mașinile mai noi de 5 ani: {}", masini);
        System.out.println("Mașinile mai noi de 5 ani: " + masini);
        return masini;
    }

    @Override
    public String toString()
    {
        return "MasinaController{" +
                "masinaService=" + masinaService +
                '}';
    }
}
