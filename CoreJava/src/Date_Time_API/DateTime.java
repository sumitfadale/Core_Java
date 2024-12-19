package Date_Time_API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date is " + today); // YYYY-MM-DD
        LocalTime nowTime = LocalTime.now();
        System.out.println("Current time is "+nowTime);// HH:MM:SS.MS
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Today's date and time is "+ dateTime); // YYYY-MM-DDTHH:MM:SS.MS

        LocalDate nextWeek = today.plusDays(7);
        System.out.println("Next week date is "+ nextWeek);

        LocalDate lastMonth =  today.minusMonths(1);
        System.out.println("Last month date from today's date "+ lastMonth);
    }
}
