package com.luther.lambda;

import org.junit.Test;

/**
 * @Author: cpzh（不器）
 * @CreateTime: 2018/12/19 20:45
 * @UpdateTime: 2018/12/19 20:45
 * @Version: 1.0.0
 * @PackageName: com.luther.lambda
 * TODO:
 */
public class OvrrideTest {
    @Test
    public void testA() {
        OverLoad overLoad = new OverLoad();
        overLoad.overloadedMethod("aaa");
    }

    @Test
    public void testB() {
        OverLoad overLoad = new OverLoad();
        overLoad.overloadMethod((x, y) -> x + y);
    }
}
