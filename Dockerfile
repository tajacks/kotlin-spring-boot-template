# Use Amazon Corretto JDK 21 as the build image
FROM amazoncorretto:21-alpine AS build

# Set working directory
WORKDIR /build

# Copy Maven wrapper scripts and .mvn directory
COPY mvnw ./
COPY .mvn/ .mvn/

# Copy the pom.xml file & parent POM
COPY pom.xml ./
COPY maven-parent/ maven-parent/

# Ensure the wrapper has execution permissions
RUN chmod +x mvnw

# Download dependencies
RUN ./mvnw dependency:resolve

# Copy the source code
COPY src/ src/

# Build the application
RUN ./mvnw clean package -DskipTests

# Use a minimal runtime image
FROM amazoncorretto:21

# Set working directory
WORKDIR /app

# Copy the built JAR from the build stage
COPY --from=build /build/target/kotlin-springboot-template-0.1.0-SNAPSHOT.jar app.jar

# Run the application
ENTRYPOINT ["java", "-jar", "app.jar"]
