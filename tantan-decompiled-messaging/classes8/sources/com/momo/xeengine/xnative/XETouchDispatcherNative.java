package com.momo.xeengine.xnative;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
@Keep
public abstract class XETouchDispatcherNative {
    public native int nativeGetWindowHeight(long j);

    public native int nativeGetWindowWidth(long j);

    public native boolean nativeHandleTouchHitTest(long j);

    public native void nativeHandleTouchesBegin(long j, int i, int[] iArr, float[] fArr, float[] fArr2);

    public native void nativeHandleTouchesEnd(long j, int i, int[] iArr, float[] fArr, float[] fArr2);

    public native void nativeHandleTouchesMove(long j, int i, int[] iArr, float[] fArr, float[] fArr2);
}
