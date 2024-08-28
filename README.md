# SpringDemo

Learn Spring 6, Spring Core, Spring REST, Spring MVC, Spring Security, Thymeleaf, JPA, Hibernate, MySQL

# Run Project

## Make jar file

```sh
(sudo) ./mvnw package // JAR is created in the "target" sub-directory
```

mvnw allows you to run maven project

- No need to have Maven installed
- If correct version of Maven is NOT found on your computer
  - Automatically downloads correct version from internet

If you already have Maven installed just use

```sh
mvn package
```

## Run jar file

```sh
java -jar {jar file name}.jar
```

## Run app using Spring Boot Maven plugin

```sh
./mvnw spring-boot:run
```
