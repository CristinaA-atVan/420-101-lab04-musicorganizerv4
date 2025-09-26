
/**
 * Write a description of class testing here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Testing
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class testing
     */
    public Testing()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public void sum(int a, int b)
    {
        int currentValue = a;
        int totalValue = 0;
        while(currentValue <= b) {
            totalValue = (currentValue + totalValue);
            currentValue++;
        }
        System.out.println(totalValue);
    }
    
    public boolean isPrime(int n)
    {
        boolean isPrime = true;
        int divisor = 2;
        while(divisor <= (n - 1)) {
            int remainder = (n % divisor);
            if(remainder == 0) {
                isPrime = false;
            }
            divisor++;
        }
        return isPrime;
    }
}
