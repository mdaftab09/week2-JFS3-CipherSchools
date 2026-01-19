//Md Aftab Raza Ansari 12005279
//code 41
// java io or file handling

//Reading file using file reader and projected oriented excersies
//method 2



import java.io.FileNotFoundException;
import java.io.FileReader;
public class Test0 {
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
        System.out.println("Total Pokemons "+ pokemons.size());   
        ArrayList<string> pokemonTitles= new ArrayList<String>();
        for(String pok : pokemons ) {
            String title = pok.split(",")[0];
            pokemonTtiles.add(title);
        }
        
        br.close();
        fr.close();
}
   
  
        

    

