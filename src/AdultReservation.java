/**
 * Created by User on 5/6/2017.
 */
 class AdultReservation extends SeatReservation {

    private boolean ifComplementray;

    @Override
    public void setComplementary(boolean complementary) {
        super.setComplementary(complementary);
        ifComplementray = super.complementary;
    }


    @Override
    public float getTicketPrice() {
        if(ifComplementray){//true
            return 0f;
        }else{
            return 12.50f;
        }
    }

    public AdultReservation(char row, int column) {
        super(row, column);
    }
}
