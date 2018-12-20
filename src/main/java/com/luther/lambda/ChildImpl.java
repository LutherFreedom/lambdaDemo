package com.luther.lambda;

/**
 * @Author: cpzh（不器）
 * @CreateTime: 2018/12/19 21:12
 * @UpdateTime: 2018/12/19 21:12
 * @Version: 1.0.0
 * @PackageName: com.luther.lambda
 * TODO:
 */
public class ChildImpl implements Child {
    @Override
    public void welcome(){
        System.out.println("ChildImpl welcome");
    }
}
