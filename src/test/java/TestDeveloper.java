import TechStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestDeveloper {

    private Developer developer;

    @Before
    public void setUp() throws Exception {
        developer = new Developer("James", 002, 25000);
    }

    @Test
    public void hasName() {
        assertEquals("James", developer.getName());
    }

    @Test
    public void hasNI() {
        assertEquals(002, developer.getni());
    }

    @Test
    public void hasSalary() {
        assertEquals(25000.0, developer.getSalary());
    }
}
