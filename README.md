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


