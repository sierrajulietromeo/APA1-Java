import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

import src.BonusEmployee;
import src.Employee;
import src.NormalEmployee;

class EmployeeTest {

    
    @Test
    void testBonusEmployeeConstructor() {
        BonusEmployee employee = new BonusEmployee("Steve", "123 Acacia Av", 40000);
        
        assertEquals("Steve", employee.getName());
        assertEquals("123 Acacia Av", employee.getAddress());
        assertEquals(40000, employee.getBasicSalary());
    }

    @Test
    void testBonusEmployeeMonthlySalary() {
        // Redirect System.out to capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            BonusEmployee employee = new BonusEmployee("Steve", "123 Acacia Av", 60000);
            employee.getMonthlySalary();

            // Check printed name
            assertTrue(outContent.toString().contains("Steve"));
            
            // Check printed monthly salary (basic salary divided by 12 + 2000)
            assertTrue(outContent.toString().contains("7000"));
        } finally {
            // Restore original System.out
            System.setOut(originalOut);
        }
    }

    @Test
    void testNormalEmployeeConstructor() {
        NormalEmployee employee = new NormalEmployee("Bob", "456 Acacia Av", 50000);
        
        assertEquals("Bob", employee.getName());
        assertEquals("456 Acacia Av", employee.getAddress());
        assertEquals(50000, employee.getBasicSalary());
    }

    @Test
    void testNormalEmployeeMonthlySalary() {
        // Redirect System.out to capture printed output
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        PrintStream originalOut = System.out;
        System.setOut(new PrintStream(outContent));

        try {
            NormalEmployee employee = new NormalEmployee("Bob", "456 Acacia Av", 60000);
            employee.getMonthlySalary();

            // Check printed name
            assertTrue(outContent.toString().contains("Bob"));
            
            // Check printed monthly salary (basic salary divided by 12)
            assertTrue(outContent.toString().contains("5000"));
        } finally {
            // Restore original System.out
            System.setOut(originalOut);
        }
    }

}