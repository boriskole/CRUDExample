package nl.delphinity.crud;

import nl.delphinity.crud.datalayer.factories.DAOFactories;
import nl.delphinity.crud.datalayer.factories.DAOFactory;
import nl.delphinity.crud.datalayer.util.HibernateSessionManager;
import nl.delphinity.crud.domain.Persoon;

import java.time.LocalDate;
import java.util.List;

public class DatabaseInit {

    public static void main(String... args) {

        DAOFactory.setFactory(DAOFactories.HIBERNATE.getFactory());
        HibernateSessionManager.init();

        DAOFactory.getFactory()
                .getPersoonDAO()
                .saveAll(List.of(
                        new Persoon(
                                "Jan",
                                "van",
                                "Jansen",
                                LocalDate.of(2000, 1, 1)
                        ),
                        new Persoon(
                                "Willem",
                                null,
                                "Jacobs",
                                LocalDate.of(1998, 1, 1)
                        ),
                        new Persoon(
                                "Piet",
                                "van",
                                "Petersen",
                                LocalDate.of(1999, 1, 1)
                        ),
                        new Persoon(
                                "Kees",
                                null,
                                "Klaassen",
                                LocalDate.of(1997, 1, 1)
                        ),
                        new Persoon(
                                "Henk",
                                "van",
                                "Hendriks",
                                LocalDate.of(1996, 1, 1)
                        )
                ));

        HibernateSessionManager.close();

    }

}
