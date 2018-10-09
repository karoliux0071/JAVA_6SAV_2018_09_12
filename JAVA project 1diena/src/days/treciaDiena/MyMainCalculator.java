package days.treciaDiena;

import java.util.Scanner;

public class MyMainCalculator {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();   //metodo iskvietimas is kitos klases
        System.out.println("Iveskite skaicius ir zenkla tarp ju pvx; '10 + 10'");
        Scanner scanner = new Scanner(System.in);   // skanuoja ka iraso vartotojas
        String line = scanner.nextLine();  //nuskaito visa eilute
        String [] items = line.split (" ");  //masyvo apsirasymas

        if(items.length == 3) {  //masyvo ilgis
          int numb = Integer.parseInt (items[0]);   // nario paemimas is masyvo
            int numb2 = Integer.parseInt (items[2]);  //string keitimas i int   int.perseint-konvertavimas
            String action = items[1];

            switch (action){
                case "+":
                    int sum = calculator.sum(numb, numb2);
                    System.out.println("Suma " + sum);
                    break;
                case "-":
                     int atimtis = (numb - numb2);

                    break;
                case "/":

                    break;
                default:
                    break;

            }

        }else{
            System.out.println("Ka tu cia darai?? ");  //blogoji salyga
        }

    }
}
