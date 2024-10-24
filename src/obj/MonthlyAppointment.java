package obj;

import java.time.LocalDate;


public class MonthlyAppointment extends Appointment {

    public MonthlyAppointment(String description, LocalDate startDate, LocalDate endDate) {
        super(description, startDate, endDate);
    }


}
