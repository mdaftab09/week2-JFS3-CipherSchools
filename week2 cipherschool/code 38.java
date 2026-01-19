//Md Aftab Raza Ansari 12005279
//code 38
// java io or file handling

//Listing file 2 (deleting )



import java.io.File;


public class Test3 {
    public static void main(String[] args){
        File f = new File= f.list();
        String[] files = f.list();
        for(String file : files){
            System.out.println("file!");
        }
        File[] files_arr = f.listFiles();
        for(File ff : files_arr){
            ff.delete();
        }
    }
}





   
  
        

    

