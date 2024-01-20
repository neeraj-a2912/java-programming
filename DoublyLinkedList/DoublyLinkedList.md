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

    ```java
    // Create a doubly linked list of strings
    DLL<String> myList = new DLL<>();
    
    // Add elements to the list
    myList.addFirst("Alice");
    myList.add("Bob");
    myList.addLast("Charlie");
    myList.addAtIndex(2, "David");
    
    // Print the list
    myList.printLL();  // Output: null<->Alice<->David<->Bob<->Charlie<->null
    
    // Remove elements from the list
    myList.removeFirst();
    myList.removeAtIndex(1);
    
    // Print the updated list
    myList.printLL();  // Output: null<->Bob<->Charlie<->null
    
    // Access values in the list
    String firstElement = myList.getFirst();  // "Bob"
    String lastElement = myList.getLast();  // "Charlie"
    String thirdElement = myList.getValueAtIndex(2);  // null (index out of bounds)
    
    // Check if a value exists in the list
    boolean containsDavid = myList.contains("David");  // false
    ```

