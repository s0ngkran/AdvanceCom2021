package sanalohit.jinnavat.lab3;

import java.util.Scanner;

public class GuessNumberGame {
    public static void main(String[] args) {
        int target = (int) (Math.random()*10)+1;
        Scanner scanner = new Scanner(System.in);
        int remaining = 3;
        while (remaining > 0){
            System.out.print("Please enter a guess (1-10):");
            int guess_num = scanner.nextInt();
            if (target < guess_num){
                remaining -= 1;
                System.out.println("Please type lower number! Number of remaining tries:"+remaining);
            }
            else if (target > guess_num){
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
