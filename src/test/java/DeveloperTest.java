import Staff.techStaff.Developer;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Wee Dave", "KS767262", 25000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Wee Dave",developer.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("KS767262", developer.getNInumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(25000.0, developer.getSalary(), 0);
    }

    @Test
    public void canIncreaseSalary(){
        developer.raiseSalary(500);
        assertEquals(25500.0,developer.getSalary(),0);
    }

    @Test
    public void canGiveBonus(){
        developer.giveBonus(10.00);
        assertEquals(27500.0,developer.getSalary(), 0);
    }

}


