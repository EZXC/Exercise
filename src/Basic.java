
//To use Scanner
import java.util.Scanner;

public class Basic {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Call Task");
		int task = input.nextInt();
		
		switch(task) {
			case 1:
				//Print 'Hello' on screen and then print your name on a separate line
				System.out.println("Hello\nEdward");
				System.out.println("------------------------------");
				break;
				
			case 2:
				//print the sum of two numbers
				System.out.println(74 + 36);
				System.out.println("------------------------------");
				break;
				
			case 3:
				//divide two numbers and print on the screen
				System.out.println(50 / 3);
				System.out.println("------------------------------");
				break;
				
			case 4:
				//print the result of the following operations
				System.out.println(-5 + 8 * 6);
				System.out.println((55 + 9) % 9);
				System.out.println(20 + -3 * 5 / 8);
				System.out.println(5 + 15 / 3 * 2 - 8 % 3);
				System.out.println("------------------------------");
				break;
				
			case 5:
				//takes two numbers as input and display the product of two numbers		
				System.out.println("Enter test1 number 1");
				int test1No1 = input.nextInt();
				
				System.out.println("Enter test1 number 2");
				int test1No2 = input.nextInt();
				
				System.out.println(test1No1 + " x " + test1No2 + " = " + test1No1 * test1No2);
				System.out.println("------------------------------");
				break;
				
			case 6:
				//print the sum (addition), multiply, subtract, divide and remainder of two numbers
				System.out.println("Enter test2 number1");
				int test2No1 = input.nextInt();
				
				System.out.println("Enter test2 number2");
				int test2No2 = input.nextInt();
				
				System.out.println(test2No1 + " + " + test2No2 + " = " + (test2No1 + test2No2));
				System.out.println(test2No1 + " - " + test2No2 + " = " + (test2No1 - test2No2));
				System.out.println(test2No1 + " x " + test2No2 + " = " + (test2No1 * test2No2));
				System.out.println(test2No1 + " / " + test2No2 + " = " + (test2No1 / test2No2));
				System.out.println(test2No1 + " mod " + test2No2 + " = " + (test2No1 % test2No2));		
				System.out.println("------------------------------");
				break;
				
			case 7:
				//takes a number as input and prints its multiplication table up to 10		
				System.out.println("Enter test3 number1");
				int test3No1 = input.nextInt();
				
				for(int i = 1; i <= 10 ; i++) {
					
					System.out.println(test3No1 + " x " + i + " = " + (test3No1 * i));
				}
				System.out.println("------------------------------");
				break;
				
			case 8:
				//display the following pattern
				System.out.println("   J    a   v     v  a ");
		        System.out.println("   J   a a   v   v  a a");
		        System.out.println("J  J  aaaaa   V V  aaaaa");
		        System.out.println(" JJ  a     a   V  a     a");
		        System.out.println("------------------------------");
		        break;
		        
			case 9:
				//compute the specified expressions and print the output
				System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
				System.out.println("------------------------------");
		        break;
		        
			case 10:
				//compute a specified formula
				double task10 = 4.0 * (1 - (1.0 / 3) + (1.0 / 5) - (1.0 / 7) + (1.0 / 9) - (1.0 / 11) );
				System.out.println(task10);
				System.out.println("------------------------------");
		        break;
				
			case 11:
				//print the area and perimeter of a circle
				double task11Radius = 7.5;
				double task11Pi = Math.PI; 
				
				System.out.println("Perimeter is = " + (task11Radius * 2 * task11Pi));
				System.out.println("Area is = " + (task11Radius * task11Radius * task11Pi));
				
				System.out.println("------------------------------");
		        break;
				
			case 12:
				//takes three numbers as input to calculate and print the average of the numbers
				System.out.println("Enter No 1");
				int task12No1 = input.nextInt();
				System.out.println("Enter No 2");
				int task12No2 = input.nextInt();
				System.out.println("Enter No 3");
				int task12No3 = input.nextInt();
				System.out.println("Enter No 4");
				int task12No4 = input.nextInt();
				System.out.println("Enter No 5");
				int task12No5 = input.nextInt();
				
				int avg = (task12No1 + task12No2 + task12No3 + task12No4 + task12No5) / 5;
				
				System.out.println("The Avg of the number is " + avg );
				
				System.out.println("------------------------------");
		        break;
		        
			case 13:
				//print the area and perimeter of a rectangle
				double task13Width = 5.5;
				double task13Heigh = 8.5;
				
				double task13Area = task13Width * task13Heigh;
				double task13Perimeter = 2 * (task13Width +  task13Heigh);
				
				System.out.printf("Area is %.1f * %.1f = %.2f\n", task13Width, task13Heigh, task13Area);
				System.out.printf("Perimeter is 2 * (%.1f + %.1f) = %.2f\n", task13Width, task13Heigh, task13Perimeter);
				
				System.out.println("------------------------------");
				break;
				
			case 14:
				//print an American flag on the screen
				System.out.println("* * * * * * ==============================");
		        System.out.println(" * * * * *  ==============================");
		        System.out.println("* * * * * * ==============================");
		        System.out.println(" * * * * *  ==============================");
		        System.out.println("* * * * * * ==============================");
		        System.out.println(" * * * * *  ==============================");
		        System.out.println("* * * * * * ==============================");
		        System.out.println(" * * * * *  ==============================");
		        System.out.println("* * * * * * ==============================");
		        System.out.println("==========================================");
		        System.out.println("==========================================");
		        System.out.println("==========================================");
		        System.out.println("==========================================");
		        System.out.println("==========================================");
		        System.out.println("==========================================");
		        
		        System.out.println("------------------------------");
		        break;
		        
			case 15:
				//swap two variables
				System.out.println("Enter No 1");
				String task15No1 = input.next();
				System.out.println("Enter No 2");
				String task15No2 = input.next();
				
				String task15Swap;
				task15Swap = task15No1;
				task15No1 = task15No2;
				task15No2 = task15Swap;
				
				System.out.println("First Enter: " + task15No1 + "\nSecond Enter: " + task15No2);
				
				System.out.println("------------------------------");
		        break;
		        
			case 16:
				//print a face
				System.out.println(" +\"\"\"\"\"+ ");
		        System.out.println("[| o o |]");
		        System.out.println(" |  >  | ");
		        System.out.println(" | '-' | ");
		        System.out.println(" +-----+ ");
		        System.out.println("------------------------------");
		        break;
		        
			case 17:
				//add two binary numbers
				long task17Binary1, task17Binary2;
				int task17i = 0, task17Remainder = 0;
				int[] task17Sum = new int[20];
				
				System.out.println("Enter No 1");
				task17Binary1 = input.nextLong();
				System.out.println("Enter No 2");
				task17Binary2 = input.nextLong();
				
				while(task17Binary1 != 0 || task17Binary2 !=0) {
					task17Sum[task17i++] = (int)((task17Binary1 % 10 + task17Binary2 % 10 + task17Remainder) % 2);
					task17Remainder = (int)((task17Binary1 % 10 + task17Binary2 % 10 + task17Remainder) / 2);
					task17Binary1 /= 10;
					task17Binary2 /= 10;
				}
				
				if(task17Remainder != 0) {
					task17Sum[task17i++] = task17Remainder;
				}
				
				task17i--;
				
				System.out.println("Sum of two binary numbers: ");
				while(task17i >= 0) {
					System.out.print(task17Sum[task17i--]);
				}
				System.out.print("\n");
				
				System.out.print("------------------------------");
		        break;
		        
			case 18:
				//multiply two binary numbers 		--With Method
				long task18Binary1, task18Binary2, task18Multiply = 0;
				int task18Digit, task18Factor = 1;
				System.out.println("Enter No 1");
				task18Binary1 = input.nextLong();
				System.out.println("Enter No 2");
				task18Binary2 = input.nextLong();
				
				while(task18Binary2 != 0) {
					
					task18Digit = (int)(task18Binary2 % 10);
					if(task18Digit == 1) {
						task18Binary1 *= task18Factor;
						task18Multiply = task18BinaryProduct((int)task18Binary1, (int)task18Multiply);
					}else {
						task18Binary1 *= task18Factor;
					}
					task18Binary2 /= 10;
					task18Factor = 10;
				}
				
				System.out.println("Product of two binary numbes: " + task18Multiply + "\n");
				System.out.println("------------------------------");
		        break;
		        
			case 19:
			case 20:
			case 21:
			case 22:
			case 23:
			case 24:
			case 25:
			case 26:
			case 27:
			case 28:
			case 29:
			case 30:
				System.out.println("Do it later");
				System.out.println("------------------------------");
		        break;
				
			case 31:
				//check whether Java is installed on your computer
				System.out.println("\nJave Version: " + System.getProperty("jave.version"));
				System.out.println("Java Runtime Version: " + System.getProperty("java.runtime.version"));
				System.out.println("Jave Home: " + System.getProperty("java.home"));
				System.out.println("Java Vendor: " + System.getProperty("java.vendor"));
				System.out.println("Java Vendor URL: " + System.getProperty("java.vendor.url"));
				System.out.println("Jave Class Path: " + System.getProperty("java.class.path") + "\n");
				System.out.println("------------------------------");
		        break;
		        
			case 32:
				//compare two numbers
				int task32No1, task32No2;
				
				System.out.println("Enter No 1");
				task32No1 = input.nextInt();
				System.out.println("Enter No 2");
				task32No2 = input.nextInt();
				
				if(task32No1 == task32No2)
					System.out.printf("%d == %d\n", task32No1, task32No2);
				if(task32No1 != task32No2)
					System.out.printf("%d != %d\n", task32No1, task32No2);
				if(task32No1 < task32No2)
					System.out.printf("%d < %d\n", task32No1, task32No2);
				if(task32No1 > task32No2)
					System.out.printf("%d > %d\n", task32No1, task32No2);
				if(task32No1 <= task32No2)
					System.out.printf("%d <= %d\n", task32No1, task32No2);
				if(task32No1 >= task32No2)
					System.out.printf("%d >= %d\n", task32No1, task32No2);
				
				System.out.println("------------------------------");
		        break;
		        
			case 33:
				//compute the sum of the digits of an integer
				int task33No1; 
				int task33Sum = 0;
				
				System.out.println("Enter No 1");
				task33No1 = input.nextInt();
				
				while(task33No1 != 0) {
					task33Sum += task33No1 % 10;  
					task33No1 /= 10;
				}
				
				System.out.println("The sum of the digits is: " + task33Sum);
				System.out.println("------------------------------");
		        break;
				
			case 34:
				//compute the area of a hexagon			--Area of a hexagon = (6 * side^2)/(4*tan(¦Ð/6))
				double task34LengthOfSide, task34Area;
				
				System.out.println("Enter Length of Side");
				task34LengthOfSide = input.nextDouble();
				
				task34Area = (6 * (task34LengthOfSide * task34LengthOfSide)) / (4 * Math.tan(Math.PI / 6));
				
				System.out.println("The area of the hexagon is: " + task34Area);
				System.out.println("------------------------------");
		        break;
		        
			case 35:
				//compute the area of a polygon			--Area of a polygon = (n*s^2)/(4*tan(¦Ð/n))
				double task35NumberOfSide, task35LengthOfSide, task35Area;
				
				System.out.println("Enter Number of Side");
				task35NumberOfSide = input.nextDouble();
				System.out.println("Enter Length of Side");
				task35LengthOfSide = input.nextDouble();
				
				task35Area = (task35NumberOfSide * (task35LengthOfSide * task35LengthOfSide)) / (4 * Math.tan(Math.PI / task35NumberOfSide));
				
				System.out.println("The area is: " + task35Area);
				System.out.println("------------------------------");
		        break;
		        
			case 36:
				//compute the distance between two points on the surface of earth		--Distance between the two points [(x1,y1) & (x2,y2)]
				//	--d = radius * arccos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
				System.out.println("Input the latitude of coordinate 1: ");
				double task36Lat1 = input.nextDouble();
				System.out.println("Input the longitude of coordinate 1: ");
				double task36Lon1 = input.nextDouble();
				System.out.println("Input the latitude of coordinate 2: ");
				double task36Lat2 = input.nextDouble();
				System.out.println("Input the longitude of coordinate 2: ");
				double task36Lon2 = input.nextDouble();
				
				System.out.print("The distance between those points is: " + task36Distance_Between_LatLong(task36Lat1, task36Lon1, task36Lat2, task36Lon2) + " km\n");
				System.out.println("------------------------------");
		        break;
		        
			case 37:
				//reverse a string
				
				input.nextLine();	//***** Require every time after input.nextInt or.nextDouble(etc) when entering string ***
				
				System.out.println("Enter Text: ");
				char[] task37Texts = input.nextLine().toCharArray();				
				System.out.print("Reverse string: ");
				for(int i = task37Texts.length - 1; i >= 0; i--) {
					System.out.print(task37Texts[i]);
				}
				System.out.print("\n");
				
				System.out.println("------------------------------");
		        break;
		        
		        
			case 38:
				//count the letters, spaces, numbers and other characters of an input string
		        
				String task38Text = "Aa kiu, I swd skieo 236587. GH kiu: sieo?? 25.33";
				task38Count(task38Text);
				
				System.out.println("------------------------------");
		        break;
				
		        
			case 39:
				//create and display unique three-digit number using 1, 2, 3, 4. Also count how many three-digit numbers are there
		        int task39Amount = 0;
		        for(int i = 1; i <= 4; i++) {
		        	for(int j = 1; j <= 4; j++) {
		        		for(int k = 1; k <= 4; k++) {
		        			if(i != j && i != k && j != k) {
		        				task39Amount++;
		        				System.out.println("Output: " + i + j + k);
		        			}
		        		}
		        	}
		        }
		        
		        System.out.println("The amount: " + task39Amount);
				
				
				System.out.println("------------------------------");
		        break;
		        
				 
				
			default:
				System.out.println("Wrong case");
		}
	}
	
	static int task18BinaryProduct(int task18Binary1, int task18Binary2) {
		
		int i = 0, remainder = 0;
		int[] sum = new int[20];
		int binary_prod_result = 0;
		
		while(task18Binary1 != 0 || task18Binary2 != 0) {
			
			sum[i++] = (task18Binary1 % 10 + task18Binary2 % 10 + remainder) % 2;
			remainder = (task18Binary1 % 10 + task18Binary2 % 10 + remainder) / 2;
			task18Binary1 /= 10;
			task18Binary2 /=10;
		}
		
		if(remainder != 0) {
			sum[i++] = remainder;
		}
		
		--i;
		
		while(i >= 0) {
			binary_prod_result = binary_prod_result * 10 + sum[i--]; 
		}
		
		return binary_prod_result;		
	}
	
	public static double task36Distance_Between_LatLong(double lat1, double lon1, double lat2, double lon2) {
		
		//		--d = radius * acrcos(sin(x1) * sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2))
		
		lat1 = Math.toRadians(lat1);
		lon1 = Math.toRadians(lon1);
		lat2 = Math.toRadians(lat2);
		lon2 = Math.toRadians(lon2);
		
		double earthRadius = 6371.01; 
		return earthRadius * Math.acos(Math.sin(lat1) * Math.sin(lat2) + Math.cos(lat1) * Math.cos(lat2) * Math.cos(lon1 - lon2));
		
		
	}

	public static void task38Count(String x) {
		
		char[] texts = x.toCharArray();
		int letter = 0;
		int space = 0;
		int num = 0;
		int other = 0;
		
		for(int i = 0; i < x.length(); i++) {
			if(Character.isLetter(texts[i])) {
				letter++;
			}else if(Character.isDigit(texts[i])){
				num++;
			}else if(Character.isSpaceChar(texts[i])) {
				space++;
			}else {
				other++;
			}			
		}
		
		System.out.printf("The string is: %s \n", x);
		System.out.println("Letter: " + letter);
		System.out.println("Space: " + space);
		System.out.println("Number: " + num);
		System.out.println("Other: " + other);
		
	}
	

}

















