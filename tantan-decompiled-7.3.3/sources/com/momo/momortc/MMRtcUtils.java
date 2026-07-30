package com.momo.momortc;

import com.momo.rtcbase.CalledByNative;
import java.util.UUID;

/* JADX INFO: loaded from: classes8.dex */
public class MMRtcUtils {
    @CalledByNative
    public static String getUUID() {
        return UUID.randomUUID().toString();
    }
}
