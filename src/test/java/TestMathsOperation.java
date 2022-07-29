import org.testng.Assert;
import org.testng.annotations.Test;

public class TestMathsOperation {
    @Test
    public void checkSumm(){
//        summ(4, 5) expected 9
        Assert.assertTrue(summ(4, 5) == 9);
//        summ(2, 6) expected 8
        Assert.assertTrue(summ(2, 6) == 8);
//        summ(34, 6) expected 40
        Assert.assertTrue(summ(34, 6) == 40);

    }
    @Test
    public void checkMult(){
        Assert.assertTrue(mult(4, 5) == 20);
        Assert.assertTrue(mult(4, 8) == 32);
        Assert.assertTrue(mult(7, 6) == 42);
    }
    public int summ(int a, int b ){
        return a + b;
    }
    public int mult(int a, int b){
        return a * b;
    }
}
