package mockito.HomeTaskMokito;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class UseMockitoTest {

    @Test
    public void getResultOfMultiplicationTest() {
        Calculator calculator = Mockito.mock(Calculator.class);
        Mockito.when(calculator.getRandomNumber()).thenReturn(3);
        Mockito.when(calculator.getRandomNumberTwo()).thenReturn(5);
        Assert.assertEquals("Result of Multiplication should be 15", 15, calculator.getResultOfMultiplication());
    }
}
