FROM openjdk:8

EXPOSE 9003

ADD target/firstapi.jar firstapi.jar

ENTRYPOINT ["java", "-jar", "/firstapi.jar"]