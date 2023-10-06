package nl.delphinity.crud.controller.persoon;

import nl.delphinity.crud.domain.Persoon;
import nl.delphinity.crud.domain.PersoonDTO;
import nl.delphinity.crud.repository.factories.DAOFactory;

import java.time.LocalDate;

public class ToevoegenAction {

    private PersoonDTO dto;

    public String toevoegen() {

        DAOFactory.getFactory()
                .getPersoonDAO()
                .save(new Persoon(
                        dto.getVoornaam(),
                        dto.getTussenvoegsel(),
                        dto.getAchternaam(),
                        convertStringToLocalDate(dto.getGeboortedatum())
                ));

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
