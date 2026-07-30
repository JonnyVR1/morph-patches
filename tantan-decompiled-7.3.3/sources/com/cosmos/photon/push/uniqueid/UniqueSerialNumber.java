package com.cosmos.photon.push.uniqueid;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.cosmos.mdlog.MDLog;
import com.cosmos.photon.push.util.PermissionUtils;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public class UniqueSerialNumber implements IUniqueId {
    private static final String TAG = "UniqueSerialNumber";

    public static String getUniquePsuedoID(String str) {
        return new UUID(("35" + (Build.BOARD.length() % 10) + (Build.BRAND.length() % 10) + (Build.CPU_ABI.length() % 10) + (Build.DEVICE.length() % 10) + (Build.MANUFACTURER.length() % 10) + (Build.MODEL.length() % 10) + (Build.PRODUCT.length() % 10)).hashCode(), str.hashCode()).toString();
    }

    @Override // com.cosmos.photon.push.uniqueid.IUniqueId
    public String getTag() {
        return "serialNum";
    }

    @Override // com.cosmos.photon.push.uniqueid.IUniqueId
    public String getUniqueId(Context context) {
        String serial;
        if (Build.VERSION.SDK_INT < 26) {
            try {
                serial = Build.SERIAL;
            } catch (Throwable th) {
                MDLog.m7451v(TAG, th.getMessage());
                return null;
            }
        } else {
            if (!PermissionUtils.checkPermission(context, "android.permission.READ_PHONE_STATE")) {
                return null;
            }
            try {
                serial = Build.getSerial();
            } catch (Throwable th2) {
                MDLog.m7451v(TAG, th2.getMessage());
                return null;
            }
        }
        if (TextUtils.isEmpty(serial) || "Unknown".equalsIgnoreCase(serial)) {
            return null;
        }
        return getUniquePsuedoID(serial);
    }
}
