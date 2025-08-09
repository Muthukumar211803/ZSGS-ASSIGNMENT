	import java.util.Scanner;
/*01 Write a program to implement bank functionality in the above scenario. Note: Create few classes namely Customer, Account, RBI (Base Class) and few 
derived classes (SBI, ICICI, PNB etc). Assume and implement required member variables and methods in each class.
Hint:
class Customer
{
//Personal Details ...
// Few functions ...
}
class Account
{
// Account Detail ...
// Few functions ...
}
abstract class RBI
{
Customer c; //hasA relationship
Account a; //hasA relationship
..
public abstract double getInterestRate();
public abstract double getWithdrawalLimit();
}
class SBI extends RBI
{
	
//Use RBI functionality or define own functionality.
}
class ICICI extends RBI
{
//Use RBI functionality or define own functionality.
}*/

class Customer{
	private int customerId;
	private String customerName;
	private String Address;
	private long phoneNumber;

  public void setCustomerId(int customerId){
	  this.customerId=customerId;
  }
  public void setCustomerName(String customerName){
	  this.customerName=customerName;
  }
  public void setAddress(String Address){
	  this.Address=Address;
  }
  public void setPhoneNumber(long phoneNumber){
	  this.phoneNumber=phoneNumber;
  }
  public int getCustomerId(){
	  return customerId;
  }
  public String getCustomerName(){
	  return customerName;
  }
  public String getAddress(){
	  return Address;
  }
  public long getPhoneNumber(){
	  return phoneNumber;
  }
  public void customerDetails(){
	   System.out.println("CustomerId is:"+customerId);
	   System.out.println("CustomerName is:"+customerName);
	   System.out.println("Address is"+Address);
	   System.out.println("PhoneNumber is:"+phoneNumber);
   }
}
   class Account{
	   private long accountNumber;
	   private double balance;
	   private String accountType;
	   
	   public void setAccountNumber(long accountNumber){
		   this.accountNumber=accountNumber;
	   }
	   public void setBalance(double balance){
		   this.balance=balance;
	   }
	   public void setAccountType(String accountType){
		   this.accountType=accountType;
	   }
	   public long getAccountNumber(){
		   return accountNumber;
	   }
	   public double getBalance(){
		   return balance;
	   }
	   public String getAccountType(){
		   return accountType;
	   }
	   public void accountDetails(){
		   System.out.println("AccountNumber is:"+accountNumber);
		   System.out.println("Balance is:"+balance);
		   System.out.println("AccountType is:"+accountType);
	   }
   }
   abstract class RBI{
	   Customer customer;
	   Account account;
	   
	   RBI(Customer c, Account a) {
        this.customer = c;
        this.account = a;
    }
		  public abstract double getInterestRate();
	   public abstract double getWithdrawalLimit();
     
	   public void bankDetails(){
		   customer.customerDetails();
		   account.accountDetails();
		   
		   System.out.println("InterestRate is:"+getInterestRate());
		   System.out.println("Withdrawal is:"+getWithdrawalLimit());
	   }
   }
   class SBI extends RBI{
	   SBI(Customer c,Account a){
	   super(c, a);
	   }
	   public  double getInterestRate(){
		   return 5.0;
	   }
	   public double getWithdrawalLimit(){
		   return 50000;
	   }
   }
   class ICICI extends RBI{
	   ICICI(Customer c,Account a){
	   super(c, a);
	   }
	   public double getInterestRate(){
		   return 5.5;
	   }
	   public double getWithdrawalLimit(){
		   return 40000;
	   }
   }
   class PNB extends RBI{
	   PNB(Customer c,Account a){
	   super(c,a);
	   }
	   public double getInterestRate(){
		   return 6.0;
	   }
	   public double getWithdrawalLimit(){
		   return 60000;
	   }
   }
	   
   class BankSystem{
     public static void main(String[] args){
		Account account=new Account();
         account.setAccountNumber(05243763456L);
		 account.setBalance(50000);
		 account.setAccountType("Saving");
		 
		 Customer customer=new Customer();
		 customer.setCustomerId(105);
		 customer.setCustomerName("Raji");
		 customer.setAddress("39/A Main road melapalayam.");
		 customer.setPhoneNumber(9876545647L);
		 
	   Scanner scan=new Scanner(System.in);
	    System.out.println("Select the Bank:");
	   System.out.println("1.SBI");
		System.out.println("2.ICICI");
	   System.out.println("3.PNB");
		int choice=scan.nextInt();
		RBI bank;
		switch(choice){
		   case 1:
		     bank=new SBI(customer,account);
			 break;
			 case 2:
			 bank=new ICICI(customer,account);
			 break;
			 case 3:
			 bank=new PNB(customer,account);
			 break;
		default:
                 System.out.println("Invalid Choice.");
                 return;
        }
         bank.bankDetails();
    }
}	 
			
	   
	   
			   
	  
 /*02 Design a Payment Gateway System using an interface named PaymentMethod with a method pay(double amount). Implement this interface in 
 different classes like CreditCardPayment, DebitCardPayment, and UPIPayment. Write a main class where you can accept payment using different 
 methods.*/
 interface PaymentMethod{
    void pay(double amount);
}

class CreditCardPayment implements PaymentMethod{
    private String cardNumber;
    private String cardHolderName;
    private String expiryDate;
    private int cvv;

    CreditCardPayment(String cardNumber,String cardHolderName,String expiryDate,int cvv) {
        this.cardNumber=cardNumber;
        this.cardHolderName=cardHolderName;
        this.expiryDate=expiryDate;
        this.cvv=cvv;
    }
	public void pay(double amount) {
       System.out.println("Verifying credit card details");
        System.out.println("Payment of Rs."+amount+"successful using Credit Card of "+cardHolderName);
   }
   }
class DebitCardPayment implements PaymentMethod{
    private String cardNumber;
    private String bankName;

    DebitCardPayment(String cardNumber,String bankName){
        this.cardNumber = cardNumber;
        this.bankName = bankName;
    }
    public void pay(double amount){
        System.out.println("Checking balance with"+ bankName);
         System.out.println("Payment of Rs."+amount+"successful using Debit Card from"+bankName);
   }
}

class UPIPayment implements PaymentMethod {
    private String upiId;
    private int pin;

    UPIPayment(String upiId,int pin) {
        this.upiId=upiId;
        this.pin=pin;
    }
    public void pay(double amount) {
        System.out.println("Verifying UPI ID"+ upiId);
        System.out.println("Payment of Rs."+amount+"successful using UPI.");
    }
}
 class GatewaySystem{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter amount to pay:");
         double amount = scan.nextDouble();

        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. Debit Card");
        System.out.println("3. UPI");
          int choice = scan.nextInt();
      PaymentMethod payment;
       switch(choice) {
            case 1:
                System.out.print("Enter CardNumber is:");
                  String ccNumber = scan.next();
                System.out.print("Enter CardHolderName is:");
                  String ccName = scan.next();
                System.out.print("Enter ExpiryDate (MM/YY) is:");
                  String expiry = scan.next();
                System.out.print("Enter CVV is:");
                  int cvv = scan.nextInt();
                  payment = new CreditCardPayment(ccNumber,ccName,expiry,cvv);
                 break;

         case 2:
                System.out.print("Enter CardNumber is:");
                  String dcNumber = scan.next();
                System.out.print("Enter BankName is:");
                   String bankName = scan.next();
                    payment = new DebitCardPayment(dcNumber, bankName);
                   break;

         case 3:
                System.out.print("Enter UPIID is:");
                 String upiId = scan.next();
                System.out.print("Enter PIN is:");
                 int pin = scan.nextInt();
                 payment = new UPIPayment(upiId,pin);
                 break;

         default:
                 System.out.println(" Payment Cancelled.");
                 return;
        }
         payment.pay(amount);
    }
}

/*03 Create a Java application to manage employees in a company. Define an abstract class Employee with a method calculateSalary(). Then create
 two subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. Demonstrate runtime 
 polymorphism by calling calculateSalary() on different types of employees using the Employee reference.*/
  abstract class Employee{
	  private int employeeId;
	  private String employeeName;
	  private double basicAmount;
	  
	  Employee(int empId,String emp_name,double amount){
		  this.employeeId=empId;
		  this.employeeName=emp_name;
		  this.basicAmount=amount;
	  }
	 double calculateSalary(){
		  return 0.0;
	  }
	  void display(){
		  System.out.println("Employee Id is:"+employeeId);
		  System.out.println("Employee Name is:"+employeeName);
		  System.out.println("Basic Amount is:"+basicAmount);
	  }
  }
  class FullTimeEmployee extends Employee{
	 private double monthlySalary;
	 
	 FullTimeEmployee(int empId,String emp_name,double monthlySalary){
		 super(empId,emp_name,monthlySalary);
		 this.monthlySalary=monthlySalary;
	 }
	 double calculateSalary(){
		 return monthlySalary;
	 }
	 
  }
	 
   class PartTimeEmployee extends Employee{
       int hoursWorked;
       double hourlyRate;

    PartTimeEmployee(int empId,String emp_name,int hoursWorked,double hourlyRate){
        super(empId,emp_name,hoursWorked*hourlyRate);
        this.hoursWorked=hoursWorked;
        this.hourlyRate=hourlyRate;
    }
    double calculateSalary(){
        return hoursWorked * hourlyRate;
    }
}
 class Company{
	 public static void main(String[] args){
	 Employee emp1=new FullTimeEmployee(102,"Raj",12000);
	 Employee emp2=new PartTimeEmployee(105,"ravi",5,500);
	 
	 emp1.display();
	 System.out.println("Monthly Salary is:"+emp1.calculateSalary());
	 emp2.display();
	 System.out.println("Monthiy Salary is:"+emp2.calculateSalary());
 }
}
/*04 Create a Java application to manage employees in a company. Define an Interface Employee with a method calculateSalary(). Then create two 
subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type. Demonstrate runtime 
polymorphism by calling calculateSalary() on different types of employees using the Employee reference.*/
interface Employees{
	double calculateSalary();
	void display();
}
class FullTimeEmployee1 implements Employees{
	private int employeeId;
	  private String employeeName;
	 private double monthlySalary;
	  
	FullTimeEmployee1(int empId,String emp_name,double monthlySalary){
		  this.employeeId=empId;
		  this.employeeName=emp_name;
		  this.monthlySalary=monthlySalary;
	}
	public double calculateSalary(){
		return monthlySalary;
	}
	public void display(){
		System.out.println("Employee Id is:"+employeeId);
		System.out.println("Employee Name is:"+employeeName);
		System.out.println("Employee job is:FullTime");
		
	}
}
class PartTimeEmployee1 implements Employees{
	private int employeeId;
	  private String employeeName;
	  private int hoursWorked;
	  private double hourlyRate;
  PartTimeEmployee1(int empId,String emp_name,int hoursWorked,double hourlyRate){ 
    	this.employeeId=empId;
		  this.employeeName=emp_name;
		  this.hoursWorked=hoursWorked;
		  this.hourlyRate=hourlyRate;
  }
  public double calculateSalary(){
	   return  hoursWorked * hourlyRate;
  }
  
  public void display(){
		System.out.println("Employee Id is:"+employeeId);
		System.out.println("Employee Name is:"+employeeName);  
	    System.out.println("Employee job is:PartTime");
  }
}
 class CompanyEmployee{
	 public static void main(String[] args){
		 Employees ep1= new FullTimeEmployee1(10,"Raji",10000);
		 Employees ep2=new PartTimeEmployee1(65,"Vasan",10,200);
		 
	    ep1.display();
		System.out.println("MonthlySalary is:"+ep1.calculateSalary());
		System.out.println();
		
		ep2.display();
		System.out.println("MonthlySalary is:"+ep2.calculateSalary());
	 }
 }

/*05 Develop a Java application for a Ticket Booking System that allows users to book tickets for different types of transportation modes such as Bus, Train, and Flight.
Define a common interface or abstract class Ticket with a method bookTicket() that each transportation mode must implement differently.
Create classes BusTicket, TrainTicket, and FlightTicket that extend the abstract class or implement the interface.
Demonstrate runtime polymorphism by calling the bookTicket() method using a reference of the base class/interface.*/	 
		  
  interface Ticket{
	  void bookTicket();
  }
  class BusTicket implements Ticket{
	  private String passengerName;
	  private String busNumber;
	private String seatNumber;
	private double busFare;
	BusTicket(String passengerName,String busNumber,String seatNumber,double busFare){
		this.passengerName=passengerName;
		this.busNumber=busNumber;
		this.seatNumber=seatNumber;
		this.busFare=busFare;
	}
	public void bookTicket(){
		System.out.println("BusTicket Booking Successfully:");
		System.out.println("Passenger Name is:"+passengerName);
		System.out.println("BusNumber is:"+busNumber);
		System.out.println("SeatNumber is:"+seatNumber);
		System.out.println("Payment fare is:"+busFare);
	}
  }
 class TrainTicket implements Ticket{
	  private String passengerName;
	  private String trainNumber;
	private String seatNumber;
	private double trainFare;
	TrainTicket(String passengerNamename,String trainNumber,String seatNumber,double trainFare){
		this.passengerName=passengerNamename;
		this.trainNumber=trainNumber;
		this.seatNumber=seatNumber;
		this.trainFare=trainFare;
	}
	public void bookTicket(){
		System.out.println("TrainTicket Booking Successfully:");
		System.out.println("Passenger Name is:"+passengerName);
		System.out.println("TrainNumber is:"+trainNumber);
		System.out.println("SeatNumber is:"+seatNumber);
		System.out.println("Payment fare is:"+trainFare);
	}
  }
  class FlightTicket implements Ticket{
	  private String passengerName;
	  private String flightNumber;
	private String seatNumber;
	private double flightFare;
	FlightTicket(String passengerName,String flightNumber,String seatNumber,double flightFare){
		this.passengerName=passengerName;
		this.flightNumber=flightNumber;
		this.seatNumber=seatNumber;
		this.flightFare=flightFare;
	}
	public void bookTicket(){
		System.out.println("FlightTicket Booking Successfully:");
		System.out.println("Passenger Name is:"+passengerName);
		System.out.println("FlightNumber is:"+flightNumber);
		System.out.println("SeatNumber is:"+seatNumber);
		System.out.println("Payment FlightFare is:"+flightFare);
	}
  }
	class TicketBooking{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Select TicketBooking:");
        System.out.println("1.BusTicket");
        System.out.println("2.TrainTicket");
        System.out.println("3.FlightTicket");
          int choice = scan.nextInt();
      Ticket ticket;
       switch(choice) {
          case 1:
                System.out.print("Enter PassengerName is:");
                  String passengerName = scan.next();
                System.out.print("Enter BusNumber is:");
                  String busNumber = scan.next();
                System.out.print("Enter SeatNumberis:");
                   String seatNumber = scan.next();
                System.out.print("Enter busFare is:");
                  double busFare = scan.nextDouble();
                  ticket=new BusTicket(passengerName,busNumber,seatNumber,busFare);
                 break;

         case 2:
                System.out.print("Enter PassengerName is:");
                  String passengerName1 = scan.next();
                System.out.print("Enter TrainNumber is:");
                   String trainNumber = scan.next();
                System.out.print("Enter SeatNumberis:");
                   String seatNumber1 = scan.next();
                System.out.print("Enter TrainFare is:");
                  double trainFare = scan.nextDouble();
                  ticket=new TrainTicket(passengerName1,trainNumber,seatNumber1,trainFare);
                 break;

         case 3:
                System.out.print("Enter PassengerName is:");
                  String passengerName2 = scan.next();
                System.out.print("Enter FlightNumber is:");
                  String flightNumber = scan.next();
                System.out.print("Enter SeatNumber is:");
                   String seatNumber2 = scan.next();
                System.out.print("Enter FlightFare is:");
                   double flightFare = scan.nextDouble();
                  ticket=new FlightTicket(passengerName2,flightNumber,seatNumber2,flightFare);
                 break;

         default:
                 System.out.println(" Booking Cancelled.");
                 return;
        }
         ticket.bookTicket();
    }
}	
		
			   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		   
		  