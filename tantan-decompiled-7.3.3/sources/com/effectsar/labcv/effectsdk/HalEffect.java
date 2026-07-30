package com.effectsar.labcv.effectsdk;

import android.util.Log;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class HalEffect {
    private volatile boolean mInited;
    private long mNativePtr;

    static {
        System.loadLibrary("effect");
    }

    private native int nativeAppendComposerNodes(String[] strArr);

    private native int nativeCleanPipeline();

    private native int nativeGetFaceDetectResult(BefFaceInfo befFaceInfo);

    private native int nativeInit(String str, String str2, boolean z, int i, int i2);

    private native int nativeProcessBuffer(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, int i5);

    private native int nativeProcessBufferWithFaceInfo(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, int i5, int i6, BefFaceInfo befFaceInfo);

    private native int nativeProcessGesture(int i, float f, float f2, float f3, float f4, float f5);

    private native int nativeProcessTouch(int i, float f, float f2, float f3, float f4, int i2, int i3);

    private native void nativeRelease();

    private native int nativeRemoveComposerNodes(String[] strArr);

    private native int nativeSetCameraPosition(boolean z);

    private native int nativeSetComposer(String str);

    private native int nativeSetComposerNodes(String[] strArr, String[] strArr2);

    private native int nativeSetFilter(String str);

    private native int nativeSetRenderCacheTexture(String str, String str2);

    private native int nativeSetRenderCacheTexture(String str, ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5);

    private native int nativeSetSticker(String str);

    private native int nativeUpdateComposer(String str, String str2, float f, boolean z);

    private native int nativeUpdateIntensity(int i, float f);

    public int appendComposerNodes(String[] strArr) {
        if (this.mInited) {
            return nativeAppendComposerNodes(strArr);
        }
        return -1;
    }

    public boolean cleanPipeline() {
        return this.mInited && nativeCleanPipeline() == 0;
    }

    public BefFaceInfo getFaceDetectResult() {
        if (!this.mInited) {
            return null;
        }
        BefFaceInfo befFaceInfo = new BefFaceInfo();
        int iNativeGetFaceDetectResult = nativeGetFaceDetectResult(befFaceInfo);
        if (iNativeGetFaceDetectResult == 0) {
            return befFaceInfo;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "nativeGetFaceDetectResult return " + iNativeGetFaceDetectResult);
        return null;
    }

    public int init(String str, String str2, boolean z, int i, int i2) {
        if (this.mInited) {
            return 0;
        }
        int iNativeInit = nativeInit(str2, str, z, i, i2);
        this.mInited = iNativeInit == 0;
        return iNativeInit;
    }

    public boolean isInited() {
        return this.mInited;
    }

    @Deprecated
    public boolean processBuffer(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, int i5) {
        return this.mInited && nativeProcessBuffer(bArr, bArr2, i3, i4, i5, i, i2) == 0;
    }

    @Deprecated
    public boolean processBufferWithFaceInfo(byte[] bArr, byte[] bArr2, int i, int i2, int i3, int i4, int i5, int i6, BefFaceInfo befFaceInfo) {
        return this.mInited && nativeProcessBufferWithFaceInfo(bArr, bArr2, i3, i4, i5, i, i2, i6, befFaceInfo) == 0;
    }

    public int processGesture(EffectsSDKEffectConstants.GestureEventCode gestureEventCode, float f, float f2, float f3, float f4, float f5) {
        return nativeProcessGesture(gestureEventCode.getCode(), f, f2, f3, f4, f5);
    }

    public int processTouch(EffectsSDKEffectConstants.TouchEventCode touchEventCode, float f, float f2, float f3, float f4, int i, int i2) {
        return nativeProcessTouch(touchEventCode.getCode(), f, f2, f3, f4, i, i2);
    }

    public void release() {
        if (this.mInited) {
            nativeRelease();
        }
        this.mInited = false;
    }

    public int removeComposerNodes(String[] strArr) {
        if (this.mInited) {
            return nativeRemoveComposerNodes(strArr);
        }
        return -1;
    }

    public boolean setCameraPostion(boolean z) {
        return this.mInited && nativeSetCameraPosition(z) == 0;
    }

    public int setComposerNodes(String[] strArr) {
        if (this.mInited) {
            return nativeSetComposerNodes(strArr, null);
        }
        return -1;
    }

    public int setComposerNodesWithTags(String[] strArr, String[] strArr2) {
        if (this.mInited) {
            return nativeSetComposerNodes(strArr, strArr2);
        }
        return -1;
    }

    public boolean setFilter(String str) {
        if (!this.mInited) {
            return false;
        }
        if (str == null) {
            str = "";
        }
        return nativeSetFilter(str) == 0;
    }

    public int setRenderCacheTexture(String str, String str2) {
        return nativeSetRenderCacheTexture(str, str2);
    }

    public int setRenderCacheTextureWithBuffer(String str, ByteBuffer byteBuffer, int i, int i2, int i3, EffectsSDKEffectConstants.PixlFormat pixlFormat, EffectsSDKEffectConstants.Rotation rotation) {
        return nativeSetRenderCacheTexture(str, byteBuffer, i, i2, i3, pixlFormat.getValue(), rotation.f5890id);
    }

    public boolean setSticker(String str) {
        if (!this.mInited) {
            return false;
        }
        if (str == null) {
            str = "";
        }
        return nativeSetSticker(str) == 0;
    }

    public int updateComposerNodes(String str, String str2, float f, boolean z) {
        if (this.mInited) {
            return nativeUpdateComposer(str, str2, f, z);
        }
        return -1;
    }

    public boolean updateIntensity(int i, float f) {
        return this.mInited && nativeUpdateIntensity(i, f) == 0;
    }
}
