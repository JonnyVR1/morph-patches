package com.tencent.could.component.common.p084ai.utils;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: com.tencent.could.component.common.ai.utils.a */
/* JADX INFO: loaded from: classes12.dex */
public class C14031a {

    /* JADX INFO: renamed from: a */
    public static final String[] f58183a = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    /* JADX INFO: renamed from: a */
    public static boolean m83393a(Context context) {
        String[] strArr = f58183a;
        if (context != null) {
            PackageManager packageManager = context.getPackageManager();
            String packageName = context.getPackageName();
            for (String str : strArr) {
                if (packageManager.checkPermission(str, packageName) == 0) {
                }
            }
            return true;
        }
        return false;
    }
}
