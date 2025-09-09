#### The Golden Rule
- Primitive variables themselves are stored on the stack.
- Objects (including Arrays) are stored on the heap.
- A reference variable (which holds the memory address of the object) is stored on the stack.
- An array is an object in Java. Therefore, when you create an array of primitives (e.g., int[]),
  > you are dealing with two parts:
  
  > The reference to the array object `(on the stack)`.
  
  > The array object itself containing the primitive values `(on the heap)`.
```java
public class PrimitiveArrayExample {
    public static void main(String[] args) {
        // Declare a reference variable 'scores' (on the stack)
        int[] scores;

        // Create a new int array object of size 3 on the heap.
        // The reference (memory address) to this object is assigned to 'scores'.
        scores = new int[3]; // Now 'scores' points to the array object.

        // Assign values to the array elements.
        // These primitive values are stored directly inside the array object on the heap.
        scores[0] = 95;
        scores[1] = 87;
        scores[2] = 72;

        // Declare and initialize another reference on the stack.
        // It now points to the SAME array object as 'scores'.
        int[] myScores = scores;

        // A change through one reference affects the object seen by the other.
        myScores[1] = 99;
        System.out.println(scores[1]); // This will print "99"
    }
}
```
      STACK MEMORY                  HEAP MEMORY
      |----------------|           |-------------------------------|
      | Variable       | Value     | Object         | Values       |
      |----------------|--------   |----------------|--------------|
      | args           | [...] |   |                |              |
      |----------------|--------   |----------------|--------------|
      | scores         | 0x789 | --|--> int[3] @0x789| [0]: 95     |
      |----------------|--------   |                | [1]: 99     | // Changed to 99
      | myScores       | 0x789 | --|                | [2]: 72     |
      |----------------|--------   |----------------|--------------|
#### Explanation:
* [ ] `int[] scores;` declares a reference variable on the stack. It is initially null.
* [ ] `new int[3];` allocates memory on the heap for an array object that can hold 3 int primitives. The JVM returns its memory address (e.g., 0x789).
* [ ] `scores = new int[3];` assigns this address to the reference variable scores.
* [ ] The assignments `scores[0] = 95; etc.,` store the primitive values directly into the slots of the array object on the heap.
* [ ] `int[] myScores = scores;` creates a new reference variable on the stack and copies the address from `scores (0x789)` into it.
      > Both references now point to the exact same object on the heap.
      This is why changing an element through `myScores` affects the data seen by `scores.`
