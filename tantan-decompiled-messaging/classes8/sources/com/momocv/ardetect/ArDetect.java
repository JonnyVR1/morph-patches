package com.momocv.ardetect;

import android.util.Log;
import com.momocv.MMFrame;
import com.momocv.OsUtils;
import com.momocv.ReadFile2Bytes;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class ArDetect {
    private static boolean initok = true;
    private long mOBJPtr = 0;
    private boolean inited = false;

    static {
        init();
    }

    public ArDetect() {
        if (initok) {
            Create();
        }
    }

    public static boolean init() {
        if (OsUtils.isWindows()) {
            System.loadLibrary("mmcv_base");
            System.loadLibrary("mmcv_api_base");
            System.loadLibrary("mmcv_api_ardetect");
            return true;
        }
        try {
            System.loadLibrary("c++_shared");
            System.loadLibrary("MNN");
            System.loadLibrary("MNN_CL");
            System.loadLibrary("MNN_Express");
            System.loadLibrary("mmcv_base");
            System.loadLibrary("mmcv_api_base");
            System.loadLibrary("mmcv_api_ardetect");
            return true;
        } catch (Throwable th) {
            Log.e("mmcv", "failed to load native library" + th.getMessage());
            initok = false;
            return false;
        }
    }

    private static native long nativeCreate();

    private static native boolean nativeLoadModel(long j, byte[] bArr);

    private static native boolean nativeProcessFrame(long j, MMFrame mMFrame, ArDetectParams arDetectParams, ArDetectInfo arDetectInfo);

    private static native void nativeRelease(long j);

    public synchronized void Create() {
        Release();
        this.mOBJPtr = nativeCreate();
    }

    public synchronized boolean LoadModel(String str) {
        try {
            if (!initok) {
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

    public synchronized boolean ProcessFrame(MMFrame mMFrame, ArDetectParams arDetectParams, ArDetectInfo arDetectInfo) {
        if (!initok) {
            return false;
        }
        long j = this.mOBJPtr;
        if (j == 0 || !this.inited) {
            return false;
        }
        return nativeProcessFrame(j, mMFrame, arDetectParams, arDetectInfo);
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
            if (!initok) {
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
