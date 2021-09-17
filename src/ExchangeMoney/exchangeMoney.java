package ExchangeMoney;
import java.util.Scanner;
public class exchangeMoney {
    public static void main(String[] args) {
        double vnd=23000;
        double usd;
        Scanner scanner=new Scanner(System.in);
        System.out.println("How many USD hah?");
        usd=scanner.nextDouble();
        double change=usd*vnd;
        System.out.println("Value in VND is "+change);
    }

}
