package days.first;

import java.util.Scanner;   // ctrl + space importinam

public class SecondExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);  //nusako kad duomenys bus is console //obejktas
        String word;  //tuscio kint sukurimas
        do {

            System.out.println("Iveskite zodi:");  //spausdina i console

             word = scanner.nextLine(); //nereikia string
             int countLetters = countLetters(word);
             if(word.length() % 2 == 0){
                 System.out.println("Ivestas zodis lyginis");
             }else {
                 System.out.println("Ivestas zodis nelyginis");
             }
            System.out.println(word);
        }while(!word.toLowerCase().equals("pabaiga"));  //raidziu sumazinimas toLowerCase




    }

    private static int countLetters (String word){   //raidziu kiekio skaiciavimas
        int count = 0;  //default reiksme 0
        for(int i = 0; i < word.length(); i++) {
            if(word.charAt(i) ==  'a') {
                count++;   //?????
            }
        }
        return count;   //grazinam






    }


}
