package JunitPackageTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddstring {

	@Test
	public void test() {
		Test_Lab t = new Test_Lab();
		String result = t.addstring("hello", "bye");
		assertEquals("hellobye",result);
	}

}
