import java.util.*; 
public class Test3 {
    int eid;
    String ename;
public Test3(int e,String s)
{
    eid=e;
    ename=s;
public void display()
{
    System.out.println("Eid="+eid);
    System.out.println("Ename="+ename);
}
public static void main(String[] args) {
    Test t1=new Test(101,"Neha");
    t1.display();
    Test t2=new Test(102,"Jolly");
    t2.display();
}
}
}
