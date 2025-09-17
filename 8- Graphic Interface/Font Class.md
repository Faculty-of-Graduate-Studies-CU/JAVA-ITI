#### Font Class
- in order to create and specify fonts in your GUI application you can use the FONT CLASS
- Commonly used constructors
```java
Font(String name,int style,int size);
```
- To specify a ceertain font to be used when drawing on the applets Graphics objects you can use the following methods
```java
void ssetFont(Font f);
```
- to change the font of any component
```java
void setFont(Font f);
```
> to obtain the list of basics fonts supported you can use the following code
> ```java
> String [] s =Toolkit.getDefaultToolkit().getFontList();
> ```
- Objects of class FONTS Are immutable
