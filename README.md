[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/7qJTF1lE)


# User Registration and Login Application

## Overview

Welcome to the User Registration and Login Application! This project is designed to make managing user accounts straightforward and secure. It consists of two key Java files: `PROG5121POE.java`, which handles user registration and login, and a placeholder for `PROG5121test.java`, where we'll implement unit tests for our application. The main focus of `PROG5121POE.java` is to capture and validate essential user information such as usernames, passwords, and cell phone numbers.

## Table of Contents

- [Code Description](#code-description)
    - [`PROG5121POE.java`](#prog5121poejava)
    - [`PROG5121POETest.java`](#prog5121poetestjava)
- [Usage](#usage)
- [License](#license)
- [Contact](#contact)
- [References](#references)

## Code Description

### `PROG5121POE.java`

The `PROG5121POE.java` file defines a class that is central to our user registration process. It’s designed to encapsulate all the important logic for registering users, including capturing usernames, passwords with specific complexity requirements, and valid South African cell phone numbers. Remember, in Java, everything revolves around classes!

#### Class: `PROG5121POE`

The **`PROG5121POE` class** is the heart of our application, organizing all the data and methods related to user registration. A class can contain many methods to handle different tasks—it's like a toolbox filled with various tools for every job!

#### Member Variables (Fields):

- **`public String username`**: This is a public string variable that stores the username entered by the user. It's easily accessible from other classes, making it user-friendly.
- **`public String password`**: This variable holds the password, allowing us to ensure it's secure and meets our complexity criteria.
- **`public String cellPhoneNumber`**: Here, we store the user’s cell phone number—something we need for verification and communication.
- **`private boolean isLoggedIn = false`**: This private variable tracks whether a user is currently logged in or not. Keeping it private is a good practice, as it protects the login state from being altered unexpectedly from outside the class.

#### Methods:

- **`public boolean checkUserName()`**:
    - This method plays a crucial role in validating usernames. It checks if the username contains an underscore (`_`) and ensures it's no longer than five characters. If everything checks out, it congratulates you with a message: "Username successfully captured!" If not, it kindly informs the user of the required format.
    - We use the `contains()` and `length()` methods of the `String` class to perform these checks, making for a smooth and efficient process.
    - The method returns a `boolean` value—`true` for a valid username and `false` if it doesn't meet our criteria. This way, you get immediate feedback!

- **`public boolean checkPasswordComplexity(String password)`**:
    - This method examines the entered password against a set of complexity rules designed to enhance security. A strong password is essential, so we check for:
        - A minimum of eight characters.
        - At least one uppercase letter.
        - At least one number.
        - At least one special character.
    - Utilizing regular expressions with the `matches()` method of the `String` class, we can efficiently validate the password's strength. This ensures that users pick passwords that are tough for others to guess—keeping their accounts safe!
 
**PROG5121POETest()**: This is the constructor for the test class! While it doesn’t hold any specific logic in this example, it’s typically used to establish any necessary conditions for the tests if needed.

**@Test**: This annotation from the JUnit testing framework marks the following method as a test for the JUnit runner to execute.

```java
public PROG5121POE user1 = new PROG5121POE();
```
This line creates an instance of the PROG5121POE class, named `user1`. This object is what we’ll use to call the methods we’re testing.

**public void testCheckUserNameEqualsCorrect() { ... }**:  
- **Purpose**: This test method checks if the `checkUserName()` method in the PROG5121POE class accurately identifies a valid username.  
- **Setup**: It sets the username of the `user1` object to "kyl_1".  
- **Execution**: It calls the `checkUserName()` method with the set username and stores the outcome in the `result` variable. The expected value is set to true.  
- **Assertion**: `assertEquals(result, expected);` This assertion from JUnit compares the `result` (the value returned by `checkUserName()`) to the expected value (true). If they don’t match, the test will fail.  
- **Output**: The `System.out.println()` statements provide the result and expected values for your reference during test execution.  

**public void testCheckUserNameEqualsIncorrect() { ... }**:  
- **Purpose**: This method checks if the `checkUserName()` method correctly recognizes an invalid username.  
- **Setup**: It sets `user1`'s username to "kyle!!!!!!!".  
- **Execution**: Calls `checkUserName()` and captures the result. The expected value is set to false.  
- **Assertion**: `assertEquals(result, expected);` This ensures that the result equals the expected value (false), and if they differ, the test fails.  
- **Output**: Displays the result and expected values.  

**public void testCheckUserNameTrue() { ... }**:  
- **Purpose**: This test also checks for a valid username using `assertTrue()`.  
- **Setup**: Sets `user1.username` to "kyl_1".  
- **Execution**: Calls `checkUserName()` and stores the outcome in `result`.  
- **Assertion**: `assertTrue(result);` This assertion checks if `result` is true; if it’s false, the test will fail.  
- **Output**: Displays the result.  

**public void testCheckUserNameFalse() { ... }**:  
- **Purpose**: This test method checks for an invalid username using `assertFalse()`.  
- **Setup**: Sets `user1.username` to "kyle!!!!!!".  
- **Execution**: Calls `checkUserName()` and stores the result in `result`.  
- **Assertion**: `assertFalse(result);` This checks if `result` is false, and if it’s true, the test fails.  
- **Output**: Displays the result.  

**public void testCheckPasswordComplexityEqualsCorrect() { ... }**:  
- **Purpose**: This method checks if the `checkPasswordComplexity()` function accurately identifies a complex password.  
- **Setup**: Sets `user1.password` to "Ch&sc&e@k9!".  
- **Execution**: Calls `checkPasswordComplexity()` and stores the result in `result`. The expected value is set to true.  
- **Assertion**: `assertEquals(result, expected);` This verifies whether `result` equals true.  
- **Output**: Displays result and expected values.  

**public void testCheckPasswordComplexityEqualsIncorrect() { ... }**:  
- **Purpose**: This method checks if `checkPasswordComplexity()` recognizes a simple password.  
- **Setup**: Sets `user1.password` to "password".  
- **Execution**: Calls `checkPasswordComplexity()` and captures the result in `result`. The expected value is set to false.  
- **Assertion**: `assertEquals(result, expected);` Ensures that `result` equals false.  
- **Output**: Displays the result and expected.  

**public void testCheckPasswordComplexityTrue() { ... }**:  
- **Purpose**: This method tests for a complex password using `assertTrue()`.  
- **Setup**: Sets `user1.password` to "Ch&sc&e@k9!".  
- **Execution**: Calls `checkPasswordComplexity()` and stores the result in `result`.  
- **Assertion**: `assertTrue(result);` Checks if the result is true.  
- **Output**: Displays the result.  

**public void testCheckPasswordComplexityFalse() { ... }**:  
- **Purpose**: This method tests for a simple password using `assertFalse()`.  
- **Setup**: Sets `user1.password` to "password".  
- **Execution**: Calls `checkPasswordComplexity()` and captures the result in `result`.  
- **Assertion**: `assertFalse(result);` Checks if the result is false.  
- **Output**: Displays the result.  

**public void testCheckCellPhoneNumberEqualsCorrect() { ... }**:  
- **Purpose**: This method checks if `checkCellPhoneNumber()` accurately identifies a correctly formatted cell phone number.  
- **Setup**: Sets `user1.cellPhoneNumber` to "+27839869876".  
- **Execution**: Calls `checkCellPhoneNumber()` and stores the result in `result`, which expects a true value.  
- **Assertion**: `assertEquals(result, expected);` This checks if `result` equals true.  
- **Output**: Displays the result and expected values.  

**public void testCheckCellPhoneNumberEqualsIncorrect() { ... }**:  
- **Purpose**: This method checks if `checkCellPhoneNumber()` identifies an incorrectly formatted cell phone number.  
- **Setup**: Sets `user1.cellPhoneNumber` to "0896553".  
- **Execution**: Calls `checkCellPhoneNumber()` and stores the result.  
- **Assertion**: Similar to the previous tests, it checks if the formatting is correct.  
- **Output**: Captures and displays the result for review.  

In summary, each of these methods is structured to make sure the `checkUserName()`, `checkPasswordComplexity()`, and `checkCellPhoneNumber()` methods work as intended, allowing for efficient and effective validation of user input in our software! Keep up the great work with your testing!

Overall, this project is built with user experience and security in mind, making it not only functional but also a pleasure to use. If you have any questions or want to dive deeper into any section, feel free to ask!

## References

Farrell, J. 2023. *Java Programming*. 10th ed. [s.l.]: Cengage Learning [29].

Lecturer Yolanda. 2024. *PROG5121 Lecture Notes: Chapter 1 Creating Java Programs* [1, 3, 26, 30]. The Independent Institute of Education.

Lecturer Yolanda. 2024. *PROG5121 Lecture Notes: Chapter 3 Using Methods, Classes, and Objects* [2, 9, 12, 15]. The Independent Institute of Education.

OpenAI. (2023). *ChatGPT (Mar 14 version)* 

