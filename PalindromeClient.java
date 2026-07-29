import java.rmi.Naming;
import java.util.Scanner;

public class PalindromeClient {
    public static void main(String args[]) {
        try{
            PalindromeInterface obj=(PalindromeInterface)Naming.lookup("rmi://localhost/palService");
            Scanner sc=new Scanner(System.in);

            System.out.println("Enter number:");
            int n=sc.nextInt();

            System.out.println("Result="+obj.checkPalindrome(n));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
