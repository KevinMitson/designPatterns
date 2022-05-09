package state.state_exercise;

public class Active implements State {
    @Override
    public void setMode() {
        System.out.println("Account is good standing ");
    }
}
