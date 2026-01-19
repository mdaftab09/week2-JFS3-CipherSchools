//Md Aftab Raza Ansari  12005279
//code 1
//command line arguments, this, find keywords


public class Test1 {
    int arg=5;
    void myTest(int arg){
        arg =arg;
    }
    public static void main(String args[]) {
      int arg=10;
      Test1 obj =new Test1();
      obj.myTest(arg);
      ;

      System.out.println(obj.arg);
    }
}
