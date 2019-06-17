import Staff.TechStaff.DatabaseAdmin;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {

    DatabaseAdmin databaseAdmin;


    @Before
    public void before() {
        databaseAdmin = new DatabaseAdmin("Ruairidh", "JR067893A", 35000);
    }

    @Test
    public void getName() {
        assertEquals("Ruairidh", databaseAdmin.getName());
    }

    @Test
    public void setName() {
        databaseAdmin.setName("James");
        assertEquals("James", databaseAdmin.getName());
    }

    @Test
    public void getnINumber() {
        assertEquals("JR067893A", databaseAdmin.getnINumber());

    }

    @Test
    public void setnINumber() {
        databaseAdmin.setnINumber("AD583902W");
        assertEquals("AD583902W", databaseAdmin.getnINumber());

    }

    @Test
    public void getSalary() {
        assertEquals(35000, databaseAdmin.getSalary());

    }

    @Test
    public void setSalary() {
        databaseAdmin.setSalary(45000);
        assertEquals(45000, databaseAdmin.getSalary());
    }

    @Test
    public void raiseSalary() {
        databaseAdmin.raiseSalary(10);
        assertEquals(38500, databaseAdmin.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(350, databaseAdmin.payBonus(), 0.01);
    }
}
