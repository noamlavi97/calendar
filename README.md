# Calendar
This is an assignment from the course 'Java advanced programing', 20554 at the Open University of Israel
Assignment 14, Q2 (semester 2023A).

This is a simple calendar app - it can show any month and year, and save the users' events for each day

To run the project:
1.   Clone
2.   cd into the cloned directory
3.   run.bat

To re-compile the project yourself:
1. cd into src->trivia directory
2. List all the files in the directory: `dir /s /B *.java > sources.txt`
3. Compile: `javac -d . @sources.txt`
4. Copy .fxml file into the newly created folder which contains the .class files
5. Run using the command: `java calendar.Calendar`