package obj;

import java.time.LocalDate;

public class OnetimeAppointment extends Appointment{

    public OnetimeAppointment(String description, LocalDate startDate) {
        super(description, startDate, startDate);
    }



    @Override
    public boolean occursOn(LocalDate testDate) {
        // TODO Auto-generated method stub
        return false;
    }
}
