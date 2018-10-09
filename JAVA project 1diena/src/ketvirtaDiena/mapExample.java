package ketvirtaDiena;


import java.util.LinkedHashMap;
import java.util.Map;

public class mapExample {
    public static void main(String[] args) {

        Map<Integer, String> cats = new LinkedHashMap<>();   // sukurimas < K , V >

        cats.put (2 , "Pukis");
        cats.put (1 , "Neiznau");
        cats.put (3 , "Cigonas");
        cats.put (4 , "Rainis");   //jei key butu toks pats pasikeistu reiksme

        for (Integer key : cats.keySet());
        {


            //System.out.println("Key " + key + "values:" + cats.get(key));
        }
    }
}
