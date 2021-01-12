package sanalohit.jinnavat.lab2;

public class ChangeMachine {
    public static void main(String[] args) {
        if (args.length == 4){
            int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            int c = Integer.parseInt(args[2]);
            int d = Integer.parseInt(args[3]);
            double total;
            total = a + b*2 +c*5+d*10;
            int bill_1000 = (int) total/1000;
            int bill_500 = (int) (total-1000*bill_1000)/500;
            int bill_100 = (int) (total-1000*bill_1000-500*bill_500)/100;
            int bill_20 = (int) (total-1000*bill_1000-500*bill_500-100*bill_100)/20;
            int remain = (int) total-1000*bill_1000-500*bill_500-100*bill_100-20*bill_20;
            System.out.println("total= "+total);
            System.out.println("1000-bill= "+bill_1000);
            System.out.println("500-bill= "+bill_500);
            System.out.println("100-bill=" +bill_100);
            System.out.println("20-bill= "+bill_20);
            System.out.println("remain= " +remain);

        }else{
            System.out.println("not enough args");
        }

    }
}
