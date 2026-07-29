import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {
    public static void main(String[] args) {

        String name="root";
        String pass="";
        String url="jdbc:mysql://localhost:3306/pk_students";

        String sql="CREATE TABLE IF NOT EXISTS sem7th (" +
                "id INT PRIMARY KEY AUTO_INCREMENT," +
                "name VARCHAR(30)," +
                "address VARCHAR(40))";

        try{
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con= DriverManager.getConnection(url,name,pass);
            Statement st=con.createStatement();

            st.executeUpdate(sql);

            System.out.println("Table creation success");

            st.close();
            con.close();
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}