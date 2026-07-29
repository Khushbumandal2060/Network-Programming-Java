import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class SumServer extends UnicastRemoteObject implements SumService {

    public SumServer() throws RemoteException {
        super();
    }

    public int sum(int a, int b, int c) throws RemoteException {
        return a + b + c;
    }

    public static void main(String[] args) {
        try {
            SumServer obj = new SumServer();
            //LocateRegistry.createRegistry(1099);
            Naming.rebind("rmi://localhost/SumService", obj);
            System.out.println("Sum Server is ready");
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
