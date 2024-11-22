Bank Management System:
A simple yet powerful Bank Management System built using Java, MySQL, and JSP/Servlets. This system allows users to manage accounts, perform transactions, and track balances securely and efficiently.

Features:
User Authentication: Secure login and registration system for users.
Account Management: Create and manage multiple bank accounts.
Transactions: Deposit, withdraw, and transfer funds.
Transaction History: View a detailed history of account transactions.
Database Integration: All data is stored and managed using MySQL.
Responsive Design: User-friendly web interface powered by JSP and HTML.

Technologies Used:
Frontend: HTML, CSS, JSP
Backend: Java Servlets
Database: MySQL
Tools: Apache Tomcat, JDBC
Development Environment: Eclipse

Installation:
Prerequisites:
Java Development Kit (JDK) 8 or higher.
MySQL Server (with MySQL Workbench optional).
Apache Tomcat 9 or higher.
An IDE like Eclipse.

Clone the repository:
git clone https://github.com/yourusername/bank-management-system.git
cd bank-management-system

Set up the database:

Create a MySQL database named bank_management.
Execute the SQL scripts in the database/ folder to create tables:

CREATE TABLE Users (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(50) UNIQUE NOT NULL,
    password VARCHAR(255) NOT NULL
);

CREATE TABLE accounts (
    account_id INT AUTO_INCREMENT PRIMARY KEY,
    account_holder_name VARCHAR(255) NOT NULL,
    balance DOUBLE NOT NULL
);

CREATE TABLE transactions (
    transaction_id INT AUTO_INCREMENT PRIMARY KEY,
    account_id INT NOT NULL,
    transaction_type VARCHAR(50) NOT NULL,
    amount DOUBLE NOT NULL,
    transaction_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (account_id) REFERENCES accounts(account_id)
);

Configure the database connection in DatabaseConnection.java:
private static final String DB_URL = "jdbc:mysql://localhost:3306/bank_db";
private static final String DB_USER = "root";
private static final String DB_PASSWORD = "password";

Deploy the project:

Import the project into your IDE.
Add the MySQL JDBC driver to the project’s build path.
Configure Apache Tomcat as the server.
Run the project on the server.

Usage:
Access the application:
Visit http://localhost:8080/BankManagementSystem/.

Login/Register:
Register as a new user or log in with existing credentials.

Manage Accounts:
View account details, make deposits, and withdrawals.

Transaction History:
Check the detailed history of all transactions.

Acknowledgments
MySQL Documentation
Java Servlet API
Apache Tomcat Community




