package com.momocv.tietieheart;

import android.util.Log;
import com.momocv.MMFrame;
import com.momocv.OsUtils;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class TietieHeart {
    private static boolean initok = true;
    private boolean releasing = false;
    private long mOBJPtr = 0;
    private boolean inited = false;

    static {
        init();
    }

    public TietieHeart() {
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
            System.loadLibrary("mmcv_api_tietieheart");
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
            System.loadLibrary("mmcv_api_tietieheart");
            return true;
        } catch (Throwable th) {
            Log.e("mmcv", "failed to load native library" + th.getMessage());
            initok = false;
            return false;
        }
    }

    private static native long nativeCreate();

    private static native boolean nativeProcessFrame(long j, MMFrame mMFrame, TietieHeartParams tietieHeartParams, TietieHeartInfo tietieHeartInfo);

    private static native void nativeRelease(long j);

    private static native void nativeReset(long j);

    public synchronized void Create() {
        if (initok) {
            if (!this.releasing) {
                this.mOBJPtr = nativeCreate();
            }
        }
    }

    public synchronized boolean ProcessFrame(MMFrame mMFrame, TietieHeartParams tietieHeartParams, TietieHeartInfo tietieHeartInfo) {
        if (!initok) {
            return false;
        }
        if (OsUtils.maceSyncLoading()) {
            return false;
        }
        long j = this.mOBJPtr;
        if (j == 0) {
            return false;
        }
        return nativeProcessFrame(j, mMFrame, tietieHeartParams, tietieHeartInfo);
    }

    public synchronized void Release() {
        this.releasing = true;
        new Thread(new Runnable() { // from class: com.momocv.tietieheart.TietieHeart.1
            @Override // java.lang.Runnable
            public void run() {
                TietieHeart.this.ReleaseFunctor();
            }
        }, "TietieHeartRelease").start();
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
}
