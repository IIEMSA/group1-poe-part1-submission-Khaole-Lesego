[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/7qJTF1lE)


# User Registration and Login Application

## Overview

Welcome to the User Registration and Login Application! This project is designed to make managing user accounts straightforward and secure. It consists of two key Java files: `PROG5121POE.java`, which handles user registration and login, and a placeholder for `PROG5121test.java`, where we'll implement unit tests for our application. The main focus of `PROG5121POE.java` is to capture and validate essential user information such as usernames, passwords, and cell phone numbers.

## Table of Contents

- [Code Description](#code-description)
    - [`PROG5121POE.java`](#prog5121poejava)
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

Overall, this project is built with user experience and security in mind, making it not only functional but also a pleasure to use. If you have any questions or want to dive deeper into any section, feel free to ask!

## References

Farrell, J. 2023. *Java Programming*. 10th ed. [s.l.]: Cengage Learning [29].

Lecturer Yolanda. 2024. *PROG5121 Lecture Notes: Chapter 1 Creating Java Programs* [1, 3, 26, 30]. The Independent Institute of Education.

Lecturer Yolanda. 2024. *PROG5121 Lecture Notes: Chapter 3 Using Methods, Classes, and Objects* [2, 9, 12, 15]. The Independent Institute of Education.

OpenAI. (2023). *ChatGPT (Mar 14 version)* 

