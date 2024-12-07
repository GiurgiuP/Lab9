package Prob3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class MasinaService2
{

    @Autowired
    private MasinaRepository2 masinaRepository;


    public Masina2 adaugaMasina(Masina2 masina)
    {
        return masinaRepository.save(masina);
    }


    public void stergeMasina(String numarInmatriculare)
    {
        masinaRepository.deleteByNumarInmatriculare(numarInmatriculare);
    }


    public Masina2 cautaMasina(String numarInmatriculare)
    {
        return masinaRepository.findByNumarInmatriculare(numarInmatriculare);
    }


    public List<Masina2> getAllMasini()
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


    public List<Masina2> getMasiniMaiNoiDe5Ani()
    {
        int cutoffYear = LocalDate.now().getYear() - 5;
        return masinaRepository.findMasiniMaiNoiDe5Ani(cutoffYear);
    }
}
