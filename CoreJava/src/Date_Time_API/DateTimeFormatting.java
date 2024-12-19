package Date_Time_API;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatting {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();  // format date and time
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        String formattedDateTime = now.format(formatter);
        System.out.println(formattedDateTime);

        LocalDate today = LocalDate.now();  // format date
        DateTimeFormatter formatter_Date = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String formattedDate = today.format(formatter_Date);
        System.out.println(formattedDate);

        LocalTime time  =  LocalTime.now();
        DateTimeFormatter formatter_Time = DateTimeFormatter.ofPattern("HH:mm:ss");
        String formattedTime = time.format(formatter_Time);
        System.out.println(formattedTime);

    }
}
