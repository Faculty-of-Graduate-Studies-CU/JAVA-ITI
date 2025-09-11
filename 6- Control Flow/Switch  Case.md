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

