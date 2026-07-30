package com.tencent.youtu.liveness;

import android.content.res.AssetManager;
import android.graphics.Rect;

/* JADX INFO: loaded from: classes2.dex */
public class YTFaceTracker {
    public static IYtLoggerListener loggerListener;
    public long nativePtr;

    public interface IYtLoggerListener {
        void log(String str, String str2);
    }

    public static class Param {
        public int biggerFaceMode;
        public int detInterval;
        public int maxFaceSize;
        public int minFaceSize;
        public int nofaceDetInterval;
        public boolean nonSquareRect;
        public float threshold;
    }

    public static class TrackedFace {
        public Rect faceRect;
        public float[] faceShape;
        public float[] faceVisible;
        public int frameId;
        public float pitch;
        public float roll;
        public int traceId;
        public float yaw;
    }

    public YTFaceTracker(String str, String str2) {
        int iNativeConstructor = NativeConstructor(str, str2);
        if (iNativeConstructor == 0) {
            return;
        }
        throw new IllegalAccessError("error model dirpath and config filaneme or memory exhausted: " + iNativeConstructor);
    }

    private native int NativeConstructor(AssetManager assetManager, String str, String str2);

    private native int NativeConstructor(String str, String str2);

    private native void NativeDestructor();

    public static native String getVersion();

    public static void nativeLog(int i, String str) {
        IYtLoggerListener iYtLoggerListener = loggerListener;
        if (iYtLoggerListener != null) {
            iYtLoggerListener.log("[YTFaceTracker.nativeLog]", str);
        }
    }

    public static native void setLoggerLevel(int i);

    public static void setLoggerListener(IYtLoggerListener iYtLoggerListener) {
        loggerListener = iYtLoggerListener;
    }

    public void destroy() {
        NativeDestructor();
    }

    public void finalize() {
        NativeDestructor();
    }

    public native Param getParam();

    public native void reset();

    public native void setParam(Param param);

    public native TrackedFace[] track(int i, byte[] bArr, int i2, int i3, int i4);

    public YTFaceTracker(AssetManager assetManager, String str, String str2) {
        int iNativeConstructor = NativeConstructor(assetManager, str, str2);
        if (iNativeConstructor == 0) {
            return;
        }
        throw new IllegalAccessError("error model dirpath and config filaneme or memory exhausted: " + iNativeConstructor);
    }
}
