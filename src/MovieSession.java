import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by User on 5/6/2017.
 */
public class MovieSession implements Comparable {

    private String movieName;
    private char rating;  //G,R,or M
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
        return (int)rowLetter;
    }

    public static char convertIndexToRow(int rowIndex){
        return (char)rowIndex;
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

    public SeatReservation getSeat(char row, int col) {

        return ;
    }

    public boolean isSeatAvaukabke(char row, int col){
        return true;
    }


    public boolean applyBooking(List<SeatReservation> reservationList){
        return true;
    }

    public void printSeats(){

    }

    @Override
    public int compareTo(@NotNull Object o) {
        return 0;
    }



    public static void main(String[] args) {
        ArrayList<MovieSession> Movie = new ArrayList<MovieSession>();


    }
}
