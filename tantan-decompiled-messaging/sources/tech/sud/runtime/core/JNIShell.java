package tech.sud.runtime.core;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class JNIShell {
    static {
        System.loadLibrary("sud");
    }

    public static native void call(long j, int i, int i2, int i3, String str);

    public static native long create(long j);

    public static native void destroy(long j);

    public static native boolean deviceIs64Bit();

    public static native void gDestroy(long j);

    public static native void gInitOrResize(long j, int i, int i2, int i3, float f);

    public static native void gPause(long j);

    public static native boolean gRender(long j);

    public static native void gResume(long j);

    public static native void gTextBitmap(long j, int i, int i2, Bitmap bitmap, int i3, int i4);

    public static native void onTouch(long j, int i, int[] iArr, float[] fArr, float[] fArr2, double d);

    public static native void setJNIContext(long j, Object obj, Object obj2, String str);

    public static native void setLogCallback(Object obj);

    public static native void setNotchInfo(long j, boolean z, int i, int i2);

    public static native void setOption(long j, String str, String str2);

    public static native void setScreenSize(long j, int i, int i2);

    public static native String version(int i);
}
