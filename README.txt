
To build the Docker container:
    In a command line shell (like bash), do the following:
    cd to project's root directory
    cd to "docker" directory
    (NOTE: rev-rest-service-0.1.0.jar should already be in the "docker" directory)
    On the command line run: docker build -t rev-rest-service .
    (don't forget the "." at the end of the previous line)

To run the Docker container:
    run: docker run -p 18080:8080 rev-rest-service
    (this will start docker and the web service)

To access the web service in the Docker container:
    Using any http client (e.g. a browser, curl, etc.), access this URL:
    http://localhost:18080/reversed-strings/98765
    Where "98765" is the string you want to reverse

The project's jar artifact can be built with maven:
    cd to project's root directory
    Run "mvn clean package"
    The maven build will generate the jar artifact target/rev-rest-service-0.1.0.jar
    The jar file contains the web service and embedded Tomcat
