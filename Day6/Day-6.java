import arithmetic.Arithmetic;
import strings.Strings;
import travel.user.User;


 class GatewaySystem{
 
  private int transid;
  private String payer_name;
  private String payee_name;
  private double amount;
  private String payment_method;
  private String tran_status;
   
   public void settransid(int id){
      transid=id;
   }

   public int gettransid(){
	   return transid;
   }
   public void setpayer_name(String payername){
	   payer_name=payername;
   }
   public String getpayer_name(){
	   return payer_name;
   }
   public void setpayee_name(String payeename){
	   payee_name=payeename;
   }
   public String getpayee_name(){
	   return payee_name;
   }
   public void setamount(double pay){
	   amount=pay;
   }
   public double getamount(){
	   return amount;
   }
   public void setpayment_method(String paymentmethod){
	   payment_method=paymentmethod;
   }
   public String getpayment_method(){
	   return payment_method;
   }
   public void settrans_status(String status){
	   tran_status=status;
   }
   public String gettrans_status(){
	   return tran_status;
   }
   void display(){
	   System.out.println("GatewaySyatem is Id:"+gettransid());
	   System.out.println("GatewaySyatem is payername:"+getpayer_name());
	   System.out.println("GatewaySyatem is payeename:"+getpayee_name());
	   System.out.println("GatewaySyatem is amount:"+getamount());
	   System.out.println("GatewaySyatem is paymentmethod:"+getpayment_method());
	   System.out.println("GatewaySyatem is transstatus:"+gettrans_status());
   }
   
   	   public static void main(String[] args){
		   GatewaySystem gateway=new GatewaySystem();
		   gateway.settransid(100);
		   gateway.setpayer_name("Muthu");
		   gateway.setpayee_name("kumar");
		   gateway.setamount(10000);
		   gateway.setpayment_method("Google pay");
		   gateway.settrans_status("Transaction successful");
		   
		   gateway.display();
	   }
 }
	   
//02 create a java application that demonstrates the use of user-defined packages;

class PaymentSystem{
	public static void main(String[] args){
		Arithmetic ar=new Arithmetic();
	System.out.println("Addition:"+ar.addition(10,20));
	   System.out.println("Subtraction:"+ar.subtraction(20,10));
	   System.out.println("Multiplication:"+ar.multiplication(10,5));
	   System.out.println("Division:"+ar.division(10,2));
	   System.out.println("Modulo:"+ar.modulo(10,3));
	
	  Strings str=new Strings();
	  System.out.println("Concatention is:"+str.concatenation("Muthu","Kumar"));
	  System.out.println("Reverse is:"+str.reverse("MuthuKumar"));
	  System.out.println("Length is:"+str.length("MuthuKumar"));
	}
}

//03 Design a class Employee with private data member:calculate and return the annual salary of the employee;

 class Employee{
	 private int emp_id;
	 private String emp_name;
	 private String emp_designation;
	 private String emp_department;
	 private double emp_monthlysalary;
	 
	 public void setemp_id(int id){
        emp_id=id;
	 }
     public int getemp_id(){
       return emp_id;
	 }
     public void setemp_name(String name){
       emp_name=name;
  }	  
    public String getemp_name(){
         return emp_name;
	}		
     public void setemp_designation(String designation){
		 emp_designation=designation;
	 }
	 public String getemp_designation(){
		 return emp_designation;
	 }
	 public void setemp_department(String department){
		 emp_department=department;
	 }
	 public String getemp_department(){
		 return emp_department;
	 }
	 public void setemp_monthlysalary(double salary){
		 emp_monthlysalary=salary;
	 }
	 public double getemp_monthlysalary(){
		 return emp_monthlysalary;
	 }
	 
	 void display(){
		 System.out.println("Employee id is:"+getemp_id());
		 System.out.println("Employee  name is:"+getemp_name());
		 System.out.println("Employee designation is:"+getemp_designation());
		 System.out.println("Employee department is:"+getemp_department());
	     System.out.println("Employee monthlysalary is:"+getemp_monthlysalary());
		   double annualsalary=emp_monthlysalary*12;
	     System.out.println("Employee Annualsalary:"+annualsalary);
	 }
		   
		public static void main(String[] args){
		 Employee emp = new Employee();
           emp.setemp_id(100);
		   emp.setemp_name("Ravi");
		   emp.setemp_designation("IT Company");
		   emp.setemp_department("Softwere Developer");
		   emp.setemp_monthlysalary(50000);
		    emp.display();
		}
 }
 
 //04  Design a travel booking system using two packages:

  class TicketMain{
    public static void main(String[] args){
	 User user=new User();
	 user.setuser_id(1100);
	 user.setuser_name("Arun");
	 user.setuser_email("arun2118@gmail.com");
	 
	 user.bookTicket();
 }
}

//05 Design a class named BankAccount that uses the concept of encapsulation. The class should have the following private data members: 
   class BankAccount{
	  private int account_number;
	  private String account_holdername;
	  private double balance;
	  
  public void setaccount_number(int number){
	  account_number=number;
  }
  public int getaccount_number(){
	  return account_number;
  }
  public void setaccount_holdername(String name){
	  account_holdername=name;
  }
  public String getaccount_holdername(){
	  return account_holdername;
  }
  public void setbalance(double initialBalance){
	  balance=initialBalance;
  }
  public double getbalance(){
	  return balance;
  }
  
  public void deposit(double amount){
        if(amount>0){
            balance =balance+amount;
            System.out.println("Deposit successful.Balance: "+balance);
        } 
		else {
            System.out.println("Invalid deposit amount.");
        }
    }
	
	public void withdraw(double amount){
        if(amount>0 && amount<=balance){
            balance = balance-amount;
            System.out.println("Withdrawal successful.Balance:"+balance);
        } 
		else{
            System.out.println("Invalid amount.");
        }
    }
    
	public static void main(String[] args){
		BankAccount bank=new BankAccount();
		bank.setaccount_number(123456789);
		bank.setaccount_holdername("John");
		bank.setbalance(2000.0);
		
		bank.deposit(300);
		bank.withdraw(500);
		
		System.out.println("Account current balance:"+bank.getbalance());
	}
}

  
  