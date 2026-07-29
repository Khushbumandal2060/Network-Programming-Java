import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class ReadUsingResult {
public static void main(String[] args) {
String name="root";
String pass="";
String url="jdbc:mysql://localhost:3306/pk_students";
try{
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con= DriverManager.getConnection(url,name,pass);
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("Select * from sem6th");
while(rs.next()){
System.out.println(rs.getInt(1)+" "
+rs.getString(2)+" "
+rs.getString(3));
}
}
catch(Exception e){
System.out.println(e.getMessage());
}
}
}