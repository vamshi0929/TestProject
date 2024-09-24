# TestProject
TestProject


nclude the following information in your README.md file:
markdown
# Flexible Calculator

## Overview
This is a simple, extensible calculator implementation in Java. It adheres to the Open-Closed Principle and supports chaining operations.

## Features
- Supports basic operations: ADD, SUBTRACT, MULTIPLY, DIVIDE.
- Allows chaining multiple operations.
- IoC-compatible design.
- Gracefully handles invalid operations and division by zero.

## How to Use
1. Initialize `SimpleCalculator` with an initial value.
2. Use `calculate()` for basic operations.
3. Use `chain()` for chaining multiple operations.

## Requirements
- JDK 8 or higher
- JUnit 5 for testing

## Running Tests
Use the following command to run tests:

bash
mvn test
