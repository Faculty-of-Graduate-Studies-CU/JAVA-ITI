#### The 8 Primitive Data Types in Java
1. Java has eight primitive data types, which can be categorized into four groups:
2. Integer Types (for whole numbers)
3. Floating-Point Types (for numbers with decimals)
4. Character Type (for single characters)
5. Boolean Type (for true/false values)
> Here is a table summarizing all eight:.

| Type | Size | Default | Range | Example |
|:-----|:----:|:-------:|:------|:--------|
| **byte** | 8 bits | 0 | -128 to 127 | `byte b = 100;` |
| **short** | 16 bits | 0 | -32,768 to 32,767 | `short s = 5000;` |
| **int** | 32 bits | 0 | -2³¹ to 2³¹-1 | `int i = 100000;` |
| **long** | 64 bits | 0L | -2⁶³ to 2⁶³-1 | `long l = 100000L;` |
| **float** | 32 bits | 0.0f | ±3.4E+38 (6-7 digits) | `float f = 3.14f;` |
| **double** | 64 bits | 0.0d | ±1.7E+308 (15 digits) | `double d = 3.14159;` |
| **char** | 16 bits | '\u0000' | '\u0000' to '\uffff' | `char c = 'A';` |
| **boolean** | ~1 bit | false | true or false | `boolean flag = true;` |

#### Key Characteristics

- **Not objects**: Stored directly on the stack (not heap)
- **Lowercase keywords**: All type names are lowercase
- **Fixed size**: Each type has a precisely defined size
- **Efficient**: Fast access and minimal memory overhead
