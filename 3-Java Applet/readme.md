#### Applets 
- An Applet is a client side java program that runs inside the web browser.
- The .class file of the applet is downloaded from the web server to the client`s machine.
- The JVM interprets and runs the applet inside the browser.
> in order to protect the client from malformed files or malicious code,the JVM enforce some security restrictions on the applets
* [ ] Syntax is checked before running
* [ ] No I/O operations on the hard disks
* [ ] Communicates only with the server from which it was downloaded
> Applets can prompt the client for additional security privileges if needed
#### Applets Life Cycle :

```JAVA
    Start([start<br>state]) --> AC[Applet Constructing]
    AC -->|init()| [Applet Initialized]
    AI -->|start()| [Applet Running]
    AR -->|stop()| [Applet Stopped]
    AS -->|start()| AR
    AR -->|paint()| AR
    AS -->|destroy()| AD[Applet Destroyed]
    AD --> End([end<br>state])
```
#### The lifecycle of an Applets:
- init():
  - Called when the applet is being initialized for the first time
- start():
  - Called whenever the browser`s windows is activated
- paint(Graphics g):
  - called after start() to paint the applet
  - or whenever the applet is repainted
- stop()
  - called whenever the browser`s windows is deactivated
- destroy()
  - called when the browser`s window is closed
> You can refresh the applet anytime by calling: repaint()
- which will invoke `update(Graphics g)` to clear the applet
- which in turn invoke `paint(Graphics g)`to draw the applet again
> to create your own applet,you write a class that extend class `Applet` ,then you can override the appropriate methods of life cycle.
