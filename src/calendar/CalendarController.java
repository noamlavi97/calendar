package calendar;

import java.time.LocalDate;
import java.time.Year;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CalendarController {

    @FXML
    private TextArea ActivitiesTextArea;

    @FXML
    private Button Button00;

    @FXML
    private Button Button01;

    @FXML
    private Button Button02;

    @FXML
    private Button Button03;

    @FXML
    private Button Button04;

    @FXML
    private Button Button05;

    @FXML
    private Button Button06;

    @FXML
    private Button Button10;

    @FXML
    private Button Button11;

    @FXML
    private Button Button12;

    @FXML
    private Button Button13;

    @FXML
    private Button Button14;

    @FXML
    private Button Button15;

    @FXML
    private Button Button16;

    @FXML
    private Button Button20;

    @FXML
    private Button Button21;

    @FXML
    private Button Button22;

    @FXML
    private Button Button23;

    @FXML
    private Button Button24;

    @FXML
    private Button Button25;

    @FXML
    private Button Button26;

    @FXML
    private Button Button30;

    @FXML
    private Button Button31;

    @FXML
    private Button Button32;

    @FXML
    private Button Button33;

    @FXML
    private Button Button34;

    @FXML
    private Button Button35;

    @FXML
    private Button Button36;

    @FXML
    private Button Button40;

    @FXML
    private Button Button41;

    @FXML
    private Button Button42;

    @FXML
    private Button Button43;

    @FXML
    private Button Button44;

    @FXML
    private Button Button45;

    @FXML
    private Button Button46;

    @FXML
    private Button Button50;

    @FXML
    private Button Button51;

    @FXML
    private Button Button52;

    @FXML
    private Button Button53;

    @FXML
    private Button Button54;

    @FXML
    private Button Button55;

    @FXML
    private Button Button56;

    @FXML
    private Label currentDayLabel;

    @FXML
    private ComboBox<String> monthComboBox;

    @FXML
    private Button saveActivitiesButton;

    @FXML
    private Button saveYearButton;

    @FXML
    private TextField yearTextArea;

    private final int MAX_NUM_OF_WEEKS_IN_MONTH=6, NUM_OF_DAYS_IN_WEEK=7;
    private Button[][] buttonArray = new Button[MAX_NUM_OF_WEEKS_IN_MONTH][NUM_OF_DAYS_IN_WEEK];
    private String currentYear, currentMonth;
    private int currentYearInt, currentMonthInt, currentDayInt;
    private MyMonth currentMonthVariable;
    private eventTable events;
    private LocalDate currentDate;

    @FXML
    void button00Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[0][0];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    
    }

    @FXML
    void button01Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[0][1];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button02Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[0][2];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button03Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[0][3];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button04Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[0][4];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button05Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[0][5];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button06Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[0][6];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button10Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[1][0];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button11Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[1][1];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button12Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[1][2];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button13Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[1][3];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button14Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[1][4];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button15Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[1][5];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button16Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[1][6];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button20Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[2][0];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button21Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[2][1];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button22Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[2][2];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button23Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[2][3];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button24Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[2][4];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button25Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[2][5];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button26Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[2][6];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button30Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[3][0];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button31Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[3][1];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button32Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[3][2];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button33Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[3][3];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button34Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[3][4];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button35Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[3][5];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button36Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[3][6];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button40Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[4][0];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button41Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[4][1];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button42Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[4][2];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button43Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[4][3];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button44Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[4][4];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button45Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[4][5];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button46Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[4][6];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button50Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[5][0];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button51Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[5][1];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button52Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[5][2];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button53Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[5][3];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button54Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[5][4];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button55Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[5][5];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    @FXML
    void button56Click(ActionEvent event) {
        currentDayInt=currentMonthVariable.getMonthMatrix()[5][6];
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    //Set the current month selection
    @FXML
    void monthComboBoxChanged(ActionEvent event) {
        currentMonth=monthComboBox.getValue();
        currentMonthInt=getMonthNum(currentMonth);
        currentMonthVariable = new MyMonth(currentMonthVariable.getYear(), currentMonthInt);
        setDatesOnButtons(currentMonthVariable);
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    //Save the current day string
    @FXML
    void saveActivitiesButtonPressed(ActionEvent event) {
        String currentMonthEvent=ActivitiesTextArea.getText();
        events.changeEvent(currentDate, currentMonthEvent);
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    //Save the current input year
    @FXML
    void saveYearButtonPressed(ActionEvent event) {
        currentYear=yearTextArea.getText();
        currentYearInt=Integer.valueOf(currentYear);
        currentMonthVariable = new MyMonth(currentYearInt, currentMonthVariable.getMonth());
        setDatesOnButtons(currentMonthVariable);
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        String todaysEvents=events.getEvent(currentDate);
        ActivitiesTextArea.setText(todaysEvents);
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
    }

    //Initialize the buttons and the various boxes with the current date
    public void initialize() {
        //Set the current date
        LocalDate today = LocalDate.now();
        currentDayInt=today.getDayOfMonth();
        currentMonthInt = today.getMonthValue();
        currentMonth=getMonthName(currentMonthInt);
        currentYearInt = Year.now().getValue();
        currentYear=Integer.toString(currentYearInt);
        currentMonthVariable = new MyMonth(currentYearInt, currentMonthInt);
        currentDate= LocalDate.of(currentYearInt, currentMonthInt, currentDayInt);
        //Set text box
        yearTextArea.setText(String.valueOf(currentYear));
        //Set buttons
        initializeButtonArray();
        setDatesOnButtons(currentMonthVariable);
        //Set combo box
        String monthNames[] ={"January","February","March","April","May","June","July","August","September","October","November","December"};
        ObservableList<String> monthNamesList = FXCollections.observableArrayList(monthNames);
        monthComboBox.setItems(monthNamesList);
        monthComboBox.setValue(currentMonth);
        //Set the current month label
        currentDayLabel.setText("Current day of\nthe month: "+currentDayInt);
        //Initialize the events table
        events = new eventTable();

    }

    //Get the month number from the month name
    public int getMonthNum (String month) {
        switch (month){
            case "January":
                return 1;
            case "February":
                return 2;
            case "March":
                return 3;
            case "April":
                return 4;
            case "May":
                return 5;
            case "June":
                return 6;
            case "July":
                return 7;
            case "August":
                return 8;
            case "September":
                return 9;
            case "October":
                return 10;
            case "November":
                return 11;
            case "December":
                return 12;
        }
        return 0;
    }

    //Get the month name from the month number
    public String getMonthName (int month) {
        switch (month){
            case 1:
                return "January";
            case 2:
                return "February";
            case 3:
                return "March";
            case 4:
                return "April";
            case 5:
                return "May";
            case 6:
                return "June";
            case 7:
                return "July";
            case 8:
                return "August";
            case 9:
                return "September";
            case 10:
                return "October";
            case 11:
                return "November";
            case 12:
                return "December";
        }
        return "";
    }

    //Connect the button array to the FXML file
    public void initializeButtonArray() {
        buttonArray[0][0]=Button00;
        buttonArray[0][1]=Button01;
        buttonArray[0][2]=Button02;
        buttonArray[0][3]=Button03;
        buttonArray[0][4]=Button04;
        buttonArray[0][5]=Button05;
        buttonArray[0][6]=Button06;
        buttonArray[1][0]=Button10;
        buttonArray[1][1]=Button11;
        buttonArray[1][2]=Button12;
        buttonArray[1][3]=Button13;
        buttonArray[1][4]=Button14;
        buttonArray[1][5]=Button15;
        buttonArray[1][6]=Button16;
        buttonArray[2][0]=Button20;
        buttonArray[2][1]=Button21;
        buttonArray[2][2]=Button22;
        buttonArray[2][3]=Button23;
        buttonArray[2][4]=Button24;
        buttonArray[2][5]=Button25;
        buttonArray[2][6]=Button26;
        buttonArray[3][0]=Button30;
        buttonArray[3][1]=Button31;
        buttonArray[3][2]=Button32;
        buttonArray[3][3]=Button33;
        buttonArray[3][4]=Button34;
        buttonArray[3][5]=Button35;
        buttonArray[3][6]=Button36;
        buttonArray[4][0]=Button40;
        buttonArray[4][1]=Button41;
        buttonArray[4][2]=Button42;
        buttonArray[4][3]=Button43;
        buttonArray[4][4]=Button44;
        buttonArray[4][5]=Button45;
        buttonArray[4][6]=Button46;
        buttonArray[5][0]=Button50;
        buttonArray[5][1]=Button51;
        buttonArray[5][2]=Button52;
        buttonArray[5][3]=Button53;
        buttonArray[5][4]=Button54;
        buttonArray[5][5]=Button55;
        buttonArray[5][6]=Button56;
    } 

        

    //Hide the buttons of the days, and set the dates according to the month template
    public void setDatesOnButtons (MyMonth currentMonth) {
        int currentDate;
        for (int i = 0; i <MAX_NUM_OF_WEEKS_IN_MONTH; i++) {
            for (int j = 0; j <NUM_OF_DAYS_IN_WEEK; j++) {
                currentDate=currentMonth.getMonthMatrix()[i][j];
                if (currentDate==0) {
                    buttonArray[i][j].setDisable(true);
                    buttonArray[i][j].setText("N/A");
                }
                else {
                    buttonArray[i][j].setDisable(false);
                    buttonArray[i][j].setText(String.valueOf(currentDate));
                }
            }   
        }
    }
}
