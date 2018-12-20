package com.luther.lambda;

import org.junit.Test;

/**
 * @Author: cpzh（不器）
 * @CreateTime: 2018/12/19 21:13
 * @UpdateTime: 2018/12/19 21:13
 * @Version: 1.0.0
 * @PackageName: com.luther.lambda
 * TODO:
 */
public class DefaultM {
    @Test
    public void testA(){
        OverridingChild overridingChild = new OverridingChild();
        overridingChild.welcome();
    }
}
