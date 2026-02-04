# Use Java 17
FROM eclipse-temurin:17-jdk-alpine

# App directory
WORKDIR /app

# Copy Maven wrapper and pom
COPY mvnw .
COPY .mvn .mvn
COPY pom.xml .

# Download dependencies
RUN chmod +x mvnw && ./mvnw dependency:go-offline

# Copy source code
COPY src src

# Build app
RUN ./mvnw package -DskipTests

# Run app
EXPOSE 8080
CMD ["java", "-jar", "target/*.jar"]
