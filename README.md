# Course Performance Calculator

This project implements a **Grade Calculator** for a course, where a course consists of assignments, quizzes, midterm exams, lab exams, and a final exam. The user can input their scores for each type of assessment, and the system will calculate the final grade based on these scores.

## Table of Contents
1. [Overview](#overview)
2. [Classes and Their Roles](#classes-and-their-roles)
3. [Running the Application](#running-the-application)
4. [Features and Functionality](#features-and-functionality)
5. [How to Use](#how-to-use)
6. [Example Output](#example-output)
7. [Testing](#testing)


---

## Overview

This system allows the user to:
- Input scores for assignments, quizzes, lab exams, midterm exams, and final exams.
- View the details of their assessments.
- Calculate their final grade based on a weighted formula:
    - **Assignments** contribute 15% of the final grade.
    - **Quizzes** contribute 5% of the final grade.
    - **Midterm Exam** contributes 15% of the final grade.
    - **Lab Exams** contribute 5% and 15% of the final grade.
    - **Final Exam** contributes 45% of the final grade.

## Classes and Their Roles

### 1. **Assessment**
- A base class for any type of assessment (assignments, quizzes, etc.).
- Holds the total and obtained scores for any assessment.
- Provides methods to retrieve these scores and calculate percentages.

### 2. **Assignment**
- Inherits from `Assessment`.
- Represents assignments in the course.
- Overrides `toString` to return a formatted string showing the assignment score and total score.

### 3. **Quiz**
- Inherits from `Assessment`.
- Represents quizzes in the course.

### 4. **Midterm**
- Inherits from `Exam`, which is a subclass of `Assessment`.
- Represents the midterm exam in the course.

### 5. **LabExam**
- Inherits from `Exam`.
- Represents lab exams in the course.
- There are two lab exams, which are handled individually.

### 6. **FinalExam**
- Inherits from `Exam`.
- Represents the final exam in the course.

### 7. **Exam**
- A base class that represents any type of exam (midterm, lab exams, final exam).
- Holds the total and obtained score for the exam.
- Provides a method `getPercentage()` to calculate the percentage score of the exam.

### 8. **Course**
- Represents a course that contains assignments, quizzes, midterm exams, lab exams, and a final exam.
- Provides methods to add assignments, quizzes, exams, and calculate the final grade based on the weighted formula.
- Overrides `toString` to return a summary of all assessments in the course.

### 9. **GradeCalculator (Main Application)**
- Provides an interactive command-line menu for the user to input scores for various assessments.
- Calculates and prints the final grade when the user selects the appropriate option.


## Running the Application

To run the application, compile the files and run the `GradeCalculator` class:

```bash
javac GradeCalculator.java Assessment.java Assignment.java Quiz.java Midterm.java LabExam.java FinalExam.java Exam.java Course.java
java GradeCalculator
```

The program will then prompt you to input scores for assignments, quizzes, exams, and calculate the final grade.

### Menu Options:
1. **Add an assignment** – Enter the total and obtained scores for an assignment.
2. **Add midterm** – Enter the total and obtained scores for the midterm exam.
3. **Add a quiz** – Enter the total and obtained scores for a quiz.
4. **Add lab exam 1** – Enter the total and obtained scores for the first lab exam.
5. **Add lab exam 2** – Enter the total and obtained scores for the second lab exam.
6. **Add final exam** – Enter the total and obtained scores for the final exam.
7. **Calculate grade and quit** – Calculate the final grade and exit the program.

## Features and Functionality

- **Dynamic Input**: Users can add scores for assignments, quizzes, midterms, lab exams, and final exams interactively.
- **Final Grade Calculation**: Based on the scores entered, the system calculates the final grade using a weighted average.
- **Customizable Course**: The course name can be set by the user at the beginning of the program.
- **Weightage Customization**: User can hard-code their coursework's weightage based on individual needs. 

## How to Use

1. Run the `GradeCalculator` class.
2. Enter the name of the course when prompted.
3. Choose from the available options to add assignments, quizzes, exams, etc.
4. Once all data is entered, select the option to calculate the grade.
5. The final grade will be displayed based on the inputs provided.

## Example Output

```
Please enter the name of this course: 
Java Programming

Choose an option:
1. Add an assignment
2. Add midterm
3. Add a quiz
4. Add lab exam 1
5. Add lab exam 2
6. Add final exam
7. Calculate grade and quit

1
How many marks was the assignment worth?
100
How many marks did you receive on the assignment?
90

Choose an option:
1. Add an assignment
2. Add midterm
3. Add a quiz
4. Add lab exam 1
5. Add lab exam 2
6. Add final exam
7. Calculate grade and quit

7
Your grade in Java Programming: 87.5
```

## Testing

The system comes with basic unit tests to ensure correct initialization and functionality of the `Assessment` class, particularly focusing on verifying that the `score` and `total` variables are initialized correctly.

For regression testing, the `Exam` class and its subclasses (`Midterm`, `LabExam`, and `FinalExam`) are tested for correctness in the calculation of percentages.

Thank you.
