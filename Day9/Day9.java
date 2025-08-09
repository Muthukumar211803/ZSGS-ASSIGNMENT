 import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;


/*01  int[] arr = {2, 5, 1, 4, 0, 7};
int quotient = arr[7] / arr[4];
Develop a Java program which handles any unexpected situations that may arise during execution.*/

 class ExceptionHandling{
    public static void main(String[] args){
        int[] arr={2,5,1,4,0,7};

        try{
            int quotient=arr[7]/arr[4];  
            System.out.println("Quotient:"+ quotient);
        } 
          catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error:Trying to access an invalid array index");
        } 
          catch (ArithmeticException e) {
            System.out.println("Error:Division by zero is not allowed");
        } 
         catch (Exception e) {
            System.out.println("Unexpected Error:"+e.getMessage());
        }

    }
}

/*02 Demonstrate multiple catch blocks: accept two numbers as strings, then convert them to integers, and perform division, and catch the following 
  exceptions: InputMismatchException, NumberFormatException, ArithmeticException and Exception.*/

class MultipleCatch{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        
        try {
            System.out.print("Enter first number:");
            String str1 = scan.nextLine();
            System.out.print("Enter second number:");
            String str2 = scan.nextLine();
            
            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);
            
            int result=num1/num2;
            System.out.println("Result:"+result);
        } 
        catch(InputMismatchException e){
            System.out.println("Error:Invalid input type");
        } 
        catch(NumberFormatException e){
            System.out.println("Error:Please enter valid integer numbers");
        } 
        catch(ArithmeticException e){
            System.out.println("Error:Division by zero is not allowed");
        } 
        catch(Exception e){
            System.out.println("Unexpected Error:"+e.getMessage());
        }

    }
}

//03 Write a program to illustrate how to throw a ClassNotFoundException.

 class NotFoundException{
    public static void main(String[] args){
        try{
            Class.forName("Student class");
            System.out.println("Class all Student presant successfully");
            
        } 
		catch (ClassNotFoundException e){
            System.out.println("Caught ClassNotFoundException:"+e.getMessage());
        }

        System.out.println("Program continues after handling the exception.");
    }
}

//04 Write a method to parse a string to an integer. Throw an exception if the string is not a valid number. Handle it using try-catch.

 class ExceptionValidNumber{
	 public static void main(String[] args){
		 Scanner scan=new Scanner(System.in);
		   String str=scan.nextLine();
			
        try{
            int number=Integer.parseInt(str);
            System.out.println(number);
        }
        catch (NumberFormatException e){
          System.out.println("Error:InValid number is:"+e.getMessage());
        }
                                           
	   System.out.println("Program continues after handling the exception.");
    }
}

//05 Create a program where the try block contains a return statement. Ensure that the finally block executes before the method returns. Show this with output.
  class FinallyBlockReturn{
     public static int getValue(){
        try{
            System.out.println("Inside try block.");
            return 50; 
        } 
		finally{
            System.out.println("Inside finally block."); 
        }
    }
      public static void main(String[] args) {
        int result=getValue();
        System.out.println("Method returns:"+result);
	  }
} 
  
 /*06 Write a Java program to accept a 4-digit ATM PIN from the user and validate whether it meets the following conditions:
--->It must be exactly 4 digits long.
--->It should contain only numeric characters.
--->It must not start with 0.
Display an appropriate message whether the PIN is valid or invalid.*/

class ValidPinNumber{
	public static void main(String[] args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the PinNumber is:");
		
		try{
			int pin=scan.nextInt();
		if(pin>=1000 && pin<=9999){
			System.out.println("Valid Pin");
		}
		else{
			System.out.println("InValid Pin");
		}
		}
		catch(Exception e){
            System.out.println("Invalid Pin only number print");
        }
	}
}

/*07 Write a Java program that shows exception propagation across multiple methods (method1 calls method2 calls method3, which throws the exception). 
  Handle the exception in method1.*/
   class Propagation{
	   public static void method1(){
		   try{
			   System.out.println("Call by method1");
			   method2();
		   }
		   catch(ArithmeticException e){
			   System.out.println("Error exception is:"+e);
		   }
		   System.out.println("End of the Method1");
	   }
	   public static void method2(){
		   System.out.println("Call by method2");
		   method3();
		   System.out.println("End of the Method2");
	   }
	     public static void method3(){
			 System.out.println("Call by Method3");
			 int result=20/2;
			 System.out.println("Result:"+result);
			 System.out.println("End of the Method3");
		 }
		 public static void main(String[] args){
			 
			 method1();
			 System.out.println("Program continues after handling the exception.");
		 }
   }
   
  //08 Design a login system that throws AuthenticationException if the username or password is incorrect. Handle it and display a login failure message.
class AuthenticationException extends Exception{
    public AuthenticationException(String message){
        super(message);
    }
}
 class Registation{
	 public static void main(String[] args){
		 Scanner scan=new Scanner(System.in);
		 System.out.println("Enter the username is:");
		  String username=scan.nextLine();
		 System.out.println("Enter the password is:");
		   String password=scan.nextLine();
		   
		   try{
			   login(username,password);
		   }
		   catch(AuthenticationException e){
			   System.out.println("Login failed:"+e.getMessage());
		   }
	 }
	public static void login(String username,String password) throws AuthenticationException{
	      
		  String correctusername="Muthu";
		  String correctpassword="4506";
		  
		  if(!username.equals(correctusername) ||!password.equals(correctpassword)){
			  throw new AuthenticationException("Invalid username or password");
        }
        
        System.out.println("Login successful.welcome" + username);
    }
	 
 }
 
 //09 Create a method to read a file from disk. Handle FileNotFoundException and IOException using try-catch-finally.
    
	class FileDisk{
		public static void main(String[] args){
			String FileName="Index.txt";
			try{
				BufferedReader bufferedReader=new BufferedReader(new FileReader(FileName));
				String line;
                while((line=bufferedReader.readLine())!=null){
                System.out.println(line);
            }
			}
			catch(FileNotFoundException e){
				System.out.println("FilenotFoundException is:"+e.getMessage());
			}
			catch(IOException e){
				System.out.println("IOException is:"+e.getMessage());
			}
			finally{
				System.out.println("Finally block execuded");
			}
		}
	}
			
				
/*10.Write a Java program to manage a voting system where a person must be at least 18 years old to be eligible to vote. Use a custom exception to handle the
 scenario when an ineligible person tries to register for voting. Display appropriate messages for eligible and ineligible voters.*/		
	

class IneligibleVoterException extends Exception {
    public IneligibleVoterException(String message) {
        super(message);
    }
}

 class VotingSystem{
    public static void registerVoter(String name, int age) throws IneligibleVoterException{
        if (age < 18){
            throw new IneligibleVoterException(name+ ":is not eligible to vote.");
        }
        System.out.println(name +":is eligible to vote.Registration successful!");
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number of voters to register:");
        int n = scan.nextInt();
        scan.nextLine(); 

        for (int i=1; i<=n;i++){
            System.out.print("Enter name of voter:"+i);
            String name = scan.nextLine();

            System.out.print("Enter age of:"+name);
            int age=scan.nextInt();
            scan.nextLine();

            try{
                registerVoter(name,age);
            } 
            catch (IneligibleVoterException e){
                System.out.println("Registration failed:"+ e.getMessage());
            }
            finally{
                System.out.println("Registration attempt completed for:"+ name);
            }
        }
        System.out.println("All voter registrations processed.");
    }
}