public class interfaces {

    public static void main(String args[]) {
        
    }
    
    public interface Bounceable {
        
        // all are the same
        void bounce();
        public void bounce();
        abstract void bounce();
        public abstract void bounce();
        abstract public void bounce();
        
        // won't compile
        final void bouce();
        private void bounce();
        protected void bounce();
        
        // constant
        public static final int PI = 2;
        
        // all are the same
        public int x = 1;
        int x = 1;
        static int x = 1;
        final int x = 1;
        public static int x = 1;
        public final int x = 1;
        static final int x = 1;
        public static final int x = 1;
        
        // default keyword use
        default int m1() {return 1;} // legal
        public default void m2() {;} // legal
        
        static default void m3() {;} // illegal
        default void m4(); // illegal, no body
    }
}
