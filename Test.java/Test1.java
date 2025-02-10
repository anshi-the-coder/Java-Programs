public class Test1 {
    int eid;
    String ename;
public Test1(int e,String s)
{
eid=e;
ename=s;
}
public void display()
{
    System.out.println("eid="+eid);
    System.out.println("ename="+ename);
}
public static void main(String[] args) {
    Test1 t1=new Test1(101,"Neha");
    t1.display();
    Test1 t2=new Test1(102,"Jolly");
    t2.display();
}
}
