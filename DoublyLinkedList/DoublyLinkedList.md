## Doubly Linked List Implementation in Java

**This repository contains a Java implementation of a doubly linked list, a linear data structure that allows for efficient element insertion and removal at both ends.**

## Key Features

* **Generic Type:** The `DLL` class can store any type of data, making it adaptable to various use cases.
* **Key Operations:**
    - **Add elements:**
        - `addFirst(data)`: Adds an element to the beginning of the list.
        - `addLast(data)`: Adds an element to the end of the list.
        - `add(data)`: Identical to `addLast(data)`.
        - `addAtIndex(index, data)`: Inserts an element at a specific index.
    - **Remove elements:**
        - `removeFirst()`: Removes the first element from the list.
        - `removeLast()`: Removes the last element from the list.
        - `removeAtIndex(index)`: Removes the element at a specific index.
    - **Access values:**
        - `getFirst()`: Returns the value of the first element.
        - `getLast()`: Returns the value of the last element.
        - `getValueAtIndex(index)`: Returns the value of the element at a specific index.
    - **Other methods:**
        - `isEmpty()`: Checks if the list is empty.
        - `size()`: Returns the current size of the list.
        - `contains(val)`: Checks if a given value exists in the list.
        - `printLL()`: Prints the contents of the list.

## Usage


1. Import the `DLL` class into your Java project.
2. Create an instance of the `DLL` class:
   ```java
   DLL<String> myList = new DLL<>();
   ```
4. Use the provided methods to interact with the doubly linked list.


