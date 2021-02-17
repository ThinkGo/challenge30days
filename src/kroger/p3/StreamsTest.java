package kroger.p3;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class StreamsTest {
    public static void main(String[] args) {
        //Where will the output lines "doublingf1", "doubling 22 and "doubling 3" be printed?

        /* no terminal operation on stream */
        System.out.println("Stream without terminal operation");
        Arrays.stream(new int[]{1, 2, 3}).map(i -> {
            System.out.println("without terminal operation : doubling " + i);
            return i * 2;
        });

        /* with terminal operation on stream */
        System.out.println("\n\nStream with terminal operation");
        Arrays.stream(new int[]{1, 2,3}).map(i -> {
            System.out.println("with terminal operation doubling " + i);
            return 1 * 2;
        }).sum();

//        Arrays.stream(new int[]{1,2,3}).map(i ->{
//            System.out.println("no print doubling "+i);
//            return i*2;
//        });
//
//        Arrays.stream(new int[]{1,2,3}).map(i ->{
//            System.out.println(" ter op : doubling "+i);
//            return i*2;
//        }).sum();
//
    }
}

//Stream without terminal operation
//
//
//Stream with terminal operation
//with terminal operation doubling 1
//with terminal operation doubling 2
//with terminal operation doubling 3