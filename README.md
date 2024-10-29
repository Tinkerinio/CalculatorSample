# CalculatorSample
<h3> Calculator Application </h3> <br> 
Description <br>
A simple calculator application built in Java using the Model-View-Controller (MVC) pattern. Supports basic arithmetic operations: addition, subtraction, multiplication and division, with error handling such as division by zero and invalid data entry.
<hr>
Functionality <ol>
<li>Arithmetic operations: addition, subtraction, multiplication, division. </li>
<li> Error checking: <br>
    Division by zero with error message. <br>
    Entering incorrect data (for example, non-numeric values) with an error message. </li>
<li> User Interface: <br>
    Fields for entering two numbers. <br>
    Buttons for selecting an arithmetic operation.
    Area for displaying the calculation result. </li>
</ol>

<hr>
Technical details <br>
1. MVC: An application is divided into three main parts: Model, View and Controller. <br>
2. Java Swing: The user interface is based on the Swing library. <br>
<h1> </h1>

Installation and launch <br>
Prerequisites <br>
1. Installed Java Development Kit (JDK) version 8 or higher. <br>
2. Development environment (IntelliJ IDEA or Eclipse recommended) for working with the project. <br>

Startup instructions
1. Open the project in your IDE.
2. Run the file CalculatorApp.java, which is located in the root directory of the project.

Once launched, the calculator window will open and you can enter numbers, select operations, and get results.
<hr>
Project structure: <ul>
 <li>CalculatorModel.java — A model containing the business logic for performing calculations. </li>
 <li>CalculatorView.java — The view containing the user interface. </li>
 <li>CalculatorController.java — Controller that processes events from View and passes data to Model. </li>
 <li>CalculatorApp.java - Main class for launching the application. </li>
</ul>
<hr>
Examples of use: <ol>
<li> Enter two numbers in the appropriate fields. </li>
<li> Press the button with the operation you want to perform (+, -, *, /).</li>
<li> The result will be displayed on the screen. If division by zero or incorrect entry occurs, an error message will be displayed. </li> </ol>
