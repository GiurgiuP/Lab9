package Prob2;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import java.util.List;

public interface MasinaRepository1 extends JpaRepository<Masina1, String>
{


    Masina1 save(Masina1 masina);


    void deleteByNumarInmatriculare(String numarInmatriculare);


    Masina1 findByNumarInmatriculare(String numarInmatriculare);


    List<Masina1> findAll();


    long countByMarca(String marca);


    long countByKilometriLessThan(int kilometri);


    @Query("SELECT m FROM Masina1 m WHERE m.anFabricatie > :cutoffYear")
    List<Masina1> findMasiniMaiNoiDe5Ani(int cutoffYear);
}
