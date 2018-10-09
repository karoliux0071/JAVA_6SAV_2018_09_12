package ketvirtaDiena;

import javax.xml.stream.events.Characters;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class uzdPirmasCode {
    public static void main(String[] args) {

Map<Integer,String> encodes = readEncodeFile();   //iskvietimas!!! file readerio
        List<Integer> letters = readEncodedLetter();

        StringBuilder sb = new StringBuilder();    //sudes visas raides
        letters.forEach( l -> sb.append(encodes.get(l)));
        System.out.println(sb.toString());
        uzkoduotiTeksta(encodes);

    }

    private static List<Integer> readEncodedLetter(){   //naujas metodas
     List<Integer> letters = new ArrayList<>();
     try(BufferedReader bf = new BufferedReader(new FileReader("laiskas.txt"))){
         String line;
         while ((line = bf.readLine())  != null) {
          String[] items = line.split(" ");
          Arrays.asList(items).forEach(v -> letters.add(Integer.parseInt(v)));
         }
     }catch (IOException e) {
         System.out.println(e);
     }

     return letters;

    }

    private static Map<Integer, String> readEncodeFile() {

        Map<Integer, String> encodes = new TreeMap<>();
        try (BufferedReader bf = new BufferedReader(new FileReader("koduote.txt"))) {  //failo nuskaitymas

            String line;
            while ((line = bf.readLine()) != null) {
                String[] items = line.split(" ");
                if(items.length == 2) {
                    Integer key = Integer.parseInt(items [0]);
                    //String val = items[1].equals()

                }else {
                    System.out.println("Bloga koduote" + line);
                }

            }

        } catch (IOException e) {
            System.out.println(e);
        }


        return encodes;

    }
    private static void uzkoduotiTeksta (Map<Integer, String> koduote) { //metodas nieko negrazinantis
      System.out.println("iveskite teksta , kuri norite uzkoduoti");
      Scanner sc = new Scanner (System.in);
      String word = sc.nextLine();
      char[] line = word.toCharArray();
      StringBuilder sb = new StringBuilder();  //objektas

      for(int i = 0; i < line.length; i++){  //i++ ima sekanti
          String raide = String.valueOf(line[i]);
          koduote.forEach((k, v)-> {
              if (raide.equals(v)){
                  sb.append(k).append(" ");   //nekuria nauja stringo i sukurta ideda
              }
          });
      }
      System.out.println(sb.toString());

    }


}
