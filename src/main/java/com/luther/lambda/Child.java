package com.luther.lambda;


/**
 * @Author: cpzh（不器）
 * @CreateTime: 2018/12/19 21:10
 * @UpdateTime: 2018/12/19 21:10
 * @Version: 1.0.0
 * @PackageName: com.luther.lambda
 * TODO:
 */
public interface Child extends Parent {
    default void welcome(){
        System.out.println("Child welcome");
    }
}
