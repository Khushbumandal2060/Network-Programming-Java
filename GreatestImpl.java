import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class GreatestImpl extends UnicastRemoteObject implements GreatestInterface {

    // Constructor must throw RemoteException
    public GreatestImpl() throws RemoteException {}

    // Implementation of remote method
    public int greatest(int a, int b, int c) throws RemoteException {
        if (a > b && a > c)
            return a;
        else if (b > c)
            return b;
        else
            return c;
    }
}
