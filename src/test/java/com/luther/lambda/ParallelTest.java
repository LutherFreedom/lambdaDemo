package com.luther.lambda;

import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * @Author: cpzh（不器）
 * @CreateTime: 2018/12/22 11:09
 * @UpdateTime: 2018/12/22 11:09
 * @Version: 1.0.0
 * @PackageName: com.luther.lambda
 * TODO:
 */
public class ParallelTest {
    private int[] arr = {1, 3, 4, 5, 6};

    @Test
    public void testA() {
        Arrays.parallelSetAll(arr, val -> val*val);
        System.out.println(Arrays.toString(arr));
    }
}
