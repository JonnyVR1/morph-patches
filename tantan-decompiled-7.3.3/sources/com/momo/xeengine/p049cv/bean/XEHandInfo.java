package com.momo.xeengine.p049cv.bean;

import androidx.annotation.Keep;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
@Keep
@Deprecated
public class XEHandInfo {
    public List<XEGestureInfo> gestures;
    public List<XEJointInfo> landmarks;
    public float[] params3D;

    public List<XEGestureInfo> getGestures() {
        return this.gestures;
    }

    public List<XEJointInfo> getLandmarks() {
        return this.landmarks;
    }

    public float[] getParams3D() {
        return this.params3D;
    }
}
