package task4;

public class ArrayTest {
    public static void main(String[] args) {
        int[] tab1 = {1,2,3,4};
        int[] tab2 = {1,2,3,4};

        ArrayComparator arrayComparator = new ArrayComparator();
        System.out.println(arrayComparator.compare(tab1,tab2));

    }
}
