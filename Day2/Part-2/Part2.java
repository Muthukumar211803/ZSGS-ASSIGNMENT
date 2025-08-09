import java.util.*;

//01 write a program that creates an integer array of 10 elements, sum of odd numbers;
 class OddNumber{
	public static void main(String[] args){
		int num=10;
	 int[] arr=new int[num];
	 int sum=0;
	 Scanner sc=new Scanner(System.in);
	  System.out.print("Enter 10 integer value:");
	 for(int i=0;i<num;i++){
		 arr[i]=sc.nextInt();
		 if(arr[i]%2!=0){
		 sum=sum+arr[i];
	 }
	}
	 System.out.println("Sum of odd number:"+sum);
	}
 }
 
 // 02 Write a program to take in 10 values and print only those numbers which are prime.
   class PrimeNumber{
	   public static void main(String[] args){
		   Scanner sc=new Scanner(System.in);
		   int[] number=new int[10];
		   System.out.print("Enter 10 integers:");
		   for(int i=0;i<10;i++){
			  number[i]=sc.nextInt();
		   }
		   for(int num:number){
			   if(isPrime(num)){
				   System.out.println(num+" ");
			   }
		   }
	   }
	   public static boolean isPrime(int num){
		   if(num<2)return false;
		   boolean isPrime=true;
		   for(int i=2;i<=num/2;i++){
			   if(num%i==0){
			   isPrime=false;
			   break;
			  }
			}
			return isPrime;
		}
   }
 
 //03 write a program which generates 30 terms of Fibonacci;
   class Fibonacci{
	   public static int[] fibo(int n){
		  int[] fib=new int[n];
		  int num1=0;
		  int num2=1;
		  int sum;
		  for(int i=0;i<n;i++){
			  fib[i]=num1;
			 sum=num1+num2;
			 num1=num2;
			 num2=sum;
		  }
		  return fib;
	   }
	 public static void main(String[] args){
		int[] fibon=fibo(30);
		System.out.println(Arrays.toString(fibon));
	 }
   }
   
   //04Design a function void print( ) with a single dimensional array x[ ] and n (as size of the array) as function arguments. The function calculates sum of only single digit and sum of only double digit elements from the array.
    class DimensionalArray {
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
       System.out.print("Enter length of array: ");
        int length = sc.nextInt();
        int[] arr = new int[length];
        System.out.println("Enter array elements:");
        for (int i=0; i<length;i++) {
            arr[i]=sc.nextInt();
        }
        
        print(arr,length);
    }

    public static void print(int[] arr, int n) {
        int singleDigit=0;
        int doubleDigit=0;

        for (int i=0; i<n; i++) {
            if (arr[i]>=0 && arr[i]<=9) {
                singleDigit = singleDigit+arr[i];
            } 
			else if(arr[i] >= 10 && arr[i]<=99) {
                doubleDigit=doubleDigit+arr[i];
            }
        }

        System.out.println("SingleDigit:"+singleDigit);
        System.out.println("DoubleDigit:"+doubleDigit);
    }
}

			
   
   //05 Write a program to initialize the following character arrays and print a suitable message after checking the arrays whether the two arrays are identical or not.
   class IdenticalOrNot{
	 public static void main(String[] args){
	     char[] ch1 = {'m','n','o','p'};
        char[] ch2= {'m','n','o','p'};
        boolean identical=true;
        if(ch1.length!=ch2.length){
            identical=false;
        }
        else{
         for(int i=0;i<ch1.length;i++){
            if(ch1[i]!=ch2[i]){
                identical=false;
                break;
            }
         }
        }
        if(identical){
            System.out.println("Two Arrays are identical");
        }
        else{
            System.out.println("Two arrays are Not identical");
        }
        }
	 }
    
	//06 write a program to accept the year of graduation from school as an integer value from the users;  		 
   class Years{
	 public static void main(String[] args){
   int[] years = {1982,1987,1993,1996,1999,2003,2006,2007,2009,2010,2016,2002};
        Arrays.sort(years);
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Year Of Graduation:");
        int key=sc.nextInt();
        int result = Arrays.binarySearch(years,key);
        if (result>=0) {
            System.out.println("Record Exists");
        } else {
            System.out.println("Record Does Not Exist");
        }
	 }
 } 
 
 //07 Write a program to input and store the weight of ten people. Sort and display them in descending order using the Selection sort technique.
   
   class SortWeight{
	public static void main(String args[]){
	 Scanner sc= new Scanner(System.in);
	  int[] weight=new int[10];
	for(int i=0;i<weight.length;i++){
	  weight[i]=sc.nextInt();
	}
	 for(int i=0;i<weight.length;i++){
		int max=i;
	 for(int j=i+1;j<weight.length;j++){
		if(weight[j]>weight[max]){
		  max=j;
	}
	}
		int temp=weight[i];
		 weight[i]=weight[max];
		 weight[max]=temp;
		}
	for(int i=0;i<weight.length;i++){
		System.out.print(weight[i]+" ");
	}
		
	}
}

//08 Write a program which takes in 10 people’s age and gives number of people who are <18, 18-60, >60.
 class PeopleAge{
	 public static void main(String[] args){
	  Scanner sc = new Scanner(System.in);
        int less=0;
        int between=0;
        int greater=0;
       System.out.println("Enter ages of 10 people:");
       for (int i=1; i<=10; i++) {
         int age=sc.nextInt();
         if(age<18) {
             less++;
      } 
        else if(age<=60) {
                between++;
         }
          else{
                greater++;
            }
        }
        System.out.println( "people<18:"+ less);
        System.out.println("People 18-60:"+between);
        System.out.println("People>60:"+greater);
        
    }
}

//09 Write an array which takes in roll no and marks in 3 subjects for 10 students. Format and Print the roll no, total marks and average for all students in a table form.
 class StudentAverage{
	 public static void main(String[] args){
     Scanner sc =new Scanner(System.in);
       int[] rollNo = new int[5];
        int[][] marks = new int[5][3];
        int[] total = new int[5];
        double[] average = new double[5];
        
      System.out.println("Enter data for 5 students:");
       for (int i = 0; i < 5; i++) {
        System.out.print("Enter Roll No:");
         rollNo[i] = sc.nextInt();
         int sum = 0;
        for (int j = 0; j < 3; j++) {
          System.out.print("Enter the Mark:");
           marks[i][j] = sc.nextInt();
           sum += marks[i][j];
        }
          total[i] = sum;
          average[i] = sum / 3.0;
          System.out.println();
        }
         for (int i = 0; i < 5; i++) {
            System.out.println(rollNo[i]); 
            System.out.println(total[i]); 
            System.out.println(average[i]);
        }
    }
}
 
 

		 


 
 
 
 
 
 
 
 
 
 
 