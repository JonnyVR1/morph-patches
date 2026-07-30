package com.cosmos.photon.push.uniqueid;

import android.content.Context;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.clevertap.android.sdk.Constants;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.util.PermissionUtils;

/* JADX INFO: loaded from: classes.dex */
public class UniqueDeviceId implements IUniqueId {
    private static final String TAG = "UniqueDeviceId";

    @Override // com.cosmos.photon.push.uniqueid.IUniqueId
    public String getTag() {
        return Constants.DEVICE_ID_TAG;
    }

    @Override // com.cosmos.photon.push.uniqueid.IUniqueId
    public String getUniqueId(Context context) {
        if (!PermissionUtils.checkPermission(context, "android.permission.READ_PHONE_STATE")) {
            return null;
        }
        try {
            String deviceId = ((TelephonyManager) context.getSystemService("phone")).getDeviceId();
            if (TextUtils.isEmpty(deviceId)) {
                return null;
            }
            return deviceId;
        } catch (Throwable th) {
            MDLog.m7451v(TAG, th.getMessage());
        }
    }
}
