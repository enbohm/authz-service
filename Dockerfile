FROM gcr.io/distroless/java:11

WORKDIR /app
COPY target/lib /app/lib
ADD target/auth-service-runner.jar /app

CMD ["/app/auth-service-runner.jar"]
