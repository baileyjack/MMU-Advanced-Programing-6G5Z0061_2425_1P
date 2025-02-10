import java.time.LocalDate;

public class Booking {
    LocalDate startDate;
    int numberOfNights;
    double costPerNight;

    public LocalDate getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }
    public int getNumberOfNights() {
        return numberOfNights;
    }
    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }
    public double getCostPerNight() {
        return costPerNight;
    }
    public void setCostPerNight(double costPerNight) {
        this.costPerNight = costPerNight;
    }
    public double getTotalCost() {
        return costPerNight * numberOfNights;
    }
}
