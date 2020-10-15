                                     //  Assignment 1

//Name-Manasi Nitin Patil-200940381043
 
 /*Program1. Write a Java program to print 'Hello' on screen and then print your name on a
 separate line.
 Expected Output :
 Hello
 Alexandra Abramov */

 /*class Hello
 {
	
	public static void main(String[] args)
	{
		System.out.println("Hello");
		System.out.println("Alexandra Abramov");
	}
 }*/

Output-
Hello
Alexandra Abramov

 /*2. Write a Java program to print the sum of two numbers.
 Test Data: 74 + 36 */

 /*import java.util.Scanner;
 class Sum
 {
	public static void main(String[] arg)
	{
		int a,b,c;
                System.out.println("Enter first no");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter second no");
		b=sc.nextInt();
		c=a+b;
		System.out.println("Addition of Two number is: "+c);
	}
 }*/

/*Output-
Enter first no
74
Enter second no
36
Addition of Two number is: 110*/


 /*3. Write a Java program to divide two numbers and print on the screen.
Test Data : 50/3
Expected Output : 16*/

/*import java.util.Scanner;
 class Divide
 {
	public static void main(String[] arg)
	{
		int a,b;
		float c;
                System.out.println("Enter first no");
		Scanner sc=new Scanner(System.in);
		a=sc.nextInt();
		System.out.println("Enter second no");
		b=sc.nextInt();
		c=a/b;
		System.out.println(" Division of two number is: "+c);
	}
 }*/
/*Output-
run:
Enter first no
50
Enter second no
3
 Division of two number is: 16.0 
 */



 /* 4. Write a Java program to print the result of the following operations.
 Test Data:
 a. -5 + 8 * 6
 b. (55+9) % 9
 c. 20 + -3*5 / 8
 d. 5 + 15 / 3 * 2 - 8 % 3
 Expected Output :
 43
 1
 19
 13
*/ 
  
 
 /*class Operations
 {
      public static void main(String args[])
      {
            System.out.println(-5+8*6);
	    System.out.println((55+9)%9);
	    System.out.println(20+-3*5/8);
	    System.out.println(5 + (15/3)* 2- (8%3));

	}
 }*/
/*Output-
run:
43
1
19
13
*/

 /* 5. Write a Java program that takes two numbers as input and display the product of two numbers. 
 Test Data:
 Input first number: 25
 Input second number: 5
 Expected Output :
 25 x 5 = 125*/

 /*import java.util.Scanner;
 class Product
 {
      public static void main(String args[])
      {
             Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the First Number:  ");
	     int a=sc.nextInt();
	     System.out.println("Enter the Second Number:  ");
	     int b=sc.nextInt();
	     System.out.println(a+ "x" +b+ "=" +a*b);
      }
}*/
/*Output-
run:
Enter the First Number:  
25
Enter the Second Number:  
5
25x5=125
*/

 /*6. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers.
 Test Data:
 Input first number: 125
 Input second number: 24
 Expected Output :
 125 + 24 = 149
 125 - 24 = 101
 125 x 24 = 3000
 125 / 24 = 5
 125 mod 24 = 5*/

 /*import java.util.Scanner;
 class Operations2
 {
      public static void main(String args[])
      {
             Scanner sc=new Scanner(System.in);
	     System.out.println("Enter the First Number:  ");
	     int a=sc.nextInt();
	     System.out.println("Enter the Second Number:  ");
	     int b=sc.nextInt();
	     System.out.println( a + " + " + b + " = " + (a+b));
 	     System.out.println(a + " - " + b + " = " + (a - b));
	     System.out.println(a + " x " + b + " = " + (a * b));
	     System.out.println(a + " / " + b + "=" + (a / b));
             System.out.println(a + " mod " +b+ "=" + (a % b));

      }
}*/
Output-
/*Enter the First Number:  
125
Enter the Second Number:  
24
125 + 24 = 149
125 - 24 = 101
125 x 24 = 3000
125 / 24=5
125 mod 24=5
*/

/*7. Write a Java program that takes a number as input and prints its multiplication table upto 10.
Test Data:
Input a number: 8
Expected Output :
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
...
8 x 10 = 80 */

 /*  import java.util.Scanner;
   class Table
   {
          public static void main(String args[])
	  {
 	       Scanner scan=new Scanner(System.in);
		
               System.out.print(" Input a Number :");
		int a= scan.nextInt();
    	       
	       for(int i=1;i<=10;i++)
		{
		      System.out.println(a + " x " + i + " = " + a * i);
		}
	  }
    }*/
/*Output-
 Input a Number :8
8 x 1 = 8
8 x 2 = 16
8 x 3 = 24
8 x 4 = 32
8 x 5 = 40
8 x 6 = 48
8 x 7 = 56
8 x 8 = 64
8 x 9 = 72
8 x 10 = 80
*/

/* 8. Write a Java program to display the following pattern.*/

 /*   class Pattern
    {
 
 	   public static void main(String[] args) 
	   {

 	       	System.out.println("   J    a   v     v  a ");
        	System.out.println("   J   a a   v   v  a a");
        	System.out.println("J  J  aaaaa   V V  aaaaa");
        	System.out.println(" JJ  a     a   V  a     a");
    	    }
     }
  */
/*Output-
   J    a   v     v  a 
   J   a a   v   v  a a
J  J  aaaaa   V V  aaaaa
 JJ  a     a   V  a     a
*/

  /* 9. Write a Java program to compute the specified expressions and print the output.
 Test Data:
 ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5))
 Expected Output
 2.138888888888889 */

 /*class Expression 
 {
    public static void main(String[] arg) 
	{
        System.out.println((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));
        }
 }*/
/*Output-
2.138888888888889
*/

 /* 10. Write a Java program to compute a specified formula.
 Specified Formula :
 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))
 Expected Output
 2.9760461760461765*/
 
 /*  class Formula
	{
           public static void main (String args [ ] ) 
	   {
 		System.out.println ( 4.0 * (1 - (1.0/3) + (1.0/5) - (1.0/7) + (1.0/9) - (1.0/11))) ;
	   }
	}
*/
/*Output-
2.9760461760461765
*/

/* 11. Write a Java program to print the area and perimeter of a circle.
Test Data:
Radius = 7.5
Expected Output
Perimeter is = 47.12388980384689
Area is = 176.71458676442586*/

 /* class Area 
  {
       public static void main(String[] args) 
      {
        double R = 7.5;
  	System.out.println("Perimeter is = " + (2 * R * Math.PI));
  	System.out.println("Area is = " + (Math.PI * R * R));
      } 
  }*/

/*Output-
Perimeter is = 47.12388980384689
Area is = 176.71458676442586
*/
 
 /*12. Write a Java program that takes three numbers as input to calculate and print the average of the numbers.*/

 /*import java.util.Scanner;
 class Average
 {
 
 	public static void main(String[] args)
        {
  	    Scanner in = new Scanner(System.in);
	    System.out.print("Enter First number: ");
  	    int No1 = in.nextInt();
   	    System.out.print("Enter second number: ");
            int No2 = in.nextInt();
            System.out.print("Input third number: ");
            int No3 = in.nextInt();
   	    System.out.println("Average of Three numbers is: " + 
            (No1 + No2 + No3) / 3);
         }
 }*/

/*Output-
Enter First number: 10
Enter second number: 20
Input third number: 30
Average of Three numbers is: 20
*/

  /*13. Write a Java program to print the area and perimeter of a rectangle.
Test Data:
Width = 5.5 Height = 8.5
Expected Output
Area is 5.6 * 8.5 = 47.60
Perimeter is 2 * (5.6 + 8.5) = 28.20 */

  /* public class Rectangle
   {
        public static void main(String[] strings) 
        {
 		 double width = 5.6;
        	 double height = 8.5;	
        	double perimeter = 2*(height + width);
		double area = width * height;			
		System.out.printf("Perimeter is 2*(%.1f + %.1f) = %.2f \n", height, width, perimeter);
		System.out.printf("Area is %.1f * %.1f = %.2f \n", width, height, area);
         }
    } */

/*Output-
Perimeter is 2*(8.5 + 5.6) = 28.20 
Area is 5.6 * 8.5 = 47.60 
*/

 /*14. Write a Java program to print an American flag on the screen.*/
  
 /*  class Americanflag 
   {
       public static void main(String[] args)
       {
        	System.out.println("* * * * * * ==================================");
        	System.out.println(" * * * * *  ==================================");
        	System.out.println("* * * * * * ==================================");
        	System.out.println(" * * * * *  ==================================");
        	System.out.println("* * * * * * ==================================");
        	System.out.println(" * * * * *  ==================================");
        	System.out.println("* * * * * * ==================================");
        	System.out.println(" * * * * *  ==================================");
        	System.out.println("* * * * * * ==================================");
        	System.out.println("==============================================");
                System.out.println("==============================================");
        	System.out.println("==============================================");
        	System.out.println("==============================================");
        	System.out.println("==============================================");
        	System.out.println("==============================================");
       }
    }*/

/*
Output-
* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
 * * * * *  ==================================
* * * * * * ==================================
==============================================
==============================================
==============================================
==============================================
==============================================
==============================================
*/

 //15. Write a Java program to swap two variables.
  /* import java.util.Scanner;
   public class Swap
   {
 	public static void main(String[] args) 
	{
   	 	int a, b,temp;
   		Scanner in = new Scanner(System.in);
		System.out.println("Enter the first number: ");
   		a = in.nextInt();
   		System.out.println("Enter the second number: ");
   		b = in.nextInt();
		temp = a;
   		   a = b;
   		   b = temp;
	       System.out.println(" Swapped values Are:" + a + " and " + b);
        
	}
    }*/  

/*Output-
Enter the first number: 
3
Enter the second number: 
4
 Swapped values Are:4 and 3
*/

 //16. Write a Java program to print a face.

 /*  public class Face
   {
      public static void main(String[] args)
      {
        System.out.println(" +\"\"\"\"\"+ ");
        System.out.println("[| o o |]");
        System.out.println(" |  ^  | ");
        System.out.println(" | '-' | ");
        System.out.println(" +-----+ ");
      }
   }*/

/*Output-
 +"""""+ 
[| o o |]
 |  ^  | 
 | '-' | 
 +-----+ 
*/

 /* 17. Write a Java program to add two binary numbers.
  Input Data:
  Input first binary number: 10
  Input second binary number: 11
  Expected Output
  Sum of two binary numbers: 101 */

  
 /* class Addition
  {
     public static void main(String a[])
     {
        
        String A="10";
	String B="11";
	System.out.println("Input First Binary Number:  "  +A);
	System.out.println("Input Second Binary Number:  "  +B);

	int A1=Integer.parseInt(A,2);//The java.lang.Integer.parseInt(String s, int radix) method parses the string argument s as 
        //a signed integer in the radix specified by the second argument radix
	int B1=Integer.parseInt(B,2);
	
        int add=A1+B1;

	System.out.println("Sum of Two Binary Number:  " +Integer.toBinaryString(add));//returns the string representation of the  int value 
                                                                                     // represented by the argument in binary (base 2)
     }	
}
*/

/*Output-
Input First Binary Number:  10
Input Second Binary Number:  11
Sum of Two Binary Number:  101
*/


/* 19. Write a Java program to convert a decimal number to binary number.
 Input Data:
 Input a Decimal Number : 5
 Expected Output
 Binary number is: 101 */

 /* class Decimaltobinary
  {

       public static void main(String args[])
       {
            System.out.println(Integer.toBinaryString(5));

       }
  }*/

/*Output-
run:
101
*/


/*20. Write a Java program to convert a decimal number to hexadecimal number.
Input Data:
Input a decimal number: 15
Expected Output
Hexadecimal number is : F */
`

 /*class DecimaltoHex
  {

       public static void main(String args[])
       {
            System.out.println(Integer.toHexString(15));//The Integer.toHexString()
         // method converts decimal to hexadecimal.

       }

  }*/

/*Output-
f
*/


 /*21. Write a Java program to convert a decimal number to octal number.
Input Data:
Input a Decimal Number: 15
Expected Output
Octal number is: 17*/

/*  class DecimaltoOctal
  {
 
       public static void main(String args[])
       {
            System.out.println(Integer.toOctString(15));//The Integer.toHexString()
         // method converts decimal to hexadecimal.

       }

  }*/

/*Output-
17
*/


/*22. Write a Java program to convert a binary number to decimal number.
Input Data:
Input a binary number: 100
Expected Output
Decimal Number: 4
*/

/*package javatest;
import java.util.Scanner;
public class BinaryToDecimal
{
 
       public static void main(String args[])
       {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter binary number :");
            String s1=sc.nextLine();
            int dec=Integer.parseInt(s1, 2);
            System.out.println("Decimal no :"+dec);

       }

  }*/

/*Output-
Enter binary number :
100
Decimal no :4
*/


/*23. Write a Java program to convert a binary number to hexadecimal number.
Input Data:
Input a Binary Number: 1101
Expected Output
HexaDecimal value: 
*/
/*package javatest;
import java.util.Scanner;
public class BinaryToHexadecimal
{
 
       public static void main(String args[])
       {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter binary number :");
            String s1=sc.nextLine();
            int a=Integer.parseInt(s1, 2);
            String s2=Integer.toHexString(a);
            System.out.println("Hexadecimal no :"+s2);

       }

  }*/

/*Output-
Enter binary number :
1101
Hexadecimal no :d
*/

/*24. Write a Java program to convert a binary number to a Octal number.
Input Data:
Input a Binary Number: 111
Expected Output
Octal number: 7
*/
/*package javatest;
import java.util.Scanner;
public class BinaryToOctal
  {
 
       public static void main(String args[])
       {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter binary number :");
            String s1=sc.nextLine();
            int a=Integer.parseInt(s1, 2);
            String s2=Integer.toOctalString(a);
            System.out.println("Octal no :"+s2);

       }

  }*/

/*Output-
Enter binary number :
111
Octal no :7
*/


/*25. Write a Java program to convert a octal number to a decimal number.
Input Data:
Input any octal number: 10
Expected Output
Equivalent decimal number: 8*/

/*package javatest;
import java.util.Scanner;
public class OctaltoDecimal
  {
 
       public static void main(String args[])
       {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter octal number :");
            String octalString=sc.nextLine();
            int decimal=Integer.parseInt(octalString, 8);
            System.out.println("Decimal no :"+decimal);

       }

  }*/


/*Output-
Enter octal number :
10
Decimal no :8
*/




        
 			





















 







 
 
         











































































































































































































	 
 


	     






		

	      



