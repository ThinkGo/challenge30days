package kr0ger.p2;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdasTest {
    public static void main(String[] args) {
        List<String> listString = Arrays.asList("Geek", "QA", "GeekForQ", "goo","bar");
        Predicate<String> p = (s) -> s.startsWith("G");
        for (String st: listString){
            if(p.test(st)){
                System.out.println(st);
            }
        }

    }
}
//Geek
//GeekForQ
