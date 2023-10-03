package nl.delphinity.crud.repository.factories;

public enum DAOFactories {

    HIBERNATE(HibernateDAOFactory.class);

    private final Class<? extends DAOFactory> factory;

    DAOFactories(Class<? extends DAOFactory> factory) {
        this.factory = factory;
    }

    public Class<? extends DAOFactory> getFactory() {
        return factory;
    }

}