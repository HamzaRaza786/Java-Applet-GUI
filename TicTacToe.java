package tictactoe;

import java.util.*;

public class TicTacToe {
public static Scanner in=new Scanner(System.in);
private int[][] game=new int[3][3];
private int xcoor1=-1,ycoor1=-1,xcoor2=-1,ycoor2=-1;
private boolean Win=false;

public TicTacToe(){
}
public void printboard(){
    System.out.println(" Y           (0)  (1)  (2)");
   System.out.print("X   (0)   ");
    for(int i=0;i<3;i++){
        for(int j=0;j<3;j++)
            System.out.printf("    "+this.game[i][j]);
        if(i!=2){
        int k=i+1;
        System.out.printf("\n    ("+ k +")   ");}
    }
    System.out.println();
}
private void InvalidMove(){
    while(this.game[this.xcoor1][this.ycoor1]!=0){
        System.out.println("Invalid Move");
        System.out.print( "Enter x-coordinate again 0-2: ");
    xcoor1=in.nextInt();
    System.out.print(" Enter y-coordinate again 0-2: ");
    ycoor1=in.nextInt();}
    }
private void InvalidMove2(){
    while(this.game[this.xcoor2][this.ycoor2]!=0){
        System.out.println("Invalid Move");
        System.out.print( "Enter x-coordinate again 0-2: ");
    xcoor2=in.nextInt();
    System.out.print(" Enter y-coordinate again 0-2: ");
    ycoor2=in.nextInt();}
    }

public void setPlayer1Move(){
    System.out.print("Player 1 enter x-coordinate 0-2: ");
    xcoor1=in.nextInt();
    System.out.print("Player 1 enter y-coordinate 0-2: ");
    ycoor1=in.nextInt();
    if(this.game[this.xcoor1][this.ycoor1]!=0){
        this.InvalidMove();}
      this.game[this.xcoor1][this.ycoor1]=1;
      this.printboard();
      this.WinnerMove();}
     public void setPlayer2Move(){
    System.out.print("Player 2 enter x-coordinate 0-2: ");
    xcoor2=in.nextInt();
    System.out.print("Player 2 enter y-coordinate 0-2: ");
    ycoor2=in.nextInt();
    if(this.game[this.xcoor2][this.ycoor2]!=0)
    this.InvalidMove2();
    this.game[this.xcoor2][this.ycoor2]=5;
    this.WinnerMove();
    this.printboard();}
public void TicTacToegame(){
    int c=0;
    System.out.printf("**WELCOME TO THE GAME**\n\n");
    this.printboard();
    for(int i=0;i<9;i+=2)
    {   this.setPlayer1Move();
        
        if(this.Win==true){
            c++;
            break;}
       if (i<7){
        this.setPlayer2Move();
        
        if(this.Win==true){
            c++;
            break;}}
    }
    if(c==0)
       System.out.println("It's a Draw");
        
}

    public void WinnerMove(){
        int row0=this.game[0][0]+this.game[0][1]+this.game[0][2];
        int row1=this.game[1][0]+this.game[1][1]+this.game[1][2];
        int row2=this.game[2][0]+this.game[2][1]+this.game[2][2];
        int col0=this.game[0][0]+this.game[1][0]+this.game[2][0];
        int col1=this.game[0][1]+this.game[1][1]+this.game[2][1];
        int col2=this.game[0][2]+this.game[1][2]+this.game[2][2];
        int di1=this.game[0][0]+this.game[1][1]+this.game[2][2];
        int di2=this.game[0][2]+this.game[1][1]+this.game[2][0];
        if (row0==3 || row1==3 || row2==3 || col0==3 || col1==3 || col2==3 || di1==3 || di2==3) {
            System.out.println("PLAYER 1 WINS!");
            this.Win=true;}
        if (row0==15 || row1==15 || row2==15 || col0==15 || col1==15|| col2==15 || di2==15 || di2==15) {
            System.out.println("PLAYER 2 WINS!");
        this.Win=true;}
    }
   public static void main(String[] args){
       TicTacToe t=new TicTacToe();
       t.TicTacToegame();
      
       
    }

}
