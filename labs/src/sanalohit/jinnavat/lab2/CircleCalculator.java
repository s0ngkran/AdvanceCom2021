package sanalohit.jinnavat.lab2;

public class CircleCalculator {
    public static void main(String[] args) {
        if (args.length == 1){
            double radius = Double.parseDouble(args[0]);
            double area = Math.PI*radius*radius;
            double circum = Math.PI*2*radius;
            System.out.println("radius= "+radius);
            System.out.printf("area= %.2f\n",area);
            System.out.printf("circumference= %.2f",circum);

        }
        else{
            System.out.println("err");
        }
    }
}
