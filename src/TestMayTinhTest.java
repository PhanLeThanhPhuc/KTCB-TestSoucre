
import javax.annotation.processing.Generated;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
@Generated(value = "org.junit-tools-1.1.0")
public class TestMayTinhTest {

	private TestMayTinh createTestSubject() {
		return new TestMayTinh();
	}

//	@MethodRef(name = "MinDay", signature = "([I)I")
	@Test
	public void testMinDay() throws Exception {
		TestMayTinh testSubject;
		int[] x = new int[] { 5,6,7,4,3,4,5,6 };
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.MinDay(x);
		int kq = 2;
		assertEquals(result, kq);
	}

//	@MethodRef(name = "MaxDay", signature = "([I)I")
	@Test
	public void testMaxDay() throws Exception {
		TestMayTinh testSubject;
		int[] x = new int[] { 20,0,1 };
		int result;

		// default test
		testSubject = createTestSubject();
		result = testSubject.MaxDay(x);
		int kq = 20;
		assertEquals(result, kq);
	}
}