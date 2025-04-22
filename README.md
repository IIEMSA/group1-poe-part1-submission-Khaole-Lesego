[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-22041afd0340ce965d47ae6ef1cefeee28c7c493a6346c4f15d667ab976d596c.svg)](https://classroom.github.com/a/7qJTF1lE)


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Chat App - User Registration and Login Application</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            line-height: 1.6;
            margin: 20px;
            padding: 0;
        }
        h1, h2, h3 {
            color: #333;
        }
        code {
            background-color: #f4f4f4;
            padding: 2px 4px;
            border-radius: 4px;
        }
        ul {
            list-style-type: none;
        }
        a {
            color: #007BFF;
            text-decoration: none;
        }
        a:hover {
            text-decoration: underline;
        }
        @media (max-width: 600px) {
            body {
                margin: 10px;
            }
        }
    </style>
</head>
<body>

    <h1>Chat App</h1>
    <h2>User Registration and Login Application</h2>

    <h3>Overview</h3>
    <p>This project comprises two Java files, <code>PROG5121POE.java</code>, which implements the user registration and login functionalities, and a placeholder for <code>PROG5121test.java</code>, which would contain the unit tests for the application. The <code>PROG5121POE.java</code> file focuses on capturing and validating user information such as username, password, and cell phone number.</p>

    <h3>Table of Contents</h3>
    <ul>
        <li><a href="#code-description">Code Description</a>
            <ul>
                <li><a href="#prog5121poejava">PROG5121POE.java</a></li>
            </ul>
        </li>
        <li><a href="#usage">Usage</a></li>
        <li><a href="#license">License</a></li>
        <li><a href="#contact">Contact</a></li>
    </ul>

    <h3 id="code-description">Code Description</h3>

    <h4 id="prog5121poejava">PROG5121POE.java</h4>
    <p>This Java file, <code>PROG5121POE.java</code>, defines a class with the same name that encapsulates the logic for user registration. It includes functionalities to capture a username, a password that meets specific complexity requirements, and a valid South African cell phone number.</p>

    <h5>Class: <code>PROG5121POE</code></h5>
    <p>The <strong>PROG5121POE class</strong> serves as the main structure for organizing the program's data and methods related to user registration. According to the textbook, everything within a Java program must be part of a class. This class contains several member variables and methods to handle different aspects of user registration.</p>

    <h6>Member Variables:</h6>
    <ul>
        <li><code>public String username</code>: Stores the user's username.</li>
        <li><code>public String password</code>: Holds the user's password.</li>
        <li><code>public String cellPhoneNumber</code>: Stores the user's cell phone number.</li>
        <li><code>private boolean isLoggedIn = false</code>: Tracks login status.</li>
    </ul>

    <h6>Methods:</h6>
    <ul>
        <li><code>public boolean checkUserName()</code>: Validates username format.</li>
        <li><code>public boolean checkPasswordComplexity(String password)</code>: Validates password against complexity rules.</li>
        <li><code>public boolean checkCellPhoneNumber(String cellPhoneNumber)</code>: Validates South African cell phone number format.</li>
        <li><code>public void registerUser()</code>: Encapsulates the user registration process.</li>
    </ul>

    <h4>PROG5121test.java</h4>
    <p>The <code>PROG5121test.java</code> file would contain the unit tests for the <code>PROG5121POE</code> class, likely using a testing framework such as JUnit.</p>

    <h3 id="usage">Usage</h3>
    <p>To run the <code>PROG5121POE.java</code> application:</p>
    <ol>
        <li>Ensure you have the <strong>Java Development Kit (JDK)</strong> installed on your system.</li>
        <li>Save the <code>PROG5121POE.java</code> file in a directory.</li>
        <li>Open a <strong>command prompt</strong> or <strong>terminal</strong> and navigate to the directory.</li>
        <li>Compile the Java file: <code>javac PROG5121POE.java</code>.</li>
        <li>Run the application: <code>java PROG5121POE</code>.</li>
    </ol>

    <h3 id="license">License</h3>
    <p>This project is licensed under the MIT License. See the LICENSE file for more details.</p>

    <h3 id="contact">Contact</h3>
    <p>For any inquiries, please contact:</p>
    <ul>
        <li><strong>Name:</strong> Lesego Khaole</li>
        <li><strong>Email:</strong> lesegokhaole@icloud.com or st10455441@imconnect.edu.za</li>
    </ul>

</body>
</html>
