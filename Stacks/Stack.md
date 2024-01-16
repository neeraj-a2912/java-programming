## Stack (Generic Stack Implementation using ArrayList)**

**This repository contains a Java implementation of a generic stack using an ArrayList.**

## Key Features

* **Generic Type:** The `Stack` class can store any type of data, making it versatile for various applications.
* **ArrayList-Based:** Uses an `ArrayList` to provide efficient stack operations.
* **Key Operations:**
    - `isEmpty()`: Checks if the stack is empty.
    - `push(x)`: Adds an element `x` to the top of the stack.
    - `pop()`: Removes and returns the top element from the stack.
    - `peek()`: Returns the top element without removing it.
    - `printStack()`: Prints the elements of the stack (top to bottom).

## Usage

1. Clone the repository:
2. Import the `Stack` class into your Java project.
3. Create an instance of the `Stack` class:
   ```java
   Stack<Integer> myStack = new Stack<>();
   ```
4. Use the provided methods to interact with the stack:
   ```java
   myStack.push(5);
   myStack.push(3);
   myStack.push(7);
   myStack.printStack();  // Output: 7->3->5
   ```

