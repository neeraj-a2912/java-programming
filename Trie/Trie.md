## Trie Data Structure in Java

This repository implements a Trie data structure in Java. A Trie (or Prefix Tree) is a space-efficient tree-based data structure for storing strings, offering efficient operations like search, prefix search, and insertion.

**Features:**

* **Efficient insertion:** Inserts words into the Trie with a time complexity of O(length of word).
* **Fast search:** Searches for the existence of a word in the Trie with a time complexity of O(length of word).

**Usage:**

1. **Clone the repository:**

```bash
git clone https://github.com/your-username/trie-java.git
```

2. **Compile and run the code:**

```bash
javac Trie.java
java Trie
```

**Example:**

```java
Trie trie = new Trie();
trie.insert("apple");
trie.insert("app");
trie.insert("banana");

System.out.println(trie.search("apple"));  // Output: true
System.out.println(trie.search("app"));    // Output: true
System.out.println(trie.search("banana")); // Output: true

```

