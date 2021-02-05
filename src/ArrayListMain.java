import java.util.ArrayList;
import java.util.Collections;

public class ArrayListMain {
    public static void main(String[] args){
        ArrayList arrayListOfIntegers = new ArrayList();
        arrayListOfIntegers.add(1);
        arrayListOfIntegers.add(2);
        arrayListOfIntegers.add(3);
        arrayListOfIntegers.add(4);
        arrayListOfIntegers.add(5);
        arrayListOfIntegers.add(6);
        arrayListOfIntegers.add(7);
        arrayListOfIntegers.add(8);
        arrayListOfIntegers.add(9);
        arrayListOfIntegers.add(10);
        arrayListOfIntegers.add(11);
        arrayListOfIntegers.add(12);
        arrayListOfIntegers.add(13);
        arrayListOfIntegers.add(14);
        arrayListOfIntegers.add(15);
        arrayListOfIntegers.add(16);
        arrayListOfIntegers.add(17);


        System.out.println(arrayListOfIntegers);
        System.out.println();
        Collections.shuffle(arrayListOfIntegers);
        System.out.println(arrayListOfIntegers);
        System.out.println();
        System.out.println(arrayListOfIntegers.get(1));









    }
}
