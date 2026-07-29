import java.rmi.Remote;
import java.rmi.RemoteException;

// Remote interface
public interface OddEvenService extends Remote {
    String check(int num) throws RemoteException;
}
