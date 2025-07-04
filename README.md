# 🧩 Spring Boot Microservices Project

This repository contains a modular microservices-based application built using **Spring Boot**, designed to demonstrate service discovery, API Gateway routing, and multi-database integration using **MongoDB** and **MySQL**.

---

## 📚 Overview

### 🔧 Microservices

| Service Name       | Description                                           | Port |
|--------------------|-------------------------------------------------------|------|
| `eureka-server`     | Service registry to enable discovery of other services | 8761 |
| `api-gateway`       | Routes client requests to appropriate services         | 8080 |
| `student-service`   | Manages student data using MongoDB                    | 8081 |
| `school-service`    | Manages school data using MySQL                       | 8082 |

---

## 🚀 Tech Stack

- Java 17
- Spring Boot 3.x
- Spring Cloud Gateway
- Netflix Eureka Server
- MongoDB, MySQL
- REST APIs
- Git, Postman

---

## 🛠️ Getting Started

### 1. Clone the Repository

```bash
git clone https://github.com/vedanti06/Springboot-microservices.git
cd Springboot-microservices
