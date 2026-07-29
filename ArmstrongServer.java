import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class ArmstrongServer extends UnicastRemoteObject implements ArmstrongService {

    public ArmstrongServer() throws RemoteException {}

    // Q4: Armstrong check
    public boolean check(int num) {
        int sum = 0, temp = num;

        // Count the number of digits
        int digits = String.valueOf(num).length();

        while (temp > 0) {
            int r = temp % 10;
            sum += Math.pow(r, digits); // raise digit to the power of digits
            temp /= 10;
        }
        return (sum == num);
    }

    public static void main(String[] args) {
        try {
           // LocateRegistry.createRegistry(1099);
            ArmstrongServer obj = new ArmstrongServer();
            Naming.rebind("rmi://localhost/ArmstrongService", obj);
            System.out.println("Armstrong Server ready (Q4)...");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
