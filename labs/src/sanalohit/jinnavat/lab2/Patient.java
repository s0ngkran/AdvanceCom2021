package sanalohit.jinnavat.lab2;

public class Patient {
    public static void main(String[] args) {
        System.out.println("hi patient");
        System.out.println(args[0]);
        if (args.length == 3){
            System.out.println("suc");
        }else{
            System.out.println("err");
        }
    }
}
