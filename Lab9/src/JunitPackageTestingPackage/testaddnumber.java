package JunitPackageTestingPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testaddnumber {

	@Test
	public void test() {
		Test_Lab t = new Test_Lab();
		int result = t.addnumber(300, 500);
		assertEquals(800,result);
	}

}
