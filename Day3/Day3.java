import java.io.*;
import java.util.*;
//01 Create a class named 'Student' with a string variable 'name' and an integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student.

class Student{
	String name;
	int Rollno;
	public static void main(String[] args){
		Student student=new Student();
		student.name="John";
		student.Rollno=2;
		
		System.out.println("Student name is:"+student.name);
	    System.out.println("Student Rollno is:"+student.Rollno);
		
	}
}


 /*02 Create a class named Student that has the following attributes:
  name (String)
  roll_no (int)
  phone_no (int)
  address (String)
  Create a constructor Student(String name, int roll_no, int phone_no, String address) and store and display the details for two students having names "Sam" and "John" respectively. */

  class SchoolStudent{
	 String name;
	 int Rollno;
	 int Phone_no;
	 String Address;
	 
	 SchoolStudent(String name,int Rollno,int Phone_no,String Address){
		 this.name=name;
		 this.Rollno=Rollno;
		 this.Phone_no=Phone_no;
		 this.Address=Address;
	 }
	 
	 void display(){
		  System.out.println("Name of the Student is:"+name);
		 System.out.println("Rollno of the Student:"+Rollno);
		 System.out.println("Phone_no of the Student is:"+Phone_no);
		 System.out.println("Address of the Student:"+Address);
		 
		
	 }
  }
  class SchoolSystem{
	 public static void main(String[] args){
		 SchoolStudent student1=new SchoolStudent("Sam",5,1376594821,"31/A main road,Tirunelveli.");
		 SchoolStudent student2=new SchoolStudent("John",3,1283567846,"31/A main road,Tirunelveli.");
		  student1.display();
		 student2.display();
		
	 }
  }	 
  
 /*03 Write a Java program where you define a class named Employee. Inside the class, define fields to hold an employee’s name, employee ID, designation, and salary.
a. First, create a no-argument constructor that prints a message saying the object has been created, and sets default values for all the fields.
b. Write a parametrized constructor that allows you to set values for all the fields when an object is created.
c. Add another constructor — a copy constructor — that takes an existing employee object and creates a new one with the same values.
In the main method, create:
a. One object using the no-argument constructor,
b. One object using the parametrized constructor,
c. And a third object using the copy constructor.
Finally, display the details of all three employees. */

 class Employee{
	 String name;
	 int empId;
	 String designation;
	 double salary;
	 //no argument constructor
	 Employee(){
		 name="Muthu";
		 empId=10;
		 designation="IT Company";
		 salary=50000;
	 }
	 //parametrized constructor
 Employee(String name,int id, String designation,double salary){
	 this.name=name;
	 this.empId=empId;
	 this.designation=designation;
	 this.salary=salary;
 }
  //copy constructor
 Employee(Employee e){
     this.name=e.name;
	 this.empId=e.empId;
	 this.designation=e.designation;
	 this.salary=e.salary;
 }
   void display(){
	   System.out.println("Employee name is:"+name);
	   System.out.println("Employee Id is:"+empId);
	   System.out.println("Employee designation is:"+designation);
	   System.out.println("Employee salary is:"+salary);
   }
		 
	 
	 public static void main (String[] args){
		 Employee emp1=new Employee();
		 emp1.display();
		 Employee emp2=new Employee();
		 emp2.name="Rajesh";
		 emp2.empId=12;
		 emp2.designation="Docter";
		 emp2.salary=40000;
		 
		 emp2.display();
		 Employee emp3=new Employee(emp2);
		 
		 emp3.display();
	 }
	 }
		 
		 
  /*04 Design the Vehicle class that stores information about a vehicle such as its vehicle ID, brand name, and price, such that it can internally keep track
  of how many vehicles have been created so far, without requiring manual counting from outside the class.*/

 class Vehicle {
    private int vehicle_id;
    private String brandname;
    private double price;
   
   static int vehiclecount=0; 
	Vehicle(int vehicle_id, String brandname, double price) {
        this.vehicle_id=vehicle_id;
        this.brandname=brandname;
        this.price=price;
        vehiclecount++;
    }
    void display(){
        System.out.println("Vehicle Id:"+vehicle_id);
        System.out.println("Brand Name:"+brandname);
        System.out.println("Price:"+price);
    }
}

 class Inventory{
    Vehicle v1;
    Vehicle v2;
    Vehicle v3;

    void displayInventory(){
        v1.display();
        v2.display();
        v3.display();
        System.out.println("Total Vehicles:"+Vehicle.vehiclecount);
    }
}
 class Main {
    public static void main(String[] args) {
        Inventory invent = new Inventory();
        invent.v1=new Vehicle(1002, "Toyota", 1000000);
        invent.v2=new Vehicle(102, "Honda", 1200000);
        invent.v3=new Vehicle(405, "Tesla", 1500000);

        invent.displayInventory();
    }
}

 /* 05 Design a simple inventory system in Java using object-oriented principles that demonstrates the use of static variables and object containment.
‌
Create two classes:
---Store
---Product
‌
Requirements:
The Store class should have:
a. storeName and storeLocation as static variables since they are common to all products in the store.
b. A static method setStoreDetails(String name, String location) to initialize the static variables.
c. A static method displayStoreDetails() to print store details.
d. A list to maintain multiple Product objects (i.e., the store contains many products).
e. A method addProduct(Product product) to add products to the store.
f. A method displayAllProducts() to display details of all products.
‌
The Product class should have:
a. Product ID, name, price, and quantity as instance variables.
b. A constructor to initialize these fields.
c. A method displayProduct() to show product details.
‌
Task:
Implement the above classes and demonstrate their use in the main() method by:
a. Setting store details once.
b. Creating multiple product objects.
c. Adding them to the store.
d. Displaying store and product information.
‌
Also Check how many .class files are generated. */

class Product{
    int productId;
    String name;
    double price;
    int quantity;

    Product(int productId, String name, double price, int quantity){
        this.productId=productId;
        this.name=name;
        this.price=price;
        this.quantity=quantity;
    }

    void display(){
        System.out.println("Product ID:"+productId);
        System.out.println("Name:"+name);
        System.out.println("Price:"+price);                  
         System.out.println("Quantity:"+quantity);
    }
}
class Store {
    static String storeName;
    static String storeLocation;
    Product p1;
    Product p2;
    Product p3;
    
    static void setStoreDetails(String name, String location){
        storeName=name;
        storeLocation=location;
    }
    static void displayStoreDetails(){
        System.out.println("Store Name: " + storeName);
        System.out.println("Store Location: " + storeLocation);
    }
    
    void displayAll(){
        p1.display();
        p2.display();
        p3.display();
    } 
}
  class Main1{
    public static void main(String[] args){
        Store.setStoreDetails("SuperMart", "Tirunelveli");
        Store store = new Store();
     store.p1 = new Product(101, "Laptop", 55000, 5);
      store.p2 = new Product(102, "Mobile", 20000, 10);
      store.p3 = new Product(103, "Headphones", 500, 50);
        Store.displayStoreDetails();
        store.displayAll();
    }
}


/*06 Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name Year of joining Address
Robert 1994 64C- WallsStreat
Sam 2000 68D- WallsStreat
John 1999 26B- WallsStreat
Can use format method to format the above said output.*/

class ThreeEmployee{
    String name;
    int yearOfJoining;
    String address;

    ThreeEmployee(String name,int yearOfJoining,String address){
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }
    void display(){
       
        System.out.format("%-10s %-15d %-20s\n", name, yearOfJoining, address);
    }
}

  class Main2 {
    public static void main(String[] args){
        ThreeEmployee emp1 = new ThreeEmployee("Robert", 1994, "64C- WallsStreat");
        ThreeEmployee emp2 = new ThreeEmployee("Sam", 2000, "68D- WallsStreat");
        ThreeEmployee emp3 = new ThreeEmployee("John", 1999, "26B- WallsStreat");

        System.out.format("%-10s %-15s %-20s\n", "Name", "Year of joining", "Address");
        emp1.display();
        emp2.display();
        emp3.display();
    }
}


		 
		 
		 
	 
		 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 

		 
		 
		 
		 
		 