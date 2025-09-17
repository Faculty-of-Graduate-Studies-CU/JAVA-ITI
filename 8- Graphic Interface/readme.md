#### Graphic Class
- The Graphic object is your means of communication with the graphics display
- You can use it to draw strings,basic shapes and show images
- You can also use it to specify the colour and the font you wish
- You can write a string using the following :
```java
void drawString (String str,int x,int y);
```
#### Some basic shapes 
```java
void drawLine(int x1,int y1,int x2,int y2);
void drawRect(int x,int y,int width,int height);
void fillRect(int x,int y,int width,int height);

void drawOval(int x,int y,int width,int height);
void fillOval(int x,int y,int width,int height);

void drawArch(int x,int y,int width,int height,int starAngel,int arcAngle);
void fillArch(int x,int y,int width,int height,int starAngle,int arcAngle);
```
#### Main Graphics class in java 
1. Graphics Class (java.awt.Graphics)
2. Graphics2D Class (java.awt.Graphics2D)
3.  BufferedImage Class
4. Complete Animation Example
#### Key Methods in Graphics Class

| Method | Description |
|--------|-------------|
| `drawLine(int x1, int y1, int x2, int y2)` | Draws a line between two points |
| `drawRect(int x, int y, int width, int height)` | Draws a rectangle outline |
| `fillRect(int x, int y, int width, int height)` | Fills a rectangle |
| `drawOval(int x, int y, int width, int height)` | Draws an oval outline |
| `fillOval(int x, int y, int width, int height)` | Fills an oval |
| `drawArc(int x, int y, int width, int height, int startAngle, int arcAngle)` | Draws an arc |
| `drawString(String str, int x, int y)` | Draws text |
| `setColor(Color c)` | Sets the current color |
| `setFont(Font font)` | Sets the font for text |
##### 1. Graphics Class (java.awt.Graphics)
- The fundamental class for 2D graphics operations.


