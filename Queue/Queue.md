# Queue Implementation Using ArrayList

## Overview

This repository contains a Java implementation of a queue data structure using an ArrayList. The `Queue<T>` class provides efficient and generic operations for managing a queue of elements.

## Key Features

- **FIFO Principle:** Follows the First-In-First-Out principle for element retrieval.
- **Generic Implementation:** Can store elements of any type `T`.
- **Dynamic Memory Allocation:** Uses an ArrayList for flexible memory usage.
- **Key Operations:**
    - `enqueue(T val)`: Adds an element to the rear of the queue.
    - `dequeue()`: Removes and returns the element at the front of the queue.
    - `front()`: Returns the element at the front of the queue without removing it.
    - `size()`: Returns the number of elements in the queue.
    - `isEmpty()`: Checks if the queue is empty.
    - `printQueue()`: Prints the elements of the queue (for debugging).

## Usage Example

```java
Queue<Integer> queue = new Queue<>();
queue.enqueue(10);
queue.enqueue(20);
queue.enqueue(30);

System.out.println(queue.front());   // Output: 10
System.out.println(queue.dequeue());  // Output: 10
System.out.println(queue.isEmpty()); // Output: false
```


