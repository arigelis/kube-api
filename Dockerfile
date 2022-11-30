FROM alpine:3.17

RUN apk add openjdk11

COPY build/libs/kuber-api.jar /app.jar

ENTRYPOINT ["java", "-jar", "/app.jar"]