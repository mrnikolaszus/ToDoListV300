# Simple To-Do List Application

## Overview
This project is a minimalistic to-do list application built using Spring Boot 3.2.3 and styled with Bootstrap 5.2.2. It is designed to provide a straightforward interface for task management.

## Note
This is a test pet project and is intended for demonstration purposes only. It serves as an example of a basic web application built with Spring Boot and Bootstrap.


## Description
The application's primary goal is to allow users to maintain a personal list of tasks. It offers essential features for interacting with these tasks, including:

- **Create:** Add new tasks to the list.
- **Update:** Change details of existing tasks.
- **Delete:** Remove tasks from the list.
- **Complete:** Mark tasks as finished.

## Getting Started
To get the application up and running on your local machine:

1. Ensure you have Java and Maven installed.
2. Clone the repository to your local environment.
3. Navigate to the project directory and run `mvn spring-boot:run`.
4. Access the application at `http://localhost:8080`.

## Usage Guide
Once the application is active:

- **View Tasks:** The home page displays all current tasks.
- **Create Task:** Use the "Create Task" button to open the task creation form.
- **Edit Task:** Each task has an associated "Edit" button for updating its content.
- **Delete Task:** Use the "Delete" button to remove a task permanently.
- **Mark Task as Complete:** Check the box next to a task to indicate completion.

## Controllers
The application has two main controllers:

### ToDoItemController
Manages the display of tasks on the homepage.

### ToDoFormController
Handles the creation, updating, and deletion of tasks through form submissions.

## Features
- Task persistence is managed through a controller-service-repository pattern.
- Form validation ensures task descriptions are provided before submission.
- A responsive UI offers a seamless experience across different devices and screen sizes.

