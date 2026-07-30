package com.momo.xeengine.p001cv.bean;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
@Deprecated
public class XEJointInfo {
    public float[] location;
    public float[] location3D;
    public float[] location3DTo2D;
    public float score;

    public float[] getLocation() {
        return this.location;
    }

    public float[] getLocation3D() {
        return this.location3D;
    }

    public float[] getLocation3DTo2D() {
        return this.location3DTo2D;
    }

    public float getScore() {
        return this.score;
    }
}
