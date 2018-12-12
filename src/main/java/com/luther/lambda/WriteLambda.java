package com.luther.lambda;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.function.BinaryOperator;

/**
 * @Author: cpzh（不器）
 * @CreateTime: 2018/12/11 20:16
 * @UpdateTime: 2018/12/11 20:16
 * @Version: 1.0.0
 * @PackageName: com.luther.lambda
 * TODO:
 */
public class WriteLambda {
    public static void main(String[] args) {
        Runnable noArguments = () -> {
            System.out.println("11111111");
        };

        ActionListener oneArgument = (event) -> {
            System.out.println("button clicked");
        };

        Runnable multiStatement = () -> {
            System.out.println("Hello ");
            System.out.println("World");
        };

        //对lambda表达式使用， 应用两个值去做操作
        BinaryOperator<Long> add = (x, y) -> x + y;

        BinaryOperator<Long> addExclicit = (Long x, Long y) -> x + y;

        //既定事实， name是final
        String name = "ss";
        ActionListener performed = (event) -> {
            System.out.println("hello" + name);
        };

        new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("hello" + name);
            }
        };
        // name可以改变
//        name = formatName(name);
//        ActionListener performed2 = (event) ->{
//            System.out.println(name);
//        };



    }

    private static String formatName(String name) {
        return name;
    }
}
