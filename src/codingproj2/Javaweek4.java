package codingproj2;

import java.util.ArrayList;


public class Javaweek4 {

	public static <stringBuilder> void main(String[] args) {
		
		// create ages array
		// subtract the value of the first element from the last element
		new ArrayList<int[]>();
		int ages1[] = {3, 9, 23, 64, 2, 8, 28, 93};
		int result1 = ages1[ages1.length - 1] - ages1[0];
		System.out.println(result1);
		
		// create ages2 array and repeat subtraction from ages array 
		new ArrayList<int[]>();
		int ages2[] = {3, 5, 7, 11, 34, 49, 54, 61, 82};
		int result2 = ages2[ages2.length - 1] - ages2[0];
		System.out.println(result2);
		
		// calculate average age and print to the console
		
	        double[] numbers = {3, 9, 23, 64, 2, 8, 28, 93, 3, 5, 7, 11, 34, 49, 54, 61, 82};
	        double sum = 0;

	        for (int i = 0; i < numbers.length; i++) {
	            sum += numbers[i];
	        }

	        double average = sum / numbers.length;
	        System.out.println("The average is: " + average);
	        
// create string array and loop to find average number of letters in each name

	String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
    
    int totalLetters = 0; 
    for (String name : names) {
    	totalLetters += name.length();
    }
    
    double averageLetters = (double) totalLetters / names.length;
    System.out.println("Average number of letters per name: " + averageLetters);
    
    // connect the names with name length using concatenation
   
   String concatenatedNames = " "; 
   for (String name : names) {
	   concatenatedNames += name + " ";
   }
	System.out.println(concatenatedNames.trim());
	
	
	// access first and last elements in the array
	System.out.println(ages1[5]);
	System.out.println(names[0]);
	
	// create a new array of nameLengths to add the length of each name to the names
	int[] nameLengths = new int[names.length];
	for (int i = 0; i < names.length; i++) {
		
	nameLengths[i] = names[i].length();
		
	} 
	
	for (int length : nameLengths) {
		System.out.println(names[0] + " " + nameLengths[0]);
		System.out.print(names[1] +  " " + nameLengths[1]);
		System.out.println(names[2] + " " + nameLengths[2]);
		System.out.println(names[3] + " " + nameLengths[3]);
		System.out.println(names[4] + " " + nameLengths[4]);
       
    // calculate the sum of nameLengths    
	
	}
	sum = 0;
		for (int i = 0; i < nameLengths.length; i++) {
			sum += nameLengths[i];
		}
		System.out.println("The sum of all lengths in nameLengths[] = " + sum);
		
		// new method to concatenate a repeated word a number of times
	
		String str = "Hello";
		int repititions = 5;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < repititions; i++) {
			sb.append(str);
			
		}
		// a new method that connects first and lastName
		String repeatedString = sb.toString();
		System.out.println(repeatedString);
		
		String firstName1 = ("Bob");
		String lastName1 = ("Brown");
		String space = " ";
		
		System.out.println(firstName1);
		System.out.println(lastName1);
		
		StringBuilder sb2 = new StringBuilder();
		sb2.append(firstName1);
		sb2.append(space);
		sb2.append(lastName1);
		System.out.println(sb2.toString());
		
	// a method with new array to prove true the sum of int is greater than 100
		
	int [] myArray = new int[6];
	myArray[0] = 11;
	myArray[1] = 18;
	myArray[2] = 32;
	myArray[3] = 5;
	myArray[4] = 41;
	myArray[5] = 22;
	
	int sumNumbers = sumArray(myArray);
	System.out.println(sumNumbers);
		 
	}
	public static int sumArray(int[] numbers2) {
		int sumNumbers = 0;
		for (int number : numbers2) {
			sumNumbers += number;	
			
		}
		return sumNumbers;
		
	}
	
	// a method with an array of double returning the average of elements in the array
	
	public static double calculateAverage(double[] numbers3) {
		double sumForAverage = 0;
		double calculateAverage[] = {21, 14, 16, 18, 32};
		for (double number : numbers3) {
			sumForAverage += number;
		}
		return sumForAverage / numbers3.length;
		
	}
	
	// a method that decides which array is greater
	public class ArrayAverage {
		public static boolean isFirstAverageGreater(double[] arr1, double[] arr2) {
	        if (arr1 == null || arr2 == null || arr1.length == 0 || arr2.length == 0) {
	            return false;
	}
	        double sum1 = 0;
	        for (double num : arr1) {
	        	sum1 += num;
	        }
	        double avg1 = sum1 / arr1.length;
	        double sum2 = 0;
	        for (double num : arr2) {
	            sum2 += num;
	        }
	        double avg2 = sum2 / arr2.length;

	        return avg1 > avg2;
	    }
		public static void main(String[] args) {
	        double[] arr1 = {1.0, 2.0, 3.0};
	        double[] arr2 = {4.0, 5.0, 6.0};
	        System.out.println(isFirstAverageGreater(arr1, arr2));
	        double[] arr3 = {10.0, 20.0};
	        double[] arr4 = {1.0, 2.0};
	        System.out.println(isFirstAverageGreater(arr3, arr4));
	        double[] arr5 = {};
	        double[] arr6 = {1.0, 2.0};
	        System.out.println(isFirstAverageGreater(arr5, arr6));
	        
	        
		}
		// a method to decide if it's too hot outside and if we have enough money for a drink
		public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
			int temperature = 85;
			moneyInPocket = 15;
			if (temperature >= 70) {
				System.out.println("It is hot outside.");
			} else if (moneyInPocket >= 10.50) {
				System.out.println("I have enough money to buy a drink.");
			} else {
				System.out.println("It is not hot enough for a drink today.");
			}
			return true;
			
		}
		// a method that returns how many snow cones you can afford to buy
		public static int sumOfSnowcones(int moneyInWallet, int snowconePrice) {
			int moneyInWallet1 = 25;
			int snowconePrice1 = 2;
			int sumOfSnowcones = moneyInWallet1 * snowconePrice1;
			if (sumOfSnowcones <= moneyInWallet1) {
				System.out.println("You can buy " + sumOfSnowcones + "snowcones");
			} else {
				System.out.println("You can only buy" + sumOfSnowcones + "snowcones");
			}
			return sumOfSnowcones;
		}
		
		
			
		
	
		
		
			
	}
	
			
	}
		


	            



		
		
	



	



		


	        
   
    
	        
	        
	        	
	        	
	        	
	        
	        
	       
	        
	 
	        
	        
	        
	        		
	        
	        
	        
	            
	        
		
		
			
		
		
		
		
		
		
		
		
		
		
		
		
		
	


	


		
		
		
		
		
		
		
