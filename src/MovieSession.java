import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.Arrays;
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
        int i = (int)rowLetter;
     if(i <= 64 || i >= 91){
         System.out.println("Try again not the right index format");
     }else{
         i = i - 'A';   // Converts A to 0 ,B to 1, C to 2 etc
     }
        return i;
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

        return  ;
    }

    public boolean isSeatAvailable(char row, int col){

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

    @Override
    public String toString() {
        return "MovieSession{" +
                "movieName='" + movieName + '\'' +
                ", rating=" + rating +
                ", sessionTime=" + sessionTime +
                ", sessionSeats=" + Arrays.toString(sessionSeats) +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<MovieSession> Movie = new ArrayList<MovieSession>();
        Time time = new Time(2,4,56);
        Time time2 = new Time (14,44,2);

        time.compareTo(time2); //test time class
        convertRowToIndex('A');
    }
}
