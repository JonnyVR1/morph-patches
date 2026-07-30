package com.momocv.cartoonface;

import android.util.Log;
import com.momocv.MMFrame;
import com.momocv.OsUtils;
import com.momocv.ReadFile2Bytes;

/* JADX INFO: loaded from: classes8.dex */
public class Cartoonface {
    private static boolean initok = true;
    private boolean releasing = false;
    private long mOBJPtr = 0;
    private boolean inited = false;

    static {
        init();
    }

    public Cartoonface() {
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

    public static boolean init() {
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
            System.loadLibrary("mmcv_api_cartoonface");
            return true;
        }
        try {
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
            System.loadLibrary("mmcv_api_cartoonface");
            return true;
        } catch (Throwable th) {
            Log.e("mmcv", "failed to load native library" + th.getMessage());
            initok = false;
            return false;
        }
    }

    private static native long nativeCreate();

    private static native boolean nativeLoadModel(long j, byte[] bArr);

    private static native boolean nativeProcessFrame(long j, MMFrame mMFrame, CartoonfaceParams cartoonfaceParams, CartoonfaceInfo cartoonfaceInfo);

    private static native void nativeRelease(long j);

    private static native void nativeReset(long j);

    public synchronized void Create() {
        if (initok) {
            if (!this.releasing) {
                this.mOBJPtr = nativeCreate();
            }
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

    public synchronized boolean ProcessFrame(MMFrame mMFrame, CartoonfaceParams cartoonfaceParams, CartoonfaceInfo cartoonfaceInfo) {
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
        return nativeProcessFrame(j, mMFrame, cartoonfaceParams, cartoonfaceInfo);
    }

    public synchronized void Release() {
        this.releasing = true;
        new Thread(new Runnable() { // from class: com.momocv.cartoonface.Cartoonface.1
            @Override // java.lang.Runnable
            public void run() {
                Cartoonface.this.ReleaseFunctor();
            }
        }, "CartoonFaceRelease").start();
    }

    public synchronized void Reset() {
        if (initok) {
            long j = this.mOBJPtr;
            if (j != 0) {
                nativeReset(j);
            }
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        Release();
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
