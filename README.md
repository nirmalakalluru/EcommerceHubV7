


EcommerceHubV7 – Hybrid Automation Framework
!Java !Selenium !TestNG !Maven !Framework

📌 Project Overview
EcommerceHubV7 is a Java-based Hybrid Test Automation Framework designed to automate end-to-end functional testing of an e-commerce web application.

The framework uses Selenium WebDriver for browser automation, TestNG for test execution and organization, and Maven for dependency management and build automation.

It is designed to support reusable automation components, data-driven testing, cross-browser execution, centralized reporting, and logging.

The framework aims to improve test maintainability, reusability, scalability, and execution efficiency.

🎯 Project Objectives
Automate critical e-commerce business workflows.
Validate end-to-end application functionality.
Support cross-browser test execution.
Implement data-driven testing.
Generate detailed execution reports.
Maintain reusable and maintainable automation components.
Simplify test execution through Maven and TestNG.
🛠️ Technology Stack

Technology	Purpose
Java	Programming language
Selenium WebDriver 4.51.0	Browser automation
TestNG 7.12.0	Test execution and test organization
Apache Maven	Build and dependency management
ExtentReports 5.1.2	HTML test reporting
Apache POI 5.4.1	Excel-based test data handling
Log4j 2.26.1	Logging
Apache Commons Email 1.6.0	Email utilities
Git & GitHub	Version control and source management
Chrome	Browser testing
Firefox	Browser testing
Safari	Browser testing
🏗️ Framework Architecture
The project follows a hybrid automation approach that combines reusable automation components with structured, data-driven test execution.

The main framework components include:

Test Layer
Contains test scenarios and test execution logic.
Organizes test cases using TestNG annotations and groups.
Automation Layer
Uses Selenium WebDriver to interact with web elements.
Supports browser-based application testing.
Test Data Layer
Uses Apache POI for Excel-based test data handling.
Supports data-driven test execution.
Reporting Layer
Uses ExtentReports to generate HTML execution reports.
Captures test execution results.
Logging Layer
Uses Log4j for execution logs and troubleshooting.
Execution Layer
Uses Maven and TestNG XML suites to manage test execution.
Supports browser-specific execution configuration.
📂 Project Structure

text
EcommerceHubV7/
│
├── src/
│   └── test/
│       └── java/
│           ├── testCases/
│           ├── pageObjects/
│           ├── utilities/
│           └── base/
│
├── testData/              # External test data
│
├── testng.xml             # TestNG suite configuration
│
├── pom.xml                # Maven dependencies and configuration
│
├── reports/               # Extent HTML reports
│
├── test-output/           # TestNG execution output
│
├── logs/                  # Execution logs
│
└── README.md
Note: The package names above illustrate the intended logical organization. Adjust the tree to match the actual package and class names in the repository.

🧪 Automated Test Scenarios
The framework currently includes the following test scenarios:


Test Case	Description
TC01	Launch E-commerce Application
TC02	User Login
TC02 – Data Driven	Data-driven Login Validation
TC03	Add Product to Cart
TC04	Complete Purchase
TC05	Add Product to Wishlist
TC06	Add Affiliate
TestNG Groups
TestNG groups are used to organize test execution.

Currently configured group:

Sanity: Executes selected critical application workflows.
Additional groups such as Regression and Data Driven can be enabled as the suite is expanded.

🌐 Cross-Browser Testing
The framework has browser-specific TestNG configurations for:

Google Chrome
Mozilla Firefox
Apple Safari
The browser and operating system are configured through TestNG XML parameters.

The framework is configured to support parallel execution using TestNG.

⚙️ Prerequisites
Before running the automation framework, install the following:

Java Development Kit (JDK).
Apache Maven 3.10.0 or compatible version.
Git.
Google Chrome.
Mozilla Firefox.
Safari (macOS only).
Eclipse or IntelliJ IDEA (optional).
Verify the installations:


bash
java -version
mvn -version
git --version
🚀 Getting Started
Step 1: Clone the Repository

bash
git clone https://github.com/nirmalakalluru/EcommerceHubV7.git
Step 2: Navigate to the Project Directory

bash
cd EcommerceHubV7
Step 3: Import the Project into an IDE
Eclipse:

Open Eclipse.
Select File → Import.
Choose Existing Maven Projects.
Browse to the cloned EcommerceHubV7 folder.
Select the project and click Finish.
IntelliJ IDEA:

Open IntelliJ IDEA.
Select Open.
Choose the EcommerceHubV7 project directory.
Allow Maven dependencies to load.
Step 4: Download Maven Dependencies
Run:


bash
mvn clean install
This downloads the dependencies defined in pom.xml and builds the project.

▶️ Test Execution
Execute All Configured Tests

bash
mvn clean test
Execute Using TestNG XML

bash
mvn test -Dsurefire.suiteXmlFiles=testng.xml
Execute from Eclipse
Right-click testng.xml.
Select Run As.
Choose TestNG Suite.
Execute from IntelliJ IDEA
Open testng.xml.
Right-click the file.
Select Run.
📊 Test Reporting
The framework integrates ExtentReports for generating detailed HTML execution reports.

Reports are generated under the reports/ directory.

The reports are intended to provide:

Test case execution status.
Passed, failed, and skipped test details.
Execution information.
Failure details for troubleshooting.
TestNG execution output is also maintained in the test-output/ directory.

📝 Logging
Log4j is integrated for framework logging.

Logs are maintained under the logs/ directory to help with:

Debugging test failures.
Tracking execution flow.
Identifying application or automation issues.
Troubleshooting test execution.
📁 Test Data Management
Apache POI is included for handling Excel-based test data.

This supports maintaining test inputs separately from automation logic and enables data-driven test scenarios.

Test data is maintained in the testData/ directory.

🔄 Version Control
Git and GitHub are used for source code management.

Repository:

https://github.com/nirmalakalluru/EcommerceHubV7

Clone command:


bash
git clone https://github.com/nirmalakalluru/EcommerceHubV7.git
🔮 Future Enhancements
Potential enhancements for the framework include:

Expanded regression test coverage.
Improved reusable page-level components.
Enhanced parallel execution.
Integration with Jenkins for CI/CD.
Screenshot capture on test failures.
BrowserStack or Selenium Grid integration.
Improved test data management.
Automated report publishing.
Integration with additional test management tools.
👩‍💻 Author
Nirmala Kalluru

GitHub: https://github.com/nirmalakalluru

Project: EcommerceHubV7

⭐ If you find this project useful, feel free to star the repository!

A few important improvements before publishing
I noticed three things while reviewing your repository:

TestNG XML: Your published testng.xml appears to contain extra > characters after some parameter tags and stray text after closing test tags. Correct these before relying on Maven test execution.

Project structure: The README's package structure is illustrative. We should replace it with the exact package names once the complete source tree is reviewed.

Git cleanup: Consider excluding generated target/, logs/, and test-output/ files from future commits, while retaining useful report samples if you want to showcase them.

How to add this README on your Mac
Open your EcommerceHubV7 project in Eclipse, IntelliJ, or Finder.

Create a file named README.md in the project root (the same level as pom.xml).

Paste the complete README above.

Save the file.

Then open Terminal:


bash
cd /Users/nirmala/Workspaces/Oct2026Batch/EcommerceHubV7

git add README.md

git commit -m "Add project documentation"

git push origin master
