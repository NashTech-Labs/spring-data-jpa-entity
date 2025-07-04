# Spring Data JPA Entity Lifecycle Demo

This is a Spring Boot project that demonstrates the lifecycle of JPA entities with auditing, clean architecture, and robust exception handling. The core functionality revolves around managing `Employee` entities using Spring Data JPA, and capturing their lifecycle events (create, update, delete) via entity listeners.

---

## Project Structure
```bash
    spring-data-jpa-entity-lifecycle/
    ├── src/
    │ ├── main/
    │ │ ├── java/com/nashtech/techhub/
    │ │ │ ├── EntityLifecycleApplication.java
    │ │ │ ├── audit/ # Auditing entity and listener
    │ │ │ ├── config/ # OpenAPI & JPA configuration
    │ │ │ ├── controller/ # REST controller for employee operations
    │ │ │ ├── dto/ # Request/Response DTOs
    │ │ │ ├── entity/ # JPA entity (Employee)
    │ │ │ ├── exception/ # Global and custom exceptions
    │ │ │ ├── repository/ # Spring Data repository
    │ │ │ └── services/ # Service layer with interface and implementation
    │ │ └── resources/
    │ │ └── application.yml # Application configuration
    │ └── test/
    │ └── java/com/nashtech/techhub/
    │ ├── EntityLifecycleApplicationTests.java
    │ └── service/EmployeeServiceTest.java #Unit Test Cases
```

---

## Features

- CRUD operations for `Employee`
- JPA Auditing using `@EntityListeners`
- Clean layering: Controller → Service → Repository
- DTO usage for request/response isolation
- Global exception handling with custom exceptions
- API documentation via Springdoc OpenAPI
- Unit tests with JUnit and Mockito

---

## Endpoints

| Method | Endpoint             | Description                        |
|--------|----------------------|------------------------------------|
| GET    | `/api/employees`     | Get all **active** employees       |
| POST   | `/api/employees`     | Create a new employee              |
| PUT    | `/api/employees/{id}`| Update an existing employee        |
| DELETE | `/api/employees/{id}`| **Soft delete** an employee by ID  |

OpenAPI Swagger UI available at:  
`http://localhost:8080/swagger-ui.html`


---

## Entity Auditing

Each `Employee` entity extends `AuditableEntity` and is tracked by `AuditEntityListener` to log lifecycle events such as creation, modification, and deletion timestamps.

---

## Tech Stack

- Java 17+
- Spring Boot
- Spring Data JPA
- H2 (in-memory DB for development)
- Lombok
- OpenAPI/Swagger (springdoc-openapi)
- JUnit & Mockito

---

## Getting Started

1. **Clone the repository**
   ```bash
   git clone https://github.com.mcas.ms/NashTech-Labs/spring-data-jpa-entity-lifecycle
   cd spring-data-jpa-entity-lifecycle
   ```
2. **Run the application**
    ```bash
    ./mvnw spring-boot:run
   ```
3. **Access API docs**

   - Swagger UI: http://localhost:8080/swagger-ui.html
   - H2 Console: http://localhost:8080/h2-console

---

## Running Tests
To execute unit tests:
```bash
./mvnw test
   ```