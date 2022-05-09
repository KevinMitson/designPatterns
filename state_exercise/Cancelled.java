package state.state_exercise;

public class Cancelled implements State{
    @Override
    public void setMode() {
        System.out.println("Your account is in cancelled state");
    }
}
