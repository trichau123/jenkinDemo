FROM openjdk:8
EXPOSE 8081
ADD target/jenkinDemo.jar jenkinDemo.jar
ENTRYPOINT ["java","-jar","/jenkinDemo.jar"]