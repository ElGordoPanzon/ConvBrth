import java.time.*;

public class App {

    public static void main(String[] args) {

        LocalDateTime birthday = LocalDateTime.of(1921, 7, 23, 2, 11, 0);
        ZoneId us = ZoneId.of("America/New_York");
        ZonedDateTime birthdayZoned = ZonedDateTime.of(birthday, us);

        ZoneId london = ZoneId.of("Europe/London");
        ZonedDateTime birthdayParis = birthdayZoned.withZoneSameInstant(london);
        System.out.println(birthdayZoned);
        System.out.println(birthdayParis);


    }

}