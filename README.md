# 📦 Order Service - Dependency Injection Example

Order Service DI is a **Java application designed to demonstrate the use of Dependency Injection (DI)** and clean separation of responsibilities between services.

The project simulates a simple **order processing system**, where services depend on abstractions instead of concrete implementations, promoting **loose coupling, flexibility, and testability**.

This project was created for educational purposes to practice **software architecture concepts such as dependency injection, service layers, and clean code principles**.

---

# 🚀 Technologies Used

- Java
- Maven
- Dependency Injection (manual implementation)
- Object-Oriented Programming (OOP)

---

# 📂 Project Structure

The project follows a simple layered structure:

```
src
 └── main
     └── java
         └── com.order
             ├── entities
             ├── services
             ├── repositories
             └── application
```

### Packages

**entities**
- Domain objects used in the system.

**services**
- Contains the business logic of the application.

**repositories**
- Responsible for data access abstraction.

**application**
- Entry point of the application.

---

# 🧠 Dependency Injection Concept

Dependency Injection (DI) is a design pattern where an object's dependencies are **provided externally rather than created internally**.

Benefits:

- Loose coupling
- Easier unit testing
- Better code maintainability
- More flexible architecture

Example concept used in the project:

```
OrderService service = new OrderService(new OrderRepository());
```

Instead of the service creating its own repository, the dependency is injected from outside.

---

# ⚙️ System Flow

The application simulates a basic **order processing flow**:

1. Create an order
2. Process order data
3. Calculate totals
4. Display order summary

Each responsibility is handled by a different class, demonstrating **separation of concerns**.

---

# ▶️ Running the Project

## 1. Clone the repository

```bash
git clone https://github.com/MarceloDebug/order-service-di.git
```

## 2. Enter the project folder

```bash
cd order-service-di
```

## 3. Compile the project

```bash
mvn compile
```

## 4. Run the application

```bash
mvn exec:java
```

or run the main class directly in your IDE.

---

# 🧩 Concepts Demonstrated

This project demonstrates several important software development concepts:

- Dependency Injection
- Separation of concerns
- Object-Oriented Programming
- Service layer pattern
- Clean architecture principles
- Maintainable code structure

---

# 📌 Project Purpose

The purpose of this project is to practice **dependency injection and modular architecture in Java**, reinforcing good development practices used in real-world backend systems.

It also serves as part of a **software development portfolio**, demonstrating understanding of architectural design patterns.

---

# 👨‍💻 Author

**Marcelo Soares**

GitHub:  
https://github.com/MarceloDebug
