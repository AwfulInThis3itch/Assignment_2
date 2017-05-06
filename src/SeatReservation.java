/**
 * Created by User on 5/5/2017.
 */
 abstract class SeatReservation {
    private char row;
    private  int column;
    protected  boolean complementary;


    public char getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    public void setComplementary(boolean complementary) {
        this.complementary = complementary;
    }

   public abstract float getTicketPrice();

    public SeatReservation(char row, int column) {
        this.row = row;
        this.column = column;
    }
}
