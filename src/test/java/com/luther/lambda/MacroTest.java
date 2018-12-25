package com.luther.lambda;

import org.junit.Test;

/**
 * @Author: cpzh（不器）
 * @CreateTime: 2018/12/25 21:01
 * @UpdateTime: 2018/12/25 21:01
 * @Version: 1.0.0
 * @PackageName: com.luther.lambda
 * TODO:
 */
public class MacroTest {
    @Test
    public void testA(){
        Macro macro = new Macro();
        Editor editor = new SimpleEditor();
        macro.record(()->editor.open());
        macro.record(()->editor.close());
        macro.record(()->editor.save());

        macro.run();

    }
}
