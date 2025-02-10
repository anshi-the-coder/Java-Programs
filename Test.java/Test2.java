import java.util.*;
public class Tset {
    class A
    {
        public void dis()
        {
            System.out.println("hello A");
        }
    }
    class B extends A{
        public void show()
        {
            System.out.println("hello B");
        }
    }
    class C extends B{
        public void kool()
        {
            System.out.println("hello C");
        }
    }
    class Tset
    {
        public static void main(String[] args) {
            B b1=new B();
              b1.dis();
              b1.show();
              C c1=new C();
              c1.dis();
              c1.show();
              c1.kool();

        }
    }
}
