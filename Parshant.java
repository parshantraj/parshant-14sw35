
/**
 * The <code>Parshant</code> class represents mathematical stuff.
 * All functions have an algorithm which
 * are implemented as methods of this class.
 * @author Parshant - 14SW35
 * @since JDK1.8
 */
public class Parshant {
	public static int minFunction(int n1, int n2) {
	/** These values are used for variable storage. */
	      int min;
	       /**
	           * Uses the param values as n1 and n2 of minFunction to assume which number is min among both numbers.
	           * This method doesn't perform any range checking.
	           * Both params are used to compare values with one another
	           * @param      n1     The first value to put into the method.
	           * @param      n2     The second value to put into the method.
    		 */
	      if (n1 > n2)
	         min = n2;
	      else
	         min = n1;

	      return min;
	}
	public static int maxFunction(int n1, int n2) {
		/** These values are used for variable storage. */
		      int max;
		       /**
		           * Uses the param values as n1 and n2 of manFunction to assume which number is max among both numbers.
		           * This method doesn't perform any range checking.
		           * Both params are used to compare values with one another
		           * @param      n1     The first value to put into the method.
		           * @param      n2     The second value to put into the method.
	    		 */
		      if (n1 < n2)
		         max = n2;
		      else
		         max = n1;

	      return max;
}
}