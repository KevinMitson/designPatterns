package state.state_exercise;

public class Unpaid implements State {
    @Override
    public void setMode() {
        System.out.println("Your account is in unpaid state");
    }
}
