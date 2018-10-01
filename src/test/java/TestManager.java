import Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestManager {

    private Manager manager;

    @Before
    public void setUp() throws Exception {
        manager = new Manager("Connie", 007, 1000000, "Chief Visionary");
    }

    @Test
    public void hasDeptName() {
        assertEquals("Chief Visionary", manager.getDeptName());
    }

    @Test
    public void hasName() {
        assertEquals("Connie", manager.getName());
    }

    @Test
    public void hasNI() {
        assertEquals(007, manager.getni());
    }

    @Test
    public void hasSalary() {
        assertEquals(1000000.0, manager.getSalary());
    }
}
