# 💼 Financial System JPA Implementation

This project implements a **Financial System Data Model** using **Spring Boot** and **Spring Data JPA**.  
It was built as part of Task 2 for the Wells Fargo training assignment.  

👨‍💻 **Created by: Achref Rhouma**

---

## 📊 Entity Relationship Diagram (ERD)

The system is based on the following ERD:

- **FinancialAdvisor** manages many **Clients**.
- **Client** has one **Portfolio**.
- **Portfolio** contains many **PortfolioHoldings**.
- **PortfolioHolding** references one **Security**.

---

## 📦 Entities Implemented
- `FinancialAdvisor`  
- `Client`  
- `Portfolio`  
- `Security`  
- `PortfolioHolding`  

Each entity:
- Is annotated with `@Entity`
- Uses an auto-generated primary key
- Defines proper JPA relationships (`@OneToOne`, `@OneToMany`, `@ManyToOne`)
- Provides constructors, getters, and setters

---

## 🗄️ Repositories
Each entity has a corresponding `JpaRepository` for CRUD operations:

- `FinancialAdvisorRepository`
- `ClientRepository`
- `PortfolioRepository`
- `SecurityRepository`
- `PortfolioHoldingRepository`

---

## 🚀 How to Run
1. Clone the repo:
   ```bash
   git clone https://github.com/achrefrhouma/financial-system-jpa.git
   cd financial-system-jpa
   ```
2. Configure database in `src/main/resources/application.properties` (e.g., H2, MySQL, or PostgreSQL).
3. Run the app:
   ```bash
   ./mvnw spring-boot:run
   ```
4. Use the repositories/services to query the database.

---

## 📝 Author
**Achref Rhouma**  
📧 achrefrhm9@gmail.com  
🌐 https://www.linkedin.com/in/achref-rhouma-560555246

---
