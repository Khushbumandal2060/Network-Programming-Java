import java.rmi.Remote;
import java.rmi.RemoteException;

public interface ArmstrongService extends Remote {
    boolean check(int num) throws RemoteException;
}
