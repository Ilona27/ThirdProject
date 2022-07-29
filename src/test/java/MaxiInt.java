import org.testng.annotations.Test;

public class MaxiInt {
    @Test
    public void checkArr(){
       int Check[] = {54,74,82,34,91,10000};
       int maxNum = Check[4];
       for(int j : Check){
           if(j > maxNum)
               maxNum = j;
       }
        System.out.println("Maximum value is " + maxNum );
    }
}
