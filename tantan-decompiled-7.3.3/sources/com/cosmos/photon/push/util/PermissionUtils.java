package com.cosmos.photon.push.util;

import android.content.Context;
import android.os.Build;

/* JADX INFO: loaded from: classes.dex */
public class PermissionUtils {
    public static boolean checkPermission(Context context, String str) {
        return context.checkSelfPermission(str) != -1;
    }

    public static boolean checkReadPrivilegedPhoneStatePermission(Context context) {
        return Build.VERSION.SDK_INT < 29 || context.checkSelfPermission("android.permission.READ_PRIVILEGED_PHONE_STATE") != -1;
    }
}
