public class Cast {

    public class A{
        
        public void print(){
            System.out.println("A");
        }
    }
    public class B extends A{
        public void print(){
            System.out.println("B");
        }
    }
    public class C extends B{
        public void print(){
            System.out.println("C");
        }
    }
    public class D extends C{
        public void print(){
            System.out.println("D");
        }
    }

    public static void main(String[] args) {
        Cast cast=new Cast();
        Cast.A a = cast.new A();
        Cast.B b=cast.new B();
        a = (A) b; // Upcasting B to A (implicit casting)
        Cast.C c=cast.new C();
        a=c;
        a.print();
    }

}
