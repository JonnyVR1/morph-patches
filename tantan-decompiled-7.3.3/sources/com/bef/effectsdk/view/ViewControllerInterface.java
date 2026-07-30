package com.bef.effectsdk.view;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class ViewControllerInterface {
    private static final List<String> list;

    public interface NativeMessageListener {
        int nativeOnMsgReceived(long j, long j2, long j3, String str);
    }

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

    public static int addMessageListener(long j, NativeMessageListener nativeMessageListener) {
        return nativeAddMessageListener(j, nativeMessageListener);
    }

    public static int attachEffect(long j, long j2) {
        return nativeAttachEffect(j, j2);
    }

    public static void createHandle(long[] jArr) {
        nativeCreateHandle(jArr, 0);
    }

    public static int createTexture(int i, int i2, int i3, int i4, int i5) {
        return nativeCreateTexture(i, i2, i3, i4, i5);
    }

    public static int deleteTexture(int i) {
        return nativeDeleteTexture(i);
    }

    public static int destroy(long j) {
        return nativeDestroy(j);
    }

    public static int init(long j, int i, int i2) {
        return nativeInit(j, i, i2);
    }

    private static native int nativeAddMessageListener(long j, NativeMessageListener nativeMessageListener);

    private static native int nativeAttachEffect(long j, long j2);

    private static native void nativeCreateHandle(long[] jArr);

    private static native void nativeCreateHandle(long[] jArr, int i);

    private static native int nativeCreateTexture(int i, int i2, int i3, int i4, int i5);

    private static native int nativeDeleteTexture(int i);

    private static native int nativeDestroy(long j);

    private static native int nativeInit(long j, int i, int i2);

    private static native void nativeOnPause(long j);

    private static native void nativeOnResume(long j);

    private static native int nativePostMessage(long j, long j2, long j3, long j4, String str);

    private static native int nativeProcess(long j, int i, int i2, int i3, float[] fArr, float[] fArr2, double d);

    private static native int nativeRemoveMessageListener(long j, NativeMessageListener nativeMessageListener);

    private static native int nativeSetRenderCacheData(long j, String str, String str2);

    private static native int nativeSetRenderCacheTexture(long j, String str, String str2);

    private static native int nativeSetRenderCacheTextureWithBuffer(long j, String str, byte[] bArr, int i, int i2);

    private static native int nativeSetResourceFinder(long j, long j2, long j3);

    private static native int nativeSetStickerPath(long j, String str);

    private static native int nativeTouchEvent(long j, int i, int[] iArr, float[] fArr, float[] fArr2, int i2);

    public static void onPause(long j) {
        nativeOnPause(j);
    }

    public static void onResume(long j) {
        nativeOnResume(j);
    }

    public static int postMessage(long j, long j2, long j3, long j4, String str) {
        return nativePostMessage(j, j2, j3, j4, str);
    }

    public static int processFrame(long j, int i, int i2, int i3, float[] fArr, float[] fArr2, double d) {
        return nativeProcess(j, i, i2, i3, fArr, fArr2, d);
    }

    public static int removeMessageListener(long j, NativeMessageListener nativeMessageListener) {
        return nativeRemoveMessageListener(j, nativeMessageListener);
    }

    public static int setRenderCacheData(long j, String str, String str2) {
        return nativeSetRenderCacheData(j, str, str2);
    }

    public static int setRenderCacheTexture(long j, String str, String str2) {
        return nativeSetRenderCacheTexture(j, str, str2);
    }

    public static int setRenderCacheTextureWithBuffer(long j, String str, byte[] bArr, int i, int i2) {
        return nativeSetRenderCacheTextureWithBuffer(j, str, bArr, i, i2);
    }

    public static int setResourceFinder(long j, long j2, long j3) {
        return nativeSetResourceFinder(j, j2, j3);
    }

    public static int setStickerPath(long j, String str) {
        return nativeSetStickerPath(j, str);
    }

    public static int touchBeginEvent(long j, int[] iArr, float[] fArr, float[] fArr2) {
        return nativeTouchEvent(j, 0, iArr, fArr, fArr2, iArr.length);
    }

    public static int touchEndEvent(long j, int[] iArr, float[] fArr, float[] fArr2) {
        return nativeTouchEvent(j, 1, iArr, fArr, fArr2, iArr.length);
    }

    public static int touchMoveEvent(long j, int[] iArr, float[] fArr, float[] fArr2) {
        return nativeTouchEvent(j, 2, iArr, fArr, fArr2, iArr.length);
    }

    public static void createHandle(long[] jArr, int i) {
        nativeCreateHandle(jArr, i);
    }

    public static int touchBeginEvent(long j, int[] iArr, float[] fArr, float[] fArr2, int i) {
        return nativeTouchEvent(j, 0, iArr, fArr, fArr2, i);
    }

    public static int touchEndEvent(long j, int[] iArr, float[] fArr, float[] fArr2, int i) {
        return nativeTouchEvent(j, 1, iArr, fArr, fArr2, i);
    }

    public static int touchMoveEvent(long j, int[] iArr, float[] fArr, float[] fArr2, int i) {
        return nativeTouchEvent(j, 2, iArr, fArr, fArr2, i);
    }
}
