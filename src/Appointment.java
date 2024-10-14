import java.time.LocalDate;


public class Appointment{
    private String description;
    private LocalDate startDate;
    private LocalDate endDate;



    public Appointment(String description, LocalDate startDate, LocalDate endDate) {
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    /**
     * occursOn” which takes a LocalDate object and
returns a boolean (true if the input >= start date and <= end date)

     */

    public boolean occursOn(LocalDate testDate){
        if(testDate >= getstartDate() && testDate <= getEndDate()){
            return true;
        }
        else{
            return false;
        }
    }
     

}

   




// Written by Eric Wang