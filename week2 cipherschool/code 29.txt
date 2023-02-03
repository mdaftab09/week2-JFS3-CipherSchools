//Md Aftab Raza Ansari 12005279
//code 29
// linked list hashset hashmap
//hashset and linked list together
//tree set




import java.util.HashSet;
import java.util.LinkedList;

public class Test3{
    public static void main(String[] args){
       HashSet myset = new HashSet();
       
       myset.add("red");
       myset.add("orange");
       myset.add("red");
       myset.add("orange");
       myset.add("green");
       System.out.println(myset);
       
       LinkedList lhs = new LinkedList();
         lhs.add("red");
         lhs.add("orange");
         lhs.add("red");
         lhs.add("orange");
         lhs.add("green");
         System.out.println(lhs);
         
         TreeSet ts = new TreeSet();
         ts.add("apple");
         ts.add("cat");
         ts.add("ball");
         ts.add(null);
         System.out.println(ts);
       
    }
}





   
  
        

    

