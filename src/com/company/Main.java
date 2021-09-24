package com.company;

import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.Calendar;


public class Main {

    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);

    GregorianCalendar cal = new GregorianCalendar();
    GregorianCalendar birth = new GregorianCalendar(2005, Calendar.OCTOBER, 22);

    cal.add(Calendar.DAY_OF_MONTH, 100);

    int day = cal.get(Calendar.DAY_OF_MONTH);
    int weekday = cal.get(Calendar.DAY_OF_WEEK);
    int year = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.MONTH);
    System.out.println(month + 1 + "/" + day + "/" + year + " and weekday is " + weekday);

    int birthday = birth.get(Calendar.DAY_OF_WEEK);
    System.out.println(birthday);

    birth.add(Calendar.DAY_OF_MONTH, 10000);

    int day_2 = birth.get(Calendar.DAY_OF_MONTH);
    int weekday_2 = birth.get(Calendar.DAY_OF_WEEK);
    int year_2 = birth.get(Calendar.YEAR);
    int month_2 = birth.get(Calendar.MONTH);
    System.out.println(month_2 + 1 + "/" + day_2 + "/" + year_2 + " and weekday is " + weekday_2);





    }
}
