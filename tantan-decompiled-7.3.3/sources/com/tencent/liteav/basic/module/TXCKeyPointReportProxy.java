package com.tencent.liteav.basic.module;

import android.content.Context;
import com.tencent.liteav.basic.log.TXCLog;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public class TXCKeyPointReportProxy {

    /* JADX INFO: renamed from: com.tencent.liteav.basic.module.TXCKeyPointReportProxy$a */
    public static class C14202a {

        /* JADX INFO: renamed from: a */
        public int f59294a;

        /* JADX INFO: renamed from: b */
        public int f59295b;

        /* JADX INFO: renamed from: c */
        public int f59296c;

        /* JADX INFO: renamed from: d */
        public int f59297d;

        /* JADX INFO: renamed from: e */
        public String f59298e;

        /* JADX INFO: renamed from: f */
        public String f59299f;

        /* JADX INFO: renamed from: g */
        public String f59300g;

        /* JADX INFO: renamed from: h */
        public String f59301h;
    }

    /* JADX INFO: renamed from: a */
    public static void m84168a(Context context) {
        File externalFilesDir;
        if (context == null || (externalFilesDir = context.getApplicationContext().getExternalFilesDir(null)) == null) {
            return;
        }
        String str = externalFilesDir.getAbsolutePath() + "/txrtmp/ssoreport.txt";
        File file = new File(str);
        if (!file.exists()) {
            try {
                if (!file.mkdirs()) {
                    TXCLog.m84149e("TXCKeyPointReportProxy", "can not create sso file path");
                    return;
                }
            } catch (Exception e) {
                TXCLog.m84149e("TXCKeyPointReportProxy", "create sso file exception:" + e.toString());
            }
        }
        nativeInit(str);
    }

    /* JADX INFO: renamed from: b */
    public static void m84172b(int i, int i2) {
        nativeTagKeyPointEnd(i, i2);
    }

    /* JADX INFO: renamed from: c */
    public static void m84173c(int i, int i2) {
        nativeSetBasicInfo(i, i2);
    }

    private static native void nativeInit(String str);

    private static native void nativeSendCacheReport();

    private static native void nativeSetBasicInfo(int i, int i2);

    private static native void nativeSetCpu(int i, int i2);

    private static native void nativeSetDeviceInfo(int i, int i2, int i3, int i4, String str, String str2, String str3, String str4);

    private static native void nativeSetErrorCode(int i);

    private static native void nativeSetLocalQuality(int i, int i2, int i3);

    private static native void nativeTagKeyPointEnd(int i, int i2);

    private static native void nativeTagKeyPointStart(int i);

    private static native void nativesetRemoteQuality(String str, int i, long j, int i2);

    /* JADX INFO: renamed from: b */
    public static void m84171b(int i) {
        nativeSetErrorCode(i);
    }

    /* JADX INFO: renamed from: a */
    public static void m84164a() {
        nativeSendCacheReport();
    }

    /* JADX INFO: renamed from: a */
    public static void m84169a(C14202a c14202a) {
        nativeSetDeviceInfo(c14202a.f59294a, c14202a.f59295b, c14202a.f59296c, c14202a.f59297d, c14202a.f59298e, c14202a.f59299f, c14202a.f59300g, c14202a.f59301h);
    }

    /* JADX INFO: renamed from: a */
    public static void m84166a(int i, int i2) {
        nativeSetCpu(i, i2);
    }

    /* JADX INFO: renamed from: a */
    public static void m84165a(int i) {
        nativeTagKeyPointStart(i);
    }

    /* JADX INFO: renamed from: a */
    public static void m84170a(String str, int i, long j, int i2) {
        nativesetRemoteQuality(str, i, j, i2);
    }

    /* JADX INFO: renamed from: a */
    public static void m84167a(int i, int i2, int i3) {
        nativeSetLocalQuality(i, i2, i3);
    }
}
