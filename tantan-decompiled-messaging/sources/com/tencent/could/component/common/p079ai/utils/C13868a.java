package com.tencent.could.component.common.p079ai.utils;

import android.content.Context;
import android.content.pm.PackageManager;

/* JADX INFO: renamed from: com.tencent.could.component.common.ai.utils.a */
/* JADX INFO: loaded from: classes2.dex */
public class C13868a {

    /* JADX INFO: renamed from: a */
    public static final String[] f57335a = {"android.permission.WRITE_EXTERNAL_STORAGE", "android.permission.READ_EXTERNAL_STORAGE"};

    /* JADX INFO: renamed from: a */
    public static boolean m82210a(Context context) {
        String[] strArr = f57335a;
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
