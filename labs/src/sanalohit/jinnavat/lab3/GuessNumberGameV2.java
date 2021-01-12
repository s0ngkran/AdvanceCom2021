package sanalohit.jinnavat.lab3;

import java.util.Scanner;

public class GuessNumberGameV2 {
    static int correctNum;
    static int minNum = 1, maxNum = 10;
    public static void main(String[] args) {
        genAnswer();
        playGame();
    }
    public static void genAnswer(){
        correctNum = minNum + (int) (Math.random()*((maxNum-minNum)+1));
    }
    public static void playGame(){
        Scanner scanner = new Scanner(System.in);
        int remaining = 3;
        while (remaining > 0){
            System.out.print("Please enter a guess (1-10):");
            int guess_num = scanner.nextInt();
            if (correctNum < guess_num){
                remaining -= 1;
                System.out.println("Please type lower number! Number of remaining tries:"+remaining);
            }
            else if (correctNum > guess_num){
                remaining -= 1;
                System.out.println("Please type higher number! Number of remaining tries"+remaining);
            }
            else{
                System.out.println("Congratulations! That's correct");
                break;
            }
        }
    }
}
