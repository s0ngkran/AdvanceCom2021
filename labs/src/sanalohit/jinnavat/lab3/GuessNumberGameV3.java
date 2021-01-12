package sanalohit.jinnavat.lab3;

import java.util.Scanner;

public class GuessNumberGameV3 {
    static int correctNum;
    static int minNum = 1, maxNum = 10;
    static int maxTries = 3;
    public static void main(String[] args) {
        configGame();
        genAnswer();
        playGames();
    }
    public static void configGame(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the max and the min values:");
        maxNum = scanner.nextInt();
        minNum = scanner.nextInt();
        System.out.print("Enter the number of tries:");
        maxTries = scanner.nextInt();
    }
    public static void genAnswer(){
        correctNum = minNum + (int) (Math.random() * ((maxNum-minNum)+1));
    }
    public static void playGames(){
        int guess;
        int maxTries_local = maxTries;
        Scanner scanner = new Scanner(System.in);
        while (true){
            while (maxTries_local > 0) {
                System.out.print("Please enter a guess (" + minNum + "-" + maxNum + "):");
                guess = scanner.nextInt();
                if (guess < minNum || guess >maxNum){
                    System.out.println("The guess number must be in the range " + minNum + " and " + maxNum);
                }
                else if (correctNum < guess) {
                    maxTries_local -= 1;
                    System.out.println("Please type lower number! Number of remaining tries:" + maxTries_local);
                }
                else if (correctNum > guess) {
                    maxTries_local -= 1;
                    System.out.println("Please type higher number! Number of remaining tries" + maxTries_local);
                }
                else {
                    System.out.println("Congratulations! That's correct");
                    break;
                }
            }
            System.out.print("If want to play again? type 'y' to continue or 'q' to quit:");
            if (scanner.next().equals("y")){
                maxTries_local = maxTries;
                genAnswer();
            }
            else{
                break;
            }
        }
    }
}
