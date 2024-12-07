package Prob2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/masini")
public class MasinaController1
{

    @Autowired
    private MasinaService1 masinaService;


    @PostMapping("/adauga")
    public Masina1 adaugaMasina(@RequestBody Masina1 masina)
    {
        return masinaService.adaugaMasina(masina);
    }


    @DeleteMapping("/sterge/{numarInmatriculare}")
    public void stergeMasina(@PathVariable String numarInmatriculare)
    {
        masinaService.stergeMasina(numarInmatriculare);
    }


    @GetMapping("/{numarInmatriculare}")
    public Masina1 cautaMasina(@PathVariable String numarInmatriculare)
    {
        return masinaService.cautaMasina(numarInmatriculare);
    }


    @GetMapping("/toate")
    public List<Masina1> getAllMasini()
    {
        return masinaService.getAllMasini();
    }


    @GetMapping("/marca/{marca}")
    public long getNumarMasiniMarca(@PathVariable String marca)
    {
        return masinaService.getNumarMasiniMarca(marca);
    }


    @GetMapping("/sub100k")
    public long getMasiniSub100k()
    {
        return masinaService.getMasiniSub100k();
    }


    @GetMapping("/maiNoiDe5Ani")
    public List<Masina1> getMasiniMaiNoiDe5Ani()
    {
        return masinaService.getMasiniMaiNoiDe5Ani();
    }
}
