# Queue Implementation Using Singly Linked List

## Overview

This repository contains a Java implementation of a queue data structure using a singly linked list. The `QueueSLL<T>` class provides efficient and generic operations for managing a queue of elements.

## Key Features

- **FIFO Principle:** Follows the First-In-First-Out principle for element retrieval.
- **Generic Implementation:** Can store elements of any type `T`.
- **Dynamic Memory Allocation:** Uses a singly linked list for flexible memory usage.
- **Key Operations:**
    - `enqueue(T data)`: Adds an element to the rear of the queue.
    - `dequeue()`: Removes and returns the element at the front of the queue.
    - `peek()`: Returns the element at the front of the queue without removing it.
    - `size()`: Returns the number of elements in the queue.
    - `isEmpty()`: Checks if the queue is empty.
    - `printQueue()`: Prints the elements of the queue (for debugging).

## Usage Example

```java
QueueSLL<Integer> queue = new QueueSLL<>();
queue.enqueue(10);
queue.enqueue(20);
queue.enqueue(30);

System.out.println(queue.peek());   // Output: 10
System.out.println(queue.dequeue());  // Output: 10
System.out.println(queue.isEmpty()); // Output: false
```


