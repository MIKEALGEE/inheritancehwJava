import Staff.Management.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Farty Mcghee", "KS767262", 55000.00,"The Illuminati", 100000.00);
    }

    @Test
    public void canGetName(){
        assertEquals("Farty Mcghee",director.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("KS767262", director.getNInumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(55000.0, director.getSalary(), 0);
    }

    @Test
    public void canIncreaseSalary(){
        director.raiseSalary(500);
        assertEquals(55500.0,director.getSalary(),0);
    }

    @Test
    public void canGiveBonus(){
        director.giveBonus(10.00);
        assertEquals(60500.0,director.getSalary(), 0);
    }

    @Test
    public void canGetBudge(){
        assertEquals(100000.00,director.getBudget(), 0);
    }

}
