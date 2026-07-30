package com.p074ss.bytertc.engine.video;

import java.util.Arrays;

/* JADX INFO: loaded from: classes11.dex */
public class ExpressionDetectResult {
    public static final int MAX_COUNT = 10;
    public ExpressionDetectInfo[] detectInfo;
    public int detectResult = 0;
    public int faceCount = 0;

    public String toString() {
        return "ExpressionDetectResult{detectResult=" + this.detectResult + ", detectInfo=" + Arrays.toString(this.detectInfo) + '}';
    }
}
