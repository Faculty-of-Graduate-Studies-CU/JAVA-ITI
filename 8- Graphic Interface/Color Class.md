#### COLORS:
- in order to work with colors in your GUI application you can use the color class
- Commonly used constructors
```java
color(int r,int g,int b);
color(float r,float g,float b)
```
> Commonly used methods
```java
int getRed()
int getGreen()
int getBlue()
color darker()
color brighter()
```
> Objects of class are immutable
#### Public static final colors:
- there are 13 predefined color objects in java
- they are declared as `public static final` objects in class color it self
```java
color.RED
color.ORANGE
color.PINK
color.YELLOW
color.GREEN
color.BLUE
color.CYAN
color.MAGENTA
color.GRAY
color.DAEK_GREY
color.LIGHT_GREY
color.WHITE
color.BLACKS
```
- to specify a certain color o be used when drawing on applet`s Graphics object use the following methods of class Graphics :
```java
void setColor (color c);
```
- to change the colors of forground or background of any components ,use the following methods of components
```java
void setForground(color c);
void setBackground(color c);
```
