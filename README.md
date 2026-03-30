# 🔐 JWT Authentication API using Spring Boot

## 🚀 Overview

This project is a **Spring Boot-based REST API** that demonstrates **JWT (JSON Web Token) Authentication**.
It allows users to log in using credentials and receive a token, which is then used to access secured endpoints.

---

## 🛠️ Tech Stack

* Java
* Spring Boot
* MySQL
* JWT (JSON Web Token)
* Postman

---

## ⚙️ Features

* 🔑 User Login Authentication
* 🎫 JWT Token Generation
* 🔒 Secure API Endpoint
* 🗄️ Database Integration using JPA
* 🌐 RESTful API Design

---

## 🔗 API Endpoints

| Method | Endpoint   | Description                              |
| ------ | ---------- | ---------------------------------------- |
| POST   | /api/login | Authenticate user and generate JWT token |
| GET    | /api/hello | Access secured API                       |



## 🔐 Authentication Flow

1. Send credentials to `/api/login`
2. Receive JWT token in response
3. Add token in header:
   
<img width="1376" height="598" alt="image" src="https://github.com/user-attachments/assets/e815c464-81f4-4227-a8b4-e10942839945" />

<img width="1208" height="630" alt="image" src="https://github.com/user-attachments/assets/8e5d1899-6f9f-4707-a935-496b63d214d2" />

