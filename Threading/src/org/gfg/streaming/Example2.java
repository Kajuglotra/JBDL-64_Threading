package org.gfg.streaming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Example2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("khgfkjhgf", "kk" , "" , "kuhjkjhgfh");
        // 1) length of string > 5 trim the length of string to 5 length
        // 2) u hvae to check that first and the last element in the given string is same of not
        // 3) if it is same, collect in list
        // 4) stream
        List<String> l = list.stream().filter(str -> str.length()>0).map(str -> str.substring(0, Math.min(str.length(), 5))).
                filter(str-> str.charAt(0) == str.charAt(str.length()-1)).collect(Collectors.toList());
        System.out.println(Runtime.getRuntime().availableProcessors());
        System.out.println(l);
    }
}
