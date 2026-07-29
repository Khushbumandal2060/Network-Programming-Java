import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class InsertData {
public static void main(String[] args) {
String name="root";
String pass="";
String url="jdbc:mysql://localhost:3306/PK_Students";
String sql="insert into sem6th(id,name,address) values ('4','ram','kalanki')";
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con= DriverManager.getConnection(url,name,pass);
Statement st=con.createStatement();
st.executeUpdate(sql);
System.out.println("Data insertion success");
}
catch(Exception e)
{
System.out.println(e.getMessage());
}
}
}