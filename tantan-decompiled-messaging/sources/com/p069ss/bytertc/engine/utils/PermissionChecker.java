package com.p069ss.bytertc.engine.utils;

import com.bytedance.realx.base.CalledByNative;
import com.p069ss.bytertc.base.utils.RtcContextUtils;
import p149l.e16;

/* JADX INFO: loaded from: classes13.dex */
public class PermissionChecker {
    @CalledByNative
    public static boolean checkAudioPermission() {
        return e16.m114373a(RtcContextUtils.getApplicationContext(), "android.permission.RECORD_AUDIO") == 0;
    }

    @CalledByNative
    public static boolean checkCameraPermission() {
        return e16.m114373a(RtcContextUtils.getApplicationContext(), "android.permission.CAMERA") == 0;
    }
}
