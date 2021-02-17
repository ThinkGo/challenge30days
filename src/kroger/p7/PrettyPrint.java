package kroger.p7;

//What is the output from running main?
//	Note: LinkedList implements the Queue interface

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class PrettyPrint {
    public void doActionCallsItself(Queue q) {
        if (q.isEmpty()) return;

        //System.out.println(q.toString());
        Object first = q.remove();
//        System.out.println(first.toString());
        doActionCallsItself(q) ;
        System.out.println(first.toString());
    }

    public static void main(String[] args) {
        LinkedList<String> starterList = new LinkedList<>(
                Arrays.asList("A", "B", "C", "D", "E"));

        PrettyPrint pp = new PrettyPrint();

        pp.doActionCallsItself(starterList);
    }
}