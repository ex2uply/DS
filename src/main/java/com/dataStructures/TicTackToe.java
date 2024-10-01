package com.dataStructures;

import java.util.Arrays;
import java.util.Scanner;

public class TicTackToe {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        for (char[] chars : board) {
            Arrays.fill(chars, ' ');
        }
        char player = 'X';
        boolean gameOver = false;
        Scanner scanner = new Scanner(System.in);
        while(!gameOver){
            printBoard(board);
            System.out.println("Player "+ player +" Enter the row col: ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            if(board[row][col] == ' '){
                board[row][col] = player;
                gameOver = haveWon(board,player);
                if(gameOver){
                    System.out.println("Player "+ player + " has won. ");
                }
                else{
                    player =  (player == 'X') ? 'O': 'X';
                }
            }else{
                System.out.println("Invalid Move: Already full");
            }
        }
        printBoard(board);

    }

    private static boolean haveWon(char[][] board, char player) {
        for (char[] chars : board) {
            if (chars[0] == player && chars[1] == player && chars[2] == player) {
                return true;
            }
        }
        for(int col = 0; col < board.length;col++){
            if(board[0][col] == player && board[1][col] == player && board[2][col] == player){
                return true;
            }
        }

        if(board[0][0] == player && board[1][1] == player && board[2][2] == player || board[0][2] == player && board[1][1] == player && board[2][0] == player){
            return true;
        }

        return  false;
    }

    private static void printBoard(char[][] board) {
        for (char[] chars : board) {
            System.out.println(Arrays.toString(chars));
        }
    }

}
