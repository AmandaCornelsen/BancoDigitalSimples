# Simple Digital Bank

📝 Project Overview

Banco Digital Simples is a console-based banking application designed to practice OOP concepts in Java.
It features two types of accounts:

ContaCorrente (Checking Account): Allows deposits, withdrawals, transfers, and usage of overdraft (cheque especial).

ContaPoupanca (Savings Account): Allows deposits, withdrawals, transfers, and application of interest (rendimento).

The project demonstrates inheritance, polymorphism, and encapsulation in Java, while providing a user-friendly menu-driven interface.

⚙️ **Tools and Technologies**

Language: Java 24

IDE: IntelliJ IDEA Community Edition

Java Concepts: Classes, Inheritance, Polymorphism, Packages, ArrayList

Terminal: Command-line interface for execution

🛠️ **Project Structure**
src/
 └── banco/
      ├── Main.java           # Entry point and menu interface
      ├── Banco.java          # Bank class managing accounts
      ├── Conta.java          # Base class for accounts
      ├── ContaCorrente.java  # Checking account class
      └── ContaPoupanca.java  # Savings account class

💡 **Features**
Main Menu (Bank Menu)

Create Account: Create a checking or savings account with a randomly generated account number.

Delete Account: Remove an account from the bank by providing the account number.

List Accounts: Display all accounts with account number, holder, and balance.

Enter Account: Access an individual account to perform transactions.

Exit: Close the application.

Account Menu (Individual Account)

Deposit: Add money to the account balance.

Withdraw: Remove money from the account balance.

Transfer: Transfer money to another account.

Apply Interest (Savings Account): Apply a fixed interest rate to the savings account balance.

Use Overdraft (Checking Account): Withdraw money exceeding the balance up to the overdraft limit.

Back: Return to the main bank menu.

🚀 **How to Run the Project (Terminal)**

Open the terminal and navigate to the project src folder:

cd path/to/Projeto/BancoDigitalSimples/src


Compile all Java files:

javac banco/*.java


Run the application:

java banco.Main


Follow the menus:

In the Bank Menu, create accounts, list, delete, or enter an account.

In the Account Menu, perform deposits, withdrawals, transfers, apply interest (savings), or use overdraft (checking).

🎯 **Example Usage**
=== Banco Digital ===
1 - Create account
2 - Delete account
3 - List accounts
4 - Enter account
5 - Exit


Select 1 to create a new account.

Select 4 to enter a specific account by its number:

=== Account Menu ===
1 - Deposit
2 - Withdraw
3 - Transfer
4 - Apply interest (savings)
5 - Use overdraft (checking)
6 - Back


Perform any operation according to the account type.

Use 6 to go back to the main bank menu.

⚡ **Notes**

Each account number is randomly generated to ensure uniqueness.

Savings accounts cannot use overdraft.

Checking accounts cannot apply interest.

Proper validations are implemented for withdrawals, transfers, and overdraft limits.

👩‍💻 **Author**

Amanda Cornelsen – Java enthusiast and student focused on Object-Oriented Programming and project-based learning.

