import java.time.OffsetDateTime;

public class DateExercise3 {
    public static void main(String[] args) {
        OffsetDateTime date = OffsetDateTime.parse("2023-03-01T13:00:00Z");

        String yearString = String.valueOf(date.getYear());
        String monthString = String.valueOf(date.getMonth());
        String dayString = String.valueOf(date.getDayOfMonth());
        String weekDayString = String.valueOf(date.getDayOfWeek());

        System.out.println("Year: " + yearString);
        System.out.println("Month: " + monthString);
        System.out.println("Day: " + dayString);
        System.out.println("Weekday: " + weekDayString);

    }
}
