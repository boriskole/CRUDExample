package nl.delphinity.crud.datalayer.factories;

import nl.delphinity.crud.datalayer.dao.GenericDAO;
import nl.delphinity.crud.datalayer.dao.PersoonDAO;
import nl.delphinity.crud.datalayer.interfaces.IPersoonDAO;
import nl.delphinity.crud.datalayer.util.HibernateSessionManager;
import nl.delphinity.crud.domain.Persoon;
import org.hibernate.Session;

public class HibernateDAOFactory extends DAOFactory {

    protected Session getCurrentSession() {
        return HibernateSessionManager.getSessionFactory().getCurrentSession();
    }

    @Override
    public IPersoonDAO getPersoonDAO() {
        GenericDAO<Persoon, Long> dao = null;
        try {
            dao = PersoonDAO.class.getDeclaredConstructor().newInstance();
            dao.setSession(getCurrentSession());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return (IPersoonDAO) dao;
    }

}