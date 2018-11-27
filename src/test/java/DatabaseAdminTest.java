import Staff.techStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("John Wick", "JY765423", 43500.00);
    }

    @Test
    public void canGetName(){
        assertEquals("John Wick",databaseAdmin.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("JY765423", databaseAdmin.getNInumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(43500.0, databaseAdmin.getSalary(), 0);
    }

    @Test
    public void canIncreaseSalary(){
        databaseAdmin.raiseSalary(500);
        assertEquals(44000.0,databaseAdmin.getSalary(),0);
    }

    @Test
    public void canGiveBonus(){
        databaseAdmin.giveBonus(10.00);
        assertEquals(47850.0,databaseAdmin.getSalary(), 0);
    }

}