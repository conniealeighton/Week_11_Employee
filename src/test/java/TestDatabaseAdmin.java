import TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestDatabaseAdmin {

    private DatabaseAdmin databaseadmin;

    @Before
    public void setUp() throws Exception {
        databaseadmin = new DatabaseAdmin("Dan", 001, 50000);
    }


    @Test
    public void hasName() {
        assertEquals("Dan", databaseadmin.getName());
    }

    @Test
    public void hasNI() {
        assertEquals(001, databaseadmin.getni());
    }

    @Test
    public void hasSalary() {
        assertEquals(50000.0, databaseadmin.getSalary());
    }

}
