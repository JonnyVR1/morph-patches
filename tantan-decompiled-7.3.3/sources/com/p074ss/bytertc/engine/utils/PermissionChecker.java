package com.p074ss.bytertc.engine.utils;

import com.bytedance.realx.base.CalledByNative;
import com.p074ss.bytertc.base.utils.RtcContextUtils;
import p153l.j26;

/* JADX INFO: loaded from: classes11.dex */
public class PermissionChecker {
    @CalledByNative
    public static boolean checkAudioPermission() {
        return j26.m143188a(RtcContextUtils.getApplicationContext(), "android.permission.RECORD_AUDIO") == 0;
    }

    @CalledByNative
    public static boolean checkCameraPermission() {
        return j26.m143188a(RtcContextUtils.getApplicationContext(), "android.permission.CAMERA") == 0;
    }
}
