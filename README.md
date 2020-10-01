<div align="center">

# Spring Boot Practice Collection

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-6DB33F?style=for-the-badge&logo=spring-boot&logoColor=white)
![Maven](https://img.shields.io/badge/Maven-C71A36?style=for-the-badge&logo=apache-maven&logoColor=white)
![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=for-the-badge&logo=thymeleaf&logoColor=white)

A comprehensive collection of Spring Boot practice projects covering REST APIs, MVC patterns, and web application development.

[Getting Started](#getting-started) | [Sub-Projects](#sub-projects) | [Tech Stack](#tech-stack)

</div>

---

## Overview

This repository contains a series of hands-on practice projects (**BaiTapThucHanh**) and a demo application built with Spring Boot. Each sub-project focuses on different aspects of Spring Boot development, from basic configuration to full CRUD web applications.

## Architecture

```
+--------------------------------------------------+
|              Spring Boot Application              |
+--------------------------------------------------+
|                                                    |
|   +------------+    +------------+    +--------+   |
|   | Controller |<-->|  Service   |<-->| Model  |   |
|   +------------+    +------------+    +--------+   |
|         |                                  |       |
|         v                                  v       |
|   +------------+                    +-----------+  |
|   |  Thymeleaf |                    | Database  |  |
|   |  Templates |                    | (H2/MySQL)|  |
|   +------------+                    +-----------+  |
|                                                    |
+--------------------------------------------------+
```

## Tech Stack

| Technology    | Purpose                      | Version |
|:------------- |:---------------------------- |:------- |
| Java          | Programming Language         | 8+      |
| Spring Boot   | Application Framework        | 2.x     |
| Maven         | Build & Dependency Mgmt      | 3.x     |
| Thymeleaf     | Template Engine              | 3.x     |
| Spring MVC    | Web Layer                    | 5.x     |
| H2 / MySQL    | Database                     | -       |

## Sub-Projects

### BaiTapThucHanh (Practice Exercises)

| Project | Description |
|:--------|:------------|
| **Car1** | Basic Spring Boot setup and project initialization |
| **Car2** | Spring MVC with Thymeleaf template rendering |
| **Car3** | Form handling and data binding |
| **Car4** | RESTful API endpoints and JSON responses |
| **Car5** | Database integration and CRUD operations |
| **Car6** | Validation and error handling |
| **Car7** | Advanced configurations and profiles |
| **Car8** | Complete web application with full CRUD |

### Demo Application

A complete Spring Boot demo project showcasing:
- Spring Boot auto-configuration
- Maven wrapper for consistent builds
- Standard project layout following Spring conventions
- Application properties configuration

## Project Structure

```
Java-Spring-Boot/
├── BaiTapThucHanh/           # Practice exercises
│   ├── Car1/                 # Project 1: Basic setup
│   ├── Car2/                 # Project 2: MVC + Thymeleaf
│   ├── Car3/                 # Project 3: Form handling
│   ├── Car4/                 # Project 4: REST APIs
│   ├── Car5/                 # Project 5: Database CRUD
│   ├── Car6/                 # Project 6: Validation
│   ├── Car7/                 # Project 7: Advanced config
│   └── Car8/                 # Project 8: Full application
├── demo/                     # Demo Spring Boot project
│   ├── src/
│   │   ├── main/
│   │   │   ├── java/         # Java source files
│   │   │   └── resources/    # Config & templates
│   │   └── test/             # Unit tests
│   ├── pom.xml               # Maven configuration
│   ├── mvnw                  # Maven wrapper (Unix)
│   └── mvnw.cmd              # Maven wrapper (Windows)
└── .gitignore
```

## Getting Started

### Prerequisites

- **Java JDK 8+** installed
- **Maven 3.x** installed (or use the included Maven wrapper)
- An IDE such as IntelliJ IDEA, Eclipse, or VS Code

### Running a Practice Project

1. **Clone the repository**
   ```bash
   git clone <repository-url>
   cd Java-Spring-Boot
   ```

2. **Navigate to a sub-project**
   ```bash
   cd BaiTapThucHanh/Car1
   ```

3. **Build and run with Maven**
   ```bash
   mvn spring-boot:run
   ```

4. **Access the application**
   ```
   http://localhost:8080
   ```

### Running the Demo Project

```bash
cd demo
./mvnw spring-boot:run
```

## Key Concepts Covered

- **Spring Boot Auto-Configuration** - Convention over configuration
- **Spring MVC** - Model-View-Controller pattern
- **Thymeleaf** - Server-side template engine
- **REST APIs** - Building RESTful web services
- **Data Binding** - Form handling and validation
- **Dependency Injection** - IoC container and beans
- **Maven Build** - Project build lifecycle

## Contributing

1. Fork the repository
2. Create your feature branch (`git checkout -b feature/new-exercise`)
3. Commit your changes (`git commit -m 'Add new practice exercise'`)
4. Push to the branch (`git push origin feature/new-exercise`)
5. Open a Pull Request

## License

This project is for educational purposes. Feel free to use and modify for learning.

---

<div align="center">

**Happy Learning!**

</div>
