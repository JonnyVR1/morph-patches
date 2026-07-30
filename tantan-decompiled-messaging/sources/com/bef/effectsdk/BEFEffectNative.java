package com.bef.effectsdk;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class BEFEffectNative {
    public static final int BEF_CLOCKWISE_ROTATE_0 = 0;
    public static final int BEF_CLOCKWISE_ROTATE_180 = 2;
    public static final int BEF_CLOCKWISE_ROTATE_270 = 3;
    public static final int BEF_CLOCKWISE_ROTATE_90 = 1;
    private static final List<String> list;

    static {
        List<String> listAsList = Arrays.asList("effect");
        list = listAsList;
        try {
            Iterator<String> it = listAsList.iterator();
            while (it.hasNext()) {
                System.loadLibrary(it.next());
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static long createHandle(boolean z) {
        return nativeCreateHandle(z);
    }

    public static int destroyHandle(long j) {
        return nativeDestroyHandle(j);
    }

    public static String getEffectSDKVersion() {
        return nativeGetEffectSDKVersion();
    }

    public static int initResourceFinder(long j, ResourceFinder resourceFinder, int i, int i2, String str) {
        return nativeInitResourceFinder(j, resourceFinder, i, i2, str);
    }

    private static native long nativeCreateHandle(boolean z);

    private static native int nativeDestroyHandle(long j);

    private static native String nativeGetEffectSDKVersion();

    private static native int nativeInitResourceFinder(long j, ResourceFinder resourceFinder, int i, int i2, String str);

    private static native int nativeProcessAlgorithm(long j, int i, int i2, int i3, double d);

    private static native int nativeProcessFrame(long j, int i, int i2, int i3, int i4, double d);

    private static native int nativeReleaseResourceFinder(long j, ResourceFinder resourceFinder);

    private static native int nativeSendMessage(long j, long j2, long j3, long j4, String str);

    private static native void nativeSetCameraPosition(long j, boolean z);

    private static native void nativeSetFrameOrientation(long j, int i);

    private static native void nativeSetOrientation(long j, int i);

    private static native int nativeSetStickerPath(long j, String str);

    private static native int nativeTouchEvent(long j, int i, int[] iArr, float[] fArr, float[] fArr2);

    public static int processAlgorithm(long j, int i, int i2, int i3, double d) {
        return nativeProcessAlgorithm(j, i, i2, i3, d);
    }

    public static int processFrame(long j, int i, int i2, int i3, int i4, double d) {
        return nativeProcessFrame(j, i, i2, i3, i4, d);
    }

    public static int releaseResourceFinder(long j, ResourceFinder resourceFinder) {
        return nativeReleaseResourceFinder(j, resourceFinder);
    }

    public static int sendMessage(long j, long j2, long j3, long j4, String str) {
        return nativeSendMessage(j, j2, j3, j4, str);
    }

    public static void setCameraPosition(long j, boolean z) {
        nativeSetCameraPosition(j, z);
    }

    public static void setFrameOrientation(long j, int i) {
        nativeSetFrameOrientation(j, i);
    }

    public static void setOrientation(long j, int i) {
        nativeSetOrientation(j, i);
    }

    public static int setStickerPath(long j, String str) {
        return nativeSetStickerPath(j, str);
    }

    public static int touchBeginEvent(long j, int[] iArr, float[] fArr, float[] fArr2) {
        return nativeTouchEvent(j, 0, iArr, fArr, fArr2);
    }

    public static int touchEndEvent(long j, int[] iArr, float[] fArr, float[] fArr2) {
        return nativeTouchEvent(j, 2, iArr, fArr, fArr2);
    }

    public static int touchMoveEvent(long j, int[] iArr, float[] fArr, float[] fArr2) {
        return nativeTouchEvent(j, 1, iArr, fArr, fArr2);
    }
}
