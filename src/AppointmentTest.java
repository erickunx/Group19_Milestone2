package Tests;
import Appointment.Appointment;

import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;

import static org.junit.Assert.assertEquals;

public class AppointmentTest {
    private Appointment appointment;

    @Before
    public void setup() {
        //setup appointment object
        LocalDate startDate = LocalDate.of(2024, 10, 11);
        LocalDate endDate = LocalDate.of(2024, 10, 13);
        appointment = new Appointment("test", startDate, endDate);
    }

    @Test
    public void testBeforeStartDate() {
        //test date before appointment start date
        //should return false
        LocalDate beforeStart = LocalDate.of(2024, 10, 10);
        boolean actual = appointment.occursOn(beforeStart);
        boolean expected = false;
        assertEquals("Demo Before Start", expected, actual);
    }

    @Test
    public void testOnStartDate() {
        //test date on appointment start date
        //should return true
        LocalDate onStart = LocalDate.of(2024, 10, 11);
        boolean actual = appointment.occursOn(onStart);
        boolean expected = true;
        assertEquals("Demo On Start", expected, actual);
    }

    @Test
    public void testBetweenDates() {
        //test date between appointment start and end dates
        //should return true
        LocalDate between = LocalDate.of(2024, 10, 12);
        boolean actual = appointment.occursOn(between);
        boolean expected = true;
        assertEquals("Demo Between Dates", expected, actual);
    }

    @Test
    public void testOnEndDate() {
        //test date on appointment end date
        //should return true
        LocalDate onEnd = LocalDate.of(2024, 10, 13);
        boolean actual = appointment.occursOn(onEnd);
        boolean expected = true;
        assertEquals("Demo On End", expected, actual);
    }

    @Test
    public void testAfterEndDate() {
        //test date after appointment end date
        //should return false
        LocalDate afterEnd = LocalDate.of(2024, 10, 14);
        boolean actual = appointment.occursOn(afterEnd);
        boolean expected = false;
        assertEquals("Demo After End", expected, actual);
    }
}