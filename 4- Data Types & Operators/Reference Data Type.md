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

## Categories of Reference Types

### 1. **Class Types**
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
