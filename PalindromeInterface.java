import java.rmi.Remote;
import java.rmi.RemoteException;

public interface PalindromeInterface extends Remote {
    String checkPalindrome(int n) throws RemoteException;
}
