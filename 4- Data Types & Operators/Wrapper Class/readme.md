
#### Wrapper Classes

Java provides wrapper classes for each primitive type to use them as objects.

| Primitive | Wrapper Class | Example |
| :--- | :--- | :--- |
| `byte` | `Byte` | `Byte b = Byte.valueOf((byte)10);` |
| `short` | `Short` | `Short s = Short.valueOf((short)100);` |
| `int` | `Integer` | `Integer i = Integer.valueOf(1000);` |
| `long` | `Long` | `Long l = Long.valueOf(10000L);` |
| `float` | `Float` | `Float f = Float.valueOf(3.14f);` |
| `double` | `Double` | `Double d = Double.valueOf(3.14159);` |
| `char` | `Character` | `Character c = Character.valueOf('A');` |
| `boolean` | `Boolean` | `Boolean bool = Boolean.valueOf(true);` |

#### Autoboxing & Unboxing:

```java
// Autoboxing (automatic conversion primitive → wrapper)
Integer num = 42; // Equivalent to: Integer num = Integer.valueOf(42);

// Unboxing (automatic conversion wrapper → primitive)
int value = num; // Equivalent to: int value = num.intValue();
```
#### Common Wrapper Class Methods:
```java
Integer num = 123;
int primitive = num.intValue(); // Convert to primitive
String str = num.toString(); // Convert to String
int parsed = Integer.parseInt("456"); // Parse String to int
int max = Integer.MAX_VALUE; // Maximum value constant
int min = Integer.MIN_VALUE; // Minimum value constant
```
#### Use Cases for Wrapper Classes:
- `Collections:` Required for storing primitives in generics
- `Nullable values:` Can represent null instead of default values
- `Utility methods:`Provide useful conversion and checking methods
- `Reflection:` Required when working with reflection APIs
