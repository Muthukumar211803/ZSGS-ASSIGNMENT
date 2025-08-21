import java.util.*;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Arrays;
import java.util.ArrayList;

/*01 Write a Java program to,
a. to create a new array list, add some colors (string) and print out the collection.
b. to iterate through all elements in an array list.
c. to insert an element into the array list at the first position.
d. to retrieve an element (at a specified index) from a given array list.
e. to update specific array element by given element.
f. to remove the third element from an array list.
g. to search an element in an array list.
h. to sort a given array list.
i. to copy one array list into another.
j. to shuffle elements in an array list.*/

 class ArrayListCollection{
	 public static void main(String[] args){
		 ArrayList<String> colors=new ArrayList<>();
		 
		 colors.add("Red");
		 colors.add("Orenge");
		 colors.add("Blue");
		 colors.add("Block");
		 colors.add("Yellow");
		 
		 System.out.println("Colors in the ArrayList:"+colors);
		 
		for(String color:colors){
			System.out.println("All element in the ArrayList:"+color);
		}
	     colors.add(0,"Green");
			 System.out.println("ArrayList in first position:"+colors);
		 
		 int index=2;
		 String element=colors.get(index);
		 System.out.println("Retrieve an Element:"+element); 
      
         colors.set(4,"purple");
           System.out.println("Update the color is:"+colors);
		   
		 colors.remove(3);
		 System.out.println("Remove the color is:"+colors);
		 
		 String searchColor="Brown";
		 if(colors.contains(searchColor)){
			 System.out.println("Present the color is ArrayList");
		 }
		 else{
			 System.out.println("Not present the color is ArrayList");
		 }
		 
		 Collections.sort(colors);
		 System.out.println("Sorted to ArrayList is:"+colors);
		 
		 ArrayList<String> copyList=new ArrayList<>(colors);
		 System.out.println("CopyList is:"+colors);
		 
		 Collections.shuffle(colors);
		 System.out.println("Shuffle is:"+colors);
		 
		 
	 }
 }
 
 /*02 Write a Java program to,
a. append the specified element to the end of a linked list.
b. iterate through all elements in a linked list.
c. iterate through all elements in a linked list starting at the specified position.
d. iterate a linked list in reverse order.
e. insert the specified element at the specified position in the linked list.
f. insert elements into the linked list at the first and last position.
g. insert the specified element at the front of a linked list.
h. insert the specified element at the end of a linked list.
i. insert some elements at the specified position into a linked list.
j. get the first and last occurrence of the specified elements in a linked list.*/

 class LinkedListCollection{
	 public static void main(String[] args){
		 LinkedList<String> lists=new LinkedList<>();
		 
		  lists.add("Blue");
		  lists.add("Red");
		  lists.add("Block");
		  lists.add("Yellow");
		  
		  System.out.println("Specified is List:"+lists);
		  System.out.println();
		  
		 for(String list:lists){
			 System.out.println("Elements is:"+list);       
		 }
		  System.out.println();
		  
		 int start=1;
        System.out.println("Iterating from position:"+start);
        for (int i=start; i<lists.size();i++){
            System.out.println(lists.get(i));
        }
		 System.out.println();
		 
		System.out.println("Reverse order:");
        Iterator<String> str = lists.descendingIterator();
        while (str.hasNext()){
            System.out.println(str.next());
        }
		 System.out.println();
		 
		 lists.add(1,"Voilet");
        System.out.println(" Position 1 Change:"+lists);
		 System.out.println();
		 
		lists.addFirst("Orange");
		lists.addLast("Blue");
		 System.out.println("Fixed First and Last position:"+lists);
		  System.out.println();
		  
		 lists.offerFirst("Front");
        System.out.println("Front:"+lists);
        System.out.println();
        
        lists.offerLast("End");
        System.out.println("End:"+lists);
        System.out.println(); 
        LinkedList<String> linked = new LinkedList<>();
        linked.add("Green");
        linked.add("Pink");
        lists.addAll(2,linked);
        System.out.println("Multiple at position 2:"+lists);
        System.out.println();
        
        lists.add("Violet"); 
        System.out.println("Lists duplicate:"+lists);
        System.out.println("First occurrence of:"+ lists.indexOf("Violet"));
        System.out.println("Last occurrence of:"+ lists.lastIndexOf("Violet"));
    }
}
  
 /*03 3. Write a Java program to,
a. append the specified element to the end of a hash set.
b. iterate through all elements in a hash list.
c. get the number of elements in a hash set.
d. empty the hash set.
e. test a hash set is empty or not.
f. clone a hash set to another hash set.
g. convert a hash set to an array.
h. convert a hash set to a tree set.
i. convert a hash set to a List/ArrayList.
j. compare two hash set.*/    

class HashSetSystem{
    public static void main(String[] args){
       
    LinkedHashSet<String> set = new LinkedHashSet<>();
      set.add("Blue");
        set.add("Orange");
        set.add("White");
		set.add("Black");
          System.out.println("HashSet:"+ set);
        System.out.println();
       
        System.out.println("Iterating:");
        for(String s:set){
            System.out.println(s);
        }
        System.out.println();
       
        System.out.println("Size:"+set.size());
          System.out.println();
       
        HashSet<String> tempSet = new HashSet<>(set);
         set.clear();
         System.out.println("Clear:"+set);
          System.out.println();
        
        System.out.println("Empty:"+set.isEmpty());
          System.out.println();
       
        set.addAll(tempSet);
          System.out.println();
       
        HashSet<String> cloneSet = new HashSet<>(set);
         System.out.println("Cloned HashSet:"+ cloneSet);
         System.out.println();
       
        String[] arr = set.toArray(new String[0]);
          System.out.println("Array:"+ Arrays.toString(arr));
           System.out.println();
       
        TreeSet<String> treeSet = new TreeSet<>(set);
        System.out.println("TreeSet:"+treeSet);
          System.out.println();
       
        ArrayList<String> list = new ArrayList<>(set);
          System.out.println("ArrayList:"+list);
           System.out.println();
        
        HashSet<String> mic = new HashSet<>();
        mic.add("Apple");
        mic.add("Orange");
        System.out.println("Equals:" + set.equals(mic));
    }
}

/*04Write a Java program to,
a. create a new tree set, add some colors (string) and print out the tree set.
b. iterate through all elements in a tree set.
c. add all the elements of a specified tree set to another tree set.
d. create a reverse order view of the elements contained in a given tree set.
e. get the first and last elements in a tree set.
f. clone a tree set list to another tree set.
g. get the number of elements in a tree set.
h. compare two tree sets.
i. Create a TreeSet that stores a set of numbers, find the numbers less than 7 in a tree set.
j. get the element in a tree set which is greater than or equal to the given element.
k. get the element in a tree set which is less than or equal to the given element.
l. get the element in a tree set which is strictly greater than or equal to the given element.
m. get an element in a tree set which is strictly less than the given element.
n. retrieve and remove the first element of a tree set.
o. retrieve and remove the last element of a tree set.
p. remove a given element from a tree set.*/

class TreeSetSystem {
    public static void main(String[] args) {
       
     TreeSet<String> colors = new TreeSet<>();
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
          System.out.println("TreeSet:"+colors);
		  System.out.println();
       System.out.println("Iterating:");
        for (String c : colors){
			System.out.println(c);
		}
           System.out.println();
      
      TreeSet<String> moreColors=new TreeSet<>();
        moreColors.add("White");
        moreColors.addAll(colors);
         System.out.println("Merged TreeSet:"+moreColors);
            System.out.println();
      
        System.out.println("Reverse order:"+colors.descendingSet());
            System.out.println();
       
        System.out.println("First:"+colors.first());
        System.out.println("Last:"+colors.last());
           System.out.println();
        
      TreeSet<String> cloneSet = new TreeSet<>(colors);
         System.out.println("Cloned:"+cloneSet);
           System.out.println();
        
        System.out.println("Size:"+ colors.size());
          System.out.println();

        System.out.println("Equals:"+ colors.equals(moreColors));
		    System.out.println();
			
      TreeSet<Integer> numbers = new TreeSet<>(Arrays.asList(1, 3, 5, 7, 9, 11));
        System.out.println("Less than 7:"+ numbers.headSet(7));
          System.out.println();
   
        System.out.println("Ceiling(>= 6):"+ numbers.ceiling(6));
           System.out.println();
       
        System.out.println("Floor(<= 6):"+ numbers.floor(6));
              System.out.println();
      
        System.out.println("Higher(> 6):"+ numbers.higher(6));
             System.out.println();
       
        System.out.println("Lower(< 6):"+ numbers.lower(6));
            System.out.println();
      
        System.out.println("Poll first:"+ numbers.pollFirst());
         System.out.println("PollFirst:"+ numbers);
           System.out.println();
      
        System.out.println("Poll last:"+ numbers.pollLast());
        System.out.println("PollLast:"+ numbers);
           System.out.println();
       
         numbers.remove(5);
        System.out.println("Removing 5:"+ numbers);
    }
}

/*05Write a Java program to,
1. create a new priority queue, add some colors (string) and print out the elements of the priority queue.
2. iterate through all elements in the priority queue.
3. add all the elements of a priority queue to another priority queue.
4. insert a given element into a priority queue.
5. remove all the elements from a priority queue.
6. count the number of elements in a priority queue.
7. compare two priority queues.
8. retrieve the first element of the priority queue.
9. retrieve and remove the first element.
10. convert a priority queue to an array containing all of the elements of the queue.*/

class PriorityQueueSystem{
 public static void main(String[] args){
   PriorityQueue<String> set=new PriorityQueue<>();
    set.addAll(Arrays.asList("Red","Green","Blue","Yellow"));
      System.out.println("PriorityQueue:"+set);
      System.out.println();
     System.out.println("Iterating:");
        for (String color:set){
            System.out.println(color);
        }
         System.out.println();
         
     PriorityQueue<String> pq= new PriorityQueue<>(set);
        System.out.println("set:"+pq);
          System.out.println();
        
        set.add("Black");
        System.out.println("Adding Black:"+set);
            System.out.println();
       
        set.clear();
        System.out.println("After clearing:"+set);
          System.out.println();
    
        set.addAll(Arrays.asList("Red","Green","Blue","Yellow","Black"));
          System.out.println();
          
        System.out.println("Size:"+set.size());
           System.out.println();
      
        System.out.println("set equals Pq"+ set.equals(pq));
             System.out.println();
    
        System.out.println("First element:"+set.peek());
            System.out.println();

        System.out.println("Poll first element:"+set.poll());
        System.out.println("After poll:"+set);
          System.out.println();
        String[] arr = set.toArray(new String[0]);
        System.out.println("Array:"+Arrays.toString(arr));
    }
}

 /*06Write a Java program to,
1. associate the specified value with the specified key in a Tree Map.
2. copy a Tree Map content to another Tree Map.
3. search a key in a Tree Map.
4. search a value in a Tree Map.
5. get all keys from the given a Tree Map.
6. delete all elements from a given Tree Map.
7. sort keys in Tree Map by using comparator.
8. get a key-value mapping associated with the greatest key and the least key in a map.
9. get the first (lowest) key and the last (highest) key currently in a map.
10. get a reverse order view of the keys contained in a given map.*/

class TreeMapSystem{
  public static void main(String[] args){
    TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1,"Red");
        map.put(2,"Green");
        map.put(3,"Blue");
        System.out.println("Original TreeMap:"+map);
          System.out.println();
      
    TreeMap<Integer,String> Map = new TreeMap<>(map);
        System.out.println("Copied TreeMap:"+Map);
         System.out.println(); 
        
        System.out.println("Contains key 2:"+ map.containsKey(2));
           System.out.println();
        System.out.println("Contains value:" + map.containsValue("Green"));
          System.out.println();

     System.out.println("All Keys:"+ map.keySet());
           System.out.println();
     TreeMap<Integer,String> tempMap = new TreeMap<>(map);
        tempMap.clear();
        System.out.println("Clearing:"+tempMap);
          System.out.println();
     TreeMap<Integer, String> descMap = new TreeMap<>(Collections.reverseOrder());
        descMap.putAll(map);
        System.out.println("Descending order:"+ descMap);
           System.out.println();

        
        System.out.println("Greatest key mapping:"+ map.lastEntry());
        System.out.println("Least key mapping: " + map.firstEntry());
            System.out.println();
        
        System.out.println("First key:"+ map.firstKey());
        System.out.println("Last key:"+ map.lastKey());
            System.out.println();

        System.out.println("Reverse order:"+ map.descendingKeySet());
    }
}

/*07Write a Java program to,
1. associate the specified value with the specified key in a HashMap.
2. count the number of key-value (size) mappings in a map.
3. copy all of the mappings from the specified map to another map.
4. remove all of the mappings from a map.
5. check whether a map contains key-value mappings (empty) or not.
6. get a shallow copy of a HashMap instance.
7. test if a map contains a mapping for the specified key.
8. test if a map contains a mapping for the specified value.
9. create a set view of the mappings contained in a map.
10. get the value of a specified key in a map.*/
  
class HashMapSystem{
    public static void main(String[] args){
    HashMap<Integer,String> map = new HashMap<>();
        map.put(1,"Apple");
        map.put(2,"Banana");
        map.put(3,"Orange");
     System.out.println("Initial Map:"+ map);
		System.out.println();

        System.out.println("Size:"+map.size());
         System.out.println();
       
     HashMap<Integer,String> copyMap = new HashMap<>(map);
        System.out.println("Copied Map:"+copyMap);
        System.out.println();
        
        copyMap.clear();
        System.out.println("Clear():"+ copyMap);
          System.out.println();
       
        System.out.println("Empty:"+copyMap.isEmpty());
         System.out.println();

     HashMap<Integer,String> clonedMap = new HashMap<>(map);
        System.out.println("Cloned Map:"+ clonedMap);
           System.out.println();
  
        System.out.println("Contains key 2:"+map.containsKey(2));
         System.out.println();
        
        System.out.println("Contains value:"+map.containsValue("Mango"));
           System.out.println();
       
      Set<Map.Entry<Integer,String>> enter = map.entrySet();
        System.out.println("Set view:"+enter);
        System.out.println();
 
        System.out.println("Value key 3:"+map.get(3));
    }
}

/*08Develop a Java program to manage a list of bank accounts using ArrayList.
--->Create an Account class with the following attributes:
a. accountNumber (int)
b. holderName (String)
c. balance (double)
--->Use auto-boxing to store the balance and interest as Double wrapper objects.
--->Use manual boxing to convert a primitive interest rate into a Double object.
--->Unbox the values (both automatic and manual) to calculate and update the new balance.
--->Add at least three Account objects to an ArrayList<Account>.
--->For each account:
a. Display the holder name, account number, original balance
b. Apply 5% interest
c. Show the new balance using primitive values (unboxed).*/

class Account{
    int accountNumber;
    String holderName;
    Double balance; 

    public Account(int accountNumber,String holderName,double balance){
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance; 
    }
}

 class BankAccountManager{
    public static void main(String[] args){
     ArrayList<Account> accounts=new ArrayList<>();
        accounts.add(new Account(10, "raj", 5000.0));
        accounts.add(new Account(12, "muthu", 8000.0));
        accounts.add(new Account(19, "Charlie", 12000.0));
        double ratePrimitive = 0.05; 
        Double interestRate = Double.valueOf(ratePrimitive); 

        
        for(Account acc:accounts){
            System.out.println("Account Holder:"+acc.holderName);
            System.out.println("Account Number:"+acc.accountNumber);
            System.out.println("Original Balance:"+acc.balance);

          double currentBalance = acc.balance;       
            double rate = interestRate.doubleValue();   

      
       double newBalance=currentBalance+(currentBalance * rate);
          acc.balance = newBalance; 

        System.out.println("New Balance:"+newBalance);
         
        }
    }
}
