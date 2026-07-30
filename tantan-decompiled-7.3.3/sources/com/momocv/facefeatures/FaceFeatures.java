package com.momocv.facefeatures;

import com.momocv.MMFrame;
import com.momocv.OsUtils;
import com.momocv.ReadFile2Bytes;

/* JADX INFO: loaded from: classes8.dex */
public class FaceFeatures {
    private long mOBJPtr = 0;
    private boolean inited = false;

    static {
        if (OsUtils.isWindows()) {
            System.loadLibrary("mmcv_base");
            System.loadLibrary("mmcv_api_base");
            System.loadLibrary("mmcv_api_facerecognition");
            System.loadLibrary("mmcv_api_imagequality");
            System.loadLibrary("mmcv_api_facefeatures");
            return;
        }
        System.loadLibrary("c++_shared");
        System.loadLibrary("MNN");
        System.loadLibrary("MNN_CL");
        System.loadLibrary("MNN_Express");
        System.loadLibrary("mmcv_base");
        System.loadLibrary("mmcv_api_base");
        System.loadLibrary("mmcv_api_facerecognition");
        System.loadLibrary("mmcv_api_imagequality");
        System.loadLibrary("mmcv_api_facefeatures");
    }

    public FaceFeatures() {
        Create();
    }

    private static native float nativeCompareFeatures(long j, float[] fArr, float[] fArr2);

    private static native long nativeCreate();

    private static native float[] nativeExtractFeatures(long j, byte[] bArr);

    private static native boolean nativeExtractFeatures_v2(long j, MMFrame mMFrame, FaceFeaturesParams faceFeaturesParams, FaceFeaturesInfo faceFeaturesInfo);

    private static native boolean nativeExtractFeatures_v3(long j, MMFrame mMFrame, FaceFeaturesParams faceFeaturesParams, FaceFeaturesInfo faceFeaturesInfo);

    private static native boolean nativeLoadModel(long j, byte[] bArr);

    private static native void nativeRelease(long j);

    public synchronized float CompareFeatures(float[] fArr, float[] fArr2) {
        long j = this.mOBJPtr;
        if (j == 0) {
            return 0.0f;
        }
        return nativeCompareFeatures(j, fArr, fArr2);
    }

    public synchronized void Create() {
        Release();
        this.mOBJPtr = nativeCreate();
    }

    public synchronized float[] ExtractFeatures(byte[] bArr) {
        long j = this.mOBJPtr;
        if (j == 0 || !this.inited) {
            return null;
        }
        return nativeExtractFeatures(j, bArr);
    }

    public synchronized boolean ExtractFeaturesV2(MMFrame mMFrame, FaceFeaturesParams faceFeaturesParams, FaceFeaturesInfo faceFeaturesInfo) {
        long j = this.mOBJPtr;
        if (j == 0 || !this.inited) {
            return false;
        }
        return nativeExtractFeatures_v2(j, mMFrame, faceFeaturesParams, faceFeaturesInfo);
    }

    public synchronized boolean ExtractFeaturesV3(MMFrame mMFrame, FaceFeaturesParams faceFeaturesParams, FaceFeaturesInfo faceFeaturesInfo) {
        long j = this.mOBJPtr;
        if (j == 0) {
            return false;
        }
        return nativeExtractFeatures_v3(j, mMFrame, faceFeaturesParams, faceFeaturesInfo);
    }

    public synchronized boolean LoadModel(String str) {
        try {
            if (this.mOBJPtr != 0 && !this.inited) {
                this.inited = nativeLoadModel(this.mOBJPtr, ReadFile2Bytes.StringPath2Bytes(str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.inited;
    }

    public synchronized void Release() {
        long j = this.mOBJPtr;
        if (j != 0) {
            nativeRelease(j);
            this.mOBJPtr = 0L;
            this.inited = false;
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        Release();
    }

    public synchronized boolean LoadModel(byte[] bArr) {
        try {
            long j = this.mOBJPtr;
            if (j != 0 && !this.inited) {
                this.inited = nativeLoadModel(j, bArr);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.inited;
    }
}
