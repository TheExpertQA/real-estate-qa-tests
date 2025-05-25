# Real Website Automation Testing – Portfolio Project

This project showcases manual and automated testing for a real-world website.

---

## 🔍 Project: Login Functionality – [Practice Test Automation](https://practicetestautomation.com/practice-test-login/)

### ✅ Manual Testing
- Documented test case in
- [ManualLoginTestCase.md](ManualLoginTestCase.md)
- [ManualInvalidLoginTestCase.md](ManualInvalidLoginTestCase.md)


### 🤖 Automation Testing
- Java + Selenium + TestNG
- Maven-based project structure
- `LoginTest.java` validates successful login using:
    - Username: `student`
    - Password: `Password123`
- - `LoginTest.java`: Valid login
- 
- `InvalidLoginTest.java`: validates Login error if using wrong credentials
- Username: 'wrongUser'
- Password: 'wrongPass'

---

## 🧰 Tech Stack
- Java
- Selenium WebDriver
- TestNG
- Maven
- IntelliJ IDEA
- Git & GitHub

---

## 📁 Folder Structure

com.ruchi.qa/
│
├── src
│ └── test
│ └── java
│ └── tests
│ └── LoginTest.java
├── ManualLoginTestCase.md
├── README.md
└── pom.xml


---

## 📌 Notes
- This is a **real website** used for automation testing practice
- Manual and automated tests demonstrate a full test cycle
