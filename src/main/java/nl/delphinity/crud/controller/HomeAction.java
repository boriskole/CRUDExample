package nl.delphinity.crud.controller;

import nl.delphinity.crud.domain.Persoon;
import nl.delphinity.crud.repository.factories.DAOFactory;

import java.util.Set;

public class HomeAction {

    private Set<Persoon> personen;

    public String home() {

        personen = DAOFactory.getFactory()
                .getPersoonDAO()
                .findAll();

        return "success";

    }

    public Set<Persoon> getPersonen() {
        return personen;
    }

    public void setPersonen(Set<Persoon> personen) {
        this.personen = personen;
    }

}
