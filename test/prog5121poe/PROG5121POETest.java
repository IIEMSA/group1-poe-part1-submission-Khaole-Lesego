
package prog5121poe; // This line declares the package name for this class, organizing it within the prog5121poe package.

import org.junit.Test; // Importing the JUnit library, which helps us write tests for our code.
import static org.junit.Assert.assertEquals; // Allows us to check if two values are equal in our tests.
import static org.junit.Assert.assertTrue; // Allows us to check if a condition is true in our tests.
import static org.junit.Assert.assertFalse; // Allows us to check if a condition is false in our tests.

public class PROG5121POETest { // This class will hold all our tests for the PROG5121POE class.

    // Here we create an instance (a specific example) of the PROG5121POE class to test.
    PROG5121POE user1 = new PROG5121POE(); 

    // Constructor for the test class; it runs when we create a new instance of PROG5121POETest.
    public PROG5121POETest() {}

    // Test to check if the username validation works correctly.
    @Test
    public void testCheckUserNameEqualsCorrect() {
        user1.username = "kyl_1"; // Setting a valid username.
        boolean result = user1.checkUserName(user1.username); // Calling the method to check the username.
        boolean expected = true; // We expect the result to be true for a valid username.
        
        // Check if the actual result is equal to the expected result.
        assertEquals(result, expected); // This will pass if result is true.
        System.out.println("Result: " + result); // Print the actual result.
        System.out.println("Expected: " + expected); // Print the expected result.
    }

    // Test to check if an invalid username is handled correctly.
    @Test
    public void testCheckUserNameEqualsIncorrect() {
        user1.username = "kyle!!!!!!!"; // Setting an invalid username with too many special characters.
        boolean result = user1.checkUserName(user1.username);
        boolean expected = false; // We expect the result to be false for an invalid username.
        
        assertEquals(result, expected); // This will pass if result is false.
        System.out.println("Result: " + result);
        System.out.println("Expected: " + expected);
    }

    // Test to check if a valid username returns true.
    @Test
    public void testCheckUserNameTrue() {
        user1.username = "kyl_1"; // Valid username.
        boolean result = user1.checkUserName(user1.username); // Check the username.
        assertTrue(result); // We expect the result to be true.
        System.out.println("Result: " + result);
    }

    // Test to check if an invalid username returns false.
    @Test
    public void testCheckUserNameFalse() {
        user1.username = "kyle!!!!!!"; // Invalid username.
        boolean result = user1.checkUserName(user1.username); 
        assertFalse(result); // We expect the result to be false.
        System.out.println("Result: " + result);
    }

    // Test to check if a valid password meets complexity requirements.
    @Test
    public void testCheckPasswordComplexityEqualsCorrect() {
        user1.password = "Ch&sc&e@k9!"; // Setting a valid password.
        boolean result = user1.checkPasswordComplexity(user1.password);
        boolean expected = true; // We expect this to be true.
        
        assertEquals(result, expected); // Check if actual equals expected.
        System.out.println("Result: " + result);
        System.out.println("Expected: " + expected);
    }

    // Test to check if an invalid password is handled correctly.
    @Test
    public void testCheckPasswordComplexityEqualsIncorrect() {
        user1.password = "password"; // Simple password, not complex enough.
        boolean result = user1.checkPasswordComplexity(user1.password);
        boolean expected = false; // We expect this to be false.
        
        assertEquals(result, expected); // Check if actual equals expected.
        System.out.println("Result: " + result);
        System.out.println("Expected: " + expected);
    }

    // Test to check if a valid password returns true.
    @Test
    public void testCheckPasswordComplexityTrue() {
        user1.password = "Ch&sc&e@k9!"; // Valid password.
        boolean result = user1.checkPasswordComplexity(user1.password);
        assertTrue(result); // We expect the result to be true.
        System.out.println("Result: " + result);
    }

    // Test to check if an invalid password returns false.
    @Test
    public void testCheckPasswordComplexityFalse() {
        user1.password = "password"; // Invalid simple password.
        boolean result = user1.checkPasswordComplexity(user1.password);
        assertFalse(result); // We expect the result to be false.
        System.out.println("Result: " + result);
    }

    // Test to check if a valid cell phone number is accepted.
    @Test
    public void testCheckCellPhoneNumberEqualsCorrect() {
        user1.cellPhoneNumber = "+27839869876"; // Valid South African phone number.
        boolean result = user1.checkCellPhoneNumber(user1.cellPhoneNumber);
        boolean expected = true; // We expect this to be true.
        
        assertEquals(result, expected); // Check if actual equals expected.
        System.out.println("Result: " + result);
        System.out.println("Expected: " + expected);
    }

    // Test to check if an invalid cell phone number is handled correctly.
    @Test
    public void testCheckCellPhoneNumberEqualsIncorrect() {
        user1.cellPhoneNumber = "0896553"; // Invalid phone number format.
        boolean result = user1.checkCellPhoneNumber(user1.cellPhoneNumber);
        boolean expected = false; // We expect this to be false.
        
        assertEquals(result, expected); // Check if actual equals expected.
        System.out.println("Result: " + result);
        System.out.println("Expected: " + expected);
    }

    // Test to check if a valid cell phone number returns true.
    @Test
    public void testCheckCellPhoneNumberTrue() {
        user1.cellPhoneNumber = "+27839869876"; // Valid number.
        boolean result = user1.checkCellPhoneNumber(user1.cellPhoneNumber);
        assertTrue(result); // We expect the result to be true.
        System.out.println("Result: " + result);
    }

    // Test to check if an invalid cell phone number returns false.
    @Test
    public void testCheckCellPhoneNumberFalse() {
        user1.cellPhoneNumber = "08966553"; // Invalid number.
        boolean result = user1.checkCellPhoneNumber(user1.cellPhoneNumber);
        assertFalse(result); // We expect the result to be false.
        System.out.println("Result: " + result);
    }

    // Test to check if a user can log in with correct credentials.
    @Test
    public void testLoginUserTrue() {
        user1.InputUserName = "kyl_1"; // Setting valid username.
        user1.InputPassword = "Ch&sc&e@k9!"; // Setting valid password.
        user1.username = user1.InputUserName; // Assigning input username to user1.
        user1.password = user1.InputPassword; // Assigning input password to user1.
        
        assertTrue(user1.LoginUser(user1.InputUserName, user1.InputPassword)); // Check if login succeeds.
        System.out.println("Result: true"); // Since this should succeed.
    }

    // Test to check if a user cannot log in with incorrect credentials.
    @Test
    public void testLoginUserFalse() {
        user1.InputUserName = "kyle!!!!!!"; // Invalid username.
        user1.InputPassword = "password"; // Invalid password.
        
        user1.username = user1.InputUserName; // Assigning input username.
        user1.password = user1.InputPassword; // Assigning input password.
        
        assertFalse(user1.LoginUser(user1.InputUserName, user1.InputPassword)); // Check if login fails.
        System.out.println("Result: false"); // This should fail.
    }
}
    
    /*
    
     @Test
    public void testLoginUserTrue() {
    // Setting up a valid registration
        user1.username = "kyl_1";
        user1.password = "Ch&sc&e@k9!";
        user1.cellPhoneNumber = "+27839869876";
        user1.registerUser(); // Register the user first

        // Attempting to log in with correct credentials
        assertTrue(user1.loginUser("kyl_1", "Ch&sc&e@k9!")); // Valid login
    }    
    
    
    
     @Test
    public void testLoginUserFalse() {
        // Setting up a valid registration
        user1.username = "kyl_1";
        user1.password = "Ch&sc&e@k9!";
        user1.cellPhoneNumber = "+27839869876";
        user1.registerUser(); // Register the user first

        // Attempting to log in with incorrect credentials
        assertFalse(user1.loginUser("wrong_user", "wrong_password")); // Invalid login
    }

    */
   
   
   

   

