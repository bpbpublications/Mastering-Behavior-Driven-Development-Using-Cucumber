package stepdefinitions;



import constants.GLOBAL_DATA;
import cucumber.api.java.Before;
import singletondriver.SingletonDriver;

public class BPBSD_0 {
	
	
	public void setUp() {
		System.out.println("Before  any of the methods");
		try {
			SingletonDriver.getInstance().setDrvr(GLOBAL_DATA.BRWSR, GLOBAL_DATA.PLTFRM, GLOBAL_DATA.ENVRNMNT, null);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
