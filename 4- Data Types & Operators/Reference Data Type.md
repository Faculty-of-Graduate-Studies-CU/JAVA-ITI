#### Reference Data Types in Java
- Reference data types in Java store references (memory addresses)
to objects rather than the actual data itself.
* [ ] Unlike primitive types, they are objects and inherit from the Object class.
# Reference Data Types in Java

Reference data types in Java store references (memory addresses) to objects rather than the actual data itself. Unlike primitive types, they are objects and inherit from the `Object` class.

## Key Characteristics

| Aspect | Description |
| :--- | :--- |
| **Storage** | Store memory references (addresses) on the stack, while the actual objects reside on the heap |
| **Default Value** | `null` (when declared as instance variables) |
| **Memory** | Variable size (depends on the object) |
| **Operations** | Support methods and operations defined in their class |
| **Comparison** | `==` compares references, `.equals()` compares content |

#### Categories of Reference Types

##### 1. **Class Types**
Objects created from class definitions.

```java
// String is a class type
String name = "John Doe";

// Custom class
class Person {
    String name;
    int age;
}
Person person = new Person();
```
##### 2. Pass by Value
- Java passes references by value, not by reference.
```java
void modifyArray(int[] arr) {
    arr[0] = 100; // Affects original array (same reference)
    arr = new int[5]; // Doesn't affect original reference
}

int[] numbers = {1, 2, 3};
modifyArray(numbers);
// numbers[0] is now 100, but numbers still points to original array
```
> Understanding Pass-by-Value:

> Primitive types: Actual values are copied

> Reference types: References (memory addresses) are copied, not the objects themselves

> No pass-by-reference: Java doesn't support passing references to variables

> No pointer at java or copy constructor
#### 3. Memory Management
- Objects are garbage-collected when no longer referenced.
```java
 Person p = new Person(); // Object created on heap
p = null; // Eligible for garbage collection
```
