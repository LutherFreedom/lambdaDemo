package com.luther.lambda;

/**
 * @Author: cpzh（不器）
 * @CreateTime: 2018/12/19 21:09
 * @UpdateTime: 2018/12/19 21:09
 * @Version: 1.0.0
 * @PackageName: com.luther.lambda
 * TODO:
 */
public interface Parent {
    default void welcome() {
        System.out.println("Parent Welcome");
    }
}
