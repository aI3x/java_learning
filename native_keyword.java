public class DateTimeUtils {
    public native String getSystemTime();
    
    static {
        System.loadLibrary("nativedatetiemutils");
    }
}

// Testing native method
public class DateTimeUtilsManualTest {
    
    @BeforeClass
    public static void setUpClass() {
        // .. load other dependent libraries
        System.loadLibrary("nativedatetimeutils");
    }
    
    @Test
    public void givenNativeLibsLoaded_thenNativeMethodIsAccessible() {
        DateTimeUtils dateTimeUtils = new DateTimeUtils();
        LOG.info("System time is : " + dateTimeUtils.getSystemTime());
        assertNotNull(datetimeUtils.getSystemTime());
    }
}
