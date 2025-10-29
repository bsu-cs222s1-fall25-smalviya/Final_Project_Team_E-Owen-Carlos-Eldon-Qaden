import java.util.ArrayList;
import java.util.List;

//takes user input and formats it into the UI
public class Format {
List<String> testList = new ArrayList<>();
ArrayList<List<String>> testArrayList = new ArrayList<>();

    //Example array to test class
    public void testMethod(List<String> testList) {
        testList.add("Monday");
        testList.add("Do dishes");
        testList.add("11");
        testList.add("45");
    }

    //appends data from input
    public void listFormat(StringBuilder format, String day, String task, String timeHour,
                           String timeMinute) {
        format.append(day);
        format.append(task);
        format.append(timeHour);
        format.append(timeMinute);
    }

    //formats data from input
    public void stringFormat(List<String> testList, ArrayList<List<String>> testArrayList) {
        List<String> monday = new ArrayList<>();
        List<String> tuesday = new ArrayList<>();
        List<String> wednesday = new ArrayList<>();
        List<String> thursday = new ArrayList<>();
        List<String> friday = new ArrayList<>();
        List<String> saturday = new ArrayList<>();
        List<String> sunday = new ArrayList<>();

        //checks to see what day it is ands adds task and time to that day
        switch (testList.get(0)) {
            case "Monday" -> {
                monday.add(testList.get(1));
                monday.add(testList.get(2));
                monday.add(testList.get(3));
            }
            case "Tuesday" -> {
                tuesday.add(testList.get(1));
                tuesday.add(testList.get(2));
                tuesday.add(testList.get(3));
            }
            case "Wednesday" -> {
                wednesday.add(testList.get(1));
                wednesday.add(testList.get(2));
                wednesday.add(testList.get(3));
            }
            case "Thursday" -> {
                thursday.add(testList.get(1));
                thursday.add(testList.get(2));
                thursday.add(testList.get(3));
            }
            case "Friday" -> {
                friday.add(testList.get(1));
                friday.add(testList.get(2));
                friday.add(testList.get(3));
            }
            case "Saturday" -> {
                saturday.add(testList.get(1));
                saturday.add(testList.get(2));
                saturday.add(testList.get(3));
            }
            case "Sunday" -> {
                sunday.add(testList.get(1));
                sunday.add(testList.get(2));
                sunday.add(testList.get(3));
            }
        }

        //adds task information to new list seperated by day of the week
        testArrayList.add(monday);
        testArrayList.add(tuesday);
        testArrayList.add(wednesday);
        testArrayList.add(thursday);
        testArrayList.add(friday);
        testArrayList.add(saturday);
        testArrayList.add(sunday);

    }

    //checks for errors from input
    public void errorHandling(List<String> testList) {
        if(testList.get(1).isBlank()) {
            testList.add(1, "Nothing to do Today :)");
            testList.add(2, "12");
            testList.add(3, "00");
        }
    }

    //main method
    public ArrayList<List<String>> formatOutput() {
        errorHandling(testList);
        stringFormat(testList, testArrayList);

        return testArrayList;
    }
}
