# 🧑‍💼 Spring Boot Admin CRUD App

A simple **Spring Boot CRUD application** for managing users (Create, Read, Update, Delete), with a responsive interface built using the [SB Admin 2 Bootstrap template](https://startbootstrap.com/theme/sb-admin-2).

---

## 📸 Features

- ✅ Add new user
- ✅ View all users in a table
- ✅ Edit user details
- ✅ Delete user
- ✅ Clean UI with Bootstrap Admin 2

---

## 🧰 Tech Stack

| Layer           | Technology                            |
|----------------|----------------------------------------|
| Backend         | Java 18, Spring Boot                   |
| View (Frontend) | Thymeleaf, HTML5, Bootstrap Admin 2    |
| Database        | MySQL (local)                          |
| Build Tool      | Maven                                  |

---

## 🚀 Getting Started

### 1️⃣ Clone the Repository

```bash
git clone https://github.com/Syazwani-s246/sb-admin2-crud.git
cd your-repo
````

---

### 2️⃣ Set Up MySQL Database

Make sure MySQL is running on your machine.

Create a database:

```sql
CREATE DATABASE admin_assessment;
```

Then, open `src/main/resources/application.properties` and update:

```properties
spring.application.name=admin

# DB Connection
spring.datasource.url=jdbc:mysql://localhost:3306/admin_assessment
spring.datasource.username=root
spring.datasource.password=yourpassword

#JPA Settings
spring.jpa.hibernate.ddl-auto=update
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
server.port=yourPortNumber
spring.jpa.show-sql=true

spring.devtools.restart.enabled=true
spring.thymeleaf.cache=false

```

---

### 3️⃣ Build & Run Locally

In your terminal:

```bash
./mvnw clean install -DskipTests
./mvnw spring-boot:run
```

Or if using Windows:

```bash
.\mvnw.cmd clean install -DskipTests
.\mvnw.cmd spring-boot:run
```

---

### 4️⃣ View the App

Open your browser and go to:

```
http://localhost:[portNumber]/table
```

---

## 🧾 Notes

* This is a basic CRUD app using Spring Boot and Thymeleaf.
* Bootstrap UI is based on SB Admin 2, manually integrated into Thymeleaf templates.
* No deployment included — run locally only.
* You can extend this app with validation, security, pagination, or REST APIs if needed.

---

## 📄 License

This project is open for educational use.
Bootstrap Admin 2 is under the [MIT license](https://github.com/StartBootstrap/startbootstrap-sb-admin-2.git).

