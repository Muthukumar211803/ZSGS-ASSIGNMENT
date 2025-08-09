import java.util.*;
import java.io.*;

//01 Illustrates with an example of using Singleton class.

class  Singleton{
	private static Singleton instance;
	
	private Singleton(){
		System.out.println("Singleton Initialization");
	}
	 public static Singleton getInstance(){
        if (instance == null){
            
            instance = new Singleton();
        }
        return instance;
    }

    public void single(String message){
        System.out.println("Singleton:"+message);
	}
	}
    class SingleTon1{
    public static void main(String[] args){
        Singleton singleton1 = Singleton.getInstance();
        singleton1.single("Application started.");
        Singleton singleton2 = Singleton.getInstance();
        singleton2.single("User logged in.");
        System.out.println(singleton1 == singleton2);
    }
}

//02 Develop a Java program that illustrates the usage of the Comparator Interface.

 class Student{
	 private String name;
	 private int marks;
	 
	 Student(String name,int marks){
		 this.name=name;
		 this.marks=marks;
	 }
	 public String getName(){
		 return name;
	 }
	 public int getMarks(){
		 return marks;
	 }
	 public String toString(){
		 return name+""+marks;
	 }
 }
	 class MarksComparator implements Comparator<Student>{
		  public int compare(Student s1, Student s2) {
            return Integer.compare(s1.getMarks(),s2.getMarks());
		  }
	 }
 
 class NameComparator implements Comparator<Student>{
	  public int compare(Student s1,Student s2){
		  return s1.getName().compareTo(s2.getName());
	  }
 }
 
 
 class StudentMarks{
	 public static void main(String[] args){
		 List<Student> students=new ArrayList<>();
		 students.add(new Student("Maya",12));
         students.add(new Student("Muthu",20));
        students.add(new Student("Ramya",18));
        students.add(new Student("Aari",25));
		
		 System.out.println("Original list:");
        for (Student s:students){
            System.out.println(s);
        }
		System.out.println();
		
        Collections.sort(students,new MarksComparator());
        System.out.println("Sorted by marks:");
        for (Student s:students){
            System.out.println(s);
        }
		System.out.println();
		
        Collections.sort(students,new NameComparator());
        System.out.println("Sorted by name:");
        for (Student s:students){
            System.out.println(s);
        }
    }
}

//03 Develop a Java program which illustrates the usage of Comparable Interface.

  class Student1 implements Comparable<Student1>{
	  private String name;
	  private int age;
	  
	  Student1(String name,int age){
		  this.name=name;
		  this.age=age;
	  }
	  public String getName(){
		  return name;
	  }
	  public int getAge(){
		  return age;
	  }
	  public int compareTo(Student1 other){
		  return Integer.compare(this.age,other.age);
	  }
	  public String toString(){
		  return name+""+age;
	  }
  }
	  class StudentsAges{
		  public static void main(String[] args){
		  List<Student1> students=new ArrayList<>();
         students.add(new Student1("Maya",12));
         students.add(new Student1("Muthu",20));
        students.add(new Student1("Ramya",18));
        students.add(new Student1("Aari",25));
		
		 System.out.println("Original list:");
        for (Student1 s:students){
            System.out.println(s);
        }
		System.out.println();
		
        Collections.sort(students);
        System.out.println("Sorted by age:");
        for (Student1 s:students){
            System.out.println(s);
        }
		System.out.println();
		
      /*  Collections.sort(students);
        System.out.println("Sorted by name:");
        for (Student1 s:students){
            System.out.println(s);
        }*/
    }
}

//04 Get some strings through the command-line prompt and use an array to store and display them.

 class CommandLineStrings{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in); 

        System.out.print("Enter the number of strings you want to enter:");
        int num=scan.nextInt();
        scan.nextLine();

        String[] stringArray = new String[num];

        System.out.println("Enter "+num+" strings:");

        
        for (int i=0; i<num;i++){
            System.out.print(i + 1);
            stringArray[i] = scan.nextLine(); 
        }

        System.out.println("Displaying the entered strings:");

        for (int i = 0; i < stringArray.length; i++){
            System.out.println("String "+(i + 1) + ":"+stringArray[i]);
        }
    }
}

//05 Write a program to illustrate the usage of clone() and find out what kind of copy it will make.

//06 Develop a Java program to illustrate pass-by-value.
  
  class Employee{
    String name;
    Employee(String name){ 
     this.name = name; 
        
    }
}

class PassByValue{
    static void changeValue(int x){
        x=100;
    }

    static void changeName(Employee e){
        e.name="Changed"; 
    }
  public static void main(String[] args){
        int a = 20;
        System.out.println("Before:a="+a);
        changeValue(a);
        System.out.println("After:a="+a);

        Employee emp=new Employee("Muthu");
        System.out.println("Before:name="+emp.name);
        changeName(emp);
        System.out.println("After:name="+emp.name);
    }
}

//07 Develop a Java program to illustrate the usage of toString() method.

 class Employee1{
	 private int Id;
	 private String Name;
	 private int age;
	 
	 Employee1(int id,String name,int age){
		 this.Id=id;
		 this.Name=name;
		 this.age=age;
	 }
	 public String toString(){
		     
		return  "EmployeeId:"+Id+"Name:"+Name+"Age:"+age;
	 }
 } 
	 class ToString{
		 public static void main(String[] args){
		 Employee1 emp=new Employee1(10,"Kumar",18);
		 System.out.println(emp.toString());
	 }
 }
	
 /*08 Write a Java program to demonstrate the concept of object cloning using the clone() method.
--->Create a class Student with fields like name, rollNo, and department.
--->Attempt to clone an object of this class using the clone() method.
--->Catch and handle the CloneNotSupportedException if thrown.
***Also find out and explain why the class must implement the Cloneable interface to avoid CloneNotSupportedException.
-->Your program should clearly illustrate:
a. What happens if Cloneable is not implemented
b. How the error is resolved by implementing Cloneable*/

 class Student2 implements Cloneable{
	 private String name;
	 private int rollNo;
	 private String department;
	 
	 Student2(String name,int rollNo,String department){
		 this.name=name;
		 this.rollNo=rollNo;
		 this.department=department;
	 }
	 public void setName(String name){
		 this.name=name;
	 }
	 public String getName(){
		 return name;
	 }
	 public void setRollNo(int rollNo){
		 this.rollNo=rollNo;
	 }
	 public int getRollNo(){
		 return rollNo;
	 }
	 public void setDepartment(String department){
	 this.department=department;
 }
     public String getDepartment(){
		 return department;
	 }
		 
	 public Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }
	 public String toString(){
		 return "StudentName:"+name+"StudentId:"+rollNo+"StudentDepartment:"+department;
	 }
  }
  class ObjectCloning{
	  public static void main(String[] args){
		  Student2 student1=new Student2("Muthu",12,"Computer Sciance");
	   try{
          Student2 student2 = (Student2) student1.clone();
		    student2.setName("Ramya");
            student2.setRollNo(10);
			student2.setDepartment("History");
			System.out.println("Original:"+student1);
            System.out.println("Cloned:"+student2);
             System.out.println();
            System.out.println("After modifying clone:");
			 System.out.println("Original:"+student1);
            System.out.println("Cloned:"+student2);

        } 
        catch (CloneNotSupportedException e) {
            System.out.println("CloneNotSupportedException:"+e.getMessage());
        }
    }
}

	 
	 