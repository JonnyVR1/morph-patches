package com.cosmos.photon.push.uniqueid;

import android.content.Context;
import android.os.Build;
import android.telephony.TelephonyManager;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.util.PermissionUtils;
import com.p051p1.mobile.putong.data.Device;

/* JADX INFO: loaded from: classes.dex */
public class UniqueIMEI implements IUniqueId {
    private static final String TAG = "UniqueIMEI";

    private String getIMEI(Context context) {
        TelephonyManager telephonyManager;
        if (PermissionUtils.checkPermission(context, "android.permission.READ_PHONE_STATE") && (telephonyManager = (TelephonyManager) context.getSystemService("phone")) != null) {
            try {
                return Build.VERSION.SDK_INT >= 26 ? telephonyManager.getImei() : telephonyManager.getDeviceId();
            } catch (Throwable th) {
                MDLog.m7451v(TAG, th.getMessage());
            }
        }
        return null;
    }

    @Override // com.cosmos.photon.push.uniqueid.IUniqueId
    public String getTag() {
        return Device.IMEI;
    }

    @Override // com.cosmos.photon.push.uniqueid.IUniqueId
    public String getUniqueId(Context context) {
        return getIMEI(context);
    }
}
