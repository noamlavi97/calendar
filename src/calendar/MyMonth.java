package calendar;

import java.util.Calendar;

public class MyMonth {

    //If the day is not in the month the value is 0, else the value is the day of the month
    private final int MAX_NUM_OF_WEEKS_IN_MONTH=6, NUM_OF_DAYS_IN_WEEK=7;
    private int[][] monthMatrix=new int [MAX_NUM_OF_WEEKS_IN_MONTH][NUM_OF_DAYS_IN_WEEK];
    private int currentMonth, currentYear;
    private Calendar firstDayOfMonth, lastDayOfMonth;
    //In the array sunday = 0th place
    private int firstDayOfMonthWeekDay, lastDayOfMonthWeekDay, lastDayOfMonthWeekNumber, daysInFirstWeekOfMonth;

    public MyMonth(int year, int month) {
        this.currentMonth=month;
        this.currentYear=year;                
        findFirstAndLastDays(year, month);
        //Zero the days before (exclusive) the first day of the month
        for (int i = 0; i <firstDayOfMonthWeekDay-1; i++) {
            this.monthMatrix [0][i]=0;
        }
        //Set the rest (inclusive) of the first week of the month
        for (int i = firstDayOfMonthWeekDay-1; i <NUM_OF_DAYS_IN_WEEK; i++) {
            this.monthMatrix [0][i]=i-firstDayOfMonthWeekDay+2;
        }
        //Set the second week of the month
        for (int i = 0; i <NUM_OF_DAYS_IN_WEEK; i++) {
            this.monthMatrix [1][i]=i+daysInFirstWeekOfMonth+1;
        }
        //Set the third week of the month
        for (int i = 0; i <NUM_OF_DAYS_IN_WEEK; i++) {
            this.monthMatrix [2][i]=i+NUM_OF_DAYS_IN_WEEK+daysInFirstWeekOfMonth+1;
        }
        
        //Switch case for the number of weeks in the month
        switch (lastDayOfMonthWeekNumber) {
            case 4:
            {
                //Set the fourth week of the month
                for (int i = 0; i <lastDayOfMonthWeekDay-1; i++) {
                    this.monthMatrix [3][i]=i+NUM_OF_DAYS_IN_WEEK*2+daysInFirstWeekOfMonth+1;
                }
                //Zero the days after (inclusive) the last day of the month
                for (int i = lastDayOfMonthWeekDay; i <NUM_OF_DAYS_IN_WEEK; i++) {
                    this.monthMatrix [3][i]=0;
                }
                //Zero the remaining weeks
                for (int i = 0; i <NUM_OF_DAYS_IN_WEEK; i++) {
                    this.monthMatrix [4][i]=0;
                    this.monthMatrix [5][i]=0;
                }
                break;
            }
            case 5:
            {
                //Set the fourth week of the month
                for (int i = 0; i <NUM_OF_DAYS_IN_WEEK; i++) {
                    this.monthMatrix [3][i]=i+NUM_OF_DAYS_IN_WEEK*2+daysInFirstWeekOfMonth+1;
                }
                //Set the fifth week of the month
                for (int i = 0; i <lastDayOfMonthWeekDay; i++) {
                    this.monthMatrix [4][i]=i+NUM_OF_DAYS_IN_WEEK*3+daysInFirstWeekOfMonth+1;
                }
                //Zero the days after (inclusive) the last day of the month
                for (int i = lastDayOfMonthWeekDay; i <NUM_OF_DAYS_IN_WEEK; i++) {
                    this.monthMatrix [4][i]=0;
                }
                //Zero the remaining week
                for (int i = 0; i <NUM_OF_DAYS_IN_WEEK; i++) {
                    this.monthMatrix [5][i]=0;
                }
                break;
            }
            case 6:
            {
                //Set the fourth week of the month
                for (int i = 0; i <NUM_OF_DAYS_IN_WEEK; i++) {
                    this.monthMatrix [3][i]=i+NUM_OF_DAYS_IN_WEEK*2+daysInFirstWeekOfMonth+1;
                }
                //Set the fifth week of the month
                for (int i = 0; i <NUM_OF_DAYS_IN_WEEK; i++) {
                    this.monthMatrix [4][i]=i+NUM_OF_DAYS_IN_WEEK*3+daysInFirstWeekOfMonth+1;
                }
                //Set the sixth week of the month
                for (int i = 0; i <lastDayOfMonthWeekDay; i++) {
                    this.monthMatrix [5][i]=i+NUM_OF_DAYS_IN_WEEK*4+daysInFirstWeekOfMonth+1;
                }
                //Zero the days after (inclusive) the last day of the month
                for (int i = lastDayOfMonthWeekDay; i <NUM_OF_DAYS_IN_WEEK; i++) {
                    this.monthMatrix [5][i]=0;
                }
                break;
            }
        }
    }

    //Find the first and last days of the month's week day
    //Month is 1-12 (1 is January, 12 is December)
     public void findFirstAndLastDays(int year, int month) {
        //Because count starts from 0;
        int actualMonth=month-1;
        int lastDayOfTheMonthDate;
        //Find the day of week of the first day of the month
        firstDayOfMonth = Calendar.getInstance();
        firstDayOfMonth.set(year, actualMonth,1);
        firstDayOfMonthWeekDay = firstDayOfMonth.get(Calendar.DAY_OF_WEEK);
        daysInFirstWeekOfMonth=NUM_OF_DAYS_IN_WEEK-firstDayOfMonthWeekDay+1;
        //Find the day of week of the last day of the month
        lastDayOfTheMonthDate=firstDayOfMonth.getActualMaximum(Calendar.DATE);
        lastDayOfMonth = Calendar.getInstance();
        lastDayOfMonth.set(year, actualMonth,lastDayOfTheMonthDate);
        lastDayOfMonthWeekDay = lastDayOfMonth.get(Calendar.DAY_OF_WEEK);
        lastDayOfMonthWeekNumber = lastDayOfMonth.get(Calendar.WEEK_OF_MONTH);         
    }

    //Getters
    public int[][] getMonthMatrix () {
        return this.monthMatrix;
    }

    public int getMonth () {
        return this.currentMonth;
    }

    public int getYear () {
        return this.currentYear;
    }
}
