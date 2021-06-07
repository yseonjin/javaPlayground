package com.company;

import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Main {

    public static void main(String[] args) {
	    DoSomething ds = (number) -> number+10;
        System.out.println(ds.doIt(10));

        // 제공
        Function<Integer,Integer> funcInter = (t) -> t + 10;
        System.out.println(funcInter.apply(10));

        Function<Integer,Integer> funcMulti = (i) -> i * 2;
        // 뒤에서부터
        System.out.println(funcInter.compose(funcMulti).apply(10));

        // 앞에서부터
        System.out.println(funcInter.andThen(funcMulti).apply(10));

        BinaryOperator<Integer> sum = (a,b) -> a+b;
        System.out.println(sum.apply(2,3));

        // 메서드 레퍼런스 - static
        UnaryOperator<String> hi = Greeting::hi;
        System.out.println(hi.apply("jin"));

        // 메서드 레퍼런스 - instance
        Greeting greeting = new Greeting();
        UnaryOperator<String> hello = greeting::hello;
        System.out.println(hello.apply("Jin"));
    }
}
