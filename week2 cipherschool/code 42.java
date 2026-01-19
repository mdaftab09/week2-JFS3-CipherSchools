//Md Aftab Raza Ansari 12005279
//code 42
// java io or file handling

//Reading file using file reader and projected oriented excersies



import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) throws Exception {
        FileReader fr = new FileReader("/Users/rajan/Desktop/pokemon.csv");
        BufferdReader br = new BufferedReader(fr);
        String line ;
        //till the time value of line variable is not matching with null keep 
        //running the loop.
        
        ArrayList<String> pokemons = new ArrayList<String>();
        while((line = br.readLine())!= null) {
          //  System.out println(line);
            pokemons.add(line);
        }
        Scanner sc = new Scanner(System.in);
        String type = sc.next();
        HashSet ptypes = new LinkedHashSet();
        if(!ptype.contains(type) ){
            System.out.println("Invalid Pokemon Type");
            return;
        }
        for(String pok : pokemons){
            String ptype = pok.split(",")[1];
            if (type.equals(type)){
                System.out.println(pok);
            }
        }
    }
}
   
  
        

    

