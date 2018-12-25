package com.luther.lambda;

/**
 * @Author: cpzh（不器）
 * @CreateTime: 2018/12/25 21:00
 * @UpdateTime: 2018/12/25 21:00
 * @Version: 1.0.0
 * @PackageName: com.luther.lambda
 * TODO:
 */
public class SimpleEditor implements Editor {
    @Override
    public void open() {
        System.out.println("Simple Method Open");
    }

    @Override
    public void save() {
        System.out.println("Simple Method Save");
    }

    @Override
    public void close() {
        System.out.println("Simple Method Close");
    }
}
