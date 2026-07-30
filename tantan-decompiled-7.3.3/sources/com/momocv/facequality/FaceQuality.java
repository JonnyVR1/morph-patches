package com.momocv.facequality;

import com.momocv.MMFrame;
import com.momocv.OsUtils;
import com.momocv.ReadFile2Bytes;

/* JADX INFO: loaded from: classes8.dex */
public class FaceQuality {
    private long mOBJPtr = 0;
    private boolean inited = false;

    static {
        if (OsUtils.isWindows()) {
            System.loadLibrary("mmcv_base");
            System.loadLibrary("mmcv_api_base");
            System.loadLibrary("mmcv_api_facerecognition");
            System.loadLibrary("mmcv_api_facequality");
            return;
        }
        System.loadLibrary("c++_shared");
        System.loadLibrary("MNN");
        System.loadLibrary("MNN_CL");
        System.loadLibrary("MNN_Express");
        System.loadLibrary("mmcv_base");
        System.loadLibrary("mmcv_api_base");
        System.loadLibrary("mmcv_api_facerecognition");
        System.loadLibrary("mmcv_api_facequality");
    }

    public FaceQuality() {
        Create();
    }

    private static native long nativeCreate();

    private static native boolean nativeLoadModel(long j, byte[] bArr);

    private static native boolean nativeProcessFrame(long j, MMFrame mMFrame, FaceQualityParams faceQualityParams, FaceQualityInfo faceQualityInfo);

    private static native void nativeRelease(long j);

    public synchronized void Create() {
        Release();
        this.mOBJPtr = nativeCreate();
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

    public synchronized boolean ProcessFrame(MMFrame mMFrame, FaceQualityParams faceQualityParams, FaceQualityInfo faceQualityInfo) {
        long j = this.mOBJPtr;
        if (j == 0 || !this.inited) {
            return false;
        }
        return nativeProcessFrame(j, mMFrame, faceQualityParams, faceQualityInfo);
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
