import javax.swing.*;
public class Login 
{
 JFrame f1;
 JLabel l1,l2;
JTextField t1;
JPasswordField ps;
JButton b1;
public Login()
{
    f1=new JFrame("login form");
    f1.setLayout(null);
    l1=new JLabel("enter name"); 
    l2=new JLabel("enter password");
t1=new JTextField();
ps=new JPasswordField();
b1=new JButton("login");
l1.setBounds(40,40,80,30);
l2.setBounds(40,80,80,30);
t1.setBounds(140,40,80,30);
ps.setBounds(140,80,80,30);
b1.setBounds(90,140,80,30);
f1.add(l1);
f1.add(l2);
f1.add(t1);
f1.add(ps);
f1.add(b1);
f1.setSize(400,400);
f1.setVisible(true);
}
public static void main(String args[])
{
    new Login();
}
}
