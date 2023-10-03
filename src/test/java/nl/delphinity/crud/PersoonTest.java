package nl.delphinity.crud;

import nl.delphinity.crud.domain.Persoon;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PersoonTest {

    private Persoon p1;
    private Persoon p2;

    @Test
    public void hashCodeTest() {

        p1 = new Persoon(
                1L,
                "Jan",
                "van",
                "Jansen",
                LocalDate.of(2000, 1, 1)
        );

        p2 = new Persoon(
                1L,
                "Jan",
                "van",
                "Jansen",
                LocalDate.of(2000, 1, 1)
        );

        assertEquals(p1.hashCode(), p2.hashCode());

        p2 = new Persoon(
                10L,
                "Willem",
                null,
                "Jacobs",
                LocalDate.of(1998, 1, 1)
        );

        assertNotEquals(p1.hashCode(), p2.hashCode());

        p1 = null;
        p2 = null;

    }

    @Test
    public void equalsTest() {

        p1 = new Persoon(
                1L,
                "Jan",
                "van",
                "Jansen",
                LocalDate.of(2000, 1, 1)
        );

        p2 = new Persoon(
                1L,
                "Jan",
                "van",
                "Jansen",
                LocalDate.of(2000, 1, 1)
        );

        assertEquals(p1, p2);

        p2 = new Persoon(
                10L,
                "Willem",
                null,
                "Jacobs",
                LocalDate.of(1998, 1, 1)
        );

        assertNotEquals(p1, p2);

        p1 = null;
        p2 = null;

    }

}
