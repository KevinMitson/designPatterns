package state.state_exercise;

public class MembersAccount {
    private String name;

   private State state;

    public MembersAccount(State state) {
        this.state = state;
    }
    public void myState(){
        state.setMode();
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
