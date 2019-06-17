import Staff.TechStaff.Dev;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DevTest {

    Dev dev;


    @Before
    public void before() {
        dev = new Dev("Ruairidh", "JR067893A", 35000);
    }

    @Test
    public void getName() {
        assertEquals("Ruairidh", dev.getName());
    }

    @Test
    public void setName() {
        dev.setName("James");
        assertEquals("James", dev.getName());
    }

    @Test
    public void getnINumber() {
        assertEquals("JR067893A", dev.getnINumber());

    }

    @Test
    public void setnINumber() {
        dev.setnINumber("AD583902W");
        assertEquals("AD583902W", dev.getnINumber());

    }

    @Test
    public void getSalary() {
        assertEquals(35000, dev.getSalary());

    }

    @Test
    public void setSalary() {
        dev.setSalary(45000);
        assertEquals(45000, dev.getSalary());
    }

    @Test
    public void raiseSalary() {
        dev.raiseSalary(10);
        assertEquals(38500, dev.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(350, dev.payBonus(), 0.01);
    }
}
