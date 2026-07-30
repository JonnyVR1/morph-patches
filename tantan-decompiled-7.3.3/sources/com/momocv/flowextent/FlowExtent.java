package com.momocv.flowextent;

import com.momocv.BaseParams;
import com.momocv.MMFrame;
import com.momocv.OsUtils;

/* JADX INFO: loaded from: classes8.dex */
public class FlowExtent {
    private long mOBJPtr = 0;

    static {
        if (OsUtils.isWindows()) {
            System.loadLibrary("mmcv_base");
            System.loadLibrary("mmcv_api_base");
            System.loadLibrary("mmcv_api_flowextent");
            return;
        }
        System.loadLibrary("c++_shared");
        System.loadLibrary("MNN");
        System.loadLibrary("MNN_CL");
        System.loadLibrary("MNN_Express");
        System.loadLibrary("mmcv_base");
        System.loadLibrary("mmcv_api_base");
        System.loadLibrary("mmcv_api_flowextent");
    }

    public FlowExtent() {
        Create();
    }

    private native long nativeCreate();

    private native boolean nativeProcessFrame(long j, MMFrame mMFrame, BaseParams baseParams, FlowExtentInfo flowExtentInfo);

    private native void nativeRelease(long j);

    public synchronized void Create() {
        Release();
        this.mOBJPtr = nativeCreate();
    }

    public synchronized boolean ProcessFrame(MMFrame mMFrame, BaseParams baseParams, FlowExtentInfo flowExtentInfo) throws Throwable {
        try {
            try {
                long j = this.mOBJPtr;
                if (j == 0) {
                    return false;
                }
                return nativeProcessFrame(j, mMFrame, baseParams, flowExtentInfo);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public synchronized void Release() {
        long j = this.mOBJPtr;
        if (j != 0) {
            nativeRelease(j);
            this.mOBJPtr = 0L;
        }
    }

    public void finalize() throws Throwable {
        super.finalize();
        Release();
    }
}
