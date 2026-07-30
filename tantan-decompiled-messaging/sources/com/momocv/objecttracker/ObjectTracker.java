package com.momocv.objecttracker;

import com.momocv.MMFrame;
import com.momocv.OsUtils;

/* JADX INFO: loaded from: classes8.dex */
public class ObjectTracker {
    public int num_orientation = 5;

    /* JADX INFO: renamed from: n */
    public int f14772n = 3;

    /* JADX INFO: renamed from: N */
    public int f14771N = 10;
    public boolean enable_detect_scale = true;
    public boolean enable_detect_loss = false;
    public boolean update_model = true;
    private long mOBJ = 0;

    static {
        if (OsUtils.isWindows()) {
            System.loadLibrary("mmcv_base");
            System.loadLibrary("mmcv_api_base");
            System.loadLibrary("mmcv_api_objecttracker");
            return;
        }
        System.loadLibrary("c++_shared");
        System.loadLibrary("MNN");
        System.loadLibrary("MNN_CL");
        System.loadLibrary("MNN_Express");
        System.loadLibrary("mmcv_base");
        System.loadLibrary("mmcv_api_base");
        System.loadLibrary("mmcv_api_objecttracker");
    }

    public ObjectTracker() throws Throwable {
        Create();
    }

    private native long nativeCreate(long j, int i, int i2, int i3, boolean z, boolean z2, boolean z3);

    private static native boolean nativeReInit(long j, MMFrame mMFrame, ObjectTrackerParams objectTrackerParams);

    private native void nativeRelease(long j);

    private static native boolean nativeUpdate(long j, MMFrame mMFrame, ObjectTrackerParams objectTrackerParams, ObjectTrackerInfo objectTrackerInfo);

    public synchronized void Create() throws Throwable {
        try {
            try {
                Release();
                this.mOBJ = nativeCreate(this.mOBJ, this.num_orientation, this.f14772n, this.f14771N, this.enable_detect_scale, this.enable_detect_loss, this.update_model);
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            throw th;
        }
    }

    public synchronized boolean ReInit(MMFrame mMFrame, ObjectTrackerParams objectTrackerParams) {
        long j = this.mOBJ;
        if (j == 0) {
            return false;
        }
        return nativeReInit(j, mMFrame, objectTrackerParams);
    }

    public synchronized void Release() {
        long j = this.mOBJ;
        if (j != 0) {
            nativeRelease(j);
            this.mOBJ = 0L;
        }
    }

    public synchronized boolean Update(MMFrame mMFrame, ObjectTrackerParams objectTrackerParams, ObjectTrackerInfo objectTrackerInfo) {
        long j = this.mOBJ;
        if (j == 0) {
            return false;
        }
        return nativeUpdate(j, mMFrame, objectTrackerParams, objectTrackerInfo);
    }

    public void finalize() throws Throwable {
        super.finalize();
        Release();
    }
}
