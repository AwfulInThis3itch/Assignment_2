import java.util.List;

/**
 * Created by User on 5/6/2017.
 */
public class MovieSession {

    private String movieName;
    private char rating;
    private Time sessionTime;
    private SeatReservation[][] sessionSeats;

    public static int NUM_ROWS;
    public static int NUM_COL;

    public MovieSession(String movieName, char rating, Time sessionTime) {
        this.movieName = movieName;
        this.rating = rating;
        this.sessionTime = sessionTime;
    }

    public static int convertRowToIndex(char rowLetter){

    }

    public static char convertIndexToRow(int rowIndex){

    }

    public String getMovieName() {
        return movieName;
    }

    public char getRating() {
        return rating;
    }

    public Time getSessionTime() {
        return sessionTime;
    }

    public static boolean getSeat(char row, int col) {

    }

    public boolean applyBooking(List<SeatReservation > reservationList0{

    }

    public void printSeats(){

    }

}
