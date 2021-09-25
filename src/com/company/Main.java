package com.company;

import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Calendar;


public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
    String word = null;
    String word_2 = null;
    String woord = null;

    GregorianCalendar cal = new GregorianCalendar();
    GregorianCalendar birth = new GregorianCalendar(2005, Calendar.OCTOBER, 22);

    cal.add(Calendar.DAY_OF_MONTH, 100);

    int day = cal.get(Calendar.DAY_OF_MONTH);
    int weekday = cal.get(Calendar.DAY_OF_WEEK);
    int year = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.MONTH);

        if (weekday == 1) {
            woord = "Sunday";
        }
        else if (weekday == 2) {
            woord = "Monday";
        }
        else if (weekday == 3) {
            woord = "Tuesday";
        }
        else if (weekday == 4) {
            woord = "Wednesday";
        }
        else if (weekday == 5) {
            woord = "Thursday";
        }
        else if (weekday == 6) {
            woord = "Friday";
        }
        else if (weekday == 7) {
            woord = "Saturday";
        }

        System.out.println(month + 1 + "/" + day + "/" + year + " and weekday is " + woord);

    int birthday = birth.get(Calendar.DAY_OF_WEEK);

        if (birthday == 1) {
            word = "Sunday";
        }
        else if (birthday == 2) {
            word = "Monday";
        }
        else if (birthday == 3) {
            word = "Tuesday";
        }
        else if (birthday == 4) {
            word = "Wednesday";
        }
        else if (birthday == 5) {
            word = "Thursday";
        }
        else if (birthday == 6) {
            word = "Friday";
        }
        else if (birthday == 7) {
            word = "Saturday";
        }
        System.out.println(word);

    birth.add(Calendar.DAY_OF_MONTH, 10000);

    int day_2 = birth.get(Calendar.DAY_OF_MONTH);
    int weekday_2 = birth.get(Calendar.DAY_OF_WEEK);
    int year_2 = birth.get(Calendar.YEAR);
    int month_2 = birth.get(Calendar.MONTH);

    if (weekday_2 == 1) {
        word_2 = "Sunday";
    }
    else if (weekday_2 == 2) {
        word_2 = "Monday";
    }
    else if (weekday_2 == 3) {
        word_2 = "Tuesday";
    }
    else if (weekday_2 == 4) {
        word_2 = "Wednesday";
    }
    else if (weekday_2 == 5) {
        word_2 = "Thursday";
    }
    else if (weekday_2 == 6) {
        word_2 = "Friday";
    }
    else if (weekday_2 == 7) {
        word_2 = "Saturday";
    }


    System.out.println(month_2 + 1 + "/" + day_2 + "/" + year_2 + " and weekday is " + word_2);





    }
}
