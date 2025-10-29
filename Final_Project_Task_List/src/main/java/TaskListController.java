package edu.bsu.cs;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class TaskListController implements Initializable {
    Photo photo = new Photo();
    Format format = new Format();

    @FXML
    private TextField taskTextField;

    @FXML
    private Label taskListArea;

    String task;
    String day;
    String hour;
    String minute;

    //takes a screenshot of the users screen to keep a version of their list
    @FXML
    protected void listScreenshot() {

        return photo.start();

    }

    //return input from formating code to print to list
    @FXML
    protected void printInput() {

        task = taskTextField.getText();

        day = dayChoicebox.getValue();

        hour = hourChoicebox.getValue();

        minute = minuteChoicebox.getValue();


        taskListArea.setText(format.listFormat(day,task,hour,minute));

    }

    //clears list and any info related to the list to begin making a new one
    @FXML
    protected void clearList() {
        taskListArea.setText("");

    }

    //choices for the day dropdown menu
    @FXML
    private ChoiceBox<String> dayChoicebox;

    private String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

    //choice for the hour dropdown menu
    @FXML
    private ChoiceBox<String> hourChoicebox;

    private String[] hours = {"00","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","17","18","19","20","21","22","23"};

    //choice for the minute dropdown menu
    @FXML
    private ChoiceBox<String> minuteChoicebox;

    private String[] minutes = {"5","10","15","20","25","30","35","40","45","50","55"};

    //gives each dropdown menu their choices
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        dayChoicebox.getItems().addAll(days);

        hourChoicebox.getItems().addAll(hours);

        minuteChoicebox.getItems().addAll(minutes);

    }

}
