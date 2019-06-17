import Staff.Management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {


    Manager manager;


    @Before
    public void before() {
        manager = new Manager("Ruairidh", "JR067893A", 35000, "DevOps");
    }

    @Test
    public void getName() {
        assertEquals("Ruairidh", manager.getName());
    }

    @Test
    public void setName() {
        manager.setName("James");
        assertEquals("James", manager.getName());
    }

    @Test
    public void getnINumber() {
        assertEquals("JR067893A", manager.getnINumber());

    }

    @Test
    public void setnINumber() {
        manager.setnINumber("AD583902W");
        assertEquals("AD583902W", manager.getnINumber());

    }

    @Test
    public void getSalary() {
        assertEquals(35000, manager.getSalary());

    }

    @Test
    public void setSalary() {
        manager.setSalary(45000);
        assertEquals(45000, manager.getSalary());
    }

    @Test
    public void raiseSalary() {
        manager.raiseSalary(10);
        assertEquals(38500, manager.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(350, manager.payBonus(), 0.01);
    }

    @Test
    public void getDeptName() {
        assertEquals("DevOps", manager.getDeptName());
    }

    @Test
    public void setDeptName() {
        manager.setDeptName("FrontEnd");
        assertEquals("FrontEnd", manager.getDeptName());
    }
}
