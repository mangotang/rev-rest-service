FROM centos
RUN yum install -y java-1.7.0-openjdk
EXPOSE 8080
ADD rev-rest-service-0.1.0.jar rev-rest-service-0.1.0.jar
ENTRYPOINT ["java","-jar","rev-rest-service-0.1.0.jar"]
