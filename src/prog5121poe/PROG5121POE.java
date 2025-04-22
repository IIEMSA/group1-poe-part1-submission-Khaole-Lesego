package prog5121poe; // Defines the package name for organizing related classes.

import java.util.Scanner; // Imports the Scanner class for user input handling.

public class PROG5121POE { // Main class for the program, containing user registration and login functionalities.
    
    // Private variables to hold user information.
    public String username; // Stores the username of the user.
    public String password; // Stores the password of the user.
    public String cellPhoneNumber; // Stores the cell phone number of the user.
    public boolean isLoggedIn = false; // Tracks the login status of the user.
    public String InputUserName; // Variable to hold user input for username.
    public String InputPassword; // Variable to hold user input for password.
    public Scanner input = new Scanner(System.in); // Creates a Scanner object for user input.
    
    // Method to check the validity of the username.
    public boolean checkUserName(String username) {
        // Validates that the username contains an underscore and is no longer than 5 characters.
        if (username.contains("_") && username.length() <= 5) {
            System.out.println("Username successfully captured.");
            return true; // Returns true if username is valid.
        } else {
            // Error message for invalid username format.
            System.out.println("Username is not correctly formatted.\nPlease ensure that your username contains:\nAn underscore(_)\nAnd is no more than five characters in length.");
            return false; // Returns false if username is invalid.
        }
    }

    // Method to check the complexity of the password.
    public boolean checkPasswordComplexity(String password) {
        // Validates that the password has a minimum length of 8 characters.
        if (password.length() < 8) {
            System.out.println("Password is not correctly formatted.\nPlease ensure that the password contains:\nAt least eight characters\nA capital letter\nA number\nAnd a special character");
            return false; // Returns false if password is too short.
        }

        // Flags to check password requirements.
        boolean hasUpperCase = false; // Checks for at least one uppercase letter.
        boolean hasDigit = false; // Checks for at least one digit.
        boolean hasSpecialChar = false; // Checks for at least one special character.

        // Iterates through each character in the password.
        for (char ch : password.toCharArray()) {
            // Updates flags based on character type.
            if (Character.isUpperCase(ch)) hasUpperCase = true;
            if (Character.isDigit(ch)) hasDigit = true;
            if (!Character.isLetterOrDigit(ch)) hasSpecialChar = true;
        }

        // Validates all password requirements.
        if (hasUpperCase && hasDigit && hasSpecialChar) {
            System.out.println("Password successfully captured.");
            return true; // Returns true if password is complex enough.
        } else {
            // Error message for insufficient password complexity.
            System.out.println("Password is not correctly formatted;\nPlease ensure that the password contains:\nAt least eight characters,\nA capital letter, a number,\nAnd a special character.");
            return false; // Returns false if password does not meet criteria.
        }
    }

    // Method to validate the cell phone number format.
    public boolean checkCellPhoneNumber(String cellPhoneNumber) {
        // Validates the cell phone number against the specified regex pattern for South African numbers "\\+27\\d{9}" or "^(\\+27\\d{9}|0\\d{9})$" as for international numbers it was "^\\+\\d{10,15}$".
        //ChatGPT mainly helped with interpreting this part of the code.
        if (cellPhoneNumber.matches("\\+27\\d{9}")) {
            System.out.println("Cell phone number successfully added.");
            return true; // Returns true if cell phone number is valid.
        } else {
            // Error message for invalid cell phone number format.
            System.out.println("Cell phone number incorrectly formatted\nOr does not contain the international code(+27).");
            return false; // Returns false if cell phone number is invalid.
        }
    }

    // Method to register a new user by collecting input.
    public void registerUser(String username, String password) {
        Scanner scanner = new Scanner(System.in); // Creates a Scanner object for user input.
        
        System.out.println("Welcome To Registrations!");

        // Loop to validate username input.
        do {
            System.out.println("Please enter a valid username:");
            username = scanner.nextLine(); // Reads username input from the user.
        } while (!checkUserName(username)); // Continues until a valid username is entered.

        // Loop to validate password input.
        do {
            System.out.println("Please enter a valid password:");
            password = scanner.nextLine(); // Reads password input from the user.
        } while (!checkPasswordComplexity(password)); // Continues until a valid password is entered.

        // Loop to validate cell phone number input.
        do {
            System.out.println("Please enter a valid cell phone number:");
            cellPhoneNumber = scanner.nextLine(); // Reads cell phone number input from the user.
        } while (!checkCellPhoneNumber(cellPhoneNumber)); // Continues until a valid cell phone number is entered.
        
        // Confirmation of successful registration.
        System.out.println("Registering a new user...\nRegistration successful!");
    }
   
    // Method to log in the user by checking credentials.
    public boolean loginUser(String InputUserName,String InputPassword) {
        
        System.out.println("Attempting Login...\nLoading...\nPlease enter registered credentials");
        
        
        
        // Loop to validate username input.
        do {
            System.out.println("Username unknown\nPlease enter a registered username:");
            InputUserName = input.nextLine(); // Reads username input from the user.
        } while (!InputUserName.equals(username)); // Continues until a valid username is entered.

        // Loop to validate password input.
        do {
            System.out.println("Password Incorrect\nPlease enter a registered password:");
            password = input.nextLine(); // Reads password input from the user.
        } while (!InputPassword.equals(password)); // Continues until a valid password is entered.
       
        if(!InputUserName.equals(username)||!InputPassword.equals(password)){return false;}
        return true;
    }

    // Method to return the login status message based on the user's login state.
    public String returnLoginStatus() {
        System.out.println("Searching for User...");
        // Returns a welcome message if the user is logged in, otherwise prompts to try again.
        if (isLoggedIn) {
            return "Welcome " + username + "; it's great to see you again.";
        } else {
            return "Username or password incorrect; please try again.";
        }
    }

    // Main method to execute the program.
    public static void main(String[] args) {
        PROG5121POE user = new PROG5121POE(); // Creates an instance of the PROG5121POE class.

        user.registerUser(user.username,user.password); // Calls the method to register a new user.
        user.loginUser(user.InputUserName,user.InputPassword); // Calls the method to log in the user and updates the login status.
        System.out.println(user.returnLoginStatus()); // Displays the login status message.
    }
}