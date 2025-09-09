#### Array of objects References:
- In Java, an array of objects is actually an array of references to objects, not the objects themselves. All elements in the array are initialized to null until explicitely assigned an object.

```java
String [] namesArr;
namesArr = new String[];
namesArr[0].anyMethods()
//ILLEGAL
//Throws NullPointerException
namesARR[0] = new String("Hello");
namesARR[1] = new String("James");
namesARR[2] = new String("Gosling");
```
