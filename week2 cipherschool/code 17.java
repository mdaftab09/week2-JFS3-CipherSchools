//Md Aftab Raza Ansari 12005279
//code 17
//collection framework part 1
// .set method



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
        
    
    }
}
