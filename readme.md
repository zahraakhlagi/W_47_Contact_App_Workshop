## The MVC Design Pattern

The application is split into 3 main layers, where each has its own responsibility:
- <b>Model</b>: holds and manages the application data. Here: contact which validates its own passed parameters.
- <b>View</b>: responsible for all interaction with the user, reading input and printing output. 
- <b>Controller</b>: coordinates between the Model and the View, handling user input and updating the model and view accordingly.

This separation improves code organization, maintainability, and scalability. Each component handles a specific responsibility, 
making the application easier to modify and extend.

For more information in detail:
https://www.geeksforgeeks.org/system-design/mvc-design-pattern/
