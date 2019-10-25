package task1;

import java.util.Random;

public class ArrayOrder {
    public static void main(String[] args) {

        int[] tab = new int[10];
        Random random = new Random();

        for(int i = 0; i<tab.length; i++){
            tab[i] = random.nextInt(10);
        }

//        for(int i = 0; i<tab.length; i++){
//
//            if(i>=tab.length/2) {
//                System.out.print(tab[tab.length - i - 1] + " ");
//            } else {
//                System.out.print(tab[i] + " ");
//            }
//        }

        int i = 0;
        int j = 0;
        while (i<tab.length*2 ){
            if(i>9) {
                System.out.print(tab[tab.length - 1 - j] + " ");
                j++;
            } else {
                System.out.print(tab[i] + " ");
            }
            i++;
        }

    }
}
