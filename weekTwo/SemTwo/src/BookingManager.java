import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class BookingManager {
    List<Booking> bookings;

    public BookingManager() {
        bookings = new ArrayList<Booking>();
    }

    public void addBooking(Booking booking) {
        bookings.add(booking);
    }
    public int getNumberOfBookings() {
        return bookings.size();
    }
    public double getTotalBookingValue() {
        double total = 0;
        for (Booking booking : bookings) {
            total += booking.getTotalCost();
        }
        return total;
    }
    public void clearBookings() {
        bookings.clear();
    }
    public List<Booking> getAllBookings() {
        return bookings;
    }
    public List<Booking> getAllBookingsByMonth(String month) {
        List<Booking> bookingsInMonth = List.of();
        for (Booking booking : bookings) {
            if (booking.getStartDate().getMonthValue() == Integer.parseInt(month)) {
                bookingsInMonth.add(booking);
            }
        }
        return bookingsInMonth;
    }
}
