package com.p051p1.mobile.backtrace.xlog;

import androidx.annotation.Keep;

/* JADX INFO: loaded from: classes8.dex */
public class XLogNative {
    public static void setXLogger(String str) {
        setXLoggerNative(str);
    }

    @Keep
    private static native void setXLoggerNative(String str);
}
