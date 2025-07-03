package Java.Bridge.Assignment;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

class CalculatorTest {

	@Test
	void testCalculateSum() {
        Calculator calcMock = mock(Calculator.class);
        when(calcMock.add(2, 3)).thenReturn(5);

        int result = calcMock.add(2, 3);

        int result1 = calcMock.add(2, 3);

        assertEquals(5, result);
        verify(calcMock,times(2)).add(anyInt(), anyInt()); 
        verify(calcMock, never()).clear(); 

	}

}
