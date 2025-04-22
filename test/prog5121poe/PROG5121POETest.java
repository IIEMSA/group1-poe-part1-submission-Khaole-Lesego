/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package prog5121poe;


import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;



public class PROG5121POETest {
    
    
    
    
    PROG5121POE user1 = new PROG5121POE();
    
    public PROG5121POETest() {}

    
     @Test
    public void testCheckUserNameEqualsCorrect() {
      
        user1.username = "kyl_1";
        boolean result = user1.checkUserName(user1.username);
        boolean expected = true;  
        assertEquals(result,expected); // Valid username
        System.out.println("Result: "+result);
        System.out.println("Expected: "+expected);
        
    }
    
    @Test
    public void testCheckUserNameEqualsIncorrect() {
      
        user1.username = "kyle!!!!!!!";
        boolean result = user1.checkUserName(user1.username);
        boolean expected = false;  
        assertEquals(result,expected); // Valid username
        System.out.println("Result: "+result);
        System.out.println("Expected: "+expected);
        
    }
    
    @Test
    public void testCheckUserNameTrue() {
      
        
        user1.username = "kyl_1";
        boolean result = user1.checkUserName(user1.username);
        assertTrue(result); // Valid username
        System.out.println("Result:"+result);
     
    }
    
    @Test
    public void testCheckUserNameFalse() {
       
        user1.username = "kyle!!!!!!";
        boolean result = user1.checkUserName(user1.username);
        assertFalse(result); // Invalid username*/
        System.out.println("Result:"+result);
     
    }
    
    
    @Test
    public void testCheckPasswordComplexityEqualsCorrect() {
      
        user1.password = "Ch&sc&e@k9!";
        boolean result = user1.checkPasswordComplexity(user1.password);
        boolean expected = true;  
        assertEquals(result,expected); // Valid username
        System.out.println("Result: "+result);
        System.out.println("Expected: "+expected);
        
    }
    
    @Test
    public void testCheckPasswordComplexityEqualsIncorrect() {
      
        user1.password = "password";
        boolean result = user1.checkPasswordComplexity(user1.password);
        boolean expected = false;  
        assertEquals(result,expected); // Valid username
        System.out.println("Result: "+result);
        System.out.println("Expected: "+expected);
        
    }
    

    @Test
    public void testCheckPasswordComplexityTrue() {
        user1.password = "Ch&sc&e@k9!";
        boolean result = user1.checkPasswordComplexity(user1.password);
        assertTrue(result); // Valid password
        System.out.println("Result:"+result);
        
        
       
    }
    
    
    @Test
    public void testCheckPasswordComplexityFalse() {
        user1.password = "password";
        boolean result = user1.checkPasswordComplexity(user1.password);
        assertFalse(result); // InValid password
        System.out.println("Result:"+result); 
    }
    

    
    @Test
    public void testCheckCellPhoneNumberEqualsCorrect() {
      
        user1.cellPhoneNumber = "+27839869876";
        boolean result = user1.checkCellPhoneNumber(user1.cellPhoneNumber);
        boolean expected = true;  
        assertEquals(result,expected); 
        System.out.println("Result: "+result);
        System.out.println("Expected: "+expected);
        
    }
    
    @Test
    public void testCheckCellPhoneNumberEqualsIncorrect() {
      
        user1.cellPhoneNumber = "0896553";
        boolean result = user1.checkCellPhoneNumber(user1.cellPhoneNumber);
        boolean expected = false;  
        assertEquals(result,expected); 
        System.out.println("Result: "+result);
        System.out.println("Expected: "+expected);
        
    }
    
    @Test
    public void testCheckCellPhoneNumberTrue() {
        user1.cellPhoneNumber = "+27839869876";
        boolean result = user1.checkCellPhoneNumber(user1.cellPhoneNumber);
        assertTrue(result); // Valid cell phone number
        System.out.println("Result:"+result);
        
    }
    
     @Test
    public void testCheckCellPhoneNumberFalse() {
        
        user1.cellPhoneNumber = "08966553";
        boolean result = user1.checkCellPhoneNumber(user1.cellPhoneNumber);
        assertFalse(result); // Invalid cell phone number
        System.out.println("Result:"+result);
    }
    
    
    @Test
    public void testLoginUserTrue() {
        
        
        user1.InputUserName = "kyl_1";
        user1.InputPassword = "Ch&sc&e@k9!";
        user1.username = user1.InputUserName;
        user1.password = user1.InputPassword;
        boolean result = true;
        
                
        assertTrue(user1.loginUser(user1.InputUserName,user1.InputPassword )); // Valid cell phone number
        System.out.println("Result:"+result);
        
    }
    
     @Test
    public void testLoginUserFalse() {
        
        user1.InputUserName = "kyle!!!!!!";
        user1.InputPassword = "password";
        user1.username = user1.InputUserName;
        user1.password = user1.InputPassword;
        boolean result = false;
        assertFalse(user1.loginUser(user1.InputUserName,user1.InputPassword )); // Valid cell phone number
        System.out.println("Result:"+result);
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
   
   
   

   
}
