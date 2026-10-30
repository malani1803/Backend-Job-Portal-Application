# 💼 Backend Job Portal Application

A backend Job Portal Application developed using **Java and Spring Boot**. This project focuses on building REST APIs, managing application data, integrating PostgreSQL, and implementing authentication and security using Spring Security.

## 🚀 Technologies Used

- **Java 21** – Programming language
- **Spring Boot 4.1.1** – Backend framework
- **Spring Web MVC** – Building REST APIs
- **Spring Security** – Authentication and authorization
- **Spring Data JPA** – Database operations
- **PostgreSQL** – Relational database
- **Hibernate** – ORM framework
- **Maven** – Dependency management
- **Lombok** – Reducing boilerplate code
- **IntelliJ IDEA** – Development environment

## ✨ Project Features

- REST API development using Spring Boot
- Job-related data management
- Job repository and service layer
- User management
- Spring Security integration
- HTTP Basic Authentication configuration
- PostgreSQL database connectivity
- JPA-based database operations

## 📂 Project Structure

```text
spring-boot-rest/
│
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/tanish/spring_boot_rest/
│   │   │       ├── config/
│   │   │       ├── controller/
│   │   │       ├── model/
│   │   │       ├── Repository/
│   │   │       ├── service/
│   │   │       └── SpringBootRestApplication.java
│   │   │
│   │   └── resources/
│   │       └── application.properties
│   │
│   └── test/
│
├── .gitignore
├── pom.xml
├── mvnw
└── mvnw.cmd
```

## ⚙️ Installation and Setup

### 1. Clone the Repository

```bash
git clone https://github.com/malani1803/Backend-Job-Portal-Application.git
```

### 2. Open the Project

Open the cloned project in IntelliJ IDEA.

### 3. Configure PostgreSQL

Create a PostgreSQL database:

```sql
CREATE DATABASE tanish;
```

Configure your `application.properties` file:

```properties
spring.datasource.url=jdbc:postgresql://localhost:5432/tanish
spring.datasource.username=postgres
spring.datasource.password=${DB_PASSWORD}

spring.datasource.driver-class-name=org.postgresql.Driver

spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
```

Set the `DB_PASSWORD` environment variable to your PostgreSQL password.

### 4. Build the Project

Using Maven:

```bash
mvn clean install
```

### 5. Run the Application

```bash
mvn spring-boot:run
```

Alternatively, run `SpringBootRestApplication.java` directly from IntelliJ IDEA.

## 🗄️ Database

This application uses PostgreSQL as its relational database.

Spring Data JPA and Hibernate are used to interact with the database and manage application entities.

## 🔐 Security

Spring Security is integrated to secure the backend application.

The project includes security configuration and HTTP Basic Authentication.

## 🛠️ Development Tools

- IntelliJ IDEA
- Postman (for API testing)
- PostgreSQL
- Git and GitHub

## 👨‍💻 Author

**Sarvesh Malani**

GitHub: [@malani1803](https://github.com/malani1803)

---

⭐ If you find this project useful, consider giving it a star!

**Project Status:** Under Development 🚀
