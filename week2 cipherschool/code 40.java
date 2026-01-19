//Md Aftab Raza Ansari 12005279
//code 40
// java io or file handling

//Reading file using file reader and projected oriented excersies
//method 2



import java.io.FileNotFoundException;
import java.io.FileReader;
public class Test0 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("/Users/rajan/Desktop/rhyme.txt");
        BufferdReader br = new BufferedReader(fr);
        String line ;
        while((line = br.readLine())!= null) {
            System.out println(line);
        }
        br.close();
        fr.close();
}
   
  
        

    

