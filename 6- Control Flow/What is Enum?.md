#### Overview
- Enums (enumerations) are a special data type that enables a variable to be a set of predefined constants. 
- They were introduced in Java 5 and provide type safety for representing fixed sets of values.
```java
java
enum EnumName {
    CONSTANT1,
    CONSTANT2,
    CONSTANT3
}
```
#### Enum with methods and field 
```java
enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6);
    
    private final double mass;   // in kilograms
    private final double radius; // in meters
    
    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }
    
    public double getMass() { return mass; }
    public double getRadius() { return radius; }
    
    // Universal gravitational constant (m³ kg⁻¹ s⁻²)
    public static final double G = 6.67300E-11;
    
    public double surfaceGravity() {
        return G * mass / (radius * radius);
    }
}

// Usage
Planet earth = Planet.EARTH;
double mass = earth.getMass();
double gravity = earth.surfaceGravity();
```
#### Enum with Custom Methods
```java
enum Operation {
    PLUS {
        public double apply(double x, double y) { return x + y; }
    },
    MINUS {
        public double apply(double x, double y) { return x - y; }
    },
    TIMES {
        public double apply(double x, double y) { return x * y; }
    },
    DIVIDE {
        public double apply(double x, double y) { return x / y; }
    };
    
    public abstract double apply(double x, double y);
}

// Usage
Operation op = Operation.PLUS;
double result = op.apply(5, 3); // Returns 8.0
```
#### Key Features
1. `Type Safety~: Prevents invalid values from being assigned
2. `Built-in Methods:`
   - values(): Returns all enum constants as an array
   - valueOf(String name): Returns the enum constant with the specified name
   - ordinal(): Returns the position of the enum constant
   - name(): Returns the name of the enum constant
3. Can Implement Interfaces:
```java
interface Printable {
    void print();
}

enum Color implements Printable {
    RED {
        public void print() { System.out.println("Red color"); }
    },
    GREEN {
        public void print() { System.out.println("Green color"); }
    };
}
```
4. Can Be Used in Switch Statements:
```java
Day day = Day.MONDAY;

switch(day) {
    case MONDAY:
        System.out.println("Start of work week");
        break;
    case FRIDAY:
        System.out.println("End of work week");
        break;
    default:
        System.out.println("Midweek");
}
```
#### Best Practices
* [ ] Use enums instead of integer or string constants
* [ ] Use descriptive names for enum constants
* [ ] Consider adding methods and fields to make enums more powerful
* [ ] Use the singleton pattern with enums for thread-safe singletons

#### Common Use Cases
* [ ] Representing states (OPEN, CLOSED, PENDING)
* [ ] Categories (SMALL, MEDIUM, LARGE)
* [ ] Options (YES, NO)
* [ ] Directions (NORTH, SOUTH, EAST, WEST)

> Enums provide a robust way to define a fixed set of constants with additional functionality and type safety.
