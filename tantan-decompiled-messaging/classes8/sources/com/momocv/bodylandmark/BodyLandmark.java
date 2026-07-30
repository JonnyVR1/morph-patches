package com.momocv.bodylandmark;

import android.util.Log;
import com.momocv.MMFrame;
import com.momocv.OsUtils;
import com.momocv.ReadFile2Bytes;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class BodyLandmark {
    private static boolean initok = true;
    private boolean releasing = false;
    private long mOBJPtr = 0;
    private boolean inited = false;

    static {
        init();
    }

    public BodyLandmark() {
        if (initok) {
            Create();
        }
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

    public static boolean init() {
        if (OsUtils.isWindows()) {
            System.loadLibrary("mmcv_base");
            System.loadLibrary("mmcv_api_base");
            System.loadLibrary("mmcv_api_bodylandmark");
            return true;
        }
        try {
            System.loadLibrary("c++_shared");
            System.loadLibrary("MNN");
            System.loadLibrary("MNN_CL");
            System.loadLibrary("MNN_Express");
            System.loadLibrary("mmcv_base");
            System.loadLibrary("mmcv_api_base");
            System.loadLibrary("mmcv_api_bodylandmark");
            return true;
        } catch (Throwable th) {
            Log.e("mmcv", "failed to load native library" + th.getMessage());
            initok = false;
            return false;
        }
    }

    private static native long nativeCreate();

    private static native boolean nativeLoadModel(long j, byte[] bArr);

    private static native boolean nativeLoadModelSync(long j, byte[] bArr);

    private static native boolean nativeProcessFrame(long j, MMFrame mMFrame, BodyLandmarkParams bodyLandmarkParams, BodyLandmarkPostInfo bodyLandmarkPostInfo);

    private static native void nativeRelease(long j);

    public synchronized void Create() {
        if (!this.releasing) {
            this.mOBJPtr = nativeCreate();
        }
    }

    public synchronized boolean LoadModel(String str) {
        try {
            if (!initok) {
                return false;
            }
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
            if (!initok) {
                return false;
            }
            if (this.mOBJPtr != 0 && !this.inited) {
                this.inited = nativeLoadModelSync(this.mOBJPtr, ReadFile2Bytes.StringPath2Bytes(str));
            }
            return this.inited;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean ProcessFrame(MMFrame mMFrame, BodyLandmarkParams bodyLandmarkParams, BodyLandmarkPostInfo bodyLandmarkPostInfo) {
        if (!initok) {
            return false;
        }
        if (OsUtils.maceSyncLoading()) {
            return false;
        }
        long j = this.mOBJPtr;
        if (j == 0 || !this.inited) {
            return false;
        }
        return nativeProcessFrame(j, mMFrame, bodyLandmarkParams, bodyLandmarkPostInfo);
    }

    public synchronized void Release() {
        this.releasing = true;
        new Thread(new Runnable() { // from class: com.momocv.bodylandmark.BodyLandmark.1
            @Override // java.lang.Runnable
            public void run() {
                BodyLandmark.this.ReleaseFunctor();
            }
        }, "bodyLandmarksRelease").start();
    }

    public void finalize() throws Throwable {
        super.finalize();
        Release();
    }

    public synchronized boolean LoadModelSync(byte[] bArr) {
        try {
            if (!initok) {
                return false;
            }
            long j = this.mOBJPtr;
            if (j != 0 && !this.inited) {
                this.inited = nativeLoadModelSync(j, bArr);
            }
            return this.inited;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean LoadModel(byte[] bArr) {
        try {
            if (!initok) {
                return false;
            }
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
