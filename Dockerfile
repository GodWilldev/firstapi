FROM java:8

EXPOSE 8081

ADD target/firstapi.jar firstapi.jar

ENTRYPOINT ["java", "-jar"]