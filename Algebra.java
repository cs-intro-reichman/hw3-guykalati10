// Implements algebraic operations and the square root function without using 
// the Java operations a + b, a - b, a * b, a / b, a % b, and without calling 
// Math.sqrt. All the functions in this class operate on int values and
// return int values.

public class Algebra {
	public static void main(String args[]) {
	    // Tests some of the operations
	    System.out.println(plus(2,3));   // 2 + 3
	    System.out.println(minus(7,2));  // 7 - 2
   		System.out.println(minus(2,7));  // 2 - 7
 		System.out.println(times(3,4));  // 3 * 4
   		System.out.println(plus(2,times(4,2)));  // 2 + 4 * 2
   		System.out.println(pow(5,3));      // 5^3
   		System.out.println(pow(3,5));      // 3^5
		System.out.println(pow(-3,5)); 
   		System.out.println(div(12,3));   // 12 / 3    
   		System.out.println(div(5,5));    // 5 / 5  
   		System.out.println(div(25,7));   // 25 / 7
   		System.out.println(mod(25,7));   // 25 % 7
   		System.out.println(mod(120,6));  // 120 % 6    
   		System.out.println(sqrt(36));
	    System.out.println(times(1,-3)); 
		System.out.println(sqrt(263169));
   		System.out.println(sqrt(76123));
	}  

// 	// Returns x1 + x2
// 	public static int plus(int x1, int x2) {
// 		int count = x1;
// 		if(x2>=0){
// 		for(int i = 0 ; i < x2 ; i++){
// 			count++;
// 		}
// 	}
// 	else{
// 		for(int i = 0 ; x2 < i ; i--){
// 			count--;
// 		}

// 	}
// 		return count;
	
// 	}

// 	// Returns x1 - x2
// 	public static int minus(int x1, int x2) {
// 		int count = x1;
// 		if(x2>=0){
// 		for(int i = 0 ; i < x2 ; i++){
// 			count--;
// 		}
// 	}
// 	else{
// 		for(int i = 0 ; x2 < i ; i--){
// 			count++;
// 		}

// 	}

// 		return count;
// 	}

// 	// Returns x1 * x2
// 	public static int times(int x1, int x2) {
// 		int count = 0;
// 		if(x2>=0){
// 		for(int i = 0 ; i < x2 ; i++){
// 			count = plus(count, x1);
// 		}
// 	}
// 	else{
// 		if(x1>=0){
// 			for(int i = 0 ; x2 < i ; i--){
// 				count = minus(count, x1);
// 			}
// 		}
// 		else{
// 			for(int i = 0 ; x2 < i ; i--){
// 				count = minus(count, x1);
// 			}

// 		}
		
// 	}
// 		return count;
// 	}

// 	// Returns x^n (for n >= 0)
// 	public static int pow(int x, int n) {
// 		int count = 1;
// 		for(int i = 0 ; i < n ; i++){
// 			count = times(count, x);
// 		}
// 		return count;
// 	}

// 	// Returns the integer part of x1 / x2 
// 	public static int div(int x1, int x2) {
// 		int check = 0 ;
// 		int count = 0 ;
// 		if(x1>=0){
// 			if(x2>=0){
// 				while(check < x1){
// 					check = plus(check, x2);
// 					if(check<=x1){
// 						count++;        
// 					}
// 				}
// 			}
// 			else{
// 				while(check < x1){
// 					check = minus(check, x2);
// 					if(check<=x1){
// 						count--;        
// 					}
// 				}

// 			}
// 		}
// 		else{
// 			if(x2>=0){
// 				while(check > x1){
// 					check = minus(check, x2);
// 					if(check>=x1){
// 						count--;        
// 					}
// 				}
// 			}
// 			else{
// 				while(check > x1){
// 					check = plus(check, x2);
// 					if(check>=x1){
// 						count++;        
// 					}
// 				}

// 			}

// 			}
// 		return count;
// 	}

// 	// Returns x1 % x2
// 	public static int mod(int x1, int x2) {
// 		int check = 0 ;
// 		int count = 0 ;
		
// 		while(check < x1){
// 			check = plus(check, x2);
// 			if(check<=x1){
// 				count++;
// 			}
// 		}
// 		return minus(x1, times(count, x2));
// 	}	

// 	// Returns the integer part of sqrt(x) 
// 	public static int sqrt(int x) {
// 		int count = 0 ;
// 		int ans = 0 ;
// 		boolean found = false;

// 		while(!found){
// 			if(pow(count, 2) == x){
// 				ans = count;
// 				found = true;
// 			}
// 			count++;
// 		}
// 		return ans;
// 	}	  	  
// }

// Returns x1 + x2
public static int plus(int x1, int x2) {
	int s = x1;
	for (int i = 0; i < Math.abs(x2); i++){
		if (x2 > 0)
		s ++;
		else
		s--;
	}
	return s;
}

// Returns x1 - x2
public static int minus(int x1, int x2) {
	int sum = x1;
	for (int i = 0; i < Math.abs(x2); i++){
		if (x2 > 0)
		sum --;
		else 
			sum++;
	}
	return sum;
}

// Returns x1 * x2
public static int times(int x1, int x2) {
	int s = 0;
	for (int i = 0; i < Math.abs(x2); i++){
		if (x1 < 0 && x2 < 0){
			s = plus(s , Math.abs(x1));
		}
		else if (x1 < 0 && x2 > 0){
			s = plus(s, x1);
		}
		else if (x1 > 0 && x2 < 0){
			s = minus(s, x1);
		}
		else if (x1 > 0 && x2 > 0){
			s = plus(s, x1);
		}
	}
	return s; 
}

// Returns x^n (for n >= 0)
public static int pow(int x, int n) {
	int sum = 1;
	for (int i = 0; i < n; i++)
	{
		if (mod(n , 2) == 0){
			sum = times(sum , Math.abs(x));
		}
		else{
			sum = times(sum , x);

		}
	}
	return sum;
}

// Returns the integer part of x1 / x2 
public static int div(int x1, int x2) {
	int count = 0;
	int sum = Math.abs(x1);
	while (sum >= Math.abs(x2)){
		count ++;
		sum = minus(sum, Math.abs(x2));
	}
	if (x1 < 0 && x2 < 0 || x1 > 0 && x2 > 0)
		return count;
	else
		return (times(-1 , count));

}

// Returns x1 % x2
public static int mod(int x1, int x2) {
	int sum = x1;
	int count = 0;
	while (sum >= x2){
		count ++;
		sum = minus(sum, x2);
	}
	int mod = minus(x1, times(count, x2));
	return mod;
}	

// Returns the integer part of sqrt(x) 
public static int sqrt(int x) {
	for (int i = 1; i <= x; i++){
		if (times(i, i) == x){
			return i;
		}
		if (times(i, i) > x){
			return minus(i, 1);
		}
	}
	return 0;
}
}