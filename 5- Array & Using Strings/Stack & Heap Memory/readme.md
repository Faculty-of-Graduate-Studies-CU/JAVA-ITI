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
    - LIFO (Last-In, First-Out): It operates like a stack of plates. The last method called (the most recent) is the first one to be completed and popped off the stack.
    - *Thread-Specific:* Each thread has its own stack. This makes stack memory inherently thread-safe.
    - *Fixed Lifespan:* Memory is allocated when a method is invoked and freed immediately when the method exits (the stack frame is popped).
    - *Access Speed:* Very fast allocation and deallocation (just moving a stack pointer).
    - *Size:* Typically much smaller than the heap. The default stack size can be configured (e.g., using the -Xss JVM argument).
    - *Memory Management:* Automatic and deterministic (managed by the JVM, not the garbage collector).
  > Common Error: StackOverflowError
This occurs when the stack memory is exhausted. The most common cause is deep or infinite recursion (a method calling itself too many times without exiting).
- **Heap Memory:** This memory is used to store objects and dynamic data allocated at runtime.The heap is a large, shared memory area used for dynamic memory allocation. It is created when the JVM starts and is shared among all threads of the application.

