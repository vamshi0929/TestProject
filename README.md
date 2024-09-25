# TestProject
TestProject



                                                                        ****Flexible Calculator****
This project is a simple yet flexible calculator implementation in Java. It adheres to the Open-Closed Principle, making it easy to extend with new features. The calculator supports basic arithmetic operations and allows for chaining operations, making it suitable for a variety of use cases.

**Features**
Basic Operations: Supports ADD, SUBTRACT, MULTIPLY, and DIVIDE.
Chaining: Allows multiple operations to be performed in a chain, giving a more seamless calculation experience.
IoC Compatibility: Built using interfaces, making it easy to integrate with dependency injection frameworks like Spring.
Error Handling: Gracefully handles invalid operations and division by zero.

**Project Structure**
Operation Enum: Defines the four basic operations (ADD, SUBTRACT, MULTIPLY, DIVIDE).
Calculator Interface: Provides a flexible interface with methods for calculating and chaining operations.
SimpleCalculator Implementation: Implements the Calculator interface, allowing for operation chaining and result retrieval.
Unit Testing: Comprehensive unit tests ensure the calculator functions as expected.

**How to Use**
1.	Initialize the SimpleCalculator with an initial value.
                     SimpleCalculator calculator = new SimpleCalculator(0);
2.	Perform basic calculations using the calculate() method.
                      calculator.calculate(Operation.ADD, 2, 3); // Result: 5.0
3.	Chain multiple operations using the chain() method.
                        calculator.chain(Operation.ADD, 3)
                                .chain(Operation.MULTIPLY, 2)
                             .chain(Operation.SUBTRACT, 4);
**Retrieve the result:**
Number result = calculator.getResult(); // Result: 12.0
**Extensibility**
•	You can extend the calculator by adding more operations to the Operation enum and handling them in the calculate() method of the SimpleCalculator class.
•	There is no need to modify the Calculator interface, ensuring that existing functionality remains unaffected.
**IoC Compatibility**
•	By using the Calculator interface, this implementation is IoC compatible. 
•	You can use dependency injection frameworks like Spring to manage instances of Calculator.
**Requirements**
•	JDK 8 or higher
•	JUnit 5 for testing
**Running the Project**
•	Compile the project:
                             javac *.java
**Run the main program using:**
                              java SimpleCalculator
**Running Tests**
Run the unit tests using the following Maven command:
                                 mvn test
**Technologies Used**
Java: The main programming language used for implementing the calculator.
JUnit 5: For unit testing.
Maven: For building and managing dependencies

**Notes on Extensibility**
You can extend the calculator's functionality by adding new operations to the operation enum and implementing the corresponding logic in the calculate method within the SimpleCalculator class. This approach follows the Open-Closed Principle, allowing modifications without altering the core Calculator interface.

**IoC Compatibility**
By utilizing the Calculator interface, this implementation adheres to Inversion of Control (IoC) principles. Dependency injection frameworks like Spring can be used to manage Calculator instances.
