import org.junit.Before;
import org.junit.Test;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Matt", "MM23112020", 10.00, "Head of People");

    }

    @Test
    public void canGetName(){
        assertEquals("Matt", manager.getName());
    }
    @Test
    public void canGetNINumber(){
        assertEquals("MM23112020", manager.getNINumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(10.00, manager.getSalary(),0.01);
    }
    @Test
    public void canGetDepartment(){
        assertEquals("Head of People", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        manager.raiseSalary(5.00);
        assertEquals(15.00, manager.getSalary(),0.01);
    }

    @Test
    public void canPayBonus(){
        assertEquals(0.10, manager.payBonus(),0.01);
    }



}
