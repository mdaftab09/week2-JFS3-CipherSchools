//Md Aftab Raza Ansari 12005279
//code 34
// java io or file handling

//creating directory in java



import java.io.File;
public class Test0{
    public static void main(String[] args){
        
        File f = new File("/users/rajan/Desktop/TestFile.txt");
        if(f.exists()){
            System.out.println("Printing file details");
            System.out.println("---------------------");
            
            System.out.println("File name : "+f.Name());
            System.out.println("File size : "+f.length());
            System.out.println("File path : "+f.getAbsolutePath());
            System.out.println("Is the File readable : "+f.canRead());
            System.out.println("Is the File writeable : "+f.canWrite());
            
            System.out.println("---------------------");
                        //directory creattion part//
            File f = new File("/Users/rajan/Desktop/avengers");
            file.mkdir();
             
        }
    }
}





   
  
        

    

