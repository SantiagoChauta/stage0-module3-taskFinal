package lang.print.gaps.finalModuleTask;

public class DigitsSumCalculator {
    public void calculateSum(int number) {
    	int last = number%10;
    	number/=10;
    	int third = number%10;
    	number/=10;
    	int second = number%10;
    	number/=10;
    	int first = number %10;
    	int ans = first+second+third+last;
    	System.out.println(ans);
    }
}
