# Usa una imagen base de Java
FROM eclipse-temurin:17-jdk-alpine

# Establece el directorio de trabajo
WORKDIR /app

# Copia el archivo JAR generado en el contenedor
COPY target/*.jar app.jar

# Expone el puerto en el que la aplicación estará escuchando
EXPOSE 8080

# Comando para ejecutar la aplicación
CMD ["java", "-jar", "app.jar"]
