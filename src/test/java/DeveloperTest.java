import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    Developer developer;

    @Before
    public void before(){
        developer= new Developer("Amy","AB20091987", 20.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Amy", developer.getName());
    }

    @Test
    public void canGetNINumber(){
        assertEquals("AB20091987", developer.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(20.00, developer.getSalary(), 0.01);
    }
}
