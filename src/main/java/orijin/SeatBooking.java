package orijin;

public class SeatBooking {
    private int bookingId;
    private String name;
    private int peopleNum;

    public SeatBooking(int bookingId, String name, int tableNumber){
        this.bookingId = bookingId;
        this.name = name;
        this.peopleNum = tableNumber;
    }

    public int getBookingId(){
        return bookingId;
    }

    public String getName(){
        return name;
    }

    public int getPeopleNum(){
        return peopleNum;
    }

    public void setBookingId(int bookingId){
        this.bookingId = bookingId;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setPeopleNum(int tableNumber){
        this.peopleNum = tableNumber;
    }



}
