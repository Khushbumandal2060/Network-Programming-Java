import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// Server class implementing remote interface
public class OddEvenServer extends UnicastRemoteObject implements OddEvenService {

    public OddEvenServer() throws RemoteException {}

    // Implementation of remote method
    public String check(int num) throws RemoteException {
        if (num % 2 == 0)
            return "Even";
        else
            return "Odd";
    }

    public static void main(String[] args) {
        try {
            // Start RMI registry programmatically
            //java.rmi.registry.LocateRegistry.createRegistry(1099);

            OddEvenServer obj = new OddEvenServer();
            Naming.rebind("OddEvenService", obj);

            System.out.println("OddEven Server is ready");
        } catch (Exception e) {
            System.out.println("Server exception: " + e);
        }
    }
}
