package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
    	if (divider > 0) {
    		int resultOfDivision = dividend / divider;
    		System.out.println(resultOfDivision * divider == dividend ? "can be divided completely" : "cannot be divided completely");
    	} else {
    		System.out.println("division by zero");
    		}
    }
}