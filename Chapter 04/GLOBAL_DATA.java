public class GLOBAL_DATA {
	    // constant variables
	    public static final String BRWSR = "chrome";
	    public static final String PLTFRM = "Windows 10";
	    public static final String ENVRNMNT = "local";
	    public static String DEFLT_BRWSR = null;
	    public static String DEFLT_PLTFRM = null;
	    public static String DEFLT_ENVRNMNT = null;
	    public static String PROPTS_PATH = null;

	    // driver class default values
	    public static String propFile = "src/main/resources/selenium.properties";
	    public static final String SE_PROPRTS =
	    new File(propFile).getAbsolutePath();

	    // test output path default values
	    public static final String TEST_OUTPT_PTH = "testOutput/";
	    public static final String LOGFLE_PTH = TEST_OUTPT_PTH + 
	    "Logs/";
	    public static final String REPORT_PTH = TEST_OUTPT_PTH + 
	    "Reports/";
	    public static final String IMAGE_PATH = TEST_OUTPT_PTH + 
	    "Images/";

	    // timeout default values
	    public static final int TIMEOUT_MNT = 60;
	    public static final int TIMEOUT_SCND = 1;
	    public static final int TIMEOUT_ZR = 0;
	}
