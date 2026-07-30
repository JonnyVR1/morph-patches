package com.p074ss.bytertc.engine;

import com.p074ss.bytertc.engine.data.Quaternionf;
import com.p074ss.bytertc.engine.utils.LogUtil;
import com.p074ss.bytertc.engine.video.IPanoramicVideo;

/* JADX INFO: loaded from: classes11.dex */
public class NativePanoramicVideo implements IPanoramicVideo {
    private static final String TAG = "NativePanoramicVideo}";
    private long mNaiveInstance;

    public NativePanoramicVideo(long j) {
        this.mNaiveInstance = j;
    }

    public static native int nativeUpdateQuaternionf(long j, float f, float f2, float f3, float f4);

    public void release() {
        this.mNaiveInstance = 0L;
    }

    @Override // com.p074ss.bytertc.engine.video.IPanoramicVideo
    public int updateQuaternionf(Quaternionf quaternionf) {
        long j = this.mNaiveInstance;
        if (j != 0) {
            return nativeUpdateQuaternionf(j, quaternionf.f56473x, quaternionf.f56474y, quaternionf.f56475z, quaternionf.f56472w);
        }
        LogUtil.m82084e(TAG, "native Panoramic is invalid, updateQuaternionf failed.");
        return -1;
    }
}
