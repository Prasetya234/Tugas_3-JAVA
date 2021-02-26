import java.util.HashMap;
import java.util.Map;

public class Front {
    public static void main(String[] args){
        // membuat objek hashmap
        HashMap<String, back> books = new HashMap<String, back>();
        
        // membuat objek 
        back moba = new back ("Game Visual", "RPG");
        back dota = new back ("Game Adventure ", "RPG");
        back cr = new back ("Game Strategi", "RPG");

        // mengisi objek
        books.put("Moba ", moba);
        books.put("Dota", dota);
        books.put("CR", cr); 

        // cetak semua     
        for(Map.Entry b: books.entrySet()){
            back back = (back) b.getValue();
            System.out.println(b.getKey() + ": " + back.getTitle());
        }
    }
}