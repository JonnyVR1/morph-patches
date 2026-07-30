package com.bef.effectsdk.algorithm;

import com.amazing.annotation.EffectKeep;

/* JADX INFO: loaded from: classes.dex */
@EffectKeep
public class RectDocDetResult {
    public static final int DETECT_FAIL = -1;
    public static final int DETECT_SUCCESS = 0;
    private RectDocDetRatio rectDocDetRatio;
    private RectDocDetTargetArea rectDocDetTargetArea;
    private int resultStatus = -1;

    @EffectKeep
    public RectDocDetResult(RectDocDetTargetArea rectDocDetTargetArea, RectDocDetRatio rectDocDetRatio) {
        this.rectDocDetTargetArea = rectDocDetTargetArea;
        this.rectDocDetRatio = rectDocDetRatio;
    }

    public RectDocDetRatio getRectDocDetRatio() {
        return this.rectDocDetRatio;
    }

    public RectDocDetTargetArea getRectDocDetTargetArea() {
        return this.rectDocDetTargetArea;
    }

    public int getResultStatus() {
        return this.resultStatus;
    }

    @EffectKeep
    public RectDocDetResult() {
    }
}
