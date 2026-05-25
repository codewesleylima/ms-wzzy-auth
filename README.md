<p align="center">
  <img src="https://iili.io/3FFO5cF.png" alt="Universidade Católica de Brasília">
</p>

## PERSONAL PROJECT - MS-AUTH 🔐

### 📖 Description
Microservice responsible for **managing authentication and authorization** of the library system. MS-Auth is responsible for:
- 🔑 **Generate JWT tokens** for user authentication
- 📝 **Register new users** with data validation
- ✅ **Validate credentials** for login
- 🔄 **Refresh tokens** through refresh tokens
- 🚪 **Manage user sessions**
- 👥 **Control roles and permissions** (ADMIN, USER, CUSTOMER, GUEST)

This service is part of a microservices architecture composed of:

- [`bff-wzzy-library`](https://github.com/codewesleylima/bff-wzzy-library) – Central gateway and orchestration
- [`ms-wzzy-auth`](https://github.com/codewesleylima/ms-wzzy-auth) – Authentication and JWT token management
- [`ms-wzzy-catalog`](https://github.com/codewesleylima/ms-wzzy-catalog) – Book catalog, authors, publishers, and categories
- [`ms-wzzy-customers`](https://github.com/codewesleylima/ms-wzzy-customers) – Customer profile, address, and preference management
- [`ms-wzzy-order`](https://github.com/codewesleylima/ms-wzzy-order) – Shopping cart and order orchestration
- [`ms-wzzy-payments`](https://github.com/codewesleylima/ms-wzzy-payments) – Payment processing and gateway integration
- [`ms-wzzy-stock`](https://github.com/codewesleylima/ms-wzzy-stock) – Inventory and availability management

---

## 🔁 Authentication Flow

1. **Client** → BFF: Submits credentials (email/password or registration data)
2. BFF → **ms-auth**: Sends login/registration request
3. **ms-auth** → Database: Validates or persists user
4. **ms-auth** → BFF: Generates and returns JWT tokens (access + refresh)
5. BFF → **Client**: Returns tokens for subsequent authentication
6. **Client** → BFF: Includes token in Authorization header
7. BFF → **ms-auth**: Validates token before routing to other services
8. **ms-auth** → BFF: Returns validation and authenticated user data

---

### ⚡ Features

1. 🔑 Generate JWT tokens (Access Token + Refresh Token)
2. 📝 Register new users with validation
3. ✅ Authenticate users with email and password
4. 🔄 Refresh expired tokens
5. 🚪 Manage user sessions
6. 👥 Control roles and permissions (RBAC)
7. 🔒 Validate tokens from requests
8. 📧 Unique email validation
9. 🚨 Custom exception handling

---

### 🖥️ **Running Locally**

To run the project locally:

```sh
./gradlew bootRun
```

> 💡 Make sure PostgreSQL database is running and configured in `application.properties`.

---

#### 🛠️ Technologies Used

- ☕ Java 21
- 🍃 Spring Boot 3
- 🔐 Spring Security with JWT
- 📦 Spring Data JPA
- 🗄️ PostgreSQL
- 🛡️ JWT (io.jsonwebtoken)
- 🧪 JUnit / Mockito
- 🔧 Gradle

---

### 🛺 Author

<table>
  <tr>
    <td align="center">
      <a href="https://www.linkedin.com/in/wesslima/" title="Wesley Lima">
        <img src="https://media.licdn.com/dms/image/v2/D4D03AQH8pgDMsT7zMw/profile-displayphoto-crop_800_800/B4DZs03OodH8AM-/0/1766118457145?e=1781136000&v=beta&t=-N2WNA9CWJ7Io6nX33GPNvYtFl9ZQMAM-jALLlYNGc8" width="100px;" alt="Wesley Lima Photo"/><br>
        <sub>
          <b>Wesley Lima</b>
        </sub>
      </a>
    </td>
  </tr>
</table>
