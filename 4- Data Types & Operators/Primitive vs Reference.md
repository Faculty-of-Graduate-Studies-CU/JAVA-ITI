#### Reference vs. Primitive Data Types: Key Characteristics

| Characteristic | Primitive Types | Reference Types |
| :--- | :--- | :--- |
| **Nature** | Basic, built-in data types | Objects (instances of classes) |
| **What they store** | Actual values | Memory addresses (references to objects) |
| **Memory location** | Stored on the stack | Reference on stack, object on heap |
| **Default value** | Type-specific (e.g., `0`, `0.0`, `false`) | `null` |
| **Size** | Fixed (1-8 bytes, depending on type) | Variable (depends on the object) |
| **Operations** | Arithmetic, logical operations | Method calls, field access |
| **Comparison** | `==` compares values | `==` compares references, `.equals()` compares content |
| **Performance** | Faster (direct access) | Slower (requires indirection) |
| **Example types** | `int`, `double`, `char`, `boolean` | `String`, `ArrayList`, arrays, custom classes |
| **Nullability** | Cannot be `null` | Can be `null` |
| **Inheritance** | No inheritance | Inherit from `Object` class |
| **Method support** | No methods | Have methods and fields |

#### Memory Diagram Example
STACK (Primitives) HEAP (Objects)
┌──────────────┐ ┌────────────────────┐
│ int x = 10 │ │ │
│ │ │ String Object │
│ String ref ────────→ │ - value: "Hello" │
│ │ │ - other fields... │
└──────────────┘ └────────────────────┘
#### Code Example Demonstrating Differences

```java
// PRIMITIVE TYPES
int a = 10;
int b = a;  // Value copy (b gets 10)
a = 20;     // Changing a doesn't affect b
System.out.println(b); // Output: 10

// REFERENCE TYPES
int[] arr1 = {1, 2, 3};
int[] arr2 = arr1;     // Reference copy (both point to same array)
arr1[0] = 99;          // Changing through arr1 affects arr2
System.out.println(arr2[0]); // Output: 99

// Comparison examples
String s1 = "Hello";
String s2 = new String("Hello");
System.out.println(s1 == s2);      // false (different references)
System.out.println(s1.equals(s2)); // true (same content)
