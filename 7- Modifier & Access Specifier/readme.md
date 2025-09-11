#### Modifiers and Access Specifiers
#### Graphic ,color,and font class
#### Exception Handeling
##### Modifiera & Access Specifiers :
- Modifiera & Access Specifiers are swt of keywords that affect the way we work with features(classes, methods,and variables)
- The following table illustrates theses keyword and how they are used
# Java Modifiers and Access Specifiers

## Access Modifiers
| Modifier | Class | Package | Subclass | World | Description |
|----------|-------|---------|----------|-------|-------------|
| `public` | ✅ | ✅ | ✅ | ✅ | Accessible from any other class |
| `protected` | ✅ | ✅ | ✅ | ❌ | Accessible within package and subclasses |
| `default` | ✅ | ✅ | ❌ | ❌ | Accessible only within the same package |
| `private` | ✅ | ❌ | ❌ | ❌ | Accessible only within the same class |

## Non-Access Modifiers
| Modifier | Applicable To | Description |
|----------|---------------|-------------|
| `static` | Methods, Variables, Blocks, Classes | Belongs to the class rather than instances |
| `final` | Classes, Methods, Variables | Cannot be modified/overridden/inherited |
| `abstract` | Classes, Methods | Cannot be instantiated, must be implemented |
| `synchronized` | Methods, Blocks | Restricted to one thread at a time |
| `volatile` | Variables | Value always read from main memory |
| `transient` | Variables | Excluded during serialization |
| `native` | Methods | Implemented in platform-dependent code |
| `strictfp` | Classes, Methods | Uses strict floating-point calculations |

## Usage Examples
```java
// Access modifiers example
public class Example {
    public String publicVar;
    protected String protectedVar;
    String defaultVar;
    private String privateVar;
}

// Non-access modifiers example
public static final double PI = 3.14159;
public abstract class Animal {
    public abstract void sound();
}
