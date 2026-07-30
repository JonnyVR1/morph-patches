package com.p074ss.android.ttvecamera;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class TEVBoostInterface {

    public enum VBoostCapabilityType {
        UNKNOWN,
        CPU_FREQ_MIN,
        CPU_FREQ_MAX,
        CPU_CORE_MIN,
        CPU_CORE_MAX,
        GPU_FREQ_MIN,
        GPU_FREQ_MAX,
        BUS_FREQ_MIN,
        BUS_FREQ_MAX,
        UFS_FREQ_MIN,
        UFS_FREQ_MAX,
        TASK_PRIORITY,
        CPU_AFFINITY,
        IDLE_STATE,
        IO_PRELOAD,
        NETWORK_ENHANCE,
        PRESET_SCENE,
        THUMB_FETCH,
        VIBRATE_ENHANCE
    }

    /* JADX INFO: renamed from: a */
    public static int m81726a(VBoostCapabilityType vBoostCapabilityType) {
        return 0;
    }

    /* JADX INFO: renamed from: b */
    public static void m81727b(Context context) {
    }

    /* JADX INFO: renamed from: c */
    public static boolean m81728c(VBoostCapabilityType vBoostCapabilityType) {
        return false;
    }

    /* JADX INFO: renamed from: d */
    public static int m81729d(VBoostCapabilityType vBoostCapabilityType, int i, long j) {
        return 0;
    }
}
