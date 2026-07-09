# 🏥 Hospital Management System

## TechnoHacks Solutions - Java Development Internship (Task 2)

The **Hospital Management System** is a desktop-based application developed as **Task 2 (Mini Project)** during my **Java Developer Internship at TechnoHacks Solutions Pvt. Ltd.**

The project is developed using **Core Java, Java Swing, JDBC, and MySQL** to automate various hospital management activities. It provides a simple graphical user interface for managing patient records, doctor information, employee details, room allocation, appointments, billing, and patient discharge efficiently.

The system replaces traditional paper-based record management with a computerized solution, improving accuracy, reducing manual work, and simplifying hospital administration.

---

# 🚀 Features

- 🔐 Login Authentication
- 👨‍⚕️ Doctor Management
- 🧑 Patient Management
- 👨‍💼 Employee Management
- 🛏 Room Allocation & Management
- 📅 Appointment Scheduling
- 💳 Billing Management
- 🚪 Patient Discharge
- 📊 Reception Dashboard
- 🗄 MySQL Database Integration using JDBC

---

# 🛠 Technologies Used

| Technology | Purpose |
|------------|---------|
| Core Java | Business Logic |
| Java Swing | Graphical User Interface (GUI) |
| JDBC | Database Connectivity |
| MySQL | Database Management |
| Eclipse IDE | Development Environment |
| MySQL Workbench | Database Design & Management |

---

# 📂 Project Structure

```text
Hospital-Management-System/
│
├── src/
│   ├── hospital/
│   │   └── management/
│   │       └── system/
│   │           ├── Login.java
│   │           ├── Reception.java
│   │           ├── AddPatient.java
│   │           ├── Doctor.java
│   │           ├── Employee.java
│   │           ├── Appointment.java
│   │           ├── Billing.java
│   │           ├── SearchRoom.java
│   │           ├── PatientDischarge.java
│   │           ├── conn.java
│   │           └── ...
│   │
│   └── icons/
│       ├── login.png
│       ├── patient.png
│       ├── doctor.png
│       └── ...
│
├── screenshots/
│
├── hospital_management_system.sql
│
└── README.md
```

---

# 🗄 Database

**Database Name**

```text
hospital_management_system
```

The project uses **MySQL** as the backend database.

Database connectivity is established using **JDBC (Java Database Connectivity).**

---

# ⚙ Installation & Setup

### Step 1

Clone this repository

```bash
git clone https://github.com/Artigoyal-maker/TECHNOHACKS.git
```

---

### Step 2

Open the project in **Eclipse IDE**.

---

### Step 3

Create a database named

```sql
CREATE DATABASE hospital_management_system;
```

---

### Step 4

Import

```
hospital_management_system.sql
```

into MySQL Workbench.

---

### Step 5

Open

```
conn.java
```

Update your MySQL username and password.

Example

```java
connection = DriverManager.getConnection(
"jdbc:mysql://localhost:3306/hospital_management_system",
"root",
"YOUR_PASSWORD");
```

---

### Step 6

Run

```
Login.java
```

---

# 📸 Project Screenshots

### Login Page

![Login Page](Screenshots/Login Page.png)

---

### Reception Dashboard

![Dashboard](Screenshots/Dashboard Page.png)

---

### Patient Management

![Patient](Screenshots/Add Patient.png, View Patient.png)

---

### Doctor Management

![Doctor](Screenshots/View Doctor.png)

---

### Employee Management

![Employee](Screenshots/View Employee.png)

---

### Room Management

![Room](Screenshots/Room Availability.png)

---

### Appointment Management

![Appointment](Screenshots/View Appointment.png)

---

### Billing Module

![Billing](Screenshots/View Bill.png)

---

### Ambulance Module

![Ambulance]{Screenshots/Ambulance Module.png}

---

### Patient Discharge

![Discharge](Screenshots/Patient Discharge.png)

---

# 🎯 Objectives

- Automate hospital management activities.
- Reduce paperwork and manual effort.
- Maintain accurate hospital records.
- Improve data accessibility.
- Simplify room allocation and patient management.
- Improve efficiency using database-driven software.

---

# 📖 Modules

- Login Module
- Patient Management
- Doctor Management
- Employee Management
- Room Management
- Appointment Management
- Billing Module
- Patient Discharge
- Ambulance Module
- Reception Dashboard

---

# 💡 Learning Outcomes

- Applied Object-Oriented Programming concepts using Java.
- Developed GUI applications using Java Swing.
- Implemented CRUD operations using JDBC.
- Integrated Java applications with MySQL.
- Improved debugging and problem-solving skills.
- Learned desktop application development.

---

# 🎓 Internship Details

**Company**

TechnoHacks Solutions Pvt. Ltd.

**Internship**

Java Development Internship

**Task**

Task 2 – Mini Project

**Project Title**

Hospital Management System

---

# 👩‍💻 Developed By

**Arti Goyal**

Java Developer Trainee Intern

TechnoHacks Solutions Pvt. Ltd.

GitHub Profile:
https://github.com/Artigoyal-maker

---

# 📌 Note

This project was developed for educational purposes as part of the **TechnoHacks Solutions Java Development Internship (Task 2 – Mini Project).**

---

⭐ If you found this project useful, please consider giving this repository a star.
