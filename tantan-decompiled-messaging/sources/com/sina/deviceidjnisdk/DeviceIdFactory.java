package com.sina.deviceidjnisdk;

import android.content.Context;

/* JADX INFO: loaded from: classes11.dex */
public class DeviceIdFactory {
    private static volatile IDeviceId sInstance;

    static {
        System.loadLibrary("weibosdkcore");
    }

    private DeviceIdFactory() {
    }

    public static native String calculateM(Context context, String str, String str2);

    private static native String getIValueNative(Context context, String str);

    private static native IDeviceId getInstanceNative(Context context, int i);
}
