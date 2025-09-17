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
