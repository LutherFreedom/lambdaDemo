package com.luther.lambda;

import java.util.function.BinaryOperator;

/**
 * @Author: cpzh（不器）
 * @CreateTime: 2018/12/19 20:47
 * @UpdateTime: 2018/12/19 20:47
 * @Version: 1.0.0
 * @PackageName: com.luther.lambda
 * TODO:
 */
public class OverLoad {
    public void overloadedMethod(Object obj) {
        System.out.println("Object");
    }

    public void overloadedMethod(String s) {
        System.out.println("String");
    }

    public void overloadMethod(BinaryOperator<Integer> lambda) {
        System.out.println("Binary");
    }

    public void overloadMethod(IntegerBiFunction lambda) {
        System.out.println("IntegerBiFunction");
    }
}
