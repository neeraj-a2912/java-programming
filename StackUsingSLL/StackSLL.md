# StackSLL: A Stack Implementation Using Singly Linked List

## Overview

This repository contains a Java implementation of a stack data structure using a singly linked list. The `StackSLL<T>` class provides efficient and generic operations for managing a stack of elements.

## Key Features

- **LIFO Principle:** Follows the Last-In-First-Out principle for element retrieval.
- **Generic Implementation:** Can store elements of any type `T`.
- **Dynamic Memory Allocation:** Uses a singly linked list for flexible memory usage.
- **Key Operations:**
    - `push(T data)`: Adds an element to the top of the stack.
    - `pop()`: Removes and returns the top element.
    - `peek()`: Returns the top element without removing it.
    - `size()`: Returns the number of elements in the stack.
    - `isEmpty()`: Checks if the stack is empty.
    - `print()`: Prints the elements of the stack (for debugging).

## Usage Example

```java
StackSLL<Integer> stack = new StackSLL<>();
stack.push(10);
stack.push(20);
stack.push(30);

System.out.println(stack.peek());   // Output: 30
System.out.println(stack.pop());    // Output: 30
System.out.println(stack.isEmpty()); // Output: false
```


