All commands are run in a command line shell, like bash

To build the Docker container:
    cd to the project's root directory
    cd to the "docker" directory
    On the command line run: 
        docker build -t rev-rest-service .
    (don't forget the "." at the end of the previous line)

To run the Docker container:
    run: 
        docker run -p 18080:8080 rev-rest-service
    (this will start docker and the web service)

To access the web service in the Docker container:
    Using any http client (e.g. a browser, curl, etc.), access this URL:
    http://localhost:18080/reversed-strings/98765
    Where "98765" is the string that will be reversed 
    For instance:
        curl http://localhost:18080/reversed-strings/98765

To stop the Docker container:
    docker stop `docker ps -q`

The project's jar artifact can be built with maven:
    cd to project's root directory
    Run "mvn clean package"
    The maven build will generate the jar artifact target/rev-rest-service-0.1.0.jar
    The jar file contains the web service and embedded Tomcat
    If you would like to use the jar generated from the maven build run the copy command:
        cp -f target/rev-rest-service-0.1.0.jar docker 
    Re-build the Docker container.
