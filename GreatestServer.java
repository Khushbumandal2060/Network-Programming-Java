import java.rmi.Naming;

public class GreatestServer {
    public static void main(String[] args) {
        try {
            // Start the RMI registry programmatically
           // LocateRegistry.createRegistry(1099); 

            GreatestImpl obj = new GreatestImpl();
            Naming.rebind("greatService", obj);

            System.out.println("Server Ready");
        } catch (Exception e) {
            System.out.println("Server exception: " + e);
        }
    }
}
