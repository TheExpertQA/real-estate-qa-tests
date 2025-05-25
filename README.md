# Real Estate QA Tests

## Overview

This repository contains a comprehensive set of manual, automated, and API test cases targeting the [practiceautomation.com](https://practiceautomation.com) website. The purpose is to validate key functionalities such as user registration, login, property search, and other core features of this real estate practice site.

These tests demonstrate effective QA automation and API testing techniques using industry-standard tools like Selenium WebDriver, TestNG, and Postman. This project serves both as a learning resource and a portfolio to showcase practical testing skills on a real-world practice application.

---

## Tools & Technologies Used

- **Java** – Programming language for automation scripts
- **Selenium WebDriver** – Browser automation
- **TestNG** – Test framework for organizing and running tests
- **Postman** – API testing
- **Maven** – Build and dependency management
- **GitHub** – Version control and repository hosting

---

## Project Structure

/real-estate-qa-tests
│
├── /automation-scripts # Selenium WebDriver Java automation tests
├── /manual-test-cases # Manual test cases documented in Markdown or Excel
├── /postman-api-tests # Postman collections and environment files
├── /test-data # Test data files (CSV, JSON)
├── README.md # Project overview and instructions
└── LICENSE # License information


---

## Getting Started

### Prerequisites

- Java JDK 8 or higher
- Maven installed and configured in PATH
- An IDE (e.g., IntelliJ IDEA, Eclipse) for running automation scripts
- Postman desktop app for API testing

### Setup

1. Clone the repository:
   ```
   git clone https://github.com/TheExpertQA/real-estate-qa-tests.git
   cd real-estate-qa-tests
Import the project in your IDE.

Install Maven dependencies:


Copy
Edit
mvn clean install
Open Postman and import the collections from /postman-api-tests folder.

Running Tests
Automation Tests
Run all TestNG tests using Maven command:


Copy
Edit
mvn test
Or run specific test classes in your IDE.

Manual Test Cases
Manual test cases are documented under /manual-test-cases. Review these before executing tests manually.

API Tests
Import the Postman collections and run the requests. Use environments for different setups.

Test Case Example
Test Case ID	Description	Preconditions	Steps	Expected Result	Status
TC001	Verify user login functionality	User registered	1. Open login page 2. Enter valid credentials 3. Click login	User is logged in successfully	Pass/Fail

Contributing
Contributions are welcome! Please follow these steps:

Fork the repo

Create a new branch (git checkout -b feature-branch)

Commit your changes (git commit -m 'Add new test case')

Push to the branch (git push origin feature-branch)

Create a Pull Request

License
This project is licensed under the Apache License - see the LICENSE file for details.

Disclaimer
This repository is for learning and demonstration purposes only. Tests are conducted on publicly available websites and are intended to showcase QA testing skills.

Contact
For questions or feedback, please reach out:

GitHub: TheExpertQA