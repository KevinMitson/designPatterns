package state.state_exercise;

public class Due implements State {
    @Override
    public void setMode() {
        System.out.println("Your account is in due state");
    }
}
