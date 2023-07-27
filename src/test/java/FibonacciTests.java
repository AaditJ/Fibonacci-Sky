import org.junit.Assert;
import org.junit.Test;
import org.sky.Fibonacci;

public class FibonacciTests {
    @Test
    public void normalCase(){

        Assert.assertEquals(34, Fibonacci.FibCalc(10));
    }

    @Test
    public void test4(){

        Assert.assertEquals(2, Fibonacci.FibCalc(4));
    }

    @Test
    public void test5(){
        Assert.assertEquals(12586269025L, Fibonacci.FibCalc(51));
    }

    @Test
    public void test0(){
        Assert.assertEquals(-1, Fibonacci.FibCalc(0));
    }

    @Test
    public void testOutOfBounds(){
        Assert.assertEquals(-1, Fibonacci.FibCalc(-12341));
    }
}
