import java.rmi.Remote;
import java.rmi.RemoteException;

public interface GreatestInterface extends Remote {
    int greatest(int a, int b, int c) throws RemoteException;
}
