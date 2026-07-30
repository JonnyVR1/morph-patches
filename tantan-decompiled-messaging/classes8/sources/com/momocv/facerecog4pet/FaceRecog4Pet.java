package com.momocv.facerecog4pet;

import com.momocv.MMFrame;
import com.momocv.OsUtils;
import com.momocv.ReadFile2Bytes;
import com.momocv.videoprocessor.VideoParams;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class FaceRecog4Pet {
    private long mOBJPtr = 0;
    private boolean inited = false;

    static {
        if (OsUtils.isWindows()) {
            System.loadLibrary("mmcv_base");
            System.loadLibrary("mmcv_api_base");
            System.loadLibrary("mmcv_api_facerecognition");
            System.loadLibrary("mmcv_api_faceattributes");
            System.loadLibrary("mmcv_api_beauty");
            System.loadLibrary("mmcv_api_imagequality");
            System.loadLibrary("mmcv_api_facefeatures");
            System.loadLibrary("mmcv_api_faceprocessor");
            System.loadLibrary("mmcv_api_videoprocessor");
            System.loadLibrary("mmcv_api_facerecog4pet");
            return;
        }
        System.loadLibrary("c++_shared");
        System.loadLibrary("MNN");
        System.loadLibrary("MNN_CL");
        System.loadLibrary("MNN_Express");
        System.loadLibrary("mmcv_base");
        System.loadLibrary("mmcv_api_base");
        System.loadLibrary("mmcv_api_facerecognition");
        System.loadLibrary("mmcv_api_faceattributes");
        System.loadLibrary("mmcv_api_beauty");
        System.loadLibrary("mmcv_api_imagequality");
        System.loadLibrary("mmcv_api_facefeatures");
        System.loadLibrary("mmcv_api_faceprocessor");
        System.loadLibrary("mmcv_api_videoprocessor");
        System.loadLibrary("mmcv_api_facerecog4pet");
    }

    public FaceRecog4Pet() {
        Create();
    }

    private void Create() {
        long j = this.mOBJPtr;
        if (j != 0) {
            nativeRelease(j);
        }
        this.mOBJPtr = nativeCreate();
    }

    private static native long nativeCreate();

    private static native byte[] nativeGetFeature(long j);

    private static native boolean nativeLoadModel(long j, byte[] bArr, byte[] bArr2, byte[] bArr3);

    private static native boolean nativeProcessFrame(long j, MMFrame mMFrame, VideoParams videoParams, FaceRecog4PetInfo faceRecog4PetInfo);

    private static native void nativeRelease(long j);

    private static native void nativeReset(long j);

    public synchronized boolean LoadModel(String str, String str2, String str3) {
        try {
            if (this.mOBJPtr != 0 && !this.inited) {
                this.inited = nativeLoadModel(this.mOBJPtr, ReadFile2Bytes.StringPath2Bytes(str), ReadFile2Bytes.StringPath2Bytes(str2), ReadFile2Bytes.StringPath2Bytes(str3));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.inited;
    }

    public synchronized boolean ProcessFrame(MMFrame mMFrame, VideoParams videoParams, FaceRecog4PetInfo faceRecog4PetInfo) {
        long j;
        j = this.mOBJPtr;
        return (j == 0 || !this.inited) ? false : nativeProcessFrame(j, mMFrame, videoParams, faceRecog4PetInfo);
    }

    public synchronized void Release() {
        try {
            long j = this.mOBJPtr;
            if (j != 0) {
                nativeRelease(j);
            }
            this.mOBJPtr = 0L;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized void Reset() {
        long j = this.mOBJPtr;
        if (j != 0) {
            nativeReset(j);
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        Release();
    }

    public synchronized byte[] getFeature() {
        long j;
        j = this.mOBJPtr;
        return (j == 0 || !this.inited) ? null : nativeGetFeature(j);
    }

    public synchronized boolean LoadModel(byte[] bArr, byte[] bArr2, byte[] bArr3) {
        try {
            long j = this.mOBJPtr;
            if (j != 0 && !this.inited) {
                this.inited = nativeLoadModel(j, bArr, bArr2, bArr3);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.inited;
    }
}
