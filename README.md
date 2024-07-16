# E-Commerce Website Backend

This repository contains the backend code for an e-commerce website built using Spring Boot. The project provides RESTful APIs for managing products, categories, orders, and customers, enabling a fully functional e-commerce platform.

## Features

- **Product Management**: Create, read, update, and delete (CRUD) operations for products.
- **Category Management**: CRUD operations for product categories.
- **Order Management**: Handle customer orders, including creation, status updates, and retrieval.
- **Customer Management**: Manage customer information and authentication.
- **Inventory Management**: Track product stock levels and availability.
- **Image Handling**: Store and retrieve product images.

## Technologies Used

- **Spring Boot**: For building the backend application.
- **Spring Data JPA**: For database interactions.
- **Hibernate**: As the ORM framework.
- **MySQL**: As the relational database.
- **Lombok**: For reducing boilerplate code.
- **Jakarta Persistence API**: For entity management.
- **Maven**: For project management and dependency management.

## Project Structure

- `com.example.ecom_proj`: Root package.
  - `controller`: Contains REST controllers for handling API requests.
  - `service`: Contains service classes for business logic.
  - `repository`: Contains repository interfaces for database operations.
  - `model`: Contains entity classes representing database tables.
  - `dto`: Contains Data Transfer Objects for transferring data between layers.

## Getting Started

### Prerequisites

- Java 11 or higher
- Maven 3.6.0 or higher
- SQL Developer (Oracle)

### Installation

1. **Clone the repository:**
   ```bash
   git clone https://github.com/your-username/ecom_proj.git
   cd ecom_proj
   ```

2. **Configure the database:**
   - Create a MySQL database named `ecom_db`.
   - Update the `src/main/resources/application.properties` file with your database credentials:
     ```properties
     spring.datasource.url=jdbc:mysql://localhost:3306/ecom_db
     spring.datasource.username=your_username
     spring.datasource.password=your_password
     spring.jpa.hibernate.ddl-auto=update
     ```

3. **Build the project:**
   ```bash
   mvn clean install
   ```

4. **Run the application:**
   ```bash
   mvn spring-boot:run
   ```

### API Endpoints

#### Product Endpoints

- `GET /api/products`: Get all products
- `GET /api/products/{id}`: Get a product by ID
- `POST /api/products`: Create a new product
- `PUT /api/products/{id}`: Update a product
- `DELETE /api/products/{id}`: Delete a product

#### Category Endpoints

- `GET /api/categories`: Get all categories
- `GET /api/categories/{id}`: Get a category by ID
- `POST /api/categories`: Create a new category
- `PUT /api/categories/{id}`: Update a category
- `DELETE /api/categories/{id}`: Delete a category

#### Order Endpoints

- `GET /api/orders`: Get all orders
- `GET /api/orders/{id}`: Get an order by ID
- `POST /api/orders`: Create a new order
- `PUT /api/orders/{id}`: Update an order
- `DELETE /api/orders/{id}`: Cancel an order

#### Customer Endpoints

- `GET /api/customers`: Get all customers
- `GET /api/customers/{id}`: Get a customer by ID
- `POST /api/customers`: Register a new customer
- `PUT /api/customers/{id}`: Update customer details
- `DELETE /api/customers/{id}`: Delete a customer

