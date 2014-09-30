import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CheckDigitTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
	
	@Test
	public void testCheckLength() {
		assertTrue("This should be true",CheckDigit.checkLength(1234567890987L));
		assertTrue("This should be true",CheckDigit.checkLength(12345678909876L));
		assertTrue("This should be true",CheckDigit.checkLength(123456789098765L));
		assertTrue("This should be true",CheckDigit.checkLength(1234567890987654L));
		assertFalse("This shoudl be false", CheckDigit.checkLength(1L));
		assertFalse("This shoudl be false", CheckDigit.checkLength(12L));
		assertFalse("This shoudl be false", CheckDigit.checkLength(123L));
		assertFalse("This shoudl be false", CheckDigit.checkLength(1234L));
		assertFalse("This shoudl be false", CheckDigit.checkLength(12345L));
		assertFalse("This shoudl be false", CheckDigit.checkLength(123456L));
		assertFalse("This shoudl be false", CheckDigit.checkLength(1234567L));
		assertFalse("This shoudl be false", CheckDigit.checkLength(12345678L));
		assertFalse("This shoudl be false", CheckDigit.checkLength(123456789L));
		assertFalse("This shoudl be false", CheckDigit.checkLength(1234567890L));
		assertFalse("This shoudl be false", CheckDigit.checkLength(12345678901L));
		assertFalse("This shoudl be false", CheckDigit.checkLength(123456789012L));
		assertFalse("This shoudl be false", CheckDigit.checkLength(12345678901234567L));
	}
	
	@Test
	public void testCheckStart(){
		assertTrue("This should be true",CheckDigit.checkStart(4L));
		assertTrue("This should be true",CheckDigit.checkStart(37L));
		assertTrue("This should be true",CheckDigit.checkStart(5L));
		assertTrue("This should be true",CheckDigit.checkStart(6L));
		assertFalse("This should be false", CheckDigit.checkStart(1L));
		assertFalse("This should be false", CheckDigit.checkStart(2L));
		assertFalse("This should be false", CheckDigit.checkStart(36L));
		assertFalse("This should be false", CheckDigit.checkStart(7L));
		assertFalse("This should be false", CheckDigit.checkStart(8L));
		assertFalse("This should be false", CheckDigit.checkStart(9L));
		assertFalse("This should be false", CheckDigit.checkStart(0L));
	}

	@Test
	public void testIsValid(){
		assertTrue("This should be true", CheckDigit.isValid(4388576018410707L));
		assertFalse("This should be false", CheckDigit.isValid(4246345689049834L));
		
	}
	
}
