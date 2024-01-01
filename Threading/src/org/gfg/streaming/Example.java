package org.gfg.streaming;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Example {

    public static void main(String[] args) {
        // array given = {1,2,3,4,5,6,7,8,9,10}
         // filter out only even mum -> 2, 4, 6, 8, 10
        // 4+ 16+ 36+ 64+ 100 = 220
        // iterative code  way -> iterate over the data in a collection
        int sum =0;
        List<Integer> num = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        for(int i = 0;i< num.size();i++){
            if(num.get(i) %2 == 0){
               sum += num.get(i)*num.get(i);
            }
        }
        System.out.println("sum is " + sum);

        long start = System.currentTimeMillis();
        // declarative way of coding ->  declare first what u want to do ?
       Optional<Integer> o = num.stream().filter(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                System.out.println("in the filter method");
                return integer%2 ==0;
            }
        }).map(new Function<Integer, Integer>() {
            @Override
            public Integer apply(Integer integer) {
                System.out.println("i am in apply method ");
                return integer*integer;
            }
        }).reduce(new BinaryOperator<Integer>() {
           @Override
           public Integer apply(Integer integer, Integer integer2) {
               System.out.println("i am in reduce method ");
               return integer+integer2;
           }
       });
        long end = System.currentTimeMillis();
        System.out.println("time difference is " + (end-start));

//        Optional<Integer> b  = o.reduce(new BinaryOperator<Integer>() {
//            @Override
//            public Integer apply(Integer integer, Integer integer2) {
//                return integer+integer2;
//            }
//        });
//               .reduce(0, new BinaryOperator<Integer>() {
//           @Override
//           public Integer apply(Integer integer, Integer integer2) {
//               System.out.println("integer is "+integer);
//               System.out.println("integer2 is "+integer2);
//               return integer+integer2;
//           }
//       });

       // lamda expresssion of functional interfaces
       int ans1 = num.stream().filter(integer -> integer%2 ==0).
               map(integer -> integer*integer).reduce(0, (integer, integer2) -> integer+integer2);
        System.out.println("ans1 is "  +  ans1);

//       System.out.println("ans is "  +  ans);

//    complexity of iterative or declarative way is different or same ?

    }
}
