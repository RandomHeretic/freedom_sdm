package org.freedom;

import java.util.ArrayList;
import java.util.Arrays;

public class Board {
    private int[][] board;

    public Board(int n){
        if (n==8){
            board = new int[8][8];
        } else if (n==10) {
            board = new int[10][10];
        }else {
            board = new int[n][n];
        }

    }

    public int[][] giveBoard(){
        return board;
    }

    public int givePosition(int x,int y){
        return board[x][y];
    }
    public int givePosition(Move m){
        int[] xy = m.returnMove();
        return board[xy[0]][xy[1]];
    }

    public void applyMove(Move LastMove,int player){
        int[] m =LastMove.returnMove();
        board[m[0]][m[1]]=player;
    }
}
