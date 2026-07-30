package com.tencent.liteav.beauty;

import android.util.Log;
import com.tencent.liteav.basic.util.C14215f;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes2.dex */
public class NativeLoad {
    private static final String TAG = "NativeLoad";

    /* JADX INFO: renamed from: com.tencent.liteav.beauty.NativeLoad$a */
    public static class C14219a {

        /* JADX INFO: renamed from: a */
        public static final NativeLoad f59375a;

        static {
            C14215f.m84239f();
            f59375a = new NativeLoad();
        }
    }

    private NativeLoad() {
        OnLoadBeauty();
        Log.e(TAG, "NativeLoad: load jni");
    }

    public static native void OnLoadBeauty();

    public static NativeLoad getInstance() {
        return C14219a.f59375a;
    }

    public static native void nativeClearQueue();

    public static native void nativeDeleteYuv2Yuv();

    public static native void nativeGlMapBufferToQueue(int i, int i2, ByteBuffer byteBuffer);

    public static native void nativeGlReadPixs(int i, int i2, byte[] bArr);

    public static native boolean nativeGlReadPixsFromQueue(int i, int i2, byte[] bArr);

    public static native void nativeGlReadPixsToQueue(int i, int i2);

    public static native int nativeLoadGLProgram(int i);

    public static native void nativeglTexImage2D(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, byte[] bArr, int i9);
}
