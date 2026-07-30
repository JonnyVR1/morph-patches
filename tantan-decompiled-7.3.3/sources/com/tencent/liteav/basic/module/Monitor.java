package com.tencent.liteav.basic.module;

/* JADX INFO: loaded from: classes2.dex */
public class Monitor {
    /* JADX INFO: renamed from: a */
    public static void m84162a(String str, int i, String str2) {
        nativeInit(str, i, str2);
    }

    private static native void nativeInit(String str, int i, String str2);

    private static native void nativeOnlineLog(int i, String str, String str2, int i2);

    private static native void nativeOnlineLogWithLimit(int i, int i2, String str, String str2, int i3, int i4);

    private static native void nativeUnInit();

    /* JADX INFO: renamed from: a */
    public static void m84161a(int i, String str, String str2, int i2) {
        nativeOnlineLog(i, str, str2, i2);
    }

    /* JADX INFO: renamed from: a */
    public static void m84160a(int i, int i2, String str, String str2, int i3, int i4) {
        nativeOnlineLogWithLimit(i, i2, str, str2, i3, i4);
    }

    /* JADX INFO: renamed from: a */
    public static void m84159a() {
        nativeUnInit();
    }
}
