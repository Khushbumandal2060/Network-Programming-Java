import java.rmi.Naming;

public class PrimeClient {
    public static void main(String[] args) {
        try {
            // Lookup the remote object
            PrimeService s = (PrimeService) Naming.lookup("rmi://localhost/PrimeService");

            // Test numbers
            int[] numbers = {17, 20, 1, 2, 19};

            for (int num : numbers) {
                System.out.println("Number " + num + " is " + s.check(num));
            }

        } catch (Exception e) {
            System.out.println("Client exception: " + e);
        }
    }
}
