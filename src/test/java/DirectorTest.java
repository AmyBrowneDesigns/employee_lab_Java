import org.junit.Before;
import org.junit.Test;
import staff.management.Director;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Alan", "AP23112020", 30.00, "CEO", 50.00);
    }

    @Test
    public void canGetBudget() {
        assertEquals(50.00, director.getBudget(),0.01);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("CEO", director.getDeptName());
    }

    @Test
    public void canPayBonus(){
        assertEquals(0.60, director.payBonus(),0.01);
    }

}
