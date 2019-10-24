package task1;

import java.util.Random;

public class ArrayOrder {
    public static void main(String[] args) {

        int[] tab = new int[20];
        Random random = new Random();

        for(int i = 0; i<tab.length/2; i++){
            tab[i] = random.nextInt(10);
        }

        for(int i = 0; i<tab.length; i++){

            if(i>=tab.length/2) {
                System.out.print(tab[tab.length - i - 1] + " ");
            } else {
                System.out.print(tab[i] + " ");
            }
        }

    }
}
