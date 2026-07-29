import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class CreateDatabase
{
public static void main(String[] args) {
String name="root";
String pass="";
String url="jdbc:mysql://localhost:3306";
String sql="Create database padmakanya_Students";
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection(url,name,pass);
Statement st=con.createStatement();
st.executeUpdate(sql);
System.out.println("Database creation success");
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}
