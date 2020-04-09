package com.bridgelabz.findmax;

public class Maximum {

    public static <T extends Comparable<T>> T maximumValue(T a,T b,T c){
        if((a.compareTo(b)>0) && (a.compareTo(c)>0))
            return a;
        else if((b.compareTo(a)>0) && (b.compareTo(c)>0))
            return b;
        else
            return c;
    }
}
