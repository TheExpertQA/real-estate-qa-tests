# 🏡 Practice Website QA Testing Project

This project contains **manual, automation, and API tests** designed for a real-world real estate platform. The testing showcases my QA skills using industry-standard tools such as **Java**, **Selenium**, **TestNG**, **Postman**, and **Git**.

> ⚠️ Note: This is a personal portfolio project based on publicly available websites such as [https://practicetestautomation.com](https://practicetestautomation.com) and similar real estate platforms. These tests do not involve any internal or proprietary code.

---

## 📌 Objective

To demonstrate structured and maintainable QA work using:
- 🧪 Automation testing (Selenium + Java + TestNG)
- 📄 Manual test case writing
- 🔌 Basic API testing (coming soon)
- ✅ GitHub for version control & portfolio presentation

---

## 🧪 Automation Test Cases

| Test Case Name | Description |
|----------------|-------------|
| [`LoginTest.java`](automation-testing/LoginTest.java) | Verifies successful login with valid credentials |
| [`InvalidLoginTest.java`](automation-testing/InvalidLoginTest.java) | Verifies error message when logging in with invalid credentials |

> **Tech Stack:** Java, Selenium WebDriver, TestNG, Maven

---

## 📝 Manual Test Cases

| Test Case Name | Description |
|----------------|-------------|
| [`ManualLoginTestCase.md`](manual-testing/ManualLoginTestCase.md) | Step-by-step manual login test |
| [`ManualInvalidLoginTestCase.md`](manual-testing/ManualInvalidLoginTestCase.md) | Manual test for login failure with incorrect credentials |

> **Format:** Markdown documents written with clear steps, test data, expected results, and IDs for traceability.

---

## 🔌 API Testing (Coming Soon)

API tests will be added using Postman for endpoints (where accessible) such as:
- `GET /listings`
- `POST /login`
- `DELETE /property/{id}`

> These will include collections + environment files with test data, validation scripts, and documentation.

---
📁 Project Structure
real-estate-qa-tests/
│
├── automation-testing/         ← Readable .java copies for GitHub
│   └── LoginTest.java
│   └── InvalidLoginTest.java
│
├── manual-testing/             ← Manual test cases in markdown
│   └── ManualLoginTestCase.md
│   └── ManualInvalidLoginTestCase.md
│
├── src/test/java/tests/        ← IntelliJ runnable tests
│   └── LoginTest.java
│   └── InvalidLoginTest.java
│
├── pom.xml                     ← Maven dependencies
└── README.md                   ← This file


⭐ This repository is designed to showcase QA skills only. No commercial or confidential data is included.