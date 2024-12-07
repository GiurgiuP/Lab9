package Prob2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MasinaService1
{

    @Autowired
    private MasinaRepository1 masinaRepository;


    public Masina1 adaugaMasina(Masina1 masina)
    {
        return masinaRepository.save(masina);
    }


    public void stergeMasina(String numarInmatriculare)
    {
        masinaRepository.deleteByNumarInmatriculare(numarInmatriculare);
    }


    public Masina1 cautaMasina(String numarInmatriculare)
    {
        return masinaRepository.findByNumarInmatriculare(numarInmatriculare);
    }


    public List<Masina1> getAllMasini()
    {
        return masinaRepository.findAll();
    }


    public long getNumarMasiniMarca(String marca)
    {
        return masinaRepository.countByMarca(marca);
    }


    public long getMasiniSub100k()
    {
        return masinaRepository.countByKilometriLessThan(100000);
    }


    public List<Masina1> getMasiniMaiNoiDe5Ani()
    {
        int cutoffYear = LocalDate.now().getYear() - 5;
        return masinaRepository.findMasiniMaiNoiDe5Ani(cutoffYear);
    }
}
