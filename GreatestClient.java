import java.rmi.Naming;
import java.util.Scanner;

public class GreatestClient {
    public static void main(String[] args) {
        try {
            GreatestInterface obj = (GreatestInterface) Naming.lookup("rmi://localhost/greatService");
            Scanner sc = new Scanner(System.in);

            System.out.println("Enter 3 numbers:");
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            System.out.println("Greatest = " + obj.greatest(a, b, c));
        } catch (Exception e) {
            System.out.println("Client exception: " + e);
        }
    }
}
