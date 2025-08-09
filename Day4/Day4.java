import java.util.Scanner;

 /* 01 We want to store the information about different vehicles. Create a class named Vehicle with two data member named mileage and price. Create its two subclasses
---Car with data members to store ownership cost, warranty (by years), seating capacity and fuel type (diesel or petrol).
---Bike with data members to store the number of cylinders, number of gears, cooling type(air, liquid or oil), wheel type(alloys or spokes) and fuel tank size(in inches)
Make another two subclasses Audi and Ford of Car, each having a data member to store the model type.
Next, make two subclasses Bajaj and TVS, each having a data member to store the make-type.
Now, store and print the information of an Audi and a Ford car (i.e. model type, ownership cost, warranty, seating capacity, fuel type, mileage and price.) Do the same for a Bajaj and a TVS bike.*/
 class Vahicle{
	 double mileage;
	 double price;
 Vahicle(double mileage,double price){
	 this.mileage=mileage;
	 this.price=price;
 }
 }
 class Car extends Vahicle{
	 double ownership_cost;
	 int warranty;
	 int seating_capacity;
	 String fuel_type;
	 
	 Car(double mileage,double price,double ownership_cost,int warranty,int seating_capacity,String fuel_type){
		super(mileage,price);
        this.ownership_cost=ownership_cost;
        this.warranty=warranty;
        this.seating_capacity=seating_capacity;
        this.fuel_type=fuel_type;
	 }
 }
 class Bike extends Vahicle{
	 int cylinders;
	 int gears;
	 String cooling_type;
	 String wheel_type;
	 int fuelTank_size;
	 
	 Bike(double mileage,double price,int cylinders,int gears,String cooling_type,String wheel_type,int fuelTank_size){
		 super(mileage,price);
		 this.cylinders=cylinders;
		 this.gears=gears;
		 this.cooling_type=cooling_type;
		 this.wheel_type=wheel_type;
		 this.fuelTank_size=fuelTank_size;
	 }
 }
 class Audi extends Car{
    String model_type;

    Audi(String model_type, double mileage, double price, double ownership_cost, int warranty, int seating_capacity, String fuel_type) {
        super(mileage, price, ownership_cost, warranty, seating_capacity, fuel_type);
        this.model_type = model_type;
    }
     void display(){
        System.out.println("Audi Model:"+ model_type);
         System.out.println("Ownership Cost: " + ownership_cost);
         System.out.println("Warranty (years): " + warranty);
         System.out.println("Seating Capacity: " + seating_capacity);
         System.out.println("Fuel Type: " + fuel_type);
         System.out.println("Mileage: " + mileage);
          System.out.println("Price: " + price);
        System.out.println();
    }
}


class Ford extends Car {
    String model_type;

    Ford(String model_type, double mileage, double price, double ownership_cost, int warranty, int seating_capacity, String fuel_type) {
        super(mileage, price, ownership_cost, warranty, seating_capacity, fuel_type);
        this.model_type = model_type;
    }

    void display() {
        System.out.println("Ford Model: " + model_type);
        System.out.println("Ownership Cost: " + ownership_cost);
        System.out.println("Warranty (years): " + warranty);
        System.out.println("Seating Capacity: " + seating_capacity);
        System.out.println("Fuel Type: " + fuel_type);
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

class Bajaj extends Bike {
    String make_type;

    Bajaj(String make_type, double mileage, double price, int cylinders, int gears, String cooling_type, String wheel_type, int fuelTank_size) {
        super(mileage, price, cylinders, gears, cooling_type, wheel_type, fuelTank_size);
        this.make_type = make_type;
    }

    void display() {
        System.out.println("Bajaj Make: " + make_type);
        System.out.println("Cylinders: " + cylinders);
        System.out.println("Gears: " + gears);
        System.out.println("Cooling Type: " + cooling_type);
        System.out.println("Wheel Type: " + wheel_type);
        System.out.println("Fuel Tank Size: " + fuelTank_size + " inches");
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
        System.out.println();
    }
}

class TVS extends Bike {
    String make_type;

    TVS(String make_type, double mileage, double price, int cylinders, int gears, String cooling_type, String wheel_type, int fuelTank_size) {
        super(mileage, price, cylinders, gears, cooling_type, wheel_type, fuelTank_size);
        this.make_type = make_type;
    }

    void display() {
        System.out.println("TVS Make: " + make_type);
        System.out.println("Cylinders: " + cylinders);
        System.out.println("Gears: " + gears);
        System.out.println("Cooling Type: " + cooling_type);
        System.out.println("Wheel Type: " + wheel_type);
        System.out.println("Fuel Tank Size: " + fuelTank_size + " inches");
        System.out.println("Mileage: " + mileage);
        System.out.println("Price: " + price);
        System.out.println();
    }
}


 class Vahicles{
    public static void main(String[] args){
        Audi audiCar = new Audi("A6", 15.5, 5000000, 100000, 5, 5, "Petrol");
        Ford fordCar = new Ford("Mustang", 12.0, 7500000, 150000, 3, 4, "Petrol");

        Bajaj bajajBike = new Bajaj("Pulsar 220", 40.0, 120000, 1, 5, "Air", "Alloys", 15);
        TVS tvsBike = new TVS("Apache RTR 200", 45.0, 110000, 1, 5, "Oil", "Alloys", 12);
        audiCar.display();
        fordCar.display();
        bajajBike.display();
        tvsBike.display();
    }
}
	 
 
 
 
 
 /*02 Construct a base class called twoD contains x and y and methods to read and write the x and y. Create another class called threeD which is derived from twoD and also contains z and write methods to read and write z. Also write a method to find the distance of two threeD Points.
sqrt((x2-x1)^2+(y2-y1)^2+(z2-z1)^2)
In main:
Create one ThreeD object using the default constructor.
Use the setters to set x, y, and z.
Create the second ThreeD object using the constructor with three arguments.
in the TwoD class:
Add a cout statement to the TwoD default constructor with a message "TwoD default constructor"
Add a cout statement to other TwoD constructor with a message "TwoD constructor with two arguments"*/

class TwoD{
   private int x;
   private int y;

  //defalut constructor

 TwoD(){
	 System.out.println("TwoD Default constructor");
 }
  //parameterized constructor
  
  TwoD(int x, int y){
	  this.x=x;
	  this.y=y;
  }
  //method
   public void setx(int x){
	   this.x=x;
   }
   public int getx(){
	   return x;
   }
   public void sety(int y){
	   this.y=y;
   }
   public int gety(){
	   return y;
   }
}
   class ThreeD extends TwoD{
	   private int z;
	   
	 //defalut constructor
	 ThreeD(){
		 System.out.println("ThreeD default constructor");
	 }
	 
	 //parameterized constructor
	 
	 ThreeD(int x,int y,int z){
		 super(x,y);
		 this.z=z;
	 }
	 public void setz(int z){
		 this.z=z;
	 }
	 public int getz(){
		 return z;
	 }
	 
	 
	 public double distance(ThreeD a) {
        return Math.sqrt(
        (a.getx()-getx())*(a.getx()-getx())+
        (a.gety()-gety())*(a.gety()-gety())+
        (a.getz()-getz())*(a.getz()-getz()));
	 }
   }
   
   class Second{
	   public static void main(String[] args){
		ThreeD three1 = new ThreeD(5,2,3);
		three1.setx(5);
		three1.sety(2);
		three1.setz(3);
        ThreeD three2 = new ThreeD(4,6,8);

        double distance = three1.distance(three2);
        System.out.println("Distance between points:"+distance);
    }
}

/*3. A class Point is declared as follows:
class Point{
public:
Point(){int=0;int=0;} //default constructor
void setPoint(int,int); //set coordinates
int getX() const {return x;} //get x coordinates
int getY() const {return y;} //get y coordinates
void printPoint(); // print (x,y) coordinates
private int x;
private int y;
};
Write the implementation of the class Point in the same file.
Then, declare a class called Circle that is derived from the class Point. The class Circle has public member functions Circle (constructor), setRadius(), getRadius() and area() and one private data member radius. The class Circle indirectly uses private member x and y of class Point to store the coordinate of the center of the circle. The class Circle also checks to make sure the radius value is a positive number, otherwise it is set to default value 1.
Note: The private members of class Point can only be indirectly accessed by class Circle using public methods of class point.
Implement the class Circle and write a driver program to test the class Circle. An example of the output of the driver program is.
Enter x: 2
Enter y: 2
Enter radius: 1
Circle center is (2,2)
Radius is 1
Area is 3.14  */



class Point{
    private int x;
    private int y;

    // default constructor
    Point(){
        System.out.println("Point Default constructor");
    }

    public void setPoint(int x, int y){
        this.x = x;
        this.y = y;
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    void printPoint(){
        System.out.print("(" + x + "," + y + ")");
    }
}

class Circle extends Point{
    private int radius;

    Circle(int x,int y,int radius){
        setPoint(x,y);
        if(radius>0){
            this.radius = radius;
        } 
		else{
            this.radius=1;
        }
    }

    public void setRadius(int radius){
        this.radius = radius;
}
    public int getRadius(){
        return radius;
    }
	double area(){
        return 3.14 * radius * radius;
    }



    void displayCircle(){
        System.out.println("Circle center is:");
         System.out.println("Radius is:"+radius);
        System.out.println("Area is:"+area());
    }
}

   class PointCircle1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
		 System.out.print("Enter x:");
          int x = sc.nextInt();
		 System.out.print("Enter y:");
          int y = sc.nextInt();

         System.out.print("Enter radius:");
          int radius = sc.nextInt();

        Circle circle=new Circle(x,y,radius);
        circle.displayCircle();

    }
}

 //04 Write a program to illustrate that Classes cannot be used for multiple Inheritance.
 
  /*class ParentA{
	  
	  void display(){
		  System.out.println("Display the ParentA class");
  }
  }
  class ParentB{
	  
	  void display(){
		  System.out.println("Display the ParentB class");
  }
  }
  class Child extends ParentA,ParentB(){
	  void display(){
		  Sustem.out.println("Display the Child class");
	  }
  }
	
 class Main{
  public static void main(String[] args){
	  Child child=new Child();
	  child.display();
  }
 } */
 
 /*05  Create a class named Shape with a method that prints "This is a shape". Create another class named Polygon inheriting the Shape class
 with the same method that prints "Polygon is a shape". Create two other classes named Rectangle and Triangle having the same method 
 which prints "Rectangle is a polygon" and "Triangle is a polygon" respectively. Again, make another class named Square having the same method 
 which prints "Square is a rectangle".Now, try calling the method by the object of each of these classes.*/
 class Shape{
	 void display(){
		 System.out.println("This is a shape");
	 }
 }
 class Polygon extends Shape{
	 void display(){
		 System.out.println("Polygon is a shape");
	 }
 }
  class Rectangle extends Polygon{
	  void display(){
		  System.out.println("Rectangle is a polygon");
	  }
  }
  class Triangle extends Polygon{
	  void display(){
		  System.out.println("Triangle is a polygon");
	  }
  }
  class Square extends Rectangle{
	  void display(){
		  System.out.println("Square is a rectangle");
	  }
  }
	  
	 class Shapes{
		 public static void main(String[] args){
			 Shape shape=new Shape();
			 Polygon polygon=new Polygon();
			 Rectangle rectangle=new Rectangle();
			 Triangle triangle=new Triangle();
			 Square square=new Square();
			 
			 shape.display();
			 polygon.display();
			 rectangle.display();
			 triangle.display();
			 square.display();
		 }
	 }
	 
 /*06  Design and implement a custom Java class named MyString that mimics the behavior of Java’s built-in String class. Your class should store character data internally (e.g., using a char[] or String as input) and should provide the following string methods,
1. int length() – Returns the number of characters.
2. char charAt(int index) – Returns the character at the specified index.
3. boolean equals(MyString other) – Checks if two MyString objects are equal.
4. MyString toUpperCase() – Returns a new string with all characters in uppercase.
5. MyString toLowerCase() – Returns a new string with all characters in lowercase.
6. MyString substring(int start, int end) – Returns a substring from start to end-1.
7. MyString concat(MyString other) – Concatenates another string to the current one.
8. boolean contains(MyString sub) – Checks if a substring exists.
9. int indexOf(char ch) – Returns the index of the first occurrence of the character.
10. MyString replace(char oldChar, char newChar) – Replaces all occurrences of a character.
* Implement proper constructors, including one that takes a char[] or String as input.
* Avoid using any built-in String methods to perform the operations internally.
* Write a main method to demonstrate the working of your MyString class. */
class MyString{
	
	
	//1. int length() – Returns the number of characters.
	
	public int length(){
		return ch.length;
	}
	
	//2. char charAt(int index) – Returns the character at the specified index.
	
	public char charAt(int i){
		return ch[i-1];
	}
	
	//3. boolean equals(MyString other) – Checks if two MyString objects are equal.
	
	public boolean equals(String s1){
		char[] ch1=s1.toCharArray();
		for(int i=0; i<ch1.length;i++){
			if(ch[i]!=ch1[i]){
				return false; 
			}
		}
		return true;
	}
	
	//4. MyString toUpperCase() – Returns a new string with all characters in uppercase.
	
	public String toUpperCase(){
		String str = "";
		for(int i=0; i<ch.length;i++){
			if(ch[i]>='a' && ch[i]<='z'){
			    str=str+(char) (ch[i]-32);
			}
			else{
				str=str+ch[i];
			}
		}
		return str;
	}
	
	//5. MyString toLowerCase() – Returns a new string with all characters in lowercase.

    public String toLowerCase(){
        String str = "";
        for (int i=0; i<ch.length;i++){
            if (ch[i]>='A'&&ch[i]<='Z'){
                str=str+(char)(ch[i]+32);
            } 
			else{
                str = str+ch[i];
            }
        }
        return str;
    }
	
	//6. MyString substring(int start, int end) – Returns a substring from start to end-1.
	
	public String substring(int start, int end){
		String str = "";
		for(int i=start; i<end;i++){
			str = str+ch[i];
		}
		return str;
	}
	
	//7. MyString concat(MyString other) – Concatenates another string to the current one.
	
	public String concat(String s2){
		String str= s2;
		for(int i=0; i<ch.length;i++){
			str = str+ch[i];
		}
		return str;
	}
	
	//8. boolean contains(MyString sub) – Checks if a substring exists.
	
	public boolean contains(String sub){
		char[] ch2 = sub.toCharArray();
		if(ch2.length > ch.length){
			return false;
		}
		for(int i=0; i <= ch.length-ch2.length; i++){
			int j=0;
			while(j<ch2.length && ch[i+j]==ch2[j]){
				j++;
			}
			if(j==ch2.length){
				return true;
			}
		}
		return false;
	}
	
	//9. int indexOf(char ch) – Returns the index of the first occurrence of the character.
	
	public int indexOf(char c){
		int index=-1;
        for(int i=0; i<ch.length; i++){
			if(ch[i]==c){
				index=i;
			}
		}			
		return index;
	}
	
	//10. MyString replace(char oldChar, char newChar) – Replaces all occurrences of a character.
	
	public String replace(char oldc, char newc){
    String str= "";
    char oldc2 = (char)(oldc + 32); 
    for (int i=0; i<ch.length;i++){
        if (ch[i]==oldc){
            str =str+newc;
        } 
        else if(ch[i]==oldc2){
            str=str+(char)(newc+32); 
        } 
        else{
            str =str+ch[i];
        }
    }
    return str;
}
    public static void main(String[] args) {
        MyString myStr = new MyString("MuthuKumar");

        System.out.println("Original String Length: " + myStr.length());
        System.out.println("Character at index 1: " + myStr.charAt(1));
        System.out.println("Equals " + myStr.equals("MuthuKumar"));
        System.out.println("To Upper Case: " + myStr.toUpperCase());
        System.out.println("To Lower Case: " + myStr.toLowerCase());
        System.out.println("Substring : " + myStr.substring(2, 7));
        System.out.println("Concatenation is: " + myStr.concat(" Java"));
        System.out.println("Contains is" + myStr.contains("Kumar"));
        System.out.println("Index of : " + myStr.indexOf('M'));
        System.out.println("Replace is: " + myStr.replace('l', 'K'));
    }
}




	

 /*07 Design a calculator application using Java Inheritance.
‌
Create the following class hierarchy:
‌
--->BasicCalculator (Base class):
Implement at least three basic arithmetic methods, such as:
‌
--->add(int a, int b)
--->subtract(int a, int b)
--->multiply(int a, int b)
--->divide(int a, int b)
‌
--->AdvancedCalculator (Inherits from BasicCalculator):
Add 3 to 4 advanced mathematical operations, such as:
‌
--->power(int base, int exponent)
--->modulus(int a, int b)
--->squareRoot(double number)
‌
--->ScientificCalculator (Inherits from AdvancedCalculator):
Add scientific functions, such as:
‌
--->sin(double angle)
--->cos(double angle)
--->log(double value)
--->exp(double value)
* Demonstrate the use of inheritance by creating an object of ScientificCalculator and calling methods from all three levels of the class hierarchy.
* Use appropriate access specifiers and method overrides where required.
* Add a main() method to test all operations.*/
  class BasicCalculator{
	  public static int add(int a,int b){
	   int result1=a+b;
	   return result1;
	  }
	  public static int subtract(int a,int b){
		  int result2=a-b;
		  return result2;
	  }
	  public static int multiply(int a,int b){
		  int result3=a*b;
		  return result3;
	  }
	  public static int divide(int a, int b){
		  int result4=a/b;
		  return result4;
	  }
  }
  
  class AdvancedCalculator extends BasicCalculator{
	  public static int power(int base,int exponent){
		  int sum1=(int)Math.pow(base,exponent);
		  return sum1;
	  }
	  public static int modulus(int a,int b){
		  int sum2=a%b;
		  return sum2;
	  }
	  public static double squareRoot(double number){
       double sum3=Math.sqrt(number);
       return sum3;
	  }	
  }
  
 class ScientificCalculator extends AdvancedCalculator{
  
  public static double sin(double angle){
	  double index1=Math.sin(angle);
	  return index1;
  }
  public static double cos(double angle){
	  double index2=Math.cos(angle);
	  return index2;
  }
  public static double log(double value){
	  double index3=Math.log(value);
	  return index3;
  }
  public static double exp(double value){
	  double index3=Math.exp(value);
	  return index3;
  }
 }
  
  class Calculates{
	  public static void main(String[] args){
		  ScientificCalculator calculate= new ScientificCalculator();
		 //BasicCalculator: 
		  System.out.println("Addition is:"+calculate.add(3,5));
		   System.out.println("Subtract is:"+calculate.subtract(5,2));
		   System.out.println("Multiply is:"+calculate.multiply(3,5));
		   System.out.println("Divide is:"+calculate.divide(10,2));
		   System.out.println();
		 //AdvancedCalculator:
		 System.out.println("Powder is:"+calculate.power(10,2));
		 System.out.println("Modulus is:"+calculate.modulus(10,2));
		 System.out.println("SquareRoot is:"+calculate.squareRoot(20));
		  System.out.println();
		 //ScientificCalculator  
		 System.out.println("Sin value is:"+calculate.sin(0));
         System.out.println("Cos is:"+calculate.cos(0));
          System.out.println("Log is:"+calculate.log(10));
          System.out.println("Exp is:"+calculate.exp(10));
            System.out.println();		  
	  }
  }
		   
	  
	   
	 


	 
		 
   		  
	
	  
	  
	  
 
			
		 
		 
		 
		 

   
   
   
   	 
