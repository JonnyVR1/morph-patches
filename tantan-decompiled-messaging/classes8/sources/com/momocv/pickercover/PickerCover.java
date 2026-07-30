package com.momocv.pickercover;

import android.util.Log;
import com.momocv.MMFrame;
import com.momocv.OsUtils;
import com.momocv.ReadFile2Bytes;
import com.momocv.videoprocessor.VideoParams;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes8.dex */
public class PickerCover {
    private static boolean initok = true;
    private long mOBJPtr = 0;
    private boolean inited = false;

    static {
        init();
    }

    public PickerCover() {
        Create();
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
            System.loadLibrary("mmcv_api_pickercover");
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
            System.loadLibrary("mmcv_api_pickercover");
            return true;
        } catch (Throwable th) {
            Log.e("mmcv", "failed to load native library" + th.getMessage());
            initok = false;
            return false;
        }
    }

    private native long nativeCreate();

    private static native boolean nativeLoadModel(long j, byte[] bArr, byte[] bArr2);

    private native boolean nativeProcessFrame(long j, MMFrame mMFrame, VideoParams videoParams, PickerCoverInfo pickerCoverInfo);

    private native void nativeRelease(long j);

    public synchronized void Create() {
        if (initok) {
            Release();
            this.mOBJPtr = nativeCreate();
        }
    }

    public synchronized boolean LoadModel(String str, String str2) {
        try {
            if (!initok) {
                return false;
            }
            if (this.mOBJPtr != 0 && !this.inited) {
                this.inited = nativeLoadModel(this.mOBJPtr, ReadFile2Bytes.StringPath2Bytes(str), ReadFile2Bytes.StringPath2Bytes(str2));
            }
            return this.inited;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized boolean ProcessFrame(MMFrame mMFrame, VideoParams videoParams, PickerCoverInfo pickerCoverInfo) throws Throwable {
        PickerCover pickerCover;
        try {
            try {
                boolean zNativeProcessFrame = false;
                if (!initok) {
                    return false;
                }
                long j = this.mOBJPtr;
                if (j == 0 || !this.inited) {
                    pickerCover = this;
                } else {
                    pickerCover = this;
                    zNativeProcessFrame = pickerCover.nativeProcessFrame(j, mMFrame, videoParams, pickerCoverInfo);
                }
                return zNativeProcessFrame;
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
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

    public synchronized boolean LoadModel(byte[] bArr, byte[] bArr2) {
        try {
            if (!initok) {
                return false;
            }
            long j = this.mOBJPtr;
            if (j != 0 && !this.inited) {
                this.inited = nativeLoadModel(j, bArr, bArr2);
            }
            return this.inited;
        } catch (Throwable th) {
            throw th;
        }
    }
}
