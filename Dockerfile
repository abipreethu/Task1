FROM eclipse-temurin:17
COPY target/task.jar task.jar
CMD ["java","-jar","task.jar"]