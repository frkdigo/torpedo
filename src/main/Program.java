package main;

import java.util.Random;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        System.out.println("Torpedó játék");
        int[] hajoPoz = new int[3];
        int veletlenPoz = (int)(Math.random() * 5);
        hajoPoz[0] = veletlenPoz;
        hajoPoz[1] = veletlenPoz + 1;
        hajoPoz[2] = veletlenPoz + 2;
        
        Hajo hajo = new Hajo(hajoPoz);
        
        int lovesekSzama = 0, talalatokSzama = 0;
        boolean sullyed = false;
        do{
            Scanner s = new Scanner(System.in);
            System.out.println("helye: ");
            int tipp = s.nextInt();
            if(hajo.talalat(tipp)){
                System.out.println("Talált");
                talalatokSzama++;
            }
            else {
                System.out.println("Mellé");
            }
            lovesekSzama++;
            sullyed = talalatokSzama == 3;
        } 
        while(!sullyed);
        System.out.printf("Találatok száma: ", lovesekSzama);
        
        }
}
