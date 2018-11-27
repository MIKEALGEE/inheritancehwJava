import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Mr T", "JY765423", 43500.00,"Posh Department");
    }

    @Test
    public void canGetName(){
        assertEquals("Mr T",manager.getName());
    }

    @Test
    public void canGetNiNumber(){
        assertEquals("JY765423", manager.getNInumber());
    }

    @Test
    public void canGetSalary(){
        assertEquals(43500.0, manager.getSalary(), 0);
    }

    @Test
    public void canGetDeptName(){
        assertEquals("Posh Department", manager.getDeptName());
    }

    @Test
    public void canIncreaseSalary(){
        manager.raiseSalary(500);
        assertEquals(44000.0,manager.getSalary(),0);
    }

    @Test
    public void canGiveBonus(){
        manager.giveBonus(10.00);
        assertEquals(47850.0,manager.getSalary(), 0);
    }

}
