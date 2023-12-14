package assignmentCalculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UnitTests {

  // if the age is between boundray values with a valid Name
    @Test
    void testValidAge() {
        assertTrue(YearOfBirthCalculator.isValidAge(25), "Age 25 should be valid");
        assertTrue(YearOfBirthCalculator.isValidAge(1), "Age 1 should be valid");
        assertTrue(YearOfBirthCalculator.isValidAge(130), "Age 130 should be valid");
        assertTrue(YearOfBirthCalculator.isValidAge(25), "Age 25 should be valid");
        assertEquals("Hello Kalle! You were born in 1947", "Hello Kalle! You were born in 1947");
    }

    //if the age is right outside the boundray  values
    @Test
    void testInvalidAge() {
        assertFalse(YearOfBirthCalculator.isValidAge(0), "Age 0 should be invalid");
        assertFalse(YearOfBirthCalculator.isValidAge(131), "Age 131 should be invalid");
    }


    @Test
    void testAgeInvalidHigh() {
        assertFalse(YearOfBirthCalculator.isValidAge(150), "Age 150 should be invalid");
    }

    //if the name is NOT empty, which is Valid
    @Test
    void testValidName() {
        YearOfBirthCalculator calculator = new YearOfBirthCalculator();
        assertDoesNotThrow(() -> calculator.isValidName("John"), "Name 'John' should be valid");
    }


    @Test
    void testInvalidName() {
        YearOfBirthCalculator calculator = new YearOfBirthCalculator();

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> calculator.isValidName(""), "Empty name should throw IllegalArgumentException");

        assertEquals("Name cannot be empty. Enter a valid name.", exception.getMessage());
    }
}


