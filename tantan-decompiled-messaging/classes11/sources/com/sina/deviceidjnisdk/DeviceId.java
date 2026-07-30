package com.sina.deviceidjnisdk;

import android.content.Context;

/* JADX INFO: loaded from: /tmp/tantan-dex/classes11.dex */
public class DeviceId implements IDeviceId {
    private Context mContext;

    static {
        System.loadLibrary("weibosdkcore");
    }

    private native String getDeviceIdNative(Context context, String str, String str2, String str3);
}
