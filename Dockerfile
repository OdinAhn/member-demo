# ARM 호환이 가장 좋은 amazoncorretto:17, 처음부터 이거 쓸껄..
FROM amazoncorretto:17

WORKDIR /app

COPY build/libs/*-SNAPSHOT.jar app.jar

ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=prod", "app.jar"]