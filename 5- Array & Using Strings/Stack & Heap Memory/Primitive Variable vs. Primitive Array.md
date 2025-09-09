```java
public class PrimitiveVsArray {
    public static void main(String[] args) {
        // PRIMITIVE (on the stack)
        int age = 30; // The value '30' is stored directly on the stack.

        // ARRAY OF PRIMITIVES (object on the heap)
        int[] temperatures = new int[5]; // Reference on stack, object on heap.
        temperatures[0] = 25; // The value '25' is stored inside the array object on the heap.

        // Pass both to a method
        modifyValues(age, temperatures);
        
        System.out.println("Age after method call: " + age); // Output: 30 (unchanged)
        System.out.println("temperatures[0] after method call: " + temperatures[0]); // Output: 99 (changed!)
    }

    public static void modifyValues(int primitiveParam, int[] arrayParam) {
        // This modifies the local copy of the primitive (on the stack)
        primitiveParam = 99;

        // This modifies the object on the heap that arrayParam points to.
        if (arrayParam.length > 0) {
            arrayParam[0] = 99; // This change will be visible to the caller.
        }
    }
}
```
- **Primitives are passed by value.** A copy of the `value 30` is passed to the method.
- The original age variable on the stack is untouched.
- **Arrays (Objects) are passed by reference value.**
-  A copy of the reference (the memory address 0x789) is passed to the method.
-   Both the original temperatures reference and the method's arrayParam reference point to the same object on the heap. Therefore,
- changes made to the object's contents inside the method are permanent and visible to the caller.
> In summary: The array container is on the heap, and the primitive values are stored inside that container on the heap.
The variable on the stack simply holds the address to find that container.
- The reason temperatures[0] becomes 99 is because of how objects are passed to methods.
> It's not the object itself that is passed, but the address to the object.
#### The Analogy: Your Home Address
1. You have a house `(The Object on the Heap)`. This is your array [25, ...].
2. You write your address on a piece of paper `(The Reference on the Stack)`.
   > The variable `temperatures` is `this piece of paper`. It doesn't contain the house; it contains the directions to the house.
3. You give a copy of that paper to a friend `(Calling the Method)`.
   > You call modifyValues(age, temperatures). You are not giving your friend the actual house.
   >  You are giving them a photocopy of the paper with your address on it. This photocopy is the method's parameter arrayParam.
4. Now, both you (in the main method) and your friend (in the modifyValues method) have a piece of paper with the same address written on it.
   - If your friend uses their paper to go to your house and repaints the front door (modifying the object, e.g., arrayParam[0] = 99), then the house itself changes.
   - When you later go to your house, you will see the repainted door! This is why the change is visible in main.
> What your friend cannot do is change the information on your original piece of paper. If they cross out your address and write a new one on their photocopy, it doesn't affect your original paper at all. This is what happens if you try to reassign the parameter itself (e.g., arrayParam = new int[10];). This change would not be seen by the main method.


