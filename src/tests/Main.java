package tests;

import java.time.LocalDate;
import obj.*;

public class Main {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2024, 10, 10);
        LocalDate end = LocalDate.of(2024, 10, 20);
        Appointment a1 = new Appointment(a1, start, end);
        System.out.println(a1);
        
    }
}
