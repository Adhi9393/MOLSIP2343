import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTimesBetweenTwoDates {
    public static void main(String[] args) {
        // Define two LocalDateTime objects for demonstration
        LocalDateTime dateTime1 = LocalDateTime.of(2023, 1, 1, 12, 0); // Replace with your desired date and time
        LocalDateTime dateTime2 = LocalDateTime.of(2023, 1, 10, 12, 0); // Replace with your desired date and time

        // Call method to list all possible times
        listAllPossibleTimes(dateTime1, dateTime2);
    }

    public static void listAllPossibleTimes(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        LocalDateTime currentDateTime = dateTime1;
        while (!currentDateTime.isAfter(dateTime2)) {
            System.out.println("Date: " + currentDateTime.toLocalDate() +
                               ", Time: " + currentDateTime.toLocalTime());

            currentDateTime = currentDateTime.plusMinutes(1); // Increment by 1 minute
        }
    }
}