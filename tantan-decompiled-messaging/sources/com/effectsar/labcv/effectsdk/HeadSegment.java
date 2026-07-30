package com.effectsar.labcv.effectsdk;

import android.content.Context;
import android.util.Log;
import java.lang.reflect.Array;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes.dex */
public class HeadSegment {
    private boolean inited = false;
    private long mNativePtr;

    static {
        try {
            System.loadLibrary("effect");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace();
        }
    }

    private native int nativeCheckLicense(Context context, String str, boolean z);

    private native int nativeCreateHandle();

    private native int nativeInitModel(String str);

    private native int nativeProcess(ByteBuffer byteBuffer, int i, int i2, int i3, int i4, int i5, float[][] fArr, BefHeadSegInfo befHeadSegInfo);

    private native int nativeRelease();

    private native int nativeSetParam(int i, float f);

    private float[][] serializeFace106(BefFaceInfo.Face106[] face106Arr) {
        if (face106Arr == null || face106Arr.length == 0) {
            return null;
        }
        float[][] fArr = (float[][]) Array.newInstance((Class<?>) Float.TYPE, face106Arr.length, 212);
        for (int i = 0; i < face106Arr.length; i++) {
            for (int i2 = 0; i2 < 106; i2++) {
                float[] fArr2 = fArr[i];
                int i3 = i2 * 2;
                BefFaceInfo.FacePoint facePoint = face106Arr[i].points_array[i2];
                fArr2[i3] = facePoint.f5823x;
                fArr2[i3 + 1] = facePoint.f5824y;
            }
        }
        return fArr;
    }

    public synchronized int init(Context context, String str, String str2, boolean z) {
        int iNativeCreateHandle;
        try {
            if (this.inited) {
                iNativeCreateHandle = -1;
            } else {
                iNativeCreateHandle = nativeCreateHandle();
                if (iNativeCreateHandle == 0) {
                    iNativeCreateHandle = nativeCheckLicense(context, str2, z);
                }
                boolean z2 = true;
                if (iNativeCreateHandle == 0) {
                    iNativeCreateHandle = nativeInitModel(str);
                    setParam(EffectsSDKEffectConstants.HeadSegmentParamType.BEF_AI_HS_ENABLE_TRACKING, 1);
                    setParam(EffectsSDKEffectConstants.HeadSegmentParamType.BEF_AI_HS_MAX_FACE, 2);
                }
                if (iNativeCreateHandle != 0) {
                    z2 = false;
                }
                this.inited = z2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return iNativeCreateHandle;
    }

    public boolean isInited() {
        return this.inited;
    }

    public BefHeadSegInfo process(ByteBuffer byteBuffer, EffectsSDKEffectConstants.PixlFormat pixlFormat, int i, int i2, int i3, EffectsSDKEffectConstants.Rotation rotation, BefFaceInfo.Face106[] face106Arr) {
        BefHeadSegInfo befHeadSegInfo = new BefHeadSegInfo();
        float[][] fArrSerializeFace106 = serializeFace106(face106Arr);
        if (fArrSerializeFace106 == null) {
            return null;
        }
        int iNativeProcess = nativeProcess(byteBuffer, pixlFormat.getValue(), i, i2, i3, rotation.f5853id, fArrSerializeFace106, befHeadSegInfo);
        if (iNativeProcess == 0) {
            return befHeadSegInfo;
        }
        Log.e(EffectsSDKEffectConstants.TAG, "headseg failed with " + iNativeProcess);
        return null;
    }

    public synchronized void release() {
        try {
            if (this.inited) {
                nativeRelease();
            }
            this.inited = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int setParam(EffectsSDKEffectConstants.HeadSegmentParamType headSegmentParamType, int i) {
        return nativeSetParam(headSegmentParamType.getValue(), i);
    }

    public synchronized int init(Context context, String str, String str2) {
        return init(context, str, str2, false);
    }
}
