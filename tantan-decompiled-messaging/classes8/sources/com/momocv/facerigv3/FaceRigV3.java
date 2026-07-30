package com.momocv.facerigv3;

import com.momocv.MMFrame;
import com.momocv.OsUtils;
import com.momocv.ReadFile2Bytes;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class FaceRigV3 {
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
            System.loadLibrary("mmcv_api_facerigv3");
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
        System.loadLibrary("mmcv_api_facerigv3");
    }

    public FaceRigV3() {
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

    private static native boolean nativeLoadModel(long j, byte[] bArr);

    private static native boolean nativeProcessFrame(long j, MMFrame mMFrame, FacerigV3Params facerigV3Params, FacerigV3Info facerigV3Info);

    private static native void nativeRelease(long j);

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

    public synchronized boolean ProcessFrame(MMFrame mMFrame, FacerigV3Params facerigV3Params, FacerigV3Info facerigV3Info) {
        long j;
        j = this.mOBJPtr;
        return j != 0 ? nativeProcessFrame(j, mMFrame, facerigV3Params, facerigV3Info) : false;
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
