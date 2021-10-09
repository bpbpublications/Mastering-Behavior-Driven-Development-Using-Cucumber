public class BPBSD_3 {
	@Given("a book named {string} by Pinakin Chaubal with following body")
	public void a_book_named_by_Pinakin_Chaubal_with_following_body(String bookName, String description) throws Throwable {
		System.out.println("The name of the book is: "+bookName+" and the detail about the author is: "+description);
	}

}