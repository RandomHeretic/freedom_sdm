package org.freedom;

public class Move {
    private int x;
    private int y;
    public Move(int new_x,int new_y){
        x=new_x;
        y=new_y;
    }
    public int[] returnMove(){
        int[] m={x,y};
        return m;
    }

}
