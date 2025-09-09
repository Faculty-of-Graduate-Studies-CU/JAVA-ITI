#### stack and heap memory in java
##### Java Stack vs Heap Memory Allocation 
- In Java, the Java Virtual Machine (JVM) uses two primary memory areas for storing data at runtime: the stack and the heap. The key difference is
  -  what they store,
  -  how they are managed,
  -  and their scope and lifespan.
- **Stack Memory:** This memory is used to store local variables, method calls, and reference data during program execution.The stack is a fast, temporary memory space used for the execution of a single thread. Each thread in a Java application has its own private JVM stack, created when the thread is started.
-  What It Stores
    - *Method Calls:* Stack frames are pushed onto the stack for each method invocation.
    - *Local Variables:* Primitive variables (e.g., int, char, boolean) and reference variables (which point to objects in the heap) that are declared inside a method.
    - *Partial Results:* Intermediate operands and return values from method calls.
- Key Characteristics
    - *LIFO (Last-In, First-Out):* It operates like a stack of plates. The last method called (the most recent) is the first one to be completed and popped off the stack.
    - *Thread-Specific:* Each thread has its own stack. This makes stack memory inherently thread-safe.
    - *Fixed Lifespan:* Memory is allocated when a method is invoked and freed immediately when the method exits (the stack frame is popped).
    - *Access Speed:* Very fast allocation and deallocation (just moving a stack pointer).
    - *Size:* Typically much smaller than the heap. The default stack size can be configured (e.g., using the -Xss JVM argument).
    - *Memory Management:* Automatic and deterministic (managed by the JVM, not the garbage collector).
  > Common Error: StackOverflowError
This occurs when the stack memory is exhausted. The most common cause is deep or infinite recursion (a method calling itself too many times without exiting).
- **Heap Memory:** This memory is used to store objects and dynamic data allocated at runtime.The heap is a large, shared memory area used for dynamic memory allocation. It is created when the JVM starts and is shared among all threads of the application.
- What It Stores
   - *Objects:* All Java objects (instances of classes, e.g., new MyClass(), new int[]).
   - *Instance Variables:* Fields (attributes) that belong to an object.
   - *Arrays:* Whether they contain primitives or objects.
- Key Characteristics
    - *Global Access:* The heap is shared across the entire application. Any thread can access an object on the heap, which can lead to synchronization issues.
    - *Dynamic Size:* The heap grows and shrinks as the application runs. Its initial and maximum size can be configured using JVM arguments (-Xms and -Xmx).
    - *Flexible Lifespan:* Objects remain in the heap from their creation until they are no longer referenced and are garbage collected.
    - *Access Speed:* Slower allocation and deallocation compared to the stack due to its dynamic nature.
    - *Memory Management:* Managed by the Garbage Collector (GC), which automatically frees memory by destroying objects that are no longer reachable by any reference.
  > Common Error: OutOfMemoryError
This occurs when the heap space is full and the garbage collector cannot reclaim enough memory to create a new object.
