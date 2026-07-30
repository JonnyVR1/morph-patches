package com.core.glcore.p023cv;

import com.momocv.MMBox;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public class MMCVBoxes implements Serializable {
    private MMBox[] detectResult;

    public MMBox[] getDetectResult() {
        return this.detectResult;
    }

    public void setDetectResult(MMBox[] mMBoxArr) {
        this.detectResult = mMBoxArr;
    }
}
