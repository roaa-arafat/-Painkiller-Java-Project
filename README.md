# Painkiller Java Project

This project is a Java implementation based on a UML diagram as required in Homework #2.

## Description
The project contains two main classes:
- **Drug**: represents the base class with common drug attributes.
- **Painkiller**: inherits from the Drug class and adds specific information.

A main class is used to test the functionality and handle user input.

## Classes Overview
- **Drug**
  - price
  - type
  - getTotalPrice()

- **Painkiller**
  - id
  - name
  - Inherits all attributes and methods from Drug

- **TestPainKiller**
  - Contains the `main()` method
  - Creates an array of 3 Painkiller objects
  - Reads data from the user
  - Prints painkillers with:
    - type = "panda"
    - total price > 20
