package ketvirtaDiena;

import java.util.Set;  //butina!!!!
import java.util.TreeSet;

public class setExample {
    public static void main(String[] args){
        Set<String> names = new TreeSet<>();   //SET sukurimas , surusiuos pagal abecele arba nuo min iki max

        names.add("Jonas");
        names.add("Andrius");
        names.add("Antanas");
        names.add("Jonas");
        names.add("Petras");

        names.forEach(System.out :: println);


    }
}
