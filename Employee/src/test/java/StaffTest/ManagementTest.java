package StaffTest;

import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ManagementTest {
    private Manager manager;
    @Before
    public void before() {
        manager= new Manager("Uday","su312",12000,"English");
    }

    @Test
    public void hasName(){
        assertEquals("Uday",manager.getName());
    }
    @Test
    public void hasSalary(){
        assertEquals(12000.00,manager.getSalary());
    }
    @Test
    public void hasNI(){
        assertEquals("su312",manager.getnI());
    }
    @Test
    public void raiseSalaryTest(){
        manager.raiseSalary(250.00);
        assertEquals(12250.00,manager.getSalary());
    }
    @Test
    public void bonusTest(){
        assertEquals(120.0,manager.payBonus());
    }
    @Test
    public void hasDepartmentTest(){
        assertEquals("English",manager.getDepName());
    }


}
