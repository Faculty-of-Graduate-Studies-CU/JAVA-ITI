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

## Memory Diagram Example
