package com.luther.lambda;

/**
 * @Author: cpzh（不器）
 * @CreateTime: 2018/12/25 20:55
 * @UpdateTime: 2018/12/25 20:55
 * @Version: 1.0.0
 * @PackageName: com.luther.lambda
 * TODO:
 */
public class Open implements Action {

    private final Editor editor;

    public Open(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.open();
    }
}
