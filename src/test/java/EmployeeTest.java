import Staff.Employee;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    Employee employee;


    @Before
    public void before() {
        employee = new Employee("Ruairidh", "JR067893A", 35000);
    }

    @Test
    public void getName() {
        assertEquals("Ruairidh", employee.getName());
    }

    @Test
    public void setName() {
        employee.setName("James");
        assertEquals("James", employee.getName());
    }

    @Test
    public void getnINumber() {
        assertEquals("JR067893A", employee.getnINumber());

    }

    @Test
    public void setnINumber() {
        employee.setnINumber("AD583902W");
        assertEquals("AD583902W", employee.getnINumber());

    }

    @Test
    public void getSalary() {
        assertEquals(35000, employee.getSalary());

    }

    @Test
    public void setSalary() {
        employee.setSalary(45000);
        assertEquals(45000, employee.getSalary());
    }

    @Test
    public void raiseSalary() {
        employee.raiseSalary(10);
        assertEquals(38500, employee.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(350, employee.payBonus(), 0.01);
    }

    @Test
    public void cantLowerSalary() {
        employee.raiseSalary(-10);
        assertEquals(35000, employee.getSalary());
    }

    @Test
    public void cantSetNullName() {
        employee.setName(null);
        assertEquals("Ruairidh", employee.getName());
    }

}
