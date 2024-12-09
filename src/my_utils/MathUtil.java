package my_utils;


public class MathUtil {
	///Iterative implementation of the fast exponentiation algorithm </br>
	///@return base^exponent
	public static float powi(float base, int exponent) { 

		//If an exponent if negative the result is 1/(base^(-exponent))
		//To simplify the method we just returning this result, following the Keep It Simple Stupid principe
		if (exponent < 0)
			return  1f/powi(base, -exponent);
			
		float result = 1f; 
	
		while (exponent > 0) { 
	
			if (exponent%2 != 0){ 
				result = result * base; 
			} 
			
			base *= base; 
	
			exponent /= 2; 
		} 
		return result; 
	} 
}
