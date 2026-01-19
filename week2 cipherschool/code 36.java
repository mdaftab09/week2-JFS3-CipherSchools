//Md Aftab Raza Ansari 12005279
//code 36
// java io or file handling

//writing data in file cont. using true



import java.io.FileWriter;
import java.io.IOException;

public class Test2{
    public static void main(String[] args){
        
        FileWriter = new FileWriter("/users/rajan/Desktop/TestFile.txt",true);
        fw.write("I am the Earth\n");
        fw.write("I am the forest green\n");
        fw.write("I am the four winds blowing\n");
        fw.write("I am the Earth\n");
        
        fw.flush();
        fw.close();
        System.out.println("File Preapared Successfully!!");
       
        
    }
}





   
  
        

    

