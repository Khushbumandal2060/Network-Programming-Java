import java.rmi.*;

public class ArmstrongClient {
    public static void main(String[] args) {
        try {
            ArmstrongService s = (ArmstrongService) Naming.lookup("rmi://localhost/ArmstrongService");
            int num=153;
            System.out.println(num+"is Armstrong?" + s.check(num));
        } catch(Exception e) {
            System.out.println(e);
        }
    }
}
