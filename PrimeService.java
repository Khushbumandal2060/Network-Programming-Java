import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PrimeService extends Remote {
    String check(int num) throws RemoteException;
}
