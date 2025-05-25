# QA Testing Project – practiceautomationtesting.com

This repository showcases manual, API, and automated UI testing for the demo website [practiceautomationtesting.com](https://practiceautomationtesting.com). It demonstrates practical QA skills using tools like Java, Selenium, TestNG, and Postman.

---

## 🔍 Project Overview

This project simulates real-world testing for a login feature on the demo site. It includes:

- ✅ Manual test case documentation
- ✅ API testing using Postman
- ✅ UI automation using Java + Selenium + TestNG

---

## 📁 Project Structure

real-estate-qa-tests/
│
├── automation-testing/ # Selenium TestNG framework with login automation
│ ├── pages/ # Page Object Model classes
│ ├── tests/ # Test classes
│ └── utils/ # Utility/helper classes
│
├── manual-testing/ # Manual test cases
│ └── ManualLoginTestCase.md
│
├── postman-api-tests/ # Postman collections and tests
│ ├── LoginTest.postman_collection.json
│ └── CreateUserTest.postman_collection.json
│
└── README.md # Project documentation



---

## 🧪 Manual Testing

Manual test cases are stored in the `manual-testing/` folder.

👉 [ManualLoginTestCase.md](manual-testing/ManualLoginTestCase.md) – A step-by-step login test case for testers to execute manually.

---

## 🤖 Automation Testing

### 🔧 Tools Used
- Java
- Selenium WebDriver
- TestNG
- Maven
- IntelliJ IDEA

### 🚀 How to Run

1. Clone the repository:
   ```bash
   git clone https://github.com/TheExpertQA/real-estate-qa-tests.git
Navigate to automation-testing/ and open in IntelliJ.

Install dependencies via Maven.

Run the test from LoginTest.java or InvalidLoginTest.java.

🔌 API Testing
🌐 Tools Used
Postman

REST APIs from reqres.in

✅ Sample Tests
Create user (POST)

Login (POST)

Validate status codes and tokens

🔍 How to Run
Import the Postman collections from postman-api-tests/ into Postman.

Use the Runner to run tests and assertions.

📸 Enhancements in Progress
Add ExtentReports for UI test results

Screenshot capture on test failure

Data-driven login testing

GitHub Actions for CI (coming soon)

👤 Author
Ruchi – QA Automation Tester
📧 For demo/recruitment purposes only


