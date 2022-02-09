package com.kamiltomanek.todolistfx;

import com.kamiltomanek.todolistfx.datamodel.ToDoData;
import com.kamiltomanek.todolistfx.datamodel.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.time.LocalDate;

public class DialogController {

    @FXML
    private TextField shortDescriptionField;

    @FXML
    private TextArea detailsField;

    @FXML
    private DatePicker deadlinePicker;

    public TodoItem processChanges() {
        String shortDescription = shortDescriptionField.getText().trim();
        String details = detailsField.getText().trim();

        LocalDate deadline = deadlinePicker.getValue();

        TodoItem newItem = new TodoItem(shortDescription, details, deadline);
        ToDoData.getInstance().addTodoItem(newItem);

        return newItem;
    }
}
