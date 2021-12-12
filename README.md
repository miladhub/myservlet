Servlet Example
===

This is just a sample servlet.

Installing Tomcat 9.x
===

[Download it](https://tomcat.apache.org/download-10.cgi#10.0.14)
and extract it to `~/apache-tomcat-10.0.14/`.


Build & deploy
===

    mvn clean install && cp target/myservlet.war ~/apache-tomcat-10.0.14/webapps/
    
Accessing the app
===

Open up <http://localhost:8080/myservlet/>
