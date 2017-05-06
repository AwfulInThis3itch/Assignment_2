/**
 * Created by User on 5/6/2017.
 */
 class ElderlyReservation extends SeatReservation{

    private boolean ifComplementray;

    @Override
    public float getTicketPrice() {
        if(ifComplementray){//true
            return 0f;
        }else{
            return 8.f;
        }
    }

    @Override
    public void setComplementary(boolean complementary) {
        super.setComplementary(complementary);
    }

    public ElderlyReservation(char row, int column) {
        super(row, column);
    }
}
