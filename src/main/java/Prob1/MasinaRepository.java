package Prob1;

import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface MasinaRepository extends CrudRepository<Masina, String>
{


    Masina save(Masina masina);


    void deleteByNumarInmatriculare(String numarInmatriculare);


    Masina findByNumarInmatriculare(String numarInmatriculare);


    List<Masina> findAll();


    long countByMarca(String marca);


    long countByKilometriLessThan(int kilometri);


    @Query("SELECT * FROM masini WHERE an_fabricatie > :cutoffYear")
    List<Masina> findMasiniMaiNoiDe5Ani(int cutoffYear);
}
