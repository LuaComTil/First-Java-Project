Spring Boot API

## Structure
- **Controller Layer**: Handles incoming HTTP requests.<br>
- **DTOs (Data Transfer Objects)**: Defines request and response structures.<br>
- **Entities**: Represents the database models.<br>
- **Repositories**: Interfaces for database access.

## Requirements

### Install the JDK
Download and install the recommended version of the JDK from the official Oracle website.<br>
Verify the installation by running `java -version` in the terminal.

### Install Maven
Download and install Maven from the official website.<br>
Verify the installation by running `mvn -version` in the terminal.

### Install Docker
Download and install Docker from the official website.<br>
Docker Compose is installed along with Docker. Verify the installation by running `docker-compose --version` in the terminal.

### Configure the Database
Any database compatible with JPA/Hibernate (PostgreSQL, MySQL) can be used.<br>
Configure the credentials and the database URL in the `application.properties` file.

## Getting Started

1. **Clone the repository**:
    ```bash
    git clone https://github.com/your-username/investment-api.git
    cd investment-api
    ```

2. **Configure the database**:
    Update the `src/main/resources/application.properties` file with your database configuration.

3. **Build the project**:
    ```bash
    mvn clean install
    ```

4. **Run the application**:
    ```bash
    mvn spring-boot:run
    ```

## API Endpoints

- **Create User**: `POST /v1/users`
    - Request Body: 
      ```json
      {
          "username": "string",
          "email": "string",
          "password": "string"
      }
      ```
    - Response: `200 OK`

- **List Users**: `GET /v1/users`
    - Response: List of users

- **Update User**: `PUT /v1/users/{userId}`
    - Request Body:
      ```json
      {
          "password": "string"
      }
      ```
    - Response: `200 OK`

- **Delete User**: `DELETE /v1/users/{userId}`
    - Response: `200 OK`

- **Create Investment**: `POST /v1/investments`
    - Request Body:
      ```json
      {
          "name": "string",
          "quantity": "number"
      }
      ```
    - Response: `200 OK`
