package Prob3;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Masina2
{

    @Id
    private String numarInmatriculare;
    private String marca;
    private int anFabricatie;
    private String culoare;
    private int kilometri;


    public String getNumarInmatriculare()
    {
        return numarInmatriculare;
    }

    public void setNumarInmatriculare(String numarInmatriculare)
    {
        this.numarInmatriculare = numarInmatriculare;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public int getAnFabricatie()
    {
        return anFabricatie;
    }

    public void setAnFabricatie(int anFabricatie)
    {
        this.anFabricatie = anFabricatie;
    }

    public String getCuloare()
    {
        return culoare;
    }

    public void setCuloare(String culoare)
    {
        this.culoare = culoare;
    }

    public int getKilometri()
    {
        return kilometri;
    }

    public void setKilometri(int kilometri)
    {
        this.kilometri = kilometri;
    }
}
