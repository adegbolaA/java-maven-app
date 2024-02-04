FROM openjdk:11
COPY . /app
WORKDIR /app
CMD ["java", "jar", "java-maven-app-1.1.0.jar"]

