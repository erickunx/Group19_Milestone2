
package obj;

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


    public boolean occursOn(LocalDate testDate){
        //Fixed bad operand type for binary operator '>=' error in testing
        //Using LocalDate comparison method to compare dates
        if((testDate.isAfter(getStartDate()) || testDate.equals(getStartDate()))
                && (testDate.isBefore(getEndDate()) || testDate.equals(getEndDate()))){
            return true;
        }
        else{
            return false;
        }
    }

    @Override
    public String toString() {
        return String.format("%s: %s - %s", description, startDate, endDate);
    }


    @Override
    public final boolean equals(Object o) {
        if (this == o)     return true;
        if(!(o instanceof Appointment that)) return false;
        return that.toString().equals(this.toString());
    }

    @Override
    public int hashCode() {
        return toString().hashCode();
    }

    

    
     

}

   
