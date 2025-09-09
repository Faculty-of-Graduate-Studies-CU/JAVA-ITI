#### Creating String objects 
```java
String mystr1 = new String("Welcome");
String sp1 = "Welcome";
String sp2 ="To java";
```
- Testing for String Equality
   - `if (myStr1.equals(sp1))`
   - `if(myStr2.equalsIgnoreCase(sp2))`
     > `if(myStr1 == sp1)` Shallow comparison ,just compare the references.
- the "+" and "+=" operators were overloaded in java for class String to be used in concatenation
- Objects of class string are immutable
  > You cant modify the contents of String object after construction
- Concatentaion always return a new object that hold the result of concatenation .
  > The remain objects remain unchanged
#### String objects are created without using the 'new' keyword and that are said to belong to the `String Pool`
- String objects in the pool have a special behaviour :
   - if we attempt to create a fresh String object with exactly the same characters as an object that already exist in the pool (Case Sensetive)
   - Then no new Object will be created
   - instead the newely declared reference will point to the existing object in the pool
- Such behaviour results in abetter performance and  saves some heap memory
> Remember : objects of class Strings are immutable.
