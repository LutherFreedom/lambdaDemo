package com.luther.lambda;

import com.google.common.collect.Lists;

import java.util.List;

/**
 * @Author: cpzh（不器）
 * @CreateTime: 2018/12/25 20:56
 * @UpdateTime: 2018/12/25 20:56
 * @Version: 1.0.0
 * @PackageName: com.luther.lambda
 * TODO:
 */
public class Macro {
    private final List<Action> actions;

    public Macro() {
        this.actions = Lists.newArrayList();
    }

    public void record(Action action) {
        actions.add(action);
    }

    public void run() {
        actions.forEach(Action::perform);
    }
}
