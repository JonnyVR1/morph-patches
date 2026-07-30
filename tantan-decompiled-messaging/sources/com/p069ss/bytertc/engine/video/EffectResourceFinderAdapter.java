package com.p069ss.bytertc.engine.video;

import com.bytedance.realx.base.CalledByNative;

/* JADX INFO: loaded from: classes13.dex */
public class EffectResourceFinderAdapter {
    public static IRtcResourceFinder sFinder;

    @CalledByNative
    public static long CreateNativeResourceFinder(long j) {
        IRtcResourceFinder iRtcResourceFinder;
        if (j == 0 || (iRtcResourceFinder = sFinder) == null) {
            return 0L;
        }
        return iRtcResourceFinder.createNativeResourceFinder(j);
    }

    @CalledByNative
    public static void ReleaseNativeResourceFinder(long j) {
        sFinder.release(j);
    }
}
