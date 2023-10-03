package nl.delphinity.crud.controller.persoon;

import nl.delphinity.crud.domain.Persoon;
import nl.delphinity.crud.repository.factories.DAOFactory;

public class VerwijderenAction {

    private Long id;

    public String verwijderen() {

        Persoon foundPersoon = DAOFactory.getFactory()
                .getPersoonDAO()
                .findById(id)
                .orElse(null);

        DAOFactory.getFactory()
                .getPersoonDAO()
                .delete(foundPersoon);

        return "success";

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
