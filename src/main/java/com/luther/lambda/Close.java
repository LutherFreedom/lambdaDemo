package com.luther.lambda;

/**
 * @Author: cpzh（不器）
 * @CreateTime: 2018/12/25 20:54
 * @UpdateTime: 2018/12/25 20:54
 * @Version: 1.0.0
 * @PackageName: com.luther.lambda
 * TODO:
 */
public class Close implements Action {
    private final Editor editor;

    public Close(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void perform() {
        editor.close();
    }
}
