import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class Swap1 
{
    JFrame f1;
    JLabel l1,l2,l3;
    JTextField t1,t2,t3,t4;
    JButton b1;
    public Swap1()
    {
        f1=new JFrame("swap");
        f1.setLayout(null);
        l1=new JLabel("enter no 1");
        l2=new JLabel("enter no 2");
        l3=new JLabel("result");
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        t4=new JTextField();
        b1=new JButton("Swap");
        l1.setBounds(40,40,80,30);
        l2.setBounds(40,80,80,30);
        l3.setBounds(140,80,60,80);
        t1.setBounds(90,140,80,30);
        t2.setBounds(130,100,80,30);
        t3.setBounds(130,140,80,50);
        t4.setBounds(150,80,60,30);
        b1.setBounds(180,220,80,30);
    }
}
    
f1.add(l1);
f1.add(l2);
f1.add(l3);
f1.add(t1);
f1.add(t2);
f1.add(t3);
f1.add(t4);
f1.add(b1);
b1.addActionListener(this);
f1.setSize(600,600);
f1.setVisible(true);
public void actionPerformed(ActionEvent e)
{
    int a,b;
    if(e.getSource()==b1)
    {
        a=Integer.parseInt(t1.getText());
        b=Integer.parseInt(t2.getText());
        a=a+b;
        b=b-a;
        a=a-b;
        t3.setText(String.valueOf(a));
        t4.setText(String.valueOf(b));
    }
}
public static void main(String args[])
{
    new Swap1();
}


