//Md Aftab Raza Ansari 12005279
//code 20
//collection framework part 2

// .contains method, 
//.index method
// .is empty() 



import java.util.ArrayList;
import java.util.List;

public class Test0 {
    public static void main(String args[]) {
        ArrayList <String>states = new ArrayList<String>();
        
        states.add("california");
        states.add("Alabama");
        states.add("Alaska");
        states.add("Arkansas");
       
        System.out.println("ArrayList: "+states);
        
        //accessing elements using>get method
        String s = states.get(2);
        System.out.println("I got"+s);
        
        //weite loop for this
       //  System.out.println("ArrayList size"+states.size());  
        //for (int i = 0; i<states.size();i++){
          //  System.out.println(states.get(i));
        //}
        
        ///////update elements usint .set() method
        states.set(s,"Texas");
        System.out.println("After updation."+states);
        
        //removing elements using .remove method
        String t = states.remove(3);
        System.out.println("State Removed is "+t);
        system.out.println("ArrayList After Deletion "+states);
        
        // sort the list usinf .sort
        states.sort(Comparator.naturalOrder());
        System.out.println("ArrayList After sorting "+states);
        
        // .contains method
        System.out.println("Is NewYork There ?"+states.contains("newyork"));
    
        //get index of ELEMENt using .index()
        System.out.println("Texas is at"+states.indexOf("Texas")+"index");
        
        //you can check if list is empty or not using .isEmpty() Method
        System.out.println("Is LIst Empty ?"+states.isEmpty());
        states.removeAll(states);
        System.out.println("Is List Empty ? "+states isEmpty());  
    }
}
