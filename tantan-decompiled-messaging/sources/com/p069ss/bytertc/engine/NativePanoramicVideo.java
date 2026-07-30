package com.p069ss.bytertc.engine;

import com.p069ss.bytertc.engine.data.Quaternionf;
import com.p069ss.bytertc.engine.utils.LogUtil;
import com.p069ss.bytertc.engine.video.IPanoramicVideo;

/* JADX INFO: loaded from: classes13.dex */
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

    @Override // com.p069ss.bytertc.engine.video.IPanoramicVideo
    public int updateQuaternionf(Quaternionf quaternionf) {
        long j = this.mNaiveInstance;
        if (j != 0) {
            return nativeUpdateQuaternionf(j, quaternionf.f55625x, quaternionf.f55626y, quaternionf.f55627z, quaternionf.f55624w);
        }
        LogUtil.m80901e(TAG, "native Panoramic is invalid, updateQuaternionf failed.");
        return -1;
    }
}
