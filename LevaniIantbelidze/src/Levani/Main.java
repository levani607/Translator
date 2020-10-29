package Levani;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean x = true;


        while(x)
        {

            Scanner myscann = new Scanner(System.in);
            System.out.println("sheiyvane sityva");
            String sityva = myscann.nextLine();
            Trans translate = new Trans(sityva);

        }

    }
}
