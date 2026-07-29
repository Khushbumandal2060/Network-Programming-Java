import java.rmi.*;

public class SumClient {
    public static void main(String[] args) {
        try {
            SumService s = (SumService) Naming.lookup("rmi://localhost/SumService");
            System.out.println("Sum :" + s.sum(10,20,30));
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
