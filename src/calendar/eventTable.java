package calendar;

import java.time.LocalDate;
import java.util.Hashtable;

public class eventTable {
    private Hashtable <LocalDate, String> events;

    //Constructor
    public eventTable() {
        this.events=new Hashtable<LocalDate, String>();
    }

    //Add/Update event to the event table
    public void changeEvent (LocalDate date, String event) {
        this.events.put(date, event);
    }

    //Get current event
    public String getEvent(LocalDate date) {
        if (!events.containsKey(date)) {
            return "";
        }
        return events.get(date);
    }

}
