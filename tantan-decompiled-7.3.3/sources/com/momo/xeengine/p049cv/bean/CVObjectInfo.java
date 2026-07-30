package com.momo.xeengine.p049cv.bean;

import androidx.annotation.Keep;
import java.io.Serializable;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Deprecated
public class CVObjectInfo implements Serializable {
    private float[] bounds;
    private float score;
    private String type;

    public float[] getBounds() {
        return this.bounds;
    }

    public float getScore() {
        return this.score;
    }

    public String getType() {
        return this.type;
    }

    public void setBounds(float[] fArr) {
        this.bounds = fArr;
    }

    public void setScore(float f) {
        this.score = f;
    }

    public void setType(String str) {
        this.type = str;
    }
}
