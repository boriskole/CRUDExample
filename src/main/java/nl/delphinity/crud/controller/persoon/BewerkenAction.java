package nl.delphinity.crud.controller.persoon;

import jakarta.transaction.Transactional;
import nl.delphinity.crud.domain.Persoon;
import nl.delphinity.crud.domain.PersoonDTO;
import nl.delphinity.crud.repository.factories.DAOFactory;
import nl.delphinity.crud.repository.util.HibernateSessionManager;

import java.time.LocalDate;

public class BewerkenAction {

    private PersoonDTO dto;

    @Transactional
    public String bewerken() {

        Persoon foundPersoon = DAOFactory.getFactory()
                .getPersoonDAO()
                .findById(dto.getId())
                .orElseThrow(
                        () -> new IllegalStateException("Persoon niet gevonden")
                );

        foundPersoon.setVoornaam(dto.getVoornaam());
        foundPersoon.setTussenvoegsel(dto.getTussenvoegsel());
        foundPersoon.setAchternaam(dto.getAchternaam());
        foundPersoon.setGeboortedatum(
                convertStringToLocalDate(dto.getGeboortedatum())
        );

        DAOFactory.getFactory()
                .getPersoonDAO()
                .merge(foundPersoon);

        return "success";
    }

    private LocalDate convertStringToLocalDate(String date) {
        String[] dateParts = date.split("-");
        return LocalDate.of(
                Integer.parseInt(dateParts[0]),
                Integer.parseInt(dateParts[1]),
                Integer.parseInt(dateParts[2])
        );
    }

    public PersoonDTO getDto() {
        return dto;
    }

    public void setDto(PersoonDTO dto) {
        this.dto = dto;
    }

}
