import org.testng.Assert;
import org.testng.annotations.Test;

public class Factorial1 {
    @Test

    public void checkFactorial(){
        Assert.assertTrue(Factorial(3) == 6);
        Assert.assertTrue(Factorial(2) == 2);
        Assert.assertTrue(Factorial(4) == 24);
        Assert.assertTrue(Factorial(5) == 120);
    }

    public int Factorial(int n){
        int result = 1;
        if(n == 1 || n == 0){
            return result;
        }
        int arr[] = new int[n];
        for( int i = n; i > 0; i--){
            arr[i-1] = i;
        }for(int elementInArr : arr){
            result = result*elementInArr;
        } return result;
    }
}

