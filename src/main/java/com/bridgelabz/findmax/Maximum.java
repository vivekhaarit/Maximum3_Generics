package com.bridgelabz.findmax;

public class Maximum {

    public static Integer largestInteger(Integer a,Integer b,Integer c){
        if((a.compareTo(b)>0) && (a.compareTo(c)>0))
            return a;
        else if((b.compareTo(a)>0) && (b.compareTo(c)>0))
            return b;
        else
            return c;
    }
    public static Float largestFloat(Float a,Float b,Float c){
        if((a.compareTo(b)>0) && (a.compareTo(c)>0))
            return a;
        else if((b.compareTo(a)>0) && (b.compareTo(c)>0))
            return b;
        else
            return c;
    }
    public static String maxString(String a,String b,String c){
        if((a.compareTo(b)>0) && (a.compareTo(c)>0))
            return a;
        else if((b.compareTo(a)>0) && (b.compareTo(c)>0))
            return b;
        else
            return c;
    }
}
