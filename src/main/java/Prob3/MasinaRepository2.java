package Prob3;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MasinaRepository2 extends JpaRepository<Masina2, String>
{
    void deleteByNumarInmatriculare(String numarInmatriculare);


    Masina2 findByNumarInmatriculare(String numarInmatriculare);


    List<Masina2> findAll();


    long countByMarca(String marca);


    long countByKilometriLessThan(int kilometri);


    @Query("SELECT m FROM Masina2 m WHERE m.anFabricatie > :cutoffYear")
    List<Masina2> findMasiniMaiNoiDe5Ani(int cutoffYear);
}
