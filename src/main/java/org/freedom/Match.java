package org.freedom;

public class Match {
    private final State CurrentState;
    private int CurrentPlayer;

    public Match(int n){
        Board b = new Board(n);
        CurrentState = new State(b);
        CurrentPlayer = 1;
    }

    public State giveCurrentState(){
        return CurrentState;
    }

    public void applyAMove(Move NewMove){
        CurrentState.applyMove(NewMove,CurrentPlayer);
        if(CurrentPlayer==1){
            CurrentPlayer=2;
        }else {
            CurrentPlayer=1;
        }
    }

    public void printBoardState(){
        CurrentState.printState();
    }
}
