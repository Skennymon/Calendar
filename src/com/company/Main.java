package com.company;

import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Calendar;


public class Main {

    public static void main(String[] args) {

        //variables and shit
        Scanner scan = new Scanner(System.in);
        String word = null;
        String word_2 = null;
        String woord = null;

        //Greg Instances
        GregorianCalendar cal = new GregorianCalendar();
        GregorianCalendar birth = new GregorianCalendar(2005, Calendar.OCTOBER, 22);

        cal.add(Calendar.DAY_OF_MONTH, 100);

        //more variable shit
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int weekday = cal.get(Calendar.DAY_OF_WEEK);
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);

        //Turns int into weekday
        switch (weekday) {
            case 1 -> woord = "Sunday";
            case 2 -> woord = "Monday";
            case 3 -> woord = "Tuesday";
            case 4 -> woord = "Wednesday";
            case 5 -> woord = "Thursday";
            case 6 -> woord = "Friday";
            case 7 -> woord = "Saturday";
        }

        System.out.println(month + 1 + "/" + day + "/" + year + " and weekday is " + woord);

        int birthday = birth.get(Calendar.DAY_OF_WEEK);

        //Turns int into weekday
        switch (birthday) {
            case 1 -> word = "Sunday";
            case 2 -> word = "Monday";
            case 3 -> word = "Tuesday";
            case 4 -> word = "Wednesday";
            case 5 -> word = "Thursday";
            case 6 -> word = "Friday";
            case 7 -> word = "Saturday";
        }

        System.out.println(word);

        //adds 10,000 days to my birthday
        birth.add(Calendar.DAY_OF_MONTH, 10000);

        //more variable shit
        int day_2 = birth.get(Calendar.DAY_OF_MONTH);
        int weekday_2 = birth.get(Calendar.DAY_OF_WEEK);
        int year_2 = birth.get(Calendar.YEAR);
        int month_2 = birth.get(Calendar.MONTH);

        //Turns int into weekday
        switch (weekday_2) {
            case 1 -> word_2 = "Sunday";
            case 2 -> word_2 = "Monday";
            case 3 -> word_2 = "Tuesday";
            case 4 -> word_2 = "Wednesday";
            case 5 -> word_2 = "Thursday";
            case 6 -> word_2 = "Friday";
            case 7 -> word_2 = "Saturday";
        }

        System.out.println(month_2 + 1 + "/" + day_2 + "/" + year_2 + " and weekday is " + word_2);

        //cock
        System.out.println("give number between 0 and 420");

        int cringe = scan.nextInt();
        String penis2 = null;

        switch (cringe) {

            case 420, 69 -> penis2 = "CUMMMM";
        }
        System.out.println(penis2);

    }
}
