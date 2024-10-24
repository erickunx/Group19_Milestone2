package obj;

import java.time.LocalDate;

public class DailyAppointment extends Appointment{

    public DailyAppointment(String description, LocalDate startDate, LocalDate endDate) {
        super(description, startDate, endDate);
    }

}
