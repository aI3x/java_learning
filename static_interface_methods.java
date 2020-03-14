interface StaticIface {
        static int m1() { return 42; } // legal
        public static void m2() { ; } // legal
        
        // final static void m3() { ; } // illegal, final not allowed
        // abstract static void m4() { ; } // illegal, abstract not allowed
        // static void m5(); // illegal, needs a method body
    }

public class static_interface_methods implements StaticIface {
    
    public static void main(String args[]) {
        
        System.out.println(StaticIface.m1());
        
        new static_interface_methods().go();
        // System.out.println(m1()); // illegal, reference to interface required
    }
    
    void go() {
        System.out.println(StaticIface.m1()); // legal from an instance
    }
 }
