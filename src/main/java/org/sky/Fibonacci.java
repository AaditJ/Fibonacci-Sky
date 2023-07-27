package org.sky;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Fibonacci {

    static Dictionary<Long, Long> dictionary = new Hashtable<>();
    static {
        dictionary.put(1L,0L);
        dictionary.put(2L,1L);
    }
    public static long FibCalc(long n){
        try{
            if(n<=0){
                System.out.println("This is not in scope");
                throw new ArrayIndexOutOfBoundsException();
            }
            if (dictionary.get(n) == null){

                dictionary.put(n, recurse(n));
            }
            return dictionary.get(n);

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
            return -1;
        }
    }

    public static long recurse(long n){
        return FibCalc(n-1) + FibCalc(n-2);
    }
}
