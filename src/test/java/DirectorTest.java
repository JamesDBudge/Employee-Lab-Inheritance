import Staff.Management.Directors.Director;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DirectorTest {

    Director director;


    @Before
    public void before() {
        director = new Director("Ruairidh", "JR067893A", 35000, "DevOps", 1000000);
    }

    @Test
    public void getName() {
        assertEquals("Ruairidh", director.getName());
    }

    @Test
    public void setName() {
        director.setName("James");
        assertEquals("James", director.getName());
    }

    @Test
    public void getnINumber() {
        assertEquals("JR067893A", director.getnINumber());

    }

    @Test
    public void setnINumber() {
        director.setnINumber("AD583902W");
        assertEquals("AD583902W", director.getnINumber());

    }

    @Test
    public void getSalary() {
        assertEquals(35000, director.getSalary());

    }

    @Test
    public void setSalary() {
        director.setSalary(45000);
        assertEquals(45000, director.getSalary());
    }

    @Test
    public void raiseSalary() {
        director.raiseSalary(10);
        assertEquals(38500, director.getSalary());
    }

    @Test
    public void canPayBonus() {
        assertEquals(700, director.payBonus(), 0.01);
    }

    @Test
    public void getDeptName() {
        assertEquals("DevOps", director.getDeptName());
    }

    @Test
    public void setDeptName() {
        director.setDeptName("FrontEnd");
        assertEquals("FrontEnd", director.getDeptName());
    }

    @Test
    public void getBudget() {
        assertEquals(1000000, director.getBudget(), 0.01);
    }

    @Test
    public void setBudget() {
        director.setBudget(1500000);
        assertEquals(1500000, director.getBudget(), 0.01);
    }

}
