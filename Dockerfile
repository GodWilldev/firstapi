FROM openjdk:17

EXPOSE 8080

ADD target/firstapi.jar firstapi.jar

ENTRYPOINT ["java", "-jar", "/firstapi.jar"]