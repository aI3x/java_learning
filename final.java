class SuperClass {
    public final void showSample() {
        System.out.println("One thing.");
    }
}

class SubClass extends SuperClass {
    public void showSample() { // cannot override final methods
        System.out.println("Another thing.");
    }
}