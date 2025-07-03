package Java.Bridge.Assignment;

import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class NoReturnTypeMethodsTest {
	static NoReturnTypeMethods nr;
	@BeforeAll
	static void setProperty() {
		nr= new NoReturnTypeMethods();
	}
	

	@Test
	void testAdd() {
		nr.add(2, 2);
		assertEquals(4, nr.getLastResult());
	}
	
	@Test
	void addAndPrint() {
		ByteArrayOutputStream out = new ByteArrayOutputStream();
	    System.setOut(new PrintStream(out));

	    nr.addAndPrint(2, 3);

	    assertTrue(out.toString().contains("5"));
	}
}
