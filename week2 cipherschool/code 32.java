//Md Aftab Raza Ansari 12005279
//code 32
// java io or file handling




import java.io.File;
public class Test0{
    public static void main(String[] args){
        //lab 1 creating empty file
        File f = new File("d:\\myTestFile.txt");
        
        try{
            f.createNewFile();
        }
        catch(IOException e){
            e.printStackTrace()''
        }
        System.out.println("fine created successfully");
    }
}





   
  
        

    

