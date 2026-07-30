package com.p046p1.mobile.backtrace.backtrace;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes8.dex */
@Keep
public class WeChatBacktraceNative {
    @Keep
    public static native String[] consumeRequestedQut();

    @Keep
    public static native void enableLogger(boolean z);

    @Keep
    public static native void immediateGeneration(boolean z);

    @Keep
    public static native void notifyWarmedUp(String str, int i);

    @Keep
    public static void requestQutGenerate() {
    }

    @Keep
    public static native void setBacktraceMode(int i);

    @Keep
    public static native void setPackageName(String str);

    @Keep
    public static native void setQuickenAlwaysOn(boolean z);

    @Keep
    public static native void setSavingPath(String str);

    @Keep
    public static native void setWarmedUp(boolean z);

    @Keep
    public static native int[] statistic(String str);

    @Keep
    public static native boolean testLoadQut(String str, int i);

    @Keep
    public static native boolean warmUp(String str, int i, boolean z);
}
