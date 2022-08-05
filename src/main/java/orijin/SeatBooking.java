package orijin;

public class SeatBooking {
    private int bookingId;
    private String name;
    private int tableNumber;

    public SeatBooking(int bookingId, String name, int tableNumber){
        this.bookingId = bookingId;
        this.name = name;
        this.tableNumber = tableNumber;
    }

    public int getBookingId(){
        return bookingId;
    }

    public String getName(){
        return name;
    }

    public int getTableNumber(){
        return tableNumber;
    }

    public void setBookingId(int bookingId){
        this.bookingId = bookingId;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setTableNumber(int tableNumber){
        this.tableNumber = tableNumber;
    }



}
