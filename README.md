# University Management System

## Overview
The University Management System is a Java-based application designed to manage university operations including managing courses, departments, professors, and students. The application offers a simple console interface for different types of users such as Admin, Professor, and Student to perform various operations.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Setup and Installation](#setup-and-installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Features
- **Admin Management:** Add, update, and delete departments and courses.
- **Professor Management:** Manage courses and interact with students.
- **Student Management:** Register for courses and view schedules.
- **Schedule Management:** Ensure no conflicts in class schedules.

## Technologies Used
- **Java:** The core programming language used.
- **Serialization:** For data persistence.
- **Console Interface:** Simple user interface using Java's `Scanner`.

## Project Structure
university-management/
```
├── dao/
│ ├── ClassCourseDAO.java 
│ ├── ClassDepartmentDAO.java
│ ├── ClassProfessorDAO.java
│ ├── ClassStudentDAO.java
│ ├── CourseDAO.java
│ ├── DepartmentDAO.java
│ ├── ProfessorDAO.java
│ └── StudentDAO.java
├── model/
│ ├── Admin.java
│ ├── Class.java
│ ├── Course.java
│ ├── Department.java
│ ├── Pair.java
│ ├── Professor.java
│ ├── ScheduleManager.java
│ ├── Student.java
│ ├── User.java
│ └── YearOfStudy.java
├── service/
│ ├── ServiceCourse.java
│ ├── ServiceStudent.java
│ ├── ServiceUser.java
│ └── serviceAdmin.java
├── Main.java
└── README.md
```

## Setup and Installation

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- An IDE or text editor (Eclipse, IntelliJ IDEA, VS Code, etc.)

### Steps
1. **Clone the repository:**
   ```bash
   git clone https://github.com/mohamed9hossam9/university-management.git
   cd university-management
2-Open the project in your IDE:

Import the project as a Java project if you are using an IDE like Eclipse or IntelliJ IDEA.
3- Compile the project:

If using command line:
  javac -d bin $(find . -name "*.java")

  If using an IDE, run the Main.java file.

  ##Usage
Start the application:

The console will display a menu for selecting user type:
markdown
نسخ الكود
Select user type:
1. Admin
2. Professor
3. Student
4. Exit

Select a user type and follow the prompts:

Admin: Manage departments and courses.
Professor: Manage courses.
Student: Register and view courses.


Certainly! Below is the README content formatted for easy copying and pasting into a GitHub repository README file:

markdown
نسخ الكود
# University Management System

## Overview
The University Management System is a Java-based application designed to manage university operations including managing courses, departments, professors, and students. The application offers a simple console interface for different types of users such as Admin, Professor, and Student to perform various operations.

## Table of Contents
- [Overview](#overview)
- [Features](#features)
- [Technologies Used](#technologies-used)
- [Project Structure](#project-structure)
- [Setup and Installation](#setup-and-installation)
- [Usage](#usage)
- [Contributing](#contributing)
- [License](#license)

## Features
- **Admin Management:** Add, update, and delete departments and courses.
- **Professor Management:** Manage courses and interact with students.
- **Student Management:** Register for courses and view schedules.
- **Schedule Management:** Ensure no conflicts in class schedules.

## Technologies Used
- **Java:** The core programming language used.
- **Serialization:** For data persistence.
- **Console Interface:** Simple user interface using Java's `Scanner`.

## Project Structure
university-management/
├── dao/
│ ├── ClassCourseDAO.java
│ ├── ClassDepartmentDAO.java
│ ├── ClassProfessorDAO.java
│ ├── ClassStudentDAO.java
│ ├── CourseDAO.java
│ ├── DepartmentDAO.java
│ ├── ProfessorDAO.java
│ └── StudentDAO.java
├── model/
│ ├── Admin.java
│ ├── Class.java
│ ├── Course.java
│ ├── Department.java
│ ├── Pair.java
│ ├── Professor.java
│ ├── ScheduleManager.java
│ ├── Student.java
│ ├── User.java
│ └── YearOfStudy.java
├── service/
│ ├── ServiceCourse.java
│ ├── ServiceStudent.java
│ ├── ServiceUser.java
│ └── serviceAdmin.java
├── Main.java
└── README.md

bash
نسخ الكود

## Setup and Installation

### Prerequisites
- Java Development Kit (JDK) 8 or higher
- An IDE or text editor (Eclipse, IntelliJ IDEA, VS Code, etc.)

### Steps
1. **Clone the repository:**
   ```bash
   git clone https://github.com/mohamed9hossam9/university-management.git
   cd university-management
Open the project in your IDE:

Import the project as a Java project if you are using an IDE like Eclipse or IntelliJ IDEA.
Compile the project:

If using command line:
bash
نسخ الكود
javac -d bin $(find . -name "*.java")
If using an IDE, use the build option available.
Run the application:

If using command line:
bash
نسخ الكود
java -cp bin org.example.Main
If using an IDE, run the Main.java file.
Usage
Start the application:

The console will display a menu for selecting user type:
markdown
نسخ الكود
Select user type:
1. Admin
2. Professor
3. Student
4. Exit
Select a user type and follow the prompts:

Admin: Manage departments and courses.
Professor: Manage courses.
Student: Register and view courses.
Contributing
Contributions are welcome! Please fork this repository and submit pull requests. For major changes, please open an issue first to discuss what you would like to change.

License
This project is licensed under the MIT License. See the LICENSE file for details.



