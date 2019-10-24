package task4;

public class ArrayComparator {
    boolean compare(int[] tab1, int[] tab2){
        //sprawdzenie tablic
        if(tab1.length != tab2.length) {
            return false;
        } else if (tab1 == null && tab2 == null) {
            return false;
        }
        //sprawdzenie wartości w tablicach
        for(int i = 0;i<tab1.length;i++){
            if(tab1[i] != tab2[i]) {
                return false;
            }
        }
        return true;
    }
}
