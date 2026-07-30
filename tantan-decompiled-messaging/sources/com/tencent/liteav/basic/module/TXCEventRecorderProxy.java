package com.tencent.liteav.basic.module;

/* JADX INFO: loaded from: classes2.dex */
public class TXCEventRecorderProxy {

    /* JADX INFO: renamed from: a */
    private long f58445a;

    /* JADX INFO: renamed from: a */
    public static void m82980a(String str, int i, long j, long j2, String str2, int i2) {
        if (str == null || str2 == null) {
            return;
        }
        nativeAddEventMsg(str, i, j, j2, str2, i2);
    }

    private static native void nativeAddEventMsg(String str, int i, long j, long j2, String str2, int i2);

    private static native void nativeRelease(long j);

    public void finalize() throws Throwable {
        nativeRelease(this.f58445a);
        this.f58445a = 0L;
        super.finalize();
    }
}
