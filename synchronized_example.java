public class synchronized_example {

    /**
     * synchronized keyword indicates that a method can
     * be accessed by one thread at a time
     */
    
    public synchronized Record retrieveUserInfo(int id) {return 1;}
    private synchronized Record retrieveUserInfo(int id) {return 1;}
    protected synchronized Record retrieveUserInfo(int id) {return 1;}
}
