class Identifiers {

    public static void main(String args[]) {
        
        // legal
        int _a;
        int $c;
        int _____2_w;
        int _$;
        int this_is_a_very_long_identifier;
        
        // illegal
        int :b;
        int -d;
        int e#;
        int .f;
        int 7g;
  
    }
    
    // classes
    class Dog {}
    class Account {}
    class PrintWriter {}
    
    // interfaces
    interface Runnable {}
    interface Serializable {}
        
    // methods
    public static void getBalance() {}
    public static void doCalculation() {}
    public static void setCustomerName() {}
        
    // variables
    int buttonWidth;
    int accountBalance;
    String myString;
        
    // constants
    int MIN_HEIGHT;
    float PI;
}
