package com.bef.effectsdk.game;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class NativeInterface {
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

    public static void createHandle(long[] jArr) {
        nativeCreateHandle(jArr);
    }

    public static int destroy(long j) {
        return nativeDestroy(j);
    }

    public static int init(long j, int i, int i2) {
        return nativeInit(j, i, i2);
    }

    private static native int nativeAddMessageListener(long j, NativeMessageListener nativeMessageListener);

    private static native void nativeCreateHandle(long[] jArr);

    private static native int nativeDestroy(long j);

    private static native int nativeInit(long j, int i, int i2);

    private static native int nativePause(long j);

    private static native int nativePostMessage(long j, long j2, long j3, long j4, String str);

    private static native int nativeProcess(long j, int i, int i2, double d);

    private static native int nativeRemoveMessageListener(long j, NativeMessageListener nativeMessageListener);

    private static native int nativeResume(long j);

    private static native int nativeSetSize(long j, int i, int i2);

    private static native int nativeSetStickerPath(long j, String str);

    private static native int nativeTouchesBegin(long j, int[] iArr, float[] fArr, float[] fArr2);

    private static native int nativeTouchesEnd(long j, int[] iArr, float[] fArr, float[] fArr2);

    private static native int nativeTouchesMove(long j, int[] iArr, float[] fArr, float[] fArr2);

    public static int pause(long j) {
        return nativePause(j);
    }

    public static int postMessage(long j, long j2, long j3, long j4, String str) {
        return nativePostMessage(j, j2, j3, j4, str);
    }

    public static int processFrame(long j, int i, int i2, double d) {
        return nativeProcess(j, i, i2, d);
    }

    public static int removeMessageListener(long j, NativeMessageListener nativeMessageListener) {
        return nativeRemoveMessageListener(j, nativeMessageListener);
    }

    public static int resume(long j) {
        return nativeResume(j);
    }

    public static int setGameBundlePath(long j, String str) {
        return nativeSetStickerPath(j, str);
    }

    public static int setSize(long j, int i, int i2) {
        return nativeSetSize(j, i, i2);
    }

    public static int touchesBegin(long j, int[] iArr, float[] fArr, float[] fArr2) {
        return nativeTouchesBegin(j, iArr, fArr, fArr2);
    }

    public static int touchesEnd(long j, int[] iArr, float[] fArr, float[] fArr2) {
        return nativeTouchesEnd(j, iArr, fArr, fArr2);
    }

    public static int touchesMove(long j, int[] iArr, float[] fArr, float[] fArr2) {
        return nativeTouchesMove(j, iArr, fArr, fArr2);
    }
}
