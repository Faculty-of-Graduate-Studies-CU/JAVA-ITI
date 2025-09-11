#### Switch block 
- switch block is used for multiple branching.
- Since java-se7 it can use [byte-short-int-char-enum-string]
#### Java Switch Statement Evolution
##### Version History and Syntax

| Version | Syntax Example | Description |
|---------|----------------|-------------|
| Java 7+ | `switch (variable) { case value1: ... break; default: ... }` | Traditional switch statement |
| Java 7+ | `switch (stringVariable) { ... }` | Switch on String (case sensitive) |
| Java 12+ | `case label1, label2 -> expression;` | Multiple case labels and arrow syntax |
| Java 12+ | `yield` and switch expressions | Returning values from switch |
1. Traditional Switch (Java 7 and above)
```java
switch (expression) {
    case value1:
        // code block
        break;
    case value2:
        // code block
        break;
    default:
        // code block
}
```
2. Switch on Strings (Java 7 and above)
```java
String day = "Monday";
switch (day) {
    case "Monday":
        System.out.println("Start of week");
        break;
    case "Friday":
        System.out.println("End of week");
        break;
    default:
        System.out.println("Midweek");
}
```
3. Enhanced Switch (Java 12+)
```java
switch (expression) {
    case value1 -> // code or expression;
    case value2, value3 -> // code for multiple cases;
    default -> // code;
}
```
4. Switch Expressions (Java 12+)
```java
int numLetters = switch (day) {
    case "Monday", "Friday", "Sunday" -> 6;
    case "Tuesday" -> 7;
    case "Thursday", "Saturday" -> 8;
    case "Wednesday" -> 9;
    default -> -1;
};
```
5. Yield in Switch (Java 12+)
```java
int result = switch (mode) {
    case "a", "b":
        yield 1;
    case "c":
        yield 2;
    default:
        yield -1;
};
```
> Important Notes
- The `break` statement is used to terminate the switch block in traditional switch.
- Without `break`, execution falls through to the next case.
- Java 12+ introduced arrow syntax `(->)` which doesn't require `break` and can handle multiple labels.
- Switch expressions (using `yield` or arrow) return a value.

| Feature | Version | Syntax | Example |
|---------|---------|--------|---------|
| Traditional | Java 7+ | `switch (expr) { case v: ... break; }` | `switch (x) { case 1: ... }` |
| String switch | Java 7+ | `switch (string) { ... }` | `switch (s) { case "A": ... }` |
| Multiple labels | Java 12+ | `case label1, label2 -> ...` | `case 1,2 -> System.out.println("1 or 2");` |
| Arrow syntax | Java 12+ | `case value -> expression` | `case 1 -> System.out.println("One");` |
| Switch expression | Java 12+ | `var result = switch (expr) { ... }` | `int j = switch (i) { case 1 -> 2; }` |
| Yield | Java 12+ | `yield value;` | `case 1: yield 10;` |
#### Version Compatibility Notes

| Style | Example | Notes |
|-------|---------|-------|
| Traditional | `switch (x) { case 1: System.out.println("One"); break; default: break; }` | Uses break to avoid fall-through |
| Traditional with fall-through | `switch (x) { case 1: case 2: System.out.println("1 or 2"); break; }` | Multiple cases without break in between |
| Switch with Strings | `switch (str) { case "A": ... }` | Available since Java 7 |
| Arrow syntax (no fall-through) | `switch (x) { case 1 -> System.out.println("One"); }` | Does not fall through |
| Multiple case labels | `switch (x) { case 1, 2 -> System.out.println("1 or 2"); }` | Combined cases |
| Switch expression (arrow) | `int num = switch (x) { case 1 -> 10; default -> 0; };` | Returns a value |
| Switch expression (yield) | `int num = switch (x) { case 1: yield 10; default: yield 0; };` | Uses yield to return |

#### Java Switch Statement Evolution Summary
#### Version Timeline and Features

| Feature | Version | Example |
|---------|---------|---------|
| Traditional | 1.0+ | `switch (x) { case 1: ... break; }` |
| String switch | 7+ | `switch (s) { case "A": ... }` |
| Enhanced switch (arrow, multiple labels) | 12+ (Preview), 14+ (Standard) | `switch (x) { case 1,2 -> ...; }` |
| Switch expressions | 12+ (Preview), 14+ (Standard) | `int j = switch (x) { case 1 -> 2; default -> 0; };` |

#### Key Features
- Expression Types: Can be byte, short, char, int, String, or enum
- Break Statement: Prevents fall-through to next cases
- Default Case: Executes when no other cases match (optional)

#### Java 14 Enhancements:
- Arrow syntax (->) eliminates need for break statements
- Switch expressions can return values
- Multiple case labels supported
- yield keyword returns values from switch expressions

#### Best Practices
- Always include a default case
- Use break statements to prevent unintentional fall-through
- For Java 14+, prefer the new arrow syntax for better readability
- Use switch expressions when you need to return a value

