import java.rmi.Naming;
import java.util.Scanner;


public class OddEvenClient {
    public static void main(String[] args) {
        try {
          OddEvenService obj = (OddEvenService) Naming.lookup("rmi://localhost/OddEvenService");
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            String result = obj.check(num);
            System.out.println("The number is: " + result);

        } catch (Exception e) {
            System.out.println("Client exception: " + e);
        }
    }
}
