public class BPBSD_00 {

	@Before
	public void setUp() {
		System.out.println("Before  any of the methods");
	}
	
	@After
	public void tearDown() {
		System.out.println("After all methods");
	}
}