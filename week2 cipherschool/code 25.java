//Md Aftab Raza Ansari 12005279
//code 25
// linked list hashset  hashmap
//linked list




import java.util.LinkedList;
public class Test0{
    public static void main(String[] arrs){
        LinkedList myll = new LinkedList();
        myll.add("Ironman");
        myll.add("Thor");
        myll.add("Hulk");
        myll.add("Loki");
       // System.out.println(myll.get(1));
       myll.addLast("Gamora");
       myll.addFirst("AntMan");
       myll.add(2, "Natasha");
        Iterator it= myll.iterator();
        
        while (it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("------------------");
        System.out.println("who at the top"+myll.peek());
        System.out.println("hey first one get out"+myll.poll());
        System.out.println("who is there standing at the last !"+myll.pop());
        
        System.out.println("------------------");
it = myll.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
}




   
  
        

    

