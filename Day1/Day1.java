import java.util.*;
//01 write a code to illustrate variable;

class FindVariable {
    static String num = "Ravi"; 
    String name1 = "Muthu"; 
    {
     System.out.println("This is the Block");
	}	
  public FindVariable(){
        String name2="Rani";
		System.out.println("name"+name2);
        
    }
	final String name3="vel";
        		

    public static void main(String[] args) {
        FindVariable obj = new FindVariable(); 
        System.out.println("Instance:"+ obj.name1);
	System.out.println("Static:"+ FindVariable.num);
	System.out.println("final:"+obj.name3);
	
	}
    }
	
//02 write a program all datatypes;
  class Datatypes{
	public static void main(String[] args){
		int i=15;
		double d=30.5;
		float f=15.75f;
		long l=123456789L;
		char c='A';
		byte b=100;
		System.out.println("int:"+i);
	System.out.println("double:"+d);
		System.out.println("float;"+f);
		System.out.println("long:"+l);
		System.out.println("char;"+c);
		System.out.println("byte:"+b);
  }
  }
 
 //03 write a program maximum two number using ternary operator;
     class MaximumTwoNumber{
		 public static void main (String[] args){
			 int a=20;
			 int b=25;
			 int maximum=(a>b)?a:b;
			 System.out.println("Maximum:"+maximum);
		 }
	 }

//04 Write a program check two number are equal or not using comparision operator;
 class TwoNumberEqualOrNot{
	 public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
        int result= a^b;
		boolean[] valid=new boolean[result+1];
		   valid[result]=true;
         if(valid[0]){
          System.out.println("Equal");
		 }
          else{
           System.out.println("Not Equal");
		  }
	 }		  
 } 
 
 //05 write a program that illustrate the execution order of static block and initialiter block;
 class Student{
	 
	static{
		System.out.println("Static Block");
	}
	{
		System.out.println("Initialiter Block");
	}
		 
	 
	 public static void main(String[] args){
		 Student obj=new Student();
	 }
 }
 //06 write a program that illustrate the Explicit type casting;
  class ExplicitTypeCasting{
	 public static void main(String[] args){
		double d=10.00;
		System.out.println("double d is"+d);
		int i=(int)d;
		System.out.println("int i is"+i);
	 }
  } 
  
  //07 write a program to check if a number is a power of 2;
   class PowerNumber{
	   public static void main(String[]args){
		   boolean result=false;
		   int n=33;
		   int index=0;
		   int temp=0;
		   while(temp<n){
			   temp=(int)(Math.pow(2,index));
			   index++;
		   if(temp==n){
		   result=true;
		 }
		 }
		 if(result){
			 System.out.println(true);
		 }
		 else{
			 System.out.println(false);
		 }
	   }
   }
   
   //08 write a program to find the first set bit of a number;
   class FirstSetBit{
	   public static void main(String[] args){
		   int num=16;
		   String binary="";
		   int temp=num;
		   while(temp>0){
			   int remainder=temp%2;
			   binary=binary+remainder;
			   temp=temp/2;
		   }
		   int count=1;
		   for(int i=0;i<binary.length()-1;i++){
		   if(binary.charAt(i)=='0'){
			   count++;
		   }
		   else{
			   break;
		}
		   }
	   System.out.println(count);
	   }
   }
   
   //09write a class Employee with attributes;
    class Employee{
		  int empid;
		  String name;
		  String department;
		  double salary;
		  Employee(int empid,String name,String department,double salary){
			  this.empid=empid;
			  this.name=name;
			  this.department=department;
			  this.salary=salary;
		  }
		  void display(){
			  System.out.println("Empid:"+empid);
			  System.out.println("Name:"+name);
			  System.out.println("Department:"+department);
			  System.out.println("Salary:"+salary);
		  }
		  public static void main(String[] args){
			  
			  Employee emp=new Employee(2,"muthu","team leader",18000);
			   emp.display();
		  }
	  }
	  
//10 Write a program to check Whether the object is an instance of a particular class;
class Instance{
	int a=10;
	String str="instance";
	
	public void display(){
		System.out.println("String Str:"+str);
		System.out.println("a:"+a);
	}
    public static void main(String[] args){
		Instance obj=new Instance();
		
		obj.display();
	}
}

	
		
	
	 
		   
   
	 
	  
	
	

 