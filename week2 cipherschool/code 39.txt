//Md Aftab Raza Ansari 12005279
//code 39
// java io or file handling

//Reading file using file reader and projected oriented excersies
//method 1



import java.io.FileNotFoundException;
import java.io.FileReader;
public class Test0 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("/Users/rajan/Desktop/rhyme.txt");
        BufferdReader br = new BufferedReader(fr);
        String line = br.readLine();
        System.out.println(line);
        
        String line = br.readLine();
        System.out.println(line);
        
        String line = br.readLine();
        System.out.println(line);
        
}
   
  
        

    

