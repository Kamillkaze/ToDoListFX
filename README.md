# ToDoListFX

ToDoListFX is an application used to add, delete, store and display 
daily tasks. Project was built in september 2021 when I wasn't 
familiar with GIT version control system, that's why there are 
only a few commits.

## Description

### How it works?

After start of the aplication user sees main window containing a few
buttons, left panel (used to display short descriptions of ToDoItems),
centre-right space (after clicking on short description from the left 
panel the details of ToDoItem are displayed here) and space on the 
bottom (deadlines are showed here).

Adding an item is enabled by clicking on "Add" button or File > Add... .
When user satisfies one of above conditions there appears newItemDialog
window, where properties of new item can be set. After clicking on "OK" 
button (in the newItemDialog) short description of new item is shown 
in the left panel.

Deletion of an item is possible by right-clicking on short description
and choosing the "Delete" option or left-clicking on short description
and pushing "delete" key on the keyboard.

The left panel shows short description of particular ToDoItem in 
different font color depending on the deadline:
- Orange - Deadline today.
- Red - Deadline yesterday or before that date.
- Black - Deadline tomorrow or after that date.

### How it's built?

Project is built using JavaFX with user interface set in .fxml files.
To store ToDoItem data the application uses .txt file. Properties 
stored are: 
- short description
- details
- deadline
