package com.momocv.videoprocessor;

import android.util.Log;
import com.clevertap.android.sdk.Constants;
import com.momocv.FacePoseInfo;
import com.momocv.FacePoseParams;
import com.momocv.MMFrame;
import com.momocv.OsUtils;
import com.momocv.ReadFile2Bytes;

/* JADX INFO: loaded from: classes8.dex */
public class VideoProcessor {
    private static boolean initok = true;
    private long mOBJPtr = 0;
    private boolean inited = false;

    static {
        init();
    }

    public VideoProcessor() {
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
            return true;
        } catch (Throwable th) {
            th.printStackTrace();
            Log.e("mmcv", "failed to load native library" + th.getMessage());
            initok = false;
            return false;
        }
    }

    public static native boolean nativCalcRTMatrixByLandmarks(FacePoseParams facePoseParams, FacePoseInfo facePoseInfo);

    private static native long nativeCreate();

    private static native boolean nativeLoadModel(long j, byte[] bArr, byte[] bArr2);

    private static native boolean nativeProcessFrame(long j, MMFrame mMFrame, VideoParams videoParams, VideoInfo videoInfo);

    private static native void nativeRelease(long j);

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

    public synchronized boolean ProcessFrame(MMFrame mMFrame, VideoParams videoParams, VideoInfo videoInfo) {
        int i;
        int i2;
        int i3;
        int i4;
        if (!initok) {
            return false;
        }
        long j = this.mOBJPtr;
        if (j == 0 || !this.inited) {
            return false;
        }
        if (mMFrame.format_ == 17 && mMFrame.data_len_ != ((mMFrame.height_ * mMFrame.width_) * 3) / 2) {
            Log.e("mmcv", "_frame.data_len_ < _frame.height_ * _frame.step_ / 2 * 3frame.width_ " + mMFrame.width_ + "frame.height_" + mMFrame.height_ + "frame.data_len_" + mMFrame.data_len_);
            return false;
        }
        int[] iArr = videoParams.crop_rect;
        if (iArr != null && iArr.length == 4) {
            int i5 = iArr[0];
            int i6 = iArr[1];
            int i7 = iArr[2];
            int i8 = iArr[3];
            if (i5 < 0 || i5 > (i = mMFrame.width_) || i6 < 0 || i6 > (i2 = mMFrame.height_) || (i3 = i5 + i7) < 0 || i3 > i || (i4 = i6 + i8) < 0 || i4 > i2 || i7 <= 0 || i8 <= 0) {
                Log.e("mmcv", "crop_rect(" + i5 + Constants.SEPARATOR_COMMA + i6 + Constants.SEPARATOR_COMMA + i7 + Constants.SEPARATOR_COMMA + i8 + ") out of frame(" + mMFrame.width_ + Constants.SEPARATOR_COMMA + mMFrame.height_ + ")");
                return false;
            }
        }
        return nativeProcessFrame(j, mMFrame, videoParams, videoInfo);
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
