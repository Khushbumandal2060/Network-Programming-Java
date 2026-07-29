import javax.sql.rowset.JdbcRowSet;
import javax.sql.rowset.RowSetProvider;
public class RowSetExample {
public static void main(String[] args) {
try{
Class.forName("com.mysql.cj.jdbc.Driver");
JdbcRowSet rs= RowSetProvider.newFactory().createJdbcRowSet();
rs.setUsername("root");
rs.setPassword("");
rs.setUrl("jdbc:mysql://localhost:3306/pk_students");
rs.setCommand("Select * from sem6th");
rs.execute();
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
