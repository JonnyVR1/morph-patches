package com.effectsar.labcv.effectsdk;

import android.content.Context;
import android.util.Log;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* JADX INFO: loaded from: classes.dex */
public class PhotoNightScene {
    static String TAG;
    private long mNativePtr = 0;
    private boolean mInited = false;
    private int mWidth = 0;
    private int mHeight = 0;
    private ByteBuffer mResultBuffer = null;

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
        TAG = "PhotoNightScene";
    }

    private native int nativeCheckLicense(Context context, String str, boolean z);

    private native int nativeCreate(String str, int i, int i2, int i3, int i4);

    private native int nativeProcess(ByteBuffer[] byteBufferArr, ByteBuffer byteBuffer);

    private native void nativeRelease();

    public void destroy() {
        nativeRelease();
    }

    public int getHeight() {
        return this.mHeight;
    }

    public ByteBuffer getResultBuffer() {
        return this.mResultBuffer;
    }

    public int getWidth() {
        return this.mWidth;
    }

    public int init(Context context, String str, String str2, int i, int i2, int i3, int i4, boolean z) {
        if (this.mInited) {
            return 0;
        }
        int iNativeCreate = nativeCreate(str2, i, i2, i3, i4);
        if (iNativeCreate != 0) {
            return iNativeCreate;
        }
        int iNativeCheckLicense = nativeCheckLicense(context, str, z);
        if (iNativeCheckLicense == 0) {
            this.mInited = true;
        }
        this.mWidth = i;
        this.mHeight = i2;
        return iNativeCheckLicense;
    }

    public ByteBuffer process(ByteBuffer[] byteBufferArr) {
        if (!this.mInited) {
            return null;
        }
        if (this.mResultBuffer == null) {
            this.mResultBuffer = ByteBuffer.allocateDirect((int) (this.mHeight * this.mWidth * 1.5f)).order(ByteOrder.nativeOrder());
        }
        this.mResultBuffer.position(0);
        if (byteBufferArr.length != 4 && byteBufferArr.length != 6) {
            Log.e(TAG, "process: invalid input size should equals 4 or 6");
            return null;
        }
        if (nativeProcess(byteBufferArr, this.mResultBuffer) != 0) {
            return null;
        }
        return this.mResultBuffer;
    }
}
