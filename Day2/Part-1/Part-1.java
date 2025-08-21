import java.util.*;

//01 Write a program that uses if statment to find  the minimum of three numbers;
  
  class MinimumThreeNumbers{
	  public static void main(String[] args){
		  int a=10;
		  int b=20;
		  int c=30;
		  int min=a;
		if(b<min){
			min=b;
		}
		if(c<min){
			min=c;
		}
	  System.out.println("Minimum:"+min);
	  }
  }
  
  //02 Write a program to do the following patterns using for loop?
/* a)   1   1
         1 1 
          1  
         1 1 
        1   1  */
  
  class XPattern{
     public static void main(String[] args){
        int n=5;
       for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
          if(j==i || j==n-i-1){
             System.out.print("1");
         }
         else{
            System.out.print(" ");
         }
       }
          System.out.println();  
         }
     }
 }
 
 /*b)  R R R R
       R     R
       R R R R 
       R   R
       R     R */
	  
   class RPattern{
    public static void main(String[] args){
        String space = " ";
        for (int i=1; i<=5; i++){
            if (i==1 || i==3){
                for (int j=1; j<=4; j++){
                    System.out.print("R ");
                }
            } 
            else if(i==2 || i==5){
                System.out.print("R");
        for (int j=1; j<=5; j++){
            System.out.print(" ");
      }
          System.out.print("R");
     }
          else if (i==4) {
          System.out.print("R");
        for (int j=1; j<=3; j++){
            System.out.print(" ");
    }
         System.out.print("R");
            }
            System.out.println();
        }
    }
}
	  
	   
	   

  
 /* 3. Write a program to do the following patterns using forloop?
a)    1     
    2   3     
  4   5   6    
    7   8      
      9     */  
	  
	  class ForloopPattern1{
	public static void main(String[] args){
		int n = 5;
		patternA(n,1);
	
	}
	
	public static void patternA(int n, int val){
		System.out.println("This is PatternA");
        int i=0;
        while (i<n){	
			int sum = 0;
            while (sum < Math.abs(n/2-i)){
                System.out.print(" ");
                sum++;
            }   
            if (i > n/2){
                int result=0;
                while (result< n-i){	
                    System.out.print((val++) + " ");
                    result++;
                }
            } 
			else{
                int j=0;
                while (j<=i){
                    System.out.print((val++) + " ");
                    j++;
                }
            }
            System.out.println();
            i++;
        }
	}
}

/* b)   w
        w w
        w w w
        w w
        w  */
		
	class ForloopPattern{
	public static void main(String[] args)
	{
		int n = 5;
		patternB(n,'w');
	    
	}
	public static void patternB(int n, char ch){
		System.out.println("This is PatternB");
        int i = 0;
        while (i < n){
            if (i >n/2){
                int x=0;
                while (x<n-i){
                    System.out.print(ch+" ");
                    x++;
                }
            }   
		    else{
                int j=0;
                while (j<=i){
                    System.out.print(ch+" ");
                    j++;
                }
            }
            System.out.println();
            i++;
        }
    }
}			
	
	  
	//04  Write a program to do the following patterns using do...while loop;
    //a) Pascal Triangle
	  class PascalTriangle{
    public static void main(String[] args) {
        int n =5;
        int i =0;
        do{
            int space=0;
            do{
                if (space >= n-i-1) break;
                System.out.print("  ");
                space++;
            } 
            while(true);
            int j=0, num=1;
            do{
                if (j>i) break;
                System.out.print(num + "   ");
                num = num*(i-j) /(j+1);
                j++;
            }
            while (true);

            System.out.println();
            i++;
        } 
        while (i < n);
    }
}

//b) ZOHOCORPORATIONS;

class DowhileLoop{
    public static void main(String[] args) {
        String str="ZOHOCORPORATIONS";
        int i=0;
        int length=4;

        do{
            int result = Math.min(i+length,str.length());
            System.out.println(str.substring(i,result));
            i = i+length;
        } 
        while(i<=str.length());
    }
}


	

	  
  
  
  //05 Define a method to find the sum of even numbers contiune statement;
    class SumOfEven{
		public static int sumEven(int n){
			int sum=0;
			for(int i=1;i<=n;i++){
				if(i%2!=0)continue;
			  sum=sum+i;
		}
             return sum;
		}
			public static void main(String[] args){
				System.out.println("EvenSum:"+sumEven(8));
			}
			}
  
  //06 Define a method to convert the decimal number to a binary number;
  
    class BinaryNumber{
		public static void main(String[] args){
			int number=10;
			String binary="";
			int temp=number;
			while(temp>0){
				int remainder=temp%2;
				binary=binary+remainder;
				temp=temp/2;
			}
			 System.out.println("Binary Number:"+binary);
	}
	}
	
  //07 Use both if and Switch case Startment two ways find the grade of a student;
   class GradeOfStudent{
	  public static void main(String[] args){ 
		int percentage=65;
      if(percentage>=85 && percentage<=100){
	  System.out.print("Grade A");
	  }
      else if(percentage>=70){
      System.out.print("Grade B");
	  }
      else if(percentage>=50){
      System.out.println("Grade C");
	  }
      else{
        System.out.print("Fail");
	  }
    System.out.println("Grade of student:"+percentage);
	  }
   }
   //Switch startment
   class StudentOfGrade{
     public static void main(String[] args){
		 int percentage=50;
       switch(percentage/10) {
            case 10:
			     System.out.print(percentage<=100);
            case 9:
			     System.out.print("Grade A");
            case 8:  
                if (percentage >= 85){ 
                    System.out.println("Grade A");
				}
                else{
                    System.out.println("Grade B");
				}
                break;
            case 7:  
                System.out.println("Grade B");
                break;
            case 6:  
            case 5:  
                System.out.println("Grade C");
                break;
            default:
                System.out.println("Fail");	
	   }
	 }	   
   }			
			
		