## SLL (Generic Singly Linked List Implementation)**

**This repository contains a Java implementation of a generic singly linked list.**

## Key Features

* **Generic Type:** The `SLL` class can store any type of data, making it adaptable to various use cases.
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
        - `size()`: Returns the current size of the list.
        - `printLL()`: Prints the contents of the list.

## Usage

1. Clone the repository
2. Import the `SLL` class into your Java project.
3. Create an instance of the `SLL` class:
   ```java
   SLL<Integer> myList = new SLL<>();
   ```
4. Use the provided methods to interact with the linked list:
   ```java
   myList.addFirst(5);
   myList.addLast(10);
   myList.addAtIndex(1, 7);
   myList.printLL();  // Output: 5->7->10->null
   ```
