package com.momocv.handlandmark;

import com.momocv.MMFrame;
import com.momocv.OsUtils;
import com.momocv.ReadFile2Bytes;

/* JADX INFO: loaded from: classes8.dex */
public class HandLandmark {
    private boolean releasing = false;
    private long mOBJPtr = 0;
    private boolean inited = false;

    static {
        if (OsUtils.isWindows()) {
            System.loadLibrary("mmcv_base");
            System.loadLibrary("mmcv_api_base");
            System.loadLibrary("mmcv_api_handlandmark");
            return;
        }
        System.loadLibrary("c++_shared");
        System.loadLibrary("MNN");
        System.loadLibrary("MNN_CL");
        System.loadLibrary("MNN_Express");
        System.loadLibrary("mmcv_base");
        System.loadLibrary("mmcv_api_base");
        System.loadLibrary("mmcv_api_handlandmark");
    }

    public HandLandmark() {
        Create();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void ReleaseFunctor() {
        try {
            long j = this.mOBJPtr;
            if (j != 0) {
                nativeRelease(j);
                this.mOBJPtr = 0L;
                this.inited = false;
            }
            this.releasing = false;
        } catch (Throwable th) {
            throw th;
        }
    }

    private static native long nativeCreate();

    private static native boolean nativeLoadModel(long j, byte[] bArr);

    private static native boolean nativeLoadModelSync(long j, byte[] bArr);

    private static native boolean nativeProcessFrame(long j, MMFrame mMFrame, HandLandmarkParams handLandmarkParams, HandLandmarkPostInfo handLandmarkPostInfo);

    private static native void nativeRelease(long j);

    public synchronized void Create() {
        if (!this.releasing) {
            this.mOBJPtr = nativeCreate();
        }
    }

    public synchronized boolean LoadModel(String str) {
        try {
            if (OsUtils.maceSyncLoading()) {
                return false;
            }
            if (this.mOBJPtr != 0 && !this.inited) {
                this.inited = nativeLoadModel(this.mOBJPtr, ReadFile2Bytes.StringPath2Bytes(str));
            }
            return this.inited;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean LoadModelSync(String str) {
        try {
            if (this.mOBJPtr != 0 && !this.inited) {
                this.inited = nativeLoadModelSync(this.mOBJPtr, ReadFile2Bytes.StringPath2Bytes(str));
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.inited;
    }

    public synchronized boolean ProcessFrame(MMFrame mMFrame, HandLandmarkParams handLandmarkParams, HandLandmarkPostInfo handLandmarkPostInfo) {
        if (OsUtils.maceSyncLoading()) {
            return false;
        }
        long j = this.mOBJPtr;
        if (j == 0 || !this.inited) {
            return false;
        }
        return nativeProcessFrame(j, mMFrame, handLandmarkParams, handLandmarkPostInfo);
    }

    public synchronized void Release() {
        this.releasing = true;
        new Thread(new Runnable() { // from class: com.momocv.handlandmark.HandLandmark.1
            @Override // java.lang.Runnable
            public void run() {
                HandLandmark.this.ReleaseFunctor();
            }
        }, "HandLandmarkRelease").start();
    }

    public void finalize() throws Throwable {
        super.finalize();
        Release();
    }

    public synchronized boolean LoadModelSync(byte[] bArr) {
        try {
            long j = this.mOBJPtr;
            if (j != 0 && !this.inited) {
                this.inited = nativeLoadModelSync(j, bArr);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.inited;
    }

    public synchronized boolean LoadModel(byte[] bArr) {
        try {
            if (OsUtils.maceSyncLoading()) {
                return false;
            }
            long j = this.mOBJPtr;
            if (j != 0 && !this.inited) {
                this.inited = nativeLoadModel(j, bArr);
            }
            return this.inited;
        } catch (Throwable th) {
            throw th;
        }
    }
}
