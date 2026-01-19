//Md Aftab Raza Ansari  12005279
//code 04
// code 3 updated version





class App {
    App(){
         System.out.println("Constructor of App");
    }
    App(int num){
        System.out.println(num);
    }
}
public class Test2 extends App{
    Test2(){
        super();
        System.out.println("Constructor of Test2");
    }
    public static void main(String[] args){
        new Test2();
   
    }
}
