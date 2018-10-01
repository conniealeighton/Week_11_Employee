package TechStaff;

import Management.Director;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestDirector {

    private Director director;

    @Before
    public void setUp() throws Exception {
        director = new Director("Lucy", 003, 30000, "Partners", 40000);
    }

    @Test
    public void hasDeptName() {
        assertEquals("Partners", director.getDeptName());
    }

    @Test
    public void hasName() {
        assertEquals("Lucy", director.getName());
    }

    @Test
    public void hasNI() {
        assertEquals(003, director.getni());
    }

    @Test
    public void hasSalary() {
        assertEquals(30000.0, director.getSalary());
    }

    @Test
    public void hasBudget() {
        assertEquals(40000.0, director.getBudget());
    }
}
