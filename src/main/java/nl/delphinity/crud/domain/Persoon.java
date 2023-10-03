package nl.delphinity.crud.domain;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.Period;
import java.util.Objects;

@Entity
@Table(name = "persoon")
public class Persoon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String voornaam;

    @Column(nullable = true)
    private String tussenvoegsel;

    @Column(nullable = false)
    private String achternaam;

    @Column(nullable = false)
    private LocalDate geboortedatum;

    public Persoon() { }

    public Persoon(Long id, String voornaam, String tussenvoegsel, String achternaam, LocalDate geboortedatum) {
        this.id = id;
        this.voornaam = voornaam;
        this.tussenvoegsel = tussenvoegsel;
        this.achternaam = achternaam;
        this.geboortedatum = geboortedatum;
    }

    public Persoon(String voornaam, String tussenvoegsel, String achternaam, LocalDate geboortedatum) {
        this.voornaam = voornaam;
        this.tussenvoegsel = tussenvoegsel;
        this.achternaam = achternaam;
        this.geboortedatum = geboortedatum;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public void setVoornaam(String voornaam) {
        this.voornaam = voornaam;
    }

    public String getTussenvoegsel() {
        return tussenvoegsel;
    }

    public void setTussenvoegsel(String tussenvoegsel) {
        this.tussenvoegsel = tussenvoegsel;
    }

    public String getAchternaam() {
        return achternaam;
    }

    public void setAchternaam(String achternaam) {
        this.achternaam = achternaam;
    }

    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }

    public void setGeboortedatum(LocalDate geboortedatum) {
        this.geboortedatum = geboortedatum;
    }

    public int getLeeftijd() {
        return Period.between(geboortedatum, LocalDate.now()).getYears();
    }

    @Override
    public int hashCode() {

        final int prime = 31;
        int result = 1;

        result = prime * result + (id == null ? 0 : id.hashCode());

        return result;

    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;

        Persoon other = (Persoon) obj;

        return Objects.equals(id, other.id);

    }

    @Override
    public String toString() {
        return voornaam + (tussenvoegsel == null ? " " : " " + tussenvoegsel + " " + achternaam);
    }

}
