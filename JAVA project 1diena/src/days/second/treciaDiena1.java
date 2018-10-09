package days.second;

import java.util.Scanner;

public class treciaDiena1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Iveskite kuro bako talpa");
        double talpa = scanner.nextInt();

        System.out.println("Iveskite nuvaziuotus kilometrus");
        double atstumas = scanner.nextInt();

        System.out.println("Sanaudu vidurkis: " );

    }
    private static double avrg (int talpa, int atstumas){
        double vidurkis = talpa/atstumas;
                return vidurkis;
    }


}
