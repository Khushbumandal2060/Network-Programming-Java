import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PrimeServer extends UnicastRemoteObject implements PrimeService {

    // Constructor
    public PrimeServer() throws RemoteException {}

    // Check if a number is prime
    public String check(int num) {
        if (num <= 1) return "Neither Prime nor Composite";
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return "Composite";
        }
        return "Prime";
    }

    public static void main(String[] args) {
        try {
            // Start RMI registry on default port 1099
        
            // Create server object
            PrimeServer obj = new PrimeServer();

            // Bind object in registry
            Naming.rebind("rmi://localhost/PrimeService", obj);

            System.out.println("Prime Server ready...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
