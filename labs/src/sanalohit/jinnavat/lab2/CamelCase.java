package sanalohit.jinnavat.lab2;
import java.util.Locale;
import java.util.Scanner;
public class CamelCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("your <firstname> <lastname> = ");
        String firstname = sc.next(), lastname = sc.next();
        firstname = camel(firstname);
        lastname = camel(lastname);
        System.out.println(firstname+lastname);
    }
    public static String camel(String name){
        String camelName ;
        camelName = name.substring(0,1).toUpperCase(Locale.ROOT);
        camelName += name.substring(1,name.length()).toLowerCase(Locale.ROOT);
        return camelName;
    }

}
