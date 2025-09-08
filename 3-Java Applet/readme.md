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


