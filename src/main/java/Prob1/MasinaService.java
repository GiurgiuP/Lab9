package Prob1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDate;
import java.util.List;

@Service
public class MasinaService {


    private static final Logger logger = LoggerFactory.getLogger(MasinaService.class);

    @Autowired
    private MasinaRepository masinaRepository;


    public Masina adaugaMasina(Masina masina)
    {
        logger.info("Adăugăm mașina în BD: {}", masina);
        System.out.println("Adăugăm mașina în BD: " + masina);
        return masinaRepository.save(masina);
    }

    // Ștergerea unei mașini
    public void stergeMasina(String numarInmatriculare)
    {
        logger.info("Ștergerea mașinii cu numărul de înmatriculare: {}", numarInmatriculare);
        System.out.println("Ștergem mașina cu numărul de înmatriculare: " + numarInmatriculare);
        masinaRepository.deleteByNumarInmatriculare(numarInmatriculare);
    }


    public Masina cautaMasina(String numarInmatriculare)
    {
        Masina masina = masinaRepository.findByNumarInmatriculare(numarInmatriculare);
        logger.info("Găsită mașină: {}", masina);
        System.out.println("Găsită mașină: " + masina);
        return masina;
    }


    public List<Masina> getAllMasini()
    {
        List<Masina> masini = masinaRepository.findAll();
        logger.info("Toate mașinile din BD: {}", masini);
        System.out.println("Toate mașinile din BD: " + masini);
        return masini;
    }


    public long getNumarMasiniMarca(String marca)
    {
        long numar = masinaRepository.countByMarca(marca);
        logger.info("Număr mașini marca {}: {}", marca, numar);
        System.out.println("Număr mașini marca " + marca + ": " + numar);
        return numar;
    }


    public long getMasiniSub100k()
    {
        long numar = masinaRepository.countByKilometriLessThan(100000);
        logger.info("Număr mașini sub 100.000 km: {}", numar);
        System.out.println("Număr mașini sub 100.000 km: " + numar);
        return numar;
    }


    public List<Masina> getMasiniMaiNoiDe5Ani()
    {
        int cutoffYear = LocalDate.now().getYear() - 5;
        List<Masina> masini = masinaRepository.findMasiniMaiNoiDe5Ani(cutoffYear);
        logger.info("Mașinile mai noi de 5 ani: {}", masini);
        System.out.println("Mașinile mai noi de 5 ani: " + masini);
        return masini;
    }
}
