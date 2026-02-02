package org.freedom;

public class State {
    private Board CurrentBoard;
    private Move LastMove;

    public State(Board Old_Board, Move Last_Move, int Player){
        LastMove=Last_Move;
        CurrentBoard=Old_Board;
        CurrentBoard.applyMove(LastMove,Player);
    }

    public Board giveBoard(){
        return CurrentBoard;
    }

    public int giveBoardPosition(Move m){
        return CurrentBoard.givePosition(m);
    }
    public int giveBoardPosition(int x,int y){
        return CurrentBoard.givePosition(new Move(x,y));
    }

    public Move giveLastMove(){
        return LastMove;
    }
}
