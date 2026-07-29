
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class PalindromeImpl extends UnicastRemoteObject implements PalindromeInterface {

    PalindromeImpl() throws RemoteException {}

    public String checkPalindrome(int n) throws RemoteException {
        int rev=0,temp=n,r;
        while(n>0){
            r=n%10;
            rev=rev*10+r;
            n=n/10;
        }
        if(temp==rev)
            return "Palindrome";
        else
            return "Not Palindrome";
    }
}
