import java.util.Scanner;


/*01 Design a Java program to maintain hospital medical records.
Create a base class named MedicalRecord that includes common attributes:
--- recordId, patientName, dateOfVisit, and diagnosis.
--- inputRecordDetails() – to input common record information.
--- override displayRecord() – to display the common record details.
‌
Create a subclass InPatientRecord that extends MedicalRecord and adds:
--- roomNumber, numberOfDaysAdmitted, roomCharges.
--- calculateTotalCharges() – to compute and return total inpatient cost.
--- displayRecord() – to include all details, including total charges.
‌
Create another subclass OutPatientRecord that extends MedicalRecord and adds:
--- doctorName, consultationFee.
--- override displayRecord() – to include all outpatient-specific details.
Include all the necessary classes if its needed.*/

class MedicalRecord{
	private int recordId;
	private String patientName;
	private String dateOfVisit;
	private String diagnosis;
	
	Scanner scan=new Scanner(System.in);
	public void inputCommonRecord(){
		System.out.println("Enter the Id number is:");
		 recordId=scan.nextInt();
		 scan.nextLine();
		System.out.println("Enter the PatientName is:");
		 patientName=scan.nextLine();
		System.out.println("Enter the DateOfVisit (dd/mm/yyyy) is:");
		 dateOfVisit=scan.nextLine();
		System.out.println("Enter the Diagnosis is:");
		 diagnosis=scan.nextLine();
	}
	public void displayRecord(){
		System.out.println("RecordId is:"+recordId);
		System.out.println("PatientName is:"+patientName);
		System.out.println("DateOfVisit is:"+dateOfVisit);
		System.out.println("Diagnosis is:"+diagnosis);
	}
}
	
	class InPatientRecord extends MedicalRecord{
		private int roomnumber;
		private int numberOfDaysAdmitted;
		private double roomCharges;
		
		public void inputInPatientRecord(){
			inputCommonRecord();
			System.out.println("Enter the roomnumber is:");
			 roomnumber=scan.nextInt();
			System.out.println("Enter the NumberOfDaysAdmitted is");
			 numberOfDaysAdmitted=scan.nextInt();
			System.out.println("Enter the RoomCharge is:");
			 roomCharges=scan.nextDouble();
		}
		
		public double calculateTotalCharges(){
			return numberOfDaysAdmitted * roomCharges;
		}
		
		public void displayRecord(){
			super.displayRecord();
			System.out.println("RoomNumber is:"+roomnumber);
			System.out.println("NumberOfDaysAdmitted:"+numberOfDaysAdmitted);
			System.out.println("RoomCharge is:"+roomCharges);
			System.out.println("TotalCharges is:"+calculateTotalCharges());
		}
	}
	class OutPatientRecord extends MedicalRecord{
		private String doctorName;
		private double consultationFee;
		
		public void inputOutPatientRecord(){
			inputCommonRecord(); 

			System.out.println("Enter the DocterName is:");
			 doctorName=scan.nextLine();
			System.out.println("Enter the ConsultationFee is:");
			 consultationFee=scan.nextDouble();
		}
		public void displayRecord(){
			super.displayRecord();
			System.out.println("DoctorName is:"+doctorName);
			System.out.println("ConsultationFee is:"+consultationFee);
		}
	}
	class Hospital{
		public static void main(String[] args){
		InPatientRecord inPatient = new InPatientRecord();
        inPatient.inputInPatientRecord();
		System.out.println("----InPatientRecord----");
		
        OutPatientRecord outPatient = new OutPatientRecord();
        outPatient.inputOutPatientRecord();
        System.out.println("----OutPatientRecord----");

        inPatient.displayRecord();
        outPatient.displayRecord();

      }
	}
				
		
  //02 Can we override private method, constructor, static method, final method? Illustrate with an example.
  
  class Parent{
	  private void show(){
        System.out.println("Parent private show()");
    }

    Parent(){
        System.out.println("Parent Constructor");
    }
	
	 static void display(){
        System.out.println("Parent static display()");
    }
	
	 final void greet(){
        System.out.println("Final is greet()");
    }
	
	}
	class Child extends Parent{
		private void show(){
        System.out.println("Child private show()");
    }
	 Child(){
        System.out.println("Child Constructor");
    }	
	static void display(){
        System.out.println("Child static display()");
    }
	/*final void greet(){
        System.out.println("Final is greet()");
    }*/
	}
	
	class Animal{
		public static void main(String[] args){
		 Parent parent=new Child();
       // parent.show();
        parent.display();
        parent.greet();
		}
	}	

/*03 Create a Java application to manage employees in a company. Define a base class Employee with a method calculateSalary(). Then create two 
subclasses FullTimeEmployee and PartTimeEmployee that override calculateSalary() method based on their working type.*/
class Employee{
    private int employeeId;
    private String employeeName;

    Employee(int id, String name){
        this.employeeId=id;
        this.employeeName =name;
    }
	double calculateSalary(){
		return 0.0;
	}

    void displayEmployeeDetails() {
        System.out.println("EmployeeID is:"+ employeeId);
        System.out.println("EmployeeName is:"+ employeeName);
    }
}

class FullTimeEmployee extends Employee{
    double monthlySalary;

    FullTimeEmployee(int id,String name,double monthlySalary){
        super(id,name);
        this.monthlySalary=monthlySalary;
    }
    double calculateSalary(){
        return monthlySalary; 
    }
}
class PartTimeEmployee extends Employee{
    int hoursWorked;
    double hourlyRate;

    PartTimeEmployee(int id,String name,int hoursWorked,double hourlyRate){
        super(id,name);
        this.hoursWorked=hoursWorked;
        this.hourlyRate=hourlyRate;
    }
    double calculateSalary(){
        return hoursWorked * hourlyRate;
    }
}
class ContractEmployee extends Employee{
	int numberOfDays;
	double amount;
	ContractEmployee(int id,String name,int days,double amount){
		super(id,name);
		this.numberOfDays=days;
		this.amount=amount;
	}
	double calculateSalary(){
		return numberOfDays*amount;
	}
}
 class Company{
    public static void main(String[] args){
        Employee emp1= new FullTimeEmployee(10,"Ravi",50000);
        Employee emp2= new PartTimeEmployee(102,"Muthu",80,500);
		Employee emp3=new ContractEmployee(101,"Rajesh",5,500);
		System.out.println("----FullTimeEmployee----");
        emp1.displayEmployeeDetails();
        System.out.println("Monthly Salary:"+emp1.calculateSalary());
        
		System.out.println("----PartTimeEmployee----");
        emp2.displayEmployeeDetails();
        System.out.println("Monthly Salary:"+emp2.calculateSalary());
		
		System.out.println("----ContractEmployee----");
        emp3.displayEmployeeDetails();
        System.out.println("Monthly Salary:"+emp3.calculateSalary());
    }
}

 //04 Design a Java Ticket Booking System using polymorphism where Bus, Train, and Flight tickets share a common method but implement booking differently.		
	  
class Ticket{
	private String passengerName;
	private String seatNumber;
	private double fare;
	Ticket(String name, String seatNo,double fare){
		this.passengerName=name;
		this.seatNumber=seatNo;
		this.fare=fare;
	}
	void booking(){
		System.out.println("Ticket Booked:");
	}
	void display(){
		System.out.println("Passenger Name is:"+passengerName);
		System.out.println("SeatNumber is:"+seatNumber);
		System.out.println("Payment fare is:"+fare);
	}
	public String getpassengerName(){
		return passengerName;
	}
	public String getseatNumber(){
		return seatNumber;
	}
	public double getfare(){
		return fare;
	}
}
 class BusTicket extends Ticket{
	 private int busNumber;
	 
	 BusTicket(int busNumber,String name,String seatNo,double fare){
		 super(name,seatNo,fare);
		 this.busNumber=busNumber;
	 }
	 void booking(){
		 System.out.println("BusTicket Booking Successful");
	 }
	 void display(){
	   System.out.println("BusNumber is:"+busNumber);
	  super.display();
 }
 }
 class TrainTicket extends Ticket{
	 private int trainNumber;
	 
	 TrainTicket(int trainNumber,String name,String seatNo,double fare){
		 super(name,seatNo,fare);
		 this.trainNumber=trainNumber;
	 }
	 void booking(){
		 System.out.println("TrainTicket Booking Successful");
	 }
	 void display(){
	   System.out.println("TrainNumber is:"+trainNumber);
	  super.display();
 }
 }
class FlightTicket extends Ticket{
	 private int flightNumber;
	 
	 FlightTicket(int flightNumber,String name,String seatNo,double fare){
		 super(name,seatNo,fare);
		 this.flightNumber=flightNumber;
	 }
	 void booking(){
		 System.out.println("FlightTicket Booking Successful");
	 }
	 void display(){
	   System.out.println("FlightNumber is:"+flightNumber);
	  super.display();
 } 
}

 class TicketBooking{
  public static void main(String[] args){
   Ticket ticket1=new BusTicket(12,"Muthu","A5",55);
   Ticket ticket2=new TrainTicket(103435,"Raj","Ac/5",250);   
	Ticket ticket3=new FlightTicket(61177,"Muthu","10F",2000);   
	ticket1.booking();
	ticket1.display();
	System.out.println();
	ticket2.booking();
	ticket2.display();
	System.out.println();
	ticket3.booking();
	ticket3.display();
 }
 }
 
 
	
	
	
	
	
	
			
			
	
	
	
	