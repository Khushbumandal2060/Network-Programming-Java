import java.rmi.Naming;

public class PalindromeServer {
    public static void main(String args[]) {
        try{
            PalindromeImpl obj=new PalindromeImpl();
            Naming.rebind("palService",obj);
            System.out.println("Server Ready");
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
