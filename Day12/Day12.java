
/*01 Write a Java program to demonstrate multi-threading by extending the Thread class.
--->Create a class MyThread that extends Thread.
--->Override the run() method to display the thread name and a message five times with a delay of 500 milliseconds between prints.
--->In the main() method, create two objects of MyThread and start them.
--->Each thread prints its message independently, showing concurrent execution.*/

class MyThread extends Thread{
    public MyThread(String name){
        super(name);
    }
    public void run(){
        for (int i=1; i<=5; i++){
            System.out.println(getName()+ i);
            try{
                Thread.sleep(500); 
            } 
			catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

 class MultiThread{
    public static void main(String[] args) {
        MyThread t1 = new MyThread("Muthu");
        MyThread t2 = new MyThread("Ravi");

        t1.start(); 
        t2.start(); 
    }
}

/*02 Write a Java program to create a thread using the Runnable interface.
--->Create a class TaskRunner that implements Runnable.
--->Inside the run() method, print the current thread name and a task-specific message 10 times with a delay of 1000ms.
--->In the main() method, create two Thread objects passing different TaskRunner instances and start both threads.
--->The console should reflect the concurrent execution of both tasks.*/
  class TaskRunner implements Runnable{
    private String taskName;

    public TaskRunner(String taskName){
        this.taskName=taskName;
    }

    public void run(){
        for (int i =1; i<=10;i++){
            System.out.println(Thread.currentThread().getName() + taskName + i);
            try{
                Thread.sleep(1000); 
            } 
			catch (InterruptedException e){
                System.out.println(e.getMessage());
            }
        }
    }
}

 class RunnableThread{
    public static void main(String[] args){
       TaskRunner task1=new TaskRunner("Data Processing");
        TaskRunner task2=new TaskRunner("File Download");

       Thread t1=new Thread(task1,"Worked1");
        Thread t2=new Thread(task2,"Worked2");

        t1.start(); 
        t2.start(); 
    }
}

/*03 Write a Java program where one thread prints only even numbers and another prints only odd numbers from 1 to 20. Synchronize the threads so that
 they print alternately (i.e., 1 2 3 4 ...).*/
  class Printer{
    private int number = 1;
    private final int MAX = 20;

    public synchronized void printOdd(){
        while (number <= MAX){
            if (number % 2 == 0){ 
                try{
                    wait();
                } 
				catch (InterruptedException e){
                   System.out.println(e.getMessage());
                }
            }
            if (number <= MAX){
                System.out.print(number + " ");
                number++;
                notify(); 
            }
        }
    }

    public synchronized void printEven(){
        while(number <= MAX){
            if (number% 2== 1){ 
                try{
                    wait();
                }
				catch(InterruptedException e){
                    System.out.println(e.getMessage());
                }
            }
            if (number <= MAX) {
                System.out.print(number + " ");
                number++;
                notify(); 
            }
        }
    }
}

 class OddEven{
    public static void main(String[] args){
        Printer printer = new Printer();
      Thread oddThread = new Thread(() -> printer.printOdd(), "Odd-Thread");
        Thread evenThread = new Thread(() -> printer.printEven(), "Even-Thread");

        oddThread.start();
        evenThread.start();
    }
}

/*04Create a Java program with a shared counter. Spawn 3 threads, where each thread increments the counter 1000 times. Use synchronization to avoid race 
conditions and display the final value.*/

class Counter{
    private int count = 0;

    public synchronized void increment(){
        count++;
    }

    public int getCount(){
        return count;
    }
}

class CounterTask implements Runnable{
    private Counter counter;

    public CounterTask(Counter counter){
        this.counter = counter;
    }
    public void run(){
        for (int i=0; i<1000;i++) {
            counter.increment();
        }
    }
}
 class SynchronizedCounter{
    public static void main(String[] args){
      Counter counter = new Counter();
	  Thread t1 = new Thread(new CounterTask(counter),"Thread-1");
       Thread t2 = new Thread(new CounterTask(counter),"Thread-2");
       Thread t3 = new Thread(new CounterTask(counter),"Thread-3");

        t1.start();
        t2.start();
        t3.start();
		try{
            t1.join();
            t2.join();
            t3.join();
        } 
		catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Final Counter Value:"+ counter.getCount());
    }
}

/*05 Implement a basic producer-consumer problem using wait() and notify().
--->Producer thread should add items to a shared buffer.
--->Consumer thread should remove items.
Ensure the buffer size is limited to 5 items.. Use Threads to implement the ATM, where you create threads to check the PIN, another thread to perform
 the cash withdrawal, another one to check the balance amount and print the receipt.*/
 
 class Product implements Serializable{
    int productId;
    String name;
    double price;
    int quantity;

    public Product(int productId, String name, double price, int quantity)
    {
        this.productId = productId;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    void display()
    {
        System.out.println("... Product Details ... \n");
        System.out.println("Product ID = "+productId);
        System.out.println("Product Name = "+name);
        System.out.println("Product Price = "+price);
        System.out.println("Product Quantity = "+quantity+"\n\n");
    }
}

class ProductInventorySystem
{
    public static void main(String[] args) 
	{
        Product p1 = new Product(121,"KeyBoard",1200,10);
        Product p2 = new Product(122,"Mouse",1400,10);
        Product p3 = new Product(123,"Laptop",140000,10);
        Product p4 = new Product(124,"Mobile",14000,10);

        ArrayList<Product> lists=new ArrayList<>();
        lists.add(p1);  
		lists.add(p2);
		lists.add(p3);  
		lists.add(p4);
 
        addProd(false,lists);
		System.out.println("-----Product Added Successfully-----\n\n");

        System.out.println("-----Reading File-----\n");
		
        try
        {
            ArrayList<Product> product = readProd("Product.ser");
            for(Product obj:product)
            {
                obj.display();
            }
        }
        catch (IOException  | ClassNotFoundException e)
        {
            System.out.println("Exception Occur \n\n");
            e.printStackTrace();
        }

        System.out.println("-----Searching Product to PID is 122-----\n");

        try 
		{
            Product ser = searchProd("Product.ser", 122);
            ser.display();
        } 
		catch (IOException |ClassNotFoundException e) 
		{
            e.printStackTrace();
        }

        System.out.println("-----Update Product Price and Quantity to PID is 123-----\n");

        try
		{
            if(updateProd("Product.ser",123,1200000,20))
            {
                try
                {
                    ArrayList<Product> product = readProd("Product.ser");
                    for(Product obj:product)
                    {
                        obj.display();
                    }
                }
                catch (IOException  | ClassNotFoundException e)
                {
                    System.out.println("Exception Occur ");
                }
            }
            else
		    {
                System.out.println("Updation Failed");
            }
        }
        catch (Exception e) 
		{
            e.printStackTrace();
        }

        System.out.println("-----Delete Product to PID 123-----\n");

        if(deleteProd("Product.ser",123))
        {
            try
            {
                ArrayList<Product> product = readProd("Product.ser");
                for(Product obj:product)
                {
                    obj.display();
                }
            }
            catch (IOException  | ClassNotFoundException e)
            {
                System.out.println("Exception Occur ");
            }
        }
    }

    public static boolean addProd(boolean append,ArrayList<Product> list)
    {
        try(FileOutputStream file=new FileOutputStream("Product.ser",append);
            ObjectOutputStream out =new ObjectOutputStream(file))
        {
            for(Product p:list) 
			{
                out.writeObject(p);
            }
        }
        catch(IOException e)
        {
            return  false;
        }
        return true;
    }

    public static ArrayList<Product> readProd(String fileName) throws IOException,ClassNotFoundException
    {
        try(FileInputStream file=new FileInputStream(fileName);
        ObjectInputStream input=new ObjectInputStream(file))
        {
            ArrayList<Product> list=new ArrayList<>();
			
            try 
		    {
                while (true) 
			    {
                    Product p = (Product) input.readObject();
                    list.add(p);
                }
            }
            catch (EOFException e)
            {
                return list;
            }
        }
    }

    public static Product searchProd(String fileName,int id) throws IOException,ClassNotFoundException
    {
        Product p=null;

        try(FileInputStream file=new FileInputStream(fileName);
            ObjectInputStream input=new ObjectInputStream(file))
        {
            try 
			{
                while (true) 
				{
                    p = (Product) input.readObject();
                    if(p.productId==id)
                    {
                        return p;
                    }
                }
            }
            catch (EOFException e)
            {
                throw new EOFException("Not  Available ");
            }
        }
    }

    public static  boolean  updateProd(String fileName,int id,int  newQuantity,int newPrice)
    {
        try 
	    {
            ArrayList<Product> list = readProd(fileName);
            ArrayList<Product>updated=new ArrayList<>();
            for(Product p:list)
            {
                if(p.productId==id)
                {
                    p.price=newPrice;
                    p.quantity=newQuantity;
                }
                updated.add(p);
            }
            addProd(false,list);
            return true;
        }  
	    catch (Exception e) 
	    {
            return false;
        }
    }

    public static  boolean  deleteProd(String fileName,int id)
    {
        try 
		{
            boolean b=false;
            ArrayList<Product> list = readProd(fileName);
            ArrayList<Product>updated=new ArrayList<>();
            for(Product p:list)
            {
                if(p.productId==id)
                {
                    continue;
                }
                updated.add(p);
            }
            addProd(false,updated);
            return true;
        }
		catch (Exception e) 
		{
            return false;
        }
    }
}