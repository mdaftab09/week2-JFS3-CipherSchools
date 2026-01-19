//Md Aftab Raza Ansari 12005279
//code 13
// Exception handling part 2
//throw

//approach  1




public class test2 {
    int n1,n2,result;
    Scanner sc =new Scanner(System.in);
    void calculate(){
        try{
            
        
        System.out.println("Enter First Number");
        n1=sc.nextInt();
        
        System.out.println("Enter Second Number");
        n2 = sc.nextInt();
        if(n==2){
            throw new ArithmeticException();
        }
        
        result = n1/n2;
        }
        catch(InputMismatchException ime){
            System.out.println("IME Detected");
        }
        catch(Arithmeticexception ae){
            System.out.println("AE Detected");
        }
        catch(Exception e){
            System.out.println("Ouch! Exception Detected"+e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("The Division is "+result);
        }
    }
    public static void main(String[] args){
        Test2 obj = new Test2();
        obj.calculate();
        
    }
}

/////////////////////////////approach 2////////////////////////////////////




import java.util.Scanner;
public class test2 {
    int n1,n2,result;
    Scanner sc =new Scanner(System.in);
    void calculate(){
        try{
            throw new ArithmeticException();
        System.out.println("Enter First Number");
        n1=sc.nextInt();
        
        System.out.println("Enter Second Number");
        n2 = sc.nextInt();
       // if(n==2){
       //     throw new ArithmeticException();
       // }
        
        result = n1/n2;
        }
        catch(InputMismatchException ime){
            System.out.println("IME Detected");
        }
        catch(Arithmeticexception ae){
            System.out.println("AE Detected");
        }
        catch(Exception e){
            System.out.println("Ouch! Exception Detected"+e.getMessage());
            e.printStackTrace();
        }
        finally {
            System.out.println("The Division is "+result);
        }
    }
    public static void main(String[] args){
        Test2 obj = new Test2();
        obj.calculate();
        
    }
}
   
   
