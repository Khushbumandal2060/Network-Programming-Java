import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class SwingData {
public static void main(String[] args) {
JFrame f1=new JFrame("Registration form");
f1.setLayout(new FlowLayout());
f1.setSize(300,300);
JLabel l1=new JLabel("Name:");
JTextField t1=new JTextField(10);
f1.add(l1);f1.add(t1);
JLabel l2=new JLabel("Email:");
JTextField t2=new JTextField(10);
f1.add(l2);f1.add(t2);
JLabel l3=new JLabel("Username:");
JTextField t3=new JTextField(10);
f1.add(l3);f1.add(t3);
JLabel l4=new JLabel("Password:");
JPasswordField t4=new JPasswordField(10);
f1.add(l4);f1.add(t4);
JButton b1=new JButton("SignUp");
JLabel l5=new JLabel("Already has Account");
JButton b2=new JButton("Login");
f1.add(b1);f1.add(l5);f1.add(b2);
b1.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent e) {
String name="root";
String pass="";
String url="jdbc:mysql://localhost:3306/pk_students";
String sql1="Create table info(id int primary key auto_increment,name varchar(30),email varchar(30),username varchar(30),password varchar(30))";
String sql2="insert into info(name,email,username,password) " +
"values(?,?,?,?)";
try{
    Class.forName("com.mysql.cj.jdbc.Driver");
Connection con= DriverManager.getConnection(url,name,pass);
Statement st=con.createStatement();
PreparedStatement pst=con.prepareStatement(sql2);
st.executeUpdate(sql1);
pst.setString(1,t1.getText());
pst.setString(2,t2.getText());
pst.setString(3, t3.getText());
pst.setString(4,t4.getText());
pst.executeUpdate();
JOptionPane.showMessageDialog(null,"Data saved success");
JFrame f2=new JFrame("Login");
f2.setSize(300,300);
f2.setLayout(new FlowLayout());
JLabel l0=new JLabel("Logged in success");
f2.add(l0);
f2.setVisible(true);
}
catch(Exception ex){
System.out.println(ex.getMessage());
}
}
});
f1.setVisible(true);
}
}