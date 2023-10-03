package nl.delphinity.crud.interceptor;

import nl.delphinity.crud.repository.factories.DAOFactories;
import nl.delphinity.crud.repository.factories.DAOFactory;
import nl.delphinity.crud.repository.util.HibernateSessionManager;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class StartupInterceptor implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        DAOFactory.setFactory(DAOFactories.HIBERNATE.getFactory());
        HibernateSessionManager.init();
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        HibernateSessionManager.close();
    }

}
