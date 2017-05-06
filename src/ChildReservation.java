/**
 * Created by User on 5/6/2017.
 */
class ChildReservationextends extends SeatReservation {

    private boolean ifComplementray;

    @Override
    public float getTicketPrice() {
        if(ifComplementray){//true
            return 0f;
        }else{
            return 8.75f;
        }
    }

    @Override
    public void setComplementary(boolean complementary) {
        super.setComplementary(complementary);
        ifComplementray = super.complementary;
    }

    public ChildReservationextends(char row, int column) {
        super(row, column);
    }
}
